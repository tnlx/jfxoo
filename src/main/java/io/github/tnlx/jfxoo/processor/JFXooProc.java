package io.github.tnlx.jfxoo.processor;

import com.squareup.javapoet.JavaFile;
import io.github.tnlx.jfxoo.annotation.JFXooForm;
import io.github.tnlx.jfxoo.annotation.JFXooTable;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.TypeElement;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JFXooProc extends AbstractProcessor {

    private CreatorGnrt creatorGnrt;
    private FormGnrt formGnrt;
    private TableGnrt tableGnrt;

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        creatorGnrt = new CreatorGnrt(processingEnv);
        formGnrt = new FormGnrt(processingEnv);
        tableGnrt = new TableGnrt(processingEnv);
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {

        /*
         * Generate code for JFXoo supported annotations
         * - JFXooForm
         * - JFXooTable
         */
        List<TypeElement> forms = new ArrayList<>(roundEnv.getElementsAnnotatedWith(JFXooForm.class)
                .stream()
                .filter(e -> e.getKind() == ElementKind.CLASS)
                .map(e -> (TypeElement) e).toList());
        List<TypeElement> table = new ArrayList<>(roundEnv.getElementsAnnotatedWith(JFXooTable.class)
                .stream()
                .filter(e -> e.getKind() == ElementKind.CLASS)
                .map(e -> (TypeElement) e).toList());
        forms.forEach(te -> {
            this.output(formGnrt.run(te));
            creatorGnrt.form(te);
        });
        table.forEach(te -> {
            this.output(tableGnrt.run(te));
            creatorGnrt.table(te);
        });
        if (creatorGnrt.pending()) {
            this.output(creatorGnrt.run());
            creatorGnrt.clear();
        }
        return false;
    }

    private boolean output(JavaFile f) {
        try {
            f.writeTo(this.processingEnv.getFiler());
        } catch (IOException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        Set<String> set = new HashSet<>();
        set.add(JFXooForm.class.getCanonicalName());
        return set;
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latestSupported();
    }
}
