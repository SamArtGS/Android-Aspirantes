# Kotlin intermedio 👀 🤠 🍎

## Funciones de orden superior y lambdas 🐼

Las funciones de Kotlin son de primera clase, lo Las funciones de Kotlin son de primera clase, lo que significa que pueden almacenarse en variables y estructuras de datos, transmitidas como argumentos y devueltas desde otras funciones de orden superior. Puede operar con funciones de cualquier manera que sea posible para otros valores que no sean de función.


### Crear instancias de un tipo de función

Hay varias formas de obtener una instancia de un tipo de función:

- Usando un bloque de código dentro de una función literal, en una de las formas:
	- Una expresión lambda: ```{a, b -> a + b}```
	- Una función anónima: ```fun (s: String): Int {return s.toIntOrNull ()?: 0}```
	
- Usando una referencia invocable a una declaración existente:
	- Una función de nivel superior, local, miembro o extensión: ``:: isOdd, String :: toInt``
	- una propiedad de nivel superior, miembro o extensión: ``List <Int> :: size``
	- un constructor: ``:: Regex``

### Ejemplo de invocación de instancias de un tipo de función

Para invocarlas directamente se utiliza indirectamente el método invoke(), pero no es necesario.

```kotlin
//Le decimos que junte 2 strings con los parámetros que le coloquemos
val junta2Strings: (String, String) -> String = String::plus

//Dentro de Int existe el método plus que suma 2 números que le entreguemos como parámetros
val suma: Int.(Int) -> Int = Int::plus

//Usando invoke
println(junta2Strings.invoke("Hola a", " todos!"))

//No usando invoke
println(junta2Strings("Hola, ", " a todos!")) 

//Usando invoke
println(intPlus.invoke(1, 1))

//no usando invoke y 2 maneras
//Int.plus(1,2)
println(intPlus(1, 2))

//Int(2).plus(2)
println(2.intPlus(3))
```
### Lambdas

Las expresiones lambda y las funciones anónimas son "literales de función", es decir, funciones que no se declaran, pero se pasan inmediatamente como una expresión. Tienen la siguiente estructura:

```kotlin
val suma: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
```
#### Tipos de funciones y referencias
Las funciones en Kotlin son de 2 tipos, tomando String como cualquier elemento:

```
() -> String : es un tipo que no toma parámetros y devuelve una cadena.
(String) -> String : es un tipo que toma un argumento de String y devuelve un argumento de String.

```

### Ejemplo de Lambda

Una función lambda es aquella que se puede almacenar dentro de una variable. 

**Ejercicio: Indique las salidas en pantalla de la función main**

```kotlin
fun main(args: Array<String>) {

    var funcionLambda :(String) -> Unit  = {s:String -> println(s)}
    funcionLambda("Construcción de una función lambda")

    funcionLambda =  {println(it)}
    funcionLambda("La otra manera de función Lambda")

    val sinArgumentos : ()->Unit = { println("Otra forma")}
    sinArgumentos()

}
```


### Closures 🍦

Una expresión lambda o una función anónima (así como una función local y una expresión de objeto) pueden acceder a su cierre o closure, es decir, las variables declaradas en el ámbito externo. Las variables capturadas en el cierre pueden modificarse en la lambda:

**Ejercicio: ¿Qué imprimirá?**

```kotlin
//Suma de una lista
var ints = listOf(1,2,3,4,5)
var suma = 0
ints.filter { it > 0 }.forEach {
    suma += it
}
println(suma)
```

## Nulleables u Opcionales 🐯

El sistema de tipos de Kotlin tiene como objetivo eliminar el peligro de referencias nulas del código.
Una de las dificultades más comunes en muchos lenguajes de programación, incluido Java, es que acceder a un miembro de una referencia nula dará como resultado una excepción de referencia nula. En Java, esto sería el equivalente de una NullPointerException.

El sistema de tipos de Kotlin está destinado a eliminar NullPointerException de nuestro código. Las únicas causas posibles de NPE pueden ser:

- Una llamada explícita para lanzar NullPointerException ()
- Uso de la !!
- Algunas inconsistencias de datos con respecto a la inicialización
	- Un no inicializado disponible en un constructor se pasa y se usa en alguna parte ("filtrando esto");

- Un constructor de superclase llama a un miembro abierto cuya implementación en la clase derivada utiliza el estado no inicializado;

En Kotlin, el sistema de tipos distingue entre referencias que pueden contener nulo (referencias anulables) y aquellas que no pueden (referencias no nulas). Por ejemplo, una variable regular de tipo String no puede contener nulo.

```kotlin
var a: String = "abc" 
a = null 
```

Para permitir nulos, podemos declarar una variable como cadena anulable, escrita String?

```kotlin
var b: String? = "abc" 
b = null //No hay problema
print(b)
```

Ahora, si llama a un método o accede a una propiedad en un, se garantiza que no causará un **NPE**.

```kotlin
//Bien
val l = a.length
//Error
val l = b.length
```

