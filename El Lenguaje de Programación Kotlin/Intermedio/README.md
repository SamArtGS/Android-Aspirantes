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
println(junta2Strings.invoke("Hola a", "todos!"))

//No usando invoke
println(junta2Strings("Hola, ", "a todos!")) 

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
Las funciones en Kotlin son de los tipos, tomando String como cualquier elemento:

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
ints.filter { cadaNumero > 0 }.forEach {
    suma += cadaNumero
}
println(suma)
```

## Programación Orientada a Objetos 🦉




