# jfxoo

[Annotation processor](https://docs.oracle.com/javase/8/docs/api/javax/annotation/processing/Processor.html) library
to generate [JavaFX](https://openjfx.io/) Form during compile time.

## Usage

```gradle
// build.gradle

dependencies {
    implementation 'io.github.tnlx:jfxoo:0.1.0'
    annotationProcessor 'io.github.tnlx:jfxoo:0.1.0'
}
```

### Form

Annotate object with `@JFXooForm`

```java
@JFXooForm
public class Contact {
  private String name;
  private String phone;
  private String email;
}
```

```java
// Init the main JFXoo interface
JFXoo jfxoo = JFXoo.init();

JFXooForm<Contact> contactForm = jfxoo.get("Contact", Contact.class);

// Obtain the JavaFX Node to add to the Scene
Node form = contactForm.node();

// Buttons to be displayed at the bottom of the form
contactForm.button("Save", contact -> {});
contactForm.button("Cancel", contact -> {});
```

### Table

Annotate object with `@JFXooTable`

```java
JFXooTable<Contact> contactTable = jfxoo.table("Contact", Contact.class);

// Obtain the JavaFX Node(s) to add to the Scene
Node node = contactTable.node(); // table and basic control buttons (as VBox)
Node table = contactTable.table(); // only the TableView
```