**Ejercicio:Será necesario hacer esto?**

```kotlin
val b: String? = "Kotlin"
if (b != null && b.length > 0) {
    print("Tamaño del string: ${b.length}")
} else {
    print("String vacío")
}
```

### Llamadas seguras

En lugar de hacer toda esa estructura para checar si nuestra variable es nula y pueda tronar nuestro programa podemos utilizar el operador ?

```kotlin
val a = "Kotlin"
val b: String? = null
println(b?.length)
println(a?.length) //¿Por qué este no es necesario?
```
> Esto devuelve b.length si b no es nulo, y nulo de lo contrario. El tipo de esta expresión es Int ?.

```kotlin
val listaConNulls: List<String?> = listOf("Kotlin", null)
for (item in listWithNulls){
    item?.let { println(it) //Qué rayos es esto? Es algo muy malo
   }
}
```

#### Operador Elvis

Cuando tenemos una referencia anulable b, podemos decir "si b no es nulo, úselo, de lo contrario use algún valor no nulo":

```kotlin
val l: Int = if (b != null) b.length else -1
```
**Ejercicio: ¿Qué hará esto?**

```kotlin
//Más simple
val l = b?.length ?: -1
```

Tenga en cuenta que, dado que throw y return son expresiones en Kotlin, también se pueden usar en el lado derecho del operador de elvis. Esto puede ser muy útil, por ejemplo, para verificar argumentos de función.

```kotlin
fun funcion(nodo: Algo): String? {
    val padre = nodo.getParent() ?: return null
    val name = nodo() ?: throw IllegalArgumentException("nombre esperado")
    // Etc Etc Etc
}
```
**Ejercicio: ¿Qué hace lo anterior?**

#### Operador !! (Operador de aserción no nulo)
(O sea firma bajo tu responsabilidad que no es nulo)

La tercera opción es para los amantes de NPE: el operador de aserción no nulo (!!) convierte cualquier valor en un tipo no nulo y lanza una excepción si el valor es nulo. Podemos escribir b !!, y esto devolverá un valor no nulo de b (por ejemplo, una Cadena en nuestro ejemplo) o arrojará un NPE si b es nulo.

O sea lo que dice eso es que "desenvuelve" de la protección de que en caso que sea nulo no se muera, pero si colocas !! a una variable opcional le quitas esta protección contra los null pointer exceptions.

```kotlin
val l = b!!.length //Se morirá si b es nulo
```
**Únicamente utilizar cuando se está 100% seguro que la variable no será nula**

#### Casteos seguros

Las conversiones regulares pueden dar lugar a una ClassCastException si el objeto no es del tipo de destino. Otra opción es usar lanzamientos seguros que devuelven nulo si el intento no tuvo éxito:

```kotlin
val a: Int? = a as? Int
```
**Ejercicio: ¿Qué hace esto?**

Y para la sana posteridad, si en una colección queremos quitar los nulos podemos utilizar éstas expresiones:

```kotlin
val listaConNuelos: List<Int?> = listOf(1, 2, null, 4)
val listaSinNulos: List<Int> = listaConNuelos.filterNotNull()
```

## Programación Orientada a Objetos 🦉

La Programación Orientada a Objetos es un paradigma de programación que viene a innovar la forma de obtener resultados. Los objetos manipulan los datos de entrada para la obtención de datos de salida específicos, donde cada objeto ofrece una funcionalidad especial.

### En Kotlin

clas clases en Kotlin son especificadas utilizando la palabra reservada: ``class``

La declaración de clase consta del nombre de la clase, el encabezado de la clase (que especifica sus parámetros de tipo, el constructor primario, etc.) y el cuerpo de la clase, rodeados por llaves. Tanto el encabezado como el cuerpo son opcionales; Si la clase no tiene cuerpo, se pueden omitir llaves.

```kotlin
class Nada
```

#### Constructor

Una clase en Kotlin puede tener un constructor primario y uno o más constructores secundarios. El constructor primario es parte del encabezado de la clase: va después del nombre de la clase

```kotlin
class Person constructor(firstName: String) {}
```



```kotlin
class Persona(val nombre: String, val apellidoPaterno: String, var edad: Int) { 
}
```

**Ejemplo de una lámpara**

```kotlin
class Lampara {
    private var estaEncendida: Boolean = false
    fun encender() {
        isOn = true
    }
    fun apagar() {
        isOn = false
    }
    fun imprimeStatusLampara() {
        if (isOn)
            println("Lámpara encendida.")
        else
            println("Lámpara apagada")
    }
}

fun main(args: Array<String>) {
    val lampara1 = Lampara()
    val lampara2 = Lampara()
    lampara1.imprimeStatusLampara()
}
```

**Ejercicio: Creen una clase con atributos y métodos**

###Código .kt vs .java

