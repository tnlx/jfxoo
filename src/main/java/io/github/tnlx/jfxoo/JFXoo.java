package io.github.tnlx.jfxoo;

import java.lang.reflect.InvocationTargetException;

public class JFXoo {

    public static final String JFXOO_CREATOR_PKG = JFXooCreator.class.getPackageName();
    public static final String JFXOO_CREATOR_TYPE = "JFXooCreators";
    private static JFXoo _instance;
    private final JFXooCreator creator;

    private JFXoo() throws ClassNotFoundException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        Class<?> _class = JFXoo.class.getClassLoader().loadClass(JFXOO_CREATOR_PKG + "." + JFXOO_CREATOR_TYPE);
        creator = (JFXooCreator) _class.getConstructors()[0].newInstance();
    }

    public static JFXoo init() throws ClassNotFoundException,
            InvocationTargetException, InstantiationException, IllegalAccessException {
        if (_instance == null) {
            _instance = new JFXoo();
        }
        return _instance;
    }

    public <T> JFXooForm<T> form(String name, Class<T> T) {
        return creator.form(name, T);
    }

    public <T> JFXooTable<T> table(String name, Class<T> T) {
        return creator.table(name, T);
    }
}
