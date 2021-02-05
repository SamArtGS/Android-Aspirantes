
```
Reporte

García Miranda Athenas Marlene
```

# Proceso de publicación de aplicaciones en la App Store (Apple) y en la Play Store (Google) 📱💻📌




La publicación es el proceso general por el cual tus apps se ponen a disposición de los usuarios. 

Cuando publicas una aplicación realizas dos tareas principales:

* **Preparas la app para su lanzamiento.**<br>
Durante el paso de preparación, compilas una versión de lanzamiento de tu aplicación que los usuarios pueden descargar e instalar en sus dispositivos Android.

* **Realizas el lanzamiento de la app para los usuarios.**<br>
Durante el paso de lanzamiento, publicitas, vendes y distribuyes la versión de actualización de tu aplicación para los usuarios.

## Play Store


### Preparación para el lanzamiento 🚀

* Como mínimo, debes quitar las llamadas de Log y el atributo android:debuggable de tu archivo de manifiesto. También debes proporcionar valores para los atributos android:versionCode y ``` android:versionName```, que se encuentran en el elemento ```<manifest>```.Asimismo, es posible que debas configurar varios ajustes para cumplir con los requisitos de Google Play o adaptar cualquier método que uses para lanzar tu aplicación.

* Si usas los archivos de compilación de Gradle, puedes emplear el tipo de compilación de lanzamiento a fin de configurar tus ajustes de compilación para la versión publicada de tu app.

* Compilar y firmar una versión de actualización de tu app. 

* Probar la versión de lanzamiento de tu app

* Actualizar los recursos de la app para el lanzamiento

* Preparar servidores y servicios remotos de los cuales dependa tu app

* Obtener una clave privada para firmar la aplicación, crear un ícono y también es conveniente que prepares un contrato de licencia para el usuario final (CLUF) a fin de proteger a tu persona, organización y propiedad intelectual.

* Evita contenidos con Copyright ©️ 

Cuando termines de preparar tu aplicación para el lanzamiento, contarás con un archivo .apk firmado que puedes distribuir a los usuarios.


### Lanzamiento ✈️

* **Crear una cuenta de desarrollador en Google Play (si no cuentas con una)®️**<br>
Al crear esta cuenta se debe aceptar el acuerdo de distribución para desarrolladores ✔️ y se hace un único pago de 25 dolares💵.

<center>
<img src="https://mscdroidlabs.es/wp-content/uploads/2019/12/Developer-Console-.png" width="500px"/><br>
</center>

* **Tener una aplicación 😹 😜**<br>
😁 El primer paso (obvio) es tener tu aplicación ya terminada 😔 sino qué vas a subir.

* **Subir los archivos APK ✅**<br>
Este formato es una variante del formato JAR de Java y se usa para distribuir e instalar componentes empaquetados para la plataforma Android. Estos archivos se suben en Google Play Developer Console.

* **Descrición de la app 🔧**<br>
En esta parte es dónde se define cuál será la descripción de la app, idioma y la información que se muestra sobre esta, incluyendo capturas de pantalla.

* **Perfil de pagos 💰**<br>
Si la app incluye compras se debe configurar un perfil de pagos. 

* **Clasificación 📃**<br>
Recuerda que el contenido de una aplicación pude no ser apto para todas las edades 🔞 por ello es necesario definir esto, de lo contrario la app no tendra clasificación y podría ser eliminada. 😭

* **Distribución 🗾 y precio 💸**<br>
Puedes establecer para qué países o regiones está disponible la app. También se definirá si la app es gratuita o tiene algún precio. Es importante saber que las aplicaciones definidas como gratuitas pueden pasar a ser de pago pero las aplicacines de paga no pueden pasar a se gratuitas.

* **Enviar la app a revisión  ✉️ 📬**<br>
Si toda la información de la app esta completa ya puedes proceder a enviar tu app para que sea revisada y validada para estar en la Play Store.

* **Esperar 🕙 🕙**<br>
Google Playstore revisará el contenido de la aplicación, si es la primera vez que se subes una app la revisión tomará un de días, después de tener varias apps publicadas será cuestion de horas.

<center>
<img src="https://applinium.com/wp-content/uploads/2018/02/publicar_googleplay6.jpg" width="700px"/><br>
</center>


## App Store


### Preparación para el lanzamiento 🚀