```java
public class Libro  {
    private String titulo;
    private Long isbn;
    public Book(String titulo, Long isbn) {
        this. titulo = titulo;
        this.isbn = isbn;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String title) {
        this.title = titulo;
    }
    public Long getIsbn() {
        return isbn;
    }
    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }
}

```
**Vaya dato perturbador 20 vs 9 líneas**

```kotlin
class Book {
    var title: String
    var isbn: Long
 
    constructor(title: String, isbn: Long) {
        this.title = title
        this.isbn = isbn
    }
}
```

> La función constructor() se denomina constructor secundario en Kotlin. Este constructor es equivalente al constructor de Java que llamamos cuando instanciamos una clase.

Algo maravilloso es que los getters y setters para estas propiedades son autogenerados para nosotros por el compilador Kotlin. Ten en cuenta que no especificamos ningún modificador de acceso para estas propiedades—así que por defecto, son públicas

Y cómo le hago para que no todos modifiquen mis datos? Bueno para eso están **var** y **val** no?


#### Iniciación en lugar de constructor?

El contructor mencinado en el principio no es necesario ya que contamos con init. En un contructor primario está prohibido colocar cualquier sentencia de código, en su lugar dentro de init colocaremos todo lo que deseamos que se haga después de crearse el objeto.

```kotlin
class Libro constructor(titulo: String, isbn: Long) {
    var titulo: String
    var isbn: Long
 
    init {
       this.titulo = titulo
       this.isbn = isbn
    }
}
```
Omitiendo la palabra construct

```kotlin
class Libro (var title: String = "valorDefecto", var isbn: Long)
```
### Instancia de clases: Objetos

Para poder instanciar una clase la forma más simple es:

```kotlin
val libro = Libro()
```
Tomando el ejemplo de la clase libro podemos crear objetos con los siguientes parámetros: 

```kotlin
val libro1 = Libro("Viaje al centro de la tierra", 9780007477159)
val libro2 = Libro(1234) //
```

**Ejercicio: ¿Por qué libro2 se puede instanciar?**

####Ejercicio: Crear otra clase donde sea posible apreciar el error de que no puedo modificar un atributo de un objeto
```kotlin
Ejercicio
```

### Tareas morales si quieren adentrarse más, no obligatorias y solo ganan conocimiento: 

- Casting inteligente
- Casting explícito
- Java Design Patterns
- Objetos complementarios
- Interoperabilidad Java
- Extensiones de objetos complementarios

	
## Herencia
Por defecto, las clases de Kotlin son finales: no se pueden heredar. Para hacer que una clase sea heredable, márquela con la palabra reservada open.

La herencia se representa 

```kotlin
open class Padre(p: Int)

class Hija(p: Int) : Padre(p)

```

Si la clase derivada tiene un constructor primario, la clase base puede (y debe) inicializarse allí mismo, utilizando los parámetros del constructor primario.

Si la clase derivada no tiene un constructor primario, entonces cada constructor secundario tiene que inicializar el tipo base usando la palabra clave super, o delegar a otro constructor que lo haga. Tenga en cuenta que en este caso diferentes constructores secundarios pueden llamar a diferentes constructores del tipo base.

```kotlin
class MiVista : View {
    constructor(ctx: Context) : super(ctx)

    constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs)
}
```
### Sobreescritura de métodos

Como mencionamos antes, nos limitamos a hacer las cosas explícitas en Kotlin. Entonces, Kotlin requiere modificadores explícitos para miembros reemplazables (los llamamos abiertos) y para anulaciones.

```kotlin
open class Forma {
    open fun dibujar() {
    	println("Dibujo")
    }
    fun llenar() {
    	println("Qué pasa conmigo?")
    }
}

class Circulo() : Forma() {
    override fun dibujar() { 
    	println("Dibujo")
    }
}
```

### Sobreescritura de propiedades

Al heredarse ponemos alunar el elemento que estamos heredando bajo una sobreescritura de la siguiente manera.

```kotlin
open class Forma {
    open val lados: Int = 0
}

class Rectangulo : Shape() {
    override val lados = 4
}
```

## Interfaces

Las interfaces en Kotlin pueden contener declaraciones de métodos abstractos, así como implementaciones de métodos. Lo que los hace diferentes de las clases abstractas es que las interfaces no pueden almacenar el estado. Pueden tener propiedades, pero deben ser abstractas o proporcionar implementaciones de acceso.

```kotlin
interface MyInterface {
    fun bar()
    fun foo() {
      // cuerpo opcional
    }
}
```

### Si necesito herencia múltiple

Kotlin sirve precisamente para esos casos donde no soporta herencia múltiple, pero sí implementación de varias interfaces por lo que separaremos después de los 2 puntos :  la herencia y luego las interfaces a implementar separadas por una coma

```kotlin
interface A {
    fun foo() { print("A") }
    fun bar()
}

interface B {
    fun foo() { print("B") }
    fun bar() { print("bar") }
}

class C : A {
    override fun bar() { print("bar") }
}

class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super<B>.bar()
    }
}
```