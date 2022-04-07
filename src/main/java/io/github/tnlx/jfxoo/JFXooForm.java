package io.github.tnlx.jfxoo;

import javafx.scene.layout.VBox;

import java.util.function.Consumer;

public interface JFXooForm<T> {

    VBox node();

    void init(T t);

    T value();

    void button(String buttonText, Consumer<T> onClicked);

    void info(String msg);

    void error(String msg);
}
