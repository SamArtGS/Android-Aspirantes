# 🥞 Conceptos generales 🍔



🍏**Gradle**: Gradle es un sistema de automatización de construcción de código abierto que construye sobre los conceptos de Apache Ant y Apache Maven e introduce un lenguaje específico del dominio (DSL) basado en Groovy en vez de la forma XML utilizada por Apache Maven para declarar la configuración de proyecto. (Alias archivos para el compilador).

🍎**Layout**:

- **LinearLayout:** Dispone los elementos en una fila o en una columna.

- **TableLayout:** Distribuye los elementos de forma tabular.
- **RelativeLayout:** Dispone los elementos en relación a otro o al padre.
- **ConstraintLayout:** Versión mejorada de RelativeLayout, que permite una edición visual desde el editor.
- **FrameLayout:** Permite el cambio dinámico de los elementos que contiene.
- **AbsoluteLayout:** Posiciona los elementos de forma absoluta.


🍐**Manifest**: Archivo que define la estructura y la metada de nuestra aplicación, sus componentes y sus requerimientos.



### Estructura de carpetas en proyecto

**manifest**

- Manifest:

**java**

- (nombre-proyecto):

- (proyecto-test):

- (proyecto-androidTest):

**generatedJava**

- BuildConfig:

**res**

- drawable:

- layout:

- mipmap:

- values:

- strings

- color

- menu

- navigation

- font

- animation

**Gradle**

- build.gradle(Project)

- build.gradle(Module)