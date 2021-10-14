# jfxoo

![Stability-wip](https://img.shields.io/badge/Stability-WIP-yellow.svg?style=flat-square)

[Annotation processor](https://docs.oracle.com/javase/8/docs/api/javax/annotation/processing/Processor.html) library
to generate [JavaFX](https://openjfx.io/) Form (GridPane) during compile time.

### Usage

Annotate object with `@JFXooForm`

```java
@JFXooForm
public class Contact {
  private String name;
  private String phone;
  private String email;
}
```

Init JFXoo factory class

```java
JFXoo jfxoo = JFXoo.init();
```

Retrieve the generate form to add to parent view

```java
JFXooForm contactForm = jfxoo.get("Contact");
Node form = (Node) contactForm.node(); // retrieve inner gridpane property within JFXooForm
```
