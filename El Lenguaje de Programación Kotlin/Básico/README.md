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

## Colecciones

## Condicionales

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

## Ciclos

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