1. Testear correctamente la app<br>
Antes de subir a app comprueba que no tenga bugs o errores. No la pruebes solamente en un simulador. Descárgala y pruébala en dispositivos reales. Tanto en iPhone como iPad.

2. Más de una pantalla<br>
Debes saber que Apple rechaza las apps que son muy simples. Una app con una webview puede que sea rechazada por la store.

3. Evita contenidos con Copyright ©️ <br>
No incluyas recursos como imágenes, logos, etc. que estén bajo copyright de otras empresas. 

4. Prepara la compatibilidad con otras versiones<br>

5. Nada de betas o versiones ‘lite’<br>
Apple solamente validará versiones definitivas de la app, no quiere versiones de prueba. 

6. Convertir tu aplicación en un archivo binario utilizando Xcode

### Lanzamiento ✈️
* Darte de alta en el Apple Developer Program 🍏<br>
Tiene un costo de 99 dólares al año 💵 y servirá inscribirte como empresa 🏢 o contribuyente individua

<center>
<img src="https://www.techotopia.com/images/0/02/Apple_ios_developer_member_center.jpg" width="600px"/><br>
</center>

* Certificados 💎📝
El siguiente paso para la publicación de la aplicación es generar los certificados development y distribution.

* Registrar dispositivo 💻📱
Se debe registrar un dispositivo movil de Apple para probar la aplicación con las herraminetas del Developer Program de Apple.

* Generar un ID para la aplicación 💾 
Esta compuesto por un identificador asignado de forma automática y un sufijo determinado por el usuario.

* Aplicaciones de pago 💰
Apple conservará el 30% de los ingresos en caso de que tu aplicación sea de pago.

* Registro iTunes Connect ®️
Para publicar una aplicación iOS se necesita un registro personal para iTunes Connect que contenga toda la información para el despliegue y gestión de la aplicación en la App Store.

* Descripción de la app 🔧
En iTunes Connect se debe proporcionar toda la información de la app incluyendo capturas de pantalla.

* Enviar a revisión ✉️ 📬 ✅
La aplicación debe pasar por un proceso de revisión por parte de Apple. Este proceso se hace de manera manual y toma alrededor de dos días.

<center>
<img src="https://i.blogs.es/e4002a/650_1000_itunesc/450_1000.png" width="600px"/><br>
</center>



## Protección de la app 📄 

La protección de la aplicación es una de las cuestiones que genera muchas dudas entre los desarrolladores de aplicaciones es la relativa a cómo proteger su creación.

De entrada, desde el momento en que ésta es, como hemos dicho, un programa informático, el régimen jurídico que 'a priori' resulta de aplicación es el de los programas de ordenador regulado en los artículos 95 y siguientes de la Ley de Propiedad Intelectual.

Al respecto cabe indicar que las creaciones a las que se refiere esta Ley se encuentran "protegidas" legalmente, a diferencia del régimen de patentes, desde el momento de su creación. Así lo establece el artículo 1 al decir que "la propiedad intelectual de una obra literaria, artística o científica corresponde al autor por el solo hecho de su creación". Por tanto, desde el mismo momento de creación de la app el dueño exclusivo de los derechos de explotación de la misma no es sino su autor.

De lo que se trata cuando hablamos de "proteger" una obra es de poder probar que en una determinada fecha nadie más que su autor afirmaba haberla creado. Ello hace que el Registro de la Propiedad Intelectual tenga lo que los juristas llamamos una "eficacia declarativa", a diferencia del régimen de las patentes, donde el registro tiene "eficacia constitutiva".

En cualquier caso, para conseguir esta "protección" se puede recurrir a diferentes vías. Una de ellas es proceder a inscribir o "registrar" la obra en el Registro de la Propiedad Intelectual, donde hay un formulario específico para los programas de ordenador (DOC).

Otra podría ser utilizar algunos de los recursos análogos al registro físico que hay en Internet, tales como Safe Creative o Myfreecopyright y, según como pretendamos licenciar el programa, se podrían usar también iniciativas como Creative Commons o la española COLORIURIS.

Y hay más posibilidades, como por ejemplo depositar la obra ante notario o incluso mandarla por correo certificado a uno mismo y guardar el sobre sellado que se reciba sin abrir. En fin, son muchas las maneras por las que podríamos probar ante un juzgado que nosotros somos el autor de la aplicación con anterioridad a la fecha que el eventual usurpador defienda.
