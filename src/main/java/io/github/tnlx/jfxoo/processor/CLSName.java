package io.github.tnlx.jfxoo.processor;

import com.squareup.javapoet.ClassName;
import io.github.tnlx.jfxoo.JFXooTable;

public class CLSName {
    public static final ClassName STAGE = ClassName.get("javafx.stage", "Stage");
    public static final ClassName SCENE = ClassName.get("javafx.scene", "Scene");
    public static final ClassName LABEL = ClassName.get("javafx.scene.control", "Label");
    public static final ClassName TEXT_FIELD = ClassName.get("javafx.scene.control", "TextField");
    public static final ClassName POS = ClassName.get("javafx.geometry", "Pos");
    public static final ClassName VPOS = ClassName.get("javafx.geometry", "VPos");
    public static final ClassName INSETS = ClassName.get("javafx.geometry", "Insets");
    public static final ClassName GRID_PANE = ClassName.get("javafx.scene.layout", "GridPane");
    public static final ClassName PRIORITY = ClassName.get("javafx.scene.layout", "Priority");
    public static final ClassName NODE = ClassName.get("javafx.scene", "Node");
    public static final ClassName SCROLL_PANE = ClassName.get("javafx.scene.control", "ScrollPane");
    public static final ClassName DATE_PICKER = ClassName.get("javafx.scene.control", "DatePicker");
    public static final ClassName PASSWORD_FIELD = ClassName.get("javafx.scene.control", "PasswordField");
    public static final ClassName TEXT = ClassName.get("javafx.scene.text", "Text");
    public static final ClassName FONT = ClassName.get("javafx.scene.text", "Font");
    public static final ClassName FONT_WEIGHT = ClassName.get("javafx.scene.text", "FontWeight");
    public static final ClassName TEXTAREA = ClassName.get("javafx.scene.control", "TextArea");
    public static final ClassName CHECKBOX = ClassName.get("javafx.scene.control", "CheckBox");
    public static final ClassName BUTTON = ClassName.get("javafx.scene.control", "Button");
    public static final ClassName HBOX = ClassName.get("javafx.scene.layout", "HBox");
    public static final ClassName VBOX = ClassName.get("javafx.scene.layout", "VBox");
    public static final ClassName TABLEVIEW = ClassName.get("javafx.scene.control", "TableView");
    public static final ClassName TABLE_COLUMN = ClassName.get("javafx.scene.control", "TableColumn");
    public static final ClassName TABLE_ROW = ClassName.get("javafx.scene.control", "TableRow");
    public static final ClassName SIMPLE_OBJECT_PROPERTY = ClassName.get("javafx.beans.property", "SimpleObjectProperty");
    public static final ClassName MOUSE_BUTTON = ClassName.get("javafx.scene.input", "MouseButton");

    public static final ClassName JFXOO_TABLE = ClassName.get(JFXooTable.class);
}
