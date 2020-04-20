# Kotlin Básico ☕️👱🏼‍♀️💅👢📱

## Variables 🐠

Como en cualquier lenguaje de programación necesitamos variables, estas en Kotlin se declaran de la siguiente manera:

Kotlin utiliza dos palabras clave diferentes para declarar variables: **val y var.**

- Usa **val** para una variable cuyo valor no cambia nunca. No puedes volver a asignar un valor a una variable que se declaró mediante val.

- Utiliza **var** para una variable cuyo valor puede cambiar.

Para declarar una variable la sintasis es:

```
 <var o val> <nombreVariable>:<TipoDato> = <Valor>
```
Ejemplo:

```kotlin
var numero: Int = 10
println(numero)
```

**Int** es un tipo que representa un número entero, uno de los muchos tipos numéricos que se pueden representar en Kotlin. 

Del mismo modo que con otros lenguajes, también puedes utilizar **Byte, Short, Long, Float y Double** según tus datos numéricos.



La palabra **var** quiere decir que puedes volver a asignar valores a numero según necesites.

La palabra **val** son para valores que no podrán cambiar luego de ser asignados.

```kotlin
//Podrá cambiar
var numero: Int = 10

numero = 15 //Bien


//No podrá cambiar
var saludo:String = "Hola Mundo!"

saludo = "Hola!" //Error
```


### Inferencia de tipo

Si colocas:

```kotlin
var saludo = "Hola a todos"
```

Es posible omitir el tipo de dato ya que Kotlin hace la inferencia con base al valor que almacena. Como "Hola a todos" es string, el compilador infiere que la variable saludo también lo es.

> Ten en cuenta que Kotlin es un lenguaje de tipo estático. Eso quiere decir que el tipo se resuelve en el tiempo de compilación y no cambia nunca.

**Ejercicio moral: Haga unas operaciones matemáticas. Suma resta multiplicación y división.**

## Colecciones 🦁

Las colecciones son un concepto común para la mayoría de los lenguajes de programación, por lo que si está familiarizado con, por ejemplo, las colecciones Java o Python, puede omitir esta introducción y pasar a las secciones detalladas.

Los siguientes tipos de colección son relevantes para Kotlin:

- **List**: Colección ordenada con acceso a elementos por índices, que son números enteros que reflejan su posición. Los elementos pueden aparecer más de una vez en una lista. Un ejemplo de una lista es una oración: es un grupo de palabras, su orden es importante y pueden repetir.

- **Set:** Colección de elementos únicos. Refleja la abstracción matemática del conjunto: un grupo de objetos sin repeticiones. En general, el orden de los elementos establecidos no tiene importancia. Por ejemplo, un alfabeto es un conjunto de letras. 

- **Map (o diccionario)**: Colección de pares clave-valor. Las claves son únicas y cada una de ellas se asigna exactamente a un valor. Los valores pueden ser duplicados. Los mapas son útiles para almacenar conexiones lógicas entre objetos, por ejemplo, la identificación de un empleado y su posición.


Kotlin agrega una Cadena a una lista de Cadenas de la misma manera que lo haría con Ints o una clase definida por el usuario. Por lo tanto, la Biblioteca estándar de Kotlin ofrece interfaces genéricas, clases y funciones para crear, completar y administrar colecciones de cualquier tipo.


La biblioteca estándar de Kotlin proporciona implementaciones para los tipos básicos de colección: conjuntos, listas y mapas y lo hace a través de 1 categorías:

- ReadOnly o Inmutable: Solo provee operaciones para acceder a la colección de los elementos 

- Mutables: Además de la operación de lectura incluye: agregar, remover y actualizar elementos.

> Tenga en cuenta que la alteración de una colección mutable no requiere que sea una var: las operaciones de escritura modifican el mismo objeto de colección mutable, por lo que la referencia no cambia. Sin embargo, si intenta reasignar una colección val, obtendrá un error de compilación.


**Clases / Interfaces que implementa**
![](../img/collections-diagram.png)

### Listas

**Inmutables**

Las lista almacena elementos en un orden específico y proporciona acceso indexado a ellos. Los índices comienzan desde cero, el índice del primer elemento, y van a el penúltimo, que es (list.size - 1)

```kotlin
val numeros = listOf("uno", "dos", "tres", "cuatro")
println("Número de elementos en la lista: ${numeros.size}")
println("Tercer elemento: ${numeros.get(2)}")
println("Cuarto elemento: ${numeros[3]}")
println("Índice del elemento \"dos\" ${numeros.indexOf("two")}")
```

