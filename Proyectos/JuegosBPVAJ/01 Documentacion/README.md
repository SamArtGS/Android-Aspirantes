# Memorama

El memorama es un juego en el cual nuestra capacidad de memorización
es el protagonista en este juego.

#Implementación en Android Studio

Lo primero que se hizo para la creación de este juego fue crear las plantillas del juego: La interfaz inicial para seleccionar el juego a jugar, seleccionar la dificultad del memorama y el memorama en sí. Para esto, se crearon los layouts, en los cuales pusimos los botones e imágenes necesarias para el juego. Una vez diseñada cada parte, procedimos a implementar código en los botones desde el xml.

Lo único diferente en cada dificultad es la cantidad de pares a encontrar. Así que todos los archivos .kt llevan una implementación similar en cuanto a código se refiere. 

Así pues, lo que se hizo primero fue implementar una lista mutable que contenga las imágenes que serán parte del juego
Después, se implementó una iteración que va desde 0 hasta la cantidad máxima de imágenes contenidas en la dificultad. Por ejemplo, en la dificultad difícil tenemos que se trata de un arreglo de 4x4, es decir 16 imágenes en total, de los cuales 8 son pares, así que en este caso la iteración va desde la posición 0 hasta 15 (Cantidad máxima de imágenes). La iteración tiene anidados varios condicionales, los cuales verificarán que las imágenes sean iguales para poder seguir seleccionando más pares, de no ser así, el usuario tendrá que voltear el par nuevamente para seguir jugando.

! Difmedia

# Gato

Este juego consiste en crear 3 patrones consecutivos de X o 0, dichos patrones pueden ser diagonales o a los costados
lo importante es crear dicho patrón para ser el vencedor.

# implementación en Android Studio.

Después de crear la interfaz gráfica en el xml de la carpeta layouts, se procedió a hacer el código. 
Consiste en una condicional con múltiples alternativas. Dicha condicional irá verificando que el patrón se haya creado. 
Por ejemplo, al crear una diagonal con X o 0 entonces el juego terminará, mientras esto no sea así, el juego seguirá corriendo.

! gato

# Creadores:
- Bautista Pérez Brian Jassiel
- Espinoza de los Monteros Camarrillo Pamela.
- Galindo Ruíz Abraham.
- Hernández Juan Ángeles.
- Magín Gómez Nancy Vanessa.