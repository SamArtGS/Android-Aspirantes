<p>
  <img src="img/kotlin-logo.png" align = "right"  width="60"/>
</p>
# 🖥 Nuestro lenguaje de programación Kotlin ☭ 🤖

**La versión soviética de Swift 🕊** 



Kotlin es un lenguaje de programación de **tipado estático** que corre sobre la máquina virtual de Java y que también puede ser compilado a código fuente de JavaScript. Es desarrollado principalmente por JetBrains en sus oficinas de San Petersburgo en la madre Rusia. 🇷🇺 [TOQUE AQUÍ](https://www.youtube.com/watch?v=U06jlgpMtQs). 
<p>
  <img src="img/jetbrains.png" align = "right"  width="80"/>
</p>
El nombre proviene de la isla de Kotlin, situada cerca de San Petersburgo. 🏝

Aunque no tiene una sintaxis compatible con Java, Kotlin está diseñado para interoperar con código Java y es **dependiente del código Java**, de su biblioteca de clases, tal como pueda ser el entorno de colecciones de Java. ☕️

En febrero de 2012, JetBrains liberó el código fuente del proyecto bajo la Licencia Apache 2.5​ Jetbrains espera que el nuevo lenguaje impulsará las ventas de IntelliJ IDEA.​ En 2017, recibe un importante impulso al ser nombrado por Google como lenguaje oficial para Android al mismo nivel que Java. 🎉

### Sintaxis
Al igual que **Pascal, Haxe, PL/SQL, F#, Go y Scala**, y a diferencia de **C** y sus derivados como **C++, Java, C#, y D**,  la declaración de variables y listas de parámetros en Kotlin tienen el tipo de dato después del identificador y un separador de dos puntos. Igual que en otros lenguajes modernos como Scala y Groovy, los puntos y comas son opcionales como final de sentencia; en muchos casos un salto de línea es suficiente para que el compilador pueda deducir que la declaración terminó.


### Semántica

Kotlin hace una distinción entre tipos nullables y no-nullables (aquellos que pueden o no tener un valor nulo). Todos los objetos nullables tienen que ser declarados con un "?" sufijo después del nombre de tipo. Las operaciones con objetos nullables necesitan cuidado especial de los desarrolladores: una verificación de valor null debe ser realizado antes de utilizar el valor. Kotlin proporciona operadores seguros de nulidad para ayudar a los desarrolladores:

- ?. (Operador de navegación segura) puede ser usado para acceder de forma seguras a un método o propiedad de un posible objeto nulo. Si el objeto es nulo, el método no se invocará y la expresión evalúa a null.

- ?: (operador de coalescencia nula) a menudo referido a como el operador Elvis.




```
fun decirHola(talVez : String?, jamasNulo : Int) {
   // uso del operador Elvis
   val nombre : String = talVez ?: "extraño"
   println("Hola, $nombre")
}
```


<p align = "center" >
  <img src="img/ciencias.png"  width="260"/>
</p>