Los elementos de la lista (incluidos los nulos) pueden duplicarse: una lista puede contener cualquier número de objetos iguales o ocurrencias de un solo objeto. Dos listas se consideran iguales si tienen los mismos tamaños y elementos estructuralmente iguales en las mismas posiciones.

```kotlin
//Ignoren la clase creada Persona por ahora

val bob = Persona("Bob", 31)
val personas = listOf<Persona>(Persona("Adam", 20), bob, bob)
val personas2 = listOf<Persona>(Persona("Adam", 20), Persona("Bob", 31), bob)
println(personas == personas2)
//TRUE
bob.age = 32
println(people == people2)
//FALSE
```
**Ejercicio: ¿Por qué es TRUE o FALSE?**

**Mutables**

Para definir una lista que podremos modificar los elementos que contenga usaremos la función mutableListOf( )

```kotlin
val numeros = mutableListOf(1, 2, 3, 4)
numeros.add(5)
numeros.removeAt(1)
numeros[0] = 0
numeros.shuffle()
println(numeros)
```
**Ejercicio: Traten de aplicar las funciones add( ), removeAt() y suffle( ) a una lista inmutable**

> En Kotlin, la implementación predeterminada de List es ArrayList, que se puede considerar como una matriz redimensionable.


### Map
**Inmutables**

Map <K, V> no es un heredero de la interfaz de Collection; sin embargo, también es un tipo de colección Kotlin. Un mapa almacena pares clave-valor (o entradas); Las claves son únicas, pero se pueden emparejar diferentes claves con valores iguales. La interfaz del mapa proporciona funciones específicas, como el acceso al valor por clave, la búsqueda de claves y valores, etc.

```kotlin
val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)
println("Todas las llaves: ${numbersMap.keys}")
println("Todos los valores:: ${numbersMap.values}")

if ("key2" in numbersMap) println("El valo de la llave key2 es: ${numbersMap["key2"]}")
    
if (1 in numbersMap.values) println("El valor 1 está en el mapa.") //Manual

if (numbersMap.containsValue(1)) println("El valor 1 está en el mapa") //Automático
```

Ejecución

```
Resultado: 
Todas las llaves: [key1, key2, key3, key4]
Todos los valores: [1, 2, 3, 1]
Value by key "key2": 2
The value 1 is in the map
The value 1 is in the map
```

**Ejercicio: ¿Estos mapas son iguales?**

```kotlin
val unMapa = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)    
val otroMapa = mapOf("key2" to 2, "key1" to 1, "key4" to 1, "key3" to 3)
```

**Mutables**
Los mapas mutables permiten tener las funciones que permiten modificar la estructura del map.

```kotlin
var numbersMap = mutableMapOf("one" to 1, "two" to 2) //declara el diccionario
numbersMap.put("three", 3) "Ingresa un nuevo elemento al diccionario"
numbersMap["one"] = 11 // Cambia el valor de la llave "one" a 11
println(numbersMap)
```

### Sets
**Inmutables**
Almacena elementos únicos; su orden es generalmente indefinido. Los elementos nulos también son únicos: un conjunto puede contener solo un nulo. Dos conjuntos son iguales si tienen el mismo tamaño, y para cada elemento de un conjunto hay un elemento igual en el otro conjunto.


```kotlin
val numero1 = setOf(1, 2, 3, 4)
println("Cantidad de elementos: ${numero1.size}")
if (numero1.contains(1)) println("1 está en el set")
val numeros2 = setOf(4, 3, 2, 1)
println("¿Los sets son iguales? ${numero1 == numeros2}")
```
**Ejercicio: ¿Qué regresará?**

La implementación predeterminada de Set - LinkedHashSet - conserva el orden de inserción de elementos. Por lo tanto, las funciones que dependen del orden, como first () o last (), devuelven resultados predecibles en dichos conjuntos.

**Mutables**

```kotlin
val numero3 = mutableSetOf(1, 2, 3, 4)
numero3.add(1)
numero3.add(5)
println(numero3)
```

Para más funciones dentro de las colecciones: [Funciones de colecciones](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/)

## Condicionales 🦊

### Declaración if-else
Como en otros lenguajes, si una expresión entre paréntesis junto con palabra if evalua true se ejecuta el código dentro de esa rama.


```kotlin
var cuenta = 10
if (cuenta == 42) {
	println("Es un 10")
} else {
	println("No es un 10")
}

```

Se puede presentar varios condicionales mediante else-if. Puedes representar una lógica más detallada:

```kotlin
val contador = 20
if (contador == 20) {
        println("Soy el 20")
    } else if (contador < 20) {
        println("Es menor a 20")
    } else {
        println("Es mayor a 20")
    }
    
```

### Expresiones condicionales
¿Tiene que repetir mucho código para asignarle valor a una variable? No sufra más. Esta expresión asigna el valor a una variable en base a lo que obtenga de su condicional.

```kotlin
val respuesta: String = if (numero == 30) {
	"Soy 1"
} else if (numero > 35) {
    "Soy 2"
} else {
	"Soy nada"
}
println(respuesta) // si numero == 30 imprime "Soy 1"
```
> Kotlin no incluye OPERADOR TERNARIO

### Switch
Para los que no conozcan qué es un Switch case es una estructura que en lugar de checar validación tras validación con en If, directamente colocamos todas las condiciones con las que deseamos contar.


**When el switch de Kotlin es un when :v**

```kotlin
when (x) {
    1 -> print("x es 1")
    2 -> print("x es 2")
    else -> { // En caso que no sea los anteriores
        print("x no es ni 1 ni 2")
    }
}
```

En Kotlin de la misma expresión nos permite para decir que un string, convertirlo a **Int**

```kotlin
when (x) {
    parseInt(s) -> print("s codifica x")
    else -> print("s no codifica a x")
}
```

Además tenemos la opción de contraer un motón de casos con ésta modalidades, con la palabra reservada in como Python:

```kotlin
when (x) {
    in 1..10 -> println("x está en el rango 1 a 10")
    in arreglo -> println("x está en un arreglo")
    !in 10..20 -> println("x está fuera del rango")
    !in arreglo2 -> println("x no está en el arreglo2")
    else -> println("ninguna de las anteriores")
}
```

Al igual que las expresiones condicionales con if, podremos hacerlas con when(x)

```kotlin
val string = when {
	x == 42 -> "Este número es 42"
	x > 42 -> "Este número es mayor a 42"
	else -> "Este número es menor a 42"
}
println(string)
```

**También puede utilizarse para lo casos que traigan las funciones**

```kotlin
when {
    x.isOdd() -> print("x es impar")
    x.isEven() -> print("x es par")
    else -> print("x es divertido")
}
```

## Ciclos 🐻

### FOR
For itera a través de todo lo que proporciona un iterador. Esto es equivalente al bucle foreach en lenguajes como C #.

```kotlin
for (item in collection) print(item)
```

Para un bloque de ciclo for se declara de la siguiente manera:

```kotlin
for (numero: Int in enteros) {
    print(numero)
}
```
Para iterar con número establecemos rangos. i estará cambiándose con cada iteración en el rango 1 a n.

```kotlin
for (i in 1..n) {
    println(i)
}
```

Para hacer una cuenta regresiva es necesaria la palabra downTo. La palabra step es para decir de cuánto en cuánto.

```kotlin
for (i in 6 downTo 0 step 2) {
    println(i)
}
```

**Ejercicio moral: ¿Qué imprimirá el siguiente código?**

Para un arreglo, podríamos usar la notación i in arreglo, o para imprimir sus elementos podríamos hacerlo mediante el índice.

```kotlin
//Recorrer el arreglo por elemento. Manera más elegante y corta
for (elemento in arreglo) {
    println(elemento)

//Recorrer un arreglo, manera más específica
for (i in arreglo.indices) {
    println(arreglo[i])
}
```

### While / Do While

Se hace una combinación entre las condiciones posibles dentro de la estructura if. Repite una condición hasta que se cumpla la condición. La estructura do-while al menos se ejecuta una vez.

```kotlin
var x = 10
while (x > 0) {
    x-- //Restará -1 al valor de x
}

var y = 0
do { //Al menos 1 vez se ejecuta esta sección.
    y++ 
} while (y>0) // y es 1 cuando pasa por este punto
```

### Romper o saltar ciclos

Para romper ciclos cuando se alcanza una condición y queremos parar el ciclo u omitir un paso podremos usar las siguientes palabras reservadas.

- **break**: Termina el ciclo de cierre más cercano.
- **continue**: Continúa con el siguiente paso del ciclo de cierre más cercano.

**Ejercicio moral: ¿Qué imprimirá el siguiente ciclo?**

```kotlin
for (i in 1..10) {
	if(i == 1){
		continue
	}
	if(i == 4){
		continue
	}
	if(i == 6){
		break
	}
    println(i)
}
```


