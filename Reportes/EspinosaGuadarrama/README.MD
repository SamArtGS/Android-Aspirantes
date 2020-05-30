# Proceso de publicación de aplicaciones en la App Store y Play Store, reglas y más... 📱🍎🤖

___

# Objetivo del reporte 📄

<p align=" justify">
  Poder analizar y conocer cuáles son los pasos a seguir para poder realizar una publicación sobre cualquier tipo de app en las tiendas 
  de distribución de aplicaciones móviles para teléfonos celulares Apps Store y Play Store.
</p>

___

# ¿A quién va dirigido? 👀

<p align=" justify">
  Va dirigído para cualquier público, pero en específico para aquellas personas que son principiantes en el desarrollo móvil o también 
  para aquellos que nunca han publicado ningun tipo de aplicación en estas tiendas.
</p>

___

<div align="center">
  <img src="https://cmsphoto.ww-cdn.com/superstatic/81328/art/grande/34325105-31402787.jpg?v=1559324698" alt="Imagen de tiendas de apps" width="500"/>
</div>

<br>

<p align=" justify">
  Antes de comenzar, es necesario comentar que para poder realizar el proceso de publicación sobre cualquier tipo de app, es necesario 
  que esta se encuentre en funcionamiento (no necesariamente terminada) y a su vez se hayan realizado los testings necesarios en 
  diversos dispositivos móviles, con el fin de evitar inconvenientes en el momento de realizar cualquiera de los pasos a continuación.
</p>

<p align=" justify">
  También es recomendable contar con cualquier tipo de documentación que sea referente sobre la app a publicar, ¿Cuál es su objetivo?, 
  ¿Cómo funciona?, ¿A qué público va dirigído?, ¿Cuenta con opciones de pago?, ¿Es gratuita?, entre preguntas similares que siempre 
  deben formularse.
</p>

# Primera parte: publicación de app en la App Store 🍎

<p align=" justify">
  La tienda virtual App Store es una de las tiendas más reconocidas debido a sus estrictas normas y restricciones que cumplen para cada 
  app que se encuentre en ella, por lo que es de esperarse que cada app publicada en está tienda deba cumplir con una serie de pasos, 
  reglas, normas y políticas para poder ser aceptada, además de ser la única tienda virtual de apps iOS. Existen cientos de tiendas que 
  tratan de ser similares a esta (siendo ilegales o falsas) debido a la tarea complicada para poder instalar apps de terceros en los 
  dispositivos de la marca Apple, teniendo apps en estas tiendas que puedan perjudicar la integridad y seguridad del dispositivo; No 
  obstante las apps que han sido publicadas en la App Store (o la gran mayoría) cuenta con la certeza de calidad y lineamientos que la 
  empresa Apple exige y brinda a sus usuarios.
</p>

<div align="center">
  <img src="https://www.muycomputerpro.com/wp-content/uploads/2018/07/AppStore.jpg" alt="Imagen de App Store" width="700"/>
</div>

### 0) Contar con el equipo necesario

<p align=" justify">
  Este punto en realidad siempre debe ser el preámbulo de cualquier publicación de app en la tienda App Store, ya que en realidad es 
  necesario contar con un equipo de cómputo de la marca Apple (al igual la versión de sistema operativo más reciente es recomendable) 
  para poder publicar las apps iOS, por el hecho de que la app se deberá convertir en un archivo binario usando el software Xcode, un 
  programa que solo está disponible para MacOS, no obstante, si tu prioridad por el momento no es publicar tu app en la App Store y 
  solo es informarte y empezar a crear apps iOS, entonces existen alternativas en los equipo de cómputo con sistemas operativos 
  GNU/Linux y Windows, como lo son Adobe Flex o Xamarín, frameworks que nos permitirán implementarlos en ides como Eclipse, FlashBuilder 
  o Visual Studio para poder compilar nuestros códigos.
</p>

<div align="center">
  <img src="https://support.apple.com/library/content/dam/edam/applecare/images/en_US/mac/macos-mojave-get-software-hero.jpg" alt="Imagen de dispositivos con MacOS" width="450"/>
</div>

### 1) Crearse un cuenta de desarrollador de Apple

<p align=" justify">
  Primero es nesario crearse una cuenta de desarrollador, la cual es totalmente gratuito y, de momento, nos servirá para aprender,
  estudiar desarrollo iOS sin tener que adquirir la suscripción anual de Apple, también para contar con el acceso a herramientas 
  necesarias como lo son el ide XCode que se utilizara para el desarrollo de apps, así como a la documentación oficial de Apple y 
  contenido adicional que nos será de gran utilidad. Puede crear su cuenta ingresando a la página oficial de desarrolladores de apple o 
  desde dando click <a href="https://developer.apple.com/">aquí</a>.
</p>

<div align="center">
  <img src="https://programandoapps.com/wp-content/uploads/2019/01/cuenta-de-desarrollador-de-apple-768x454.png" alt="Imagen de cuenta de desarrollador Apple" width="450"/>
</div>

### 2) Suscripción al programa Apple Developer

<p align=" justify">
  Una vez se tenga una cuenta de desarrollador de apple al igual que la app deseada a subir, será necesario subscribirse al programa de 
  Apple Developer, ya que hay ciertas tareas que no podrán hacerse con la cuenta gratuita y se deberá adquirir una suscripción.
  Esta suscripción se encuentra actualmente con un coste desde 99 Dolares o 99 Euros (dependiendo la región) y es necesario renovarla 
  anualmente.
</p>

<p align=" justify">
	Esta subscribción permite poder publicar las apps en el App Store y acceder a ciertos servicios que con la cuenta gratuita no son 
  posibles, como las notificaciones push, probar las apps en dispositivos físicos, entre otras funciones. Para más información sobre 
  la subscripción, puede dar click <a href="https://developer.apple.com/es/support/enrollment/">aquí</a>. También si así lo desea, 
  puede redireccionarse a este 
  <a href="https://medium.com/@mortegac/tipo-de-licencias-para-desarrolladores-app-store-4fc5acebfd5f">artículo</a> para obtener más 
  detalles sobre los tipos de subscripción existentes en Apple.
</p>

### 3) Crear los certificados de Apple necesarios

<p align=" justify">
  El siguiente paso es crear 3 certificados a través del Member Center. Este es un proceso complejo que incluye una serie de 
  certificados, identificadores y perfiles para poder compilar la aplicación. Los pasos a dar son:
</p>

1. Una vez dentro del Member Center, entrar en “Certificates, Identifiers & Profiles“.
2. Pulsar sobre Certificates.
3. Pulsar sobre Download en el certificado de tipo iOS distribution. Se deberá abrir para que see guarde en tu “Llavero-Keychain”.
4. Pulsar en Idenfiers.
5. Pulsar sobre el botón + Add.  Deberá introducir un nombre para el identificador y, posteriormente, el identificador (Bundle ID). Más
	 adelante se tendrá que poner este Bundle ID en su proyecto de xCode (el código con el que se realizan la apps para el App Store).
6. Seguidamente, pulsar sobre Continue y, por último, en Submit.
7. Pulsar en Provisioning Profiles -> Distribution.
8. Pulsar sobre el botón + Add y selecciona la opción Distribution, App Store. 
9. Pulsar en Continue. Después, selecciona el Bundle ID creado en el paso anterior y pulsa en Continue.
10. Seleccionar el certificado para ios Distribution y pulsa en Continue. Pon un un nombre para el perfil (Provisioning) y pulsar en 
   Generate.
11. Por último, pulsar en Download para descargar el provisioning y abrirlo para que se incluya en tu lista de perfiles de xCode.

<p align=" justify">
  Para más información acerca de los certificados acceda al siguiente 
  <a href="https://developer.apple.com/es/support/certificates/">link</a>.
</p>

### 4) Preparación de elementos gráficos
<p align=" justify">
  Durante el proceso de carga de la aplicación Apple se irá solicitando una serie de elementos que son fundamentales para el éxito de su
  app. Por eso, antes de seguir, es importante que dedicarle el tiempo necesario para crear estos archivos.
</p>

Los elementos que se deben preparar son:

1. El icono de la aplicación.
2. Las capturas promocionales.
3. Un vídeo promocional.

### 5) Cargar la app en  iTunes Connect

<p align=" justify">
	El proceso de carga de la aplicación en iTunes se realiza desde iTunes Connect donde tienes que acceder tu usuario y contraseña. Una 
  vez dentro, tienes que seguir los siguientes pasos para colgar una aplicación en la APP Store:
</p>

1. Pulsa sobre “Manage your apps“.
2. Pulsa en Add New App.
3. Incluye la información sobre la aplicación y pulsa en Continue:  

	- Idioma.
	- Nombre de la aplicación.
	- Identificador de la app.
	- Selecciona el Bundle ID de la aplicación  
  
4. Selecciona la fecha en la que estará disponible tu aplicación en AppStore una vez que se apruebe por Apple. Además, debes incluir el
   precio de la aplicación. Después, pulsa en Continue.
5. Indica el número de versión, Copyright y dos categorías que describan la aplicación que has desarrollado.
6. Escribe una descripción para la aplicación y una serie de palabras que la describan. Estos dos aspectos son muy importantes ya que de
   ellos dependerá que los usuarios te encuentren en la búsqueda en el AppStore.
7. Introduce una web de soporte.
8. Incluye la información de contacto.
9. Sube las imágenes de la aplicación que ya has preparado: el icono y las diferentes capturas de pantalla. Guarda la configuración.
10. Entra en la descripción de la aplicación y pulsa en Ready to Upload Binary. Debes seleccionar NO y pulsar en Save y, después en 
    Continuar.  

En este momento tienes la aplicación preparada para ser subida. Ahora llega el momento de subirla desde Xcode.  

<p align=" justify">
  Esta prepared to Upload. Ahora hay que subirla desde Xcode que es el entorno de desarrollo integrado (IDE) creado por Apple y que
  trabaja de manera conjunta con Interface Builder, la herramienta gráfica para crear interfaces de usuario. Puedes descargarla desde la
  Mac App Store.
</p>

En Xcode puedes definir los siguientes valorespara tu app:  

- Versión: Es la versión de tu app.
- Build: Es el número de versión del archivo que vas a subir. Para colgar una aplicación en la APP Store puedes subir varios archivos a
  iTunes Connect y después seleccionar el que quieres enviar para su revisión. Este valor es invisible para el usuario que se descargue
  tu app.
  
### 6) Validación de la app

Para cerrar el proceso de carga de la app debes seguir estos pasos:

1. Abre tu proyecto de XCode y comprueba que tu Bundle Id es el mismo que has creado en Apple Developer identifier.
2. Selecciona tu provisioning profile.
3. En las opciones generales del proyecto en la pestaña Build Settings, busca Code Signing Identity, y selecciona el provisioning creado
   para el campo Release.
4. Pulsa  en la pestaña Product y en Archive. Si no detecta ningún error generará nuestro tu archivo de manera correcta.
5. Selecciona la opción Validate. Aparecerá una ventana con los datos que se han cargado de tu cuenta de iTunes Connect. En caso
   contrario, debes poner tu usuario y clave.
6. Si la aplicación pasa la prueba te lo indicará.
7. Una vez que la app sea validada pulsa en Distribute e indica Submit to the iOS App Store.

<p align=" justify">
  En este momento ya tienes la aplicación cargada y sólo debes esperar a que se cierre el proceso de revisión del equipo de Apple. Si,
  por lo que sea, hay algo en la aplicación que no funciona correctamente te lo indicarán. Esto puede ser tanto por un error de tu
  programación como porque Apple no permite alguna funcionalidad que has incorporado.
</p>

<p align=" justify">
  Para terminar el proceso de colgar una aplicación en la APP Store debes corregir los errores y volver a distribuirla. En este caso,
  para poder subir un nuevo archivo debes de cambiar el número de Build. Si el primero era el 1.0, el segundo archivo podría ser el 1.1.
</p>

# Segunda parte: publicación de app en la Play Store 🤖

<p align=" justify">
  Play Store es una de las tiendas para comprar y descargar app móviles más famosas que existe mundialmente, siendo una tienda muy 
  amplia de apps como también muy flexible con estas, siendo más sencillo poder publicar una app aquí que con su "rival" más cercano 
  (App Store).
</p>

<div align="center">
  <img src="https://fotografias.lasexta.com/clipping/cmsimages02/2019/10/17/0236F2C7-2A64-4317-8503-225DBC27CBF7/58.jpg" 
  alt="Imagen de Play Store" width="700"/>
</div>

<p align=" justify">
  Para poder publicar una app en esta tienda solamente es necesario contar con un equipo de cómputo que permita subir el programa donde 
  se encuentra la app a diferencia de App Store, y los paso a seguir son:
</p>

### 1) Registrarse y crear una cuenta de desarrollador

<p align=" justify">
  Primero se necesitará crear una cuenta de desarrollador en Google Play. Para ello, se necesita contar con una cuenta de Google e 
  proporcionar la información personal necesaria, la cual se pedira mientras se realizan los pasos.
</p>


<div align="center">
  <img src="https://academiaandroid.com/wpaa/wp-content/uploads/2016/11/7.2.Condiciones.png" 
  alt="Imagen de registro de cuenta de desarrollador de google" width="700"/>
</div>


Para más información por favor de click al siguiente 
<a href="https://support.google.com/googleplay/android-developer/answer/6112435?hl=es-419">enlace</a>.

<p align=" justify">
  Una vez acepte el acuerdo de distribución para desarrolladores, deberá pagar la cuota de registro: un único pago de 25 dólares. A
  continuación, puede incluir la información de su cuenta. A los usuarios se les mostrará tu nombre de desarrollador, pero podrá
  agregar más información de contacto: sitio web, email de contacto y dirección física, si asi lo desea.
</p>

<p align=" justify">
  Además, si su app incluye compras en la app o es de pago, también deberá configurar un perfil de pagos. Este perfil le permitirá
  controlar los pagos mensuales, además de acceder a los informes de ventas desde Play Console.
</p>

### 2) Subir la app

<p align=" justify">
  Una vez que se haya registrado y obtenga una cuenta de desarrollador de Google Play, podrá subir apps a esta plataforma mediante Play 
  Console.
</p>

<p align=" justify">
  En el menú de Play Console, seleccione ‘Todas las aplicaciones’ y haga clic en ‘Crear Aplicación’. Ahora deberá seleccionar el idioma 
  predeterminado y agregar el título de su app que aparecerá en la tienda. Aunque si tienes dudas, no te preocupes: podrás cambiarlo más 
  adelante. Por el momento, solo quedará hacer clic en ‘Crear’.
</p>

### 3) Completar la ficha de Play Store

<p align=" justify">
  Antes de subir la app, se deberá completar la ficha de la app de Play Store. Se trata de la información que verán los usuarios y que 
  permitirá que te encuentren a través de las búsquedas.
</p>

### 4) Subir la APK

<p align=" justify">
  Ahora es el momento de subir el código fuente de su app o APK, pero antes de poder cargar su APK, necesitará crear una versión 
  de la app. En Play Console podrá crear versiones de la aplicación, en el menú ‘Gestión de versiones’ / ‘Versiones de la 
  aplicación’.
</p>

<p align=" justify">
  Podrá escoger si desea lanzar una prueba interna, una versión cerrada para un grupo amplio de testers, una versión abierta o ya, 
  crear una versión de producción que estará disponible para todos los usuarios de la aplicación.
</p>

### 5) Clasificación de contenido

<p align=" justify">
  Las aplicaciones de Google Play deben dar información a los usuarios de su clasificación por edades. Es muy importante que complete  
  el cuestionario de clasificación de contenido tras subir el código fuente. De lo contrario, su aplicación se mostrará como ‘Sin  
  clasificar’ y podría acabar siendo eliminada de la tienda.
</p>

<p align=" justify">
  Para ello, desde Play Console selecciona la aplicación y en el menú de la izquierda, selecciona ‘Presencia en Google Play Store’ /  
  ‘Clasificación de contenido’.
</p>

### 6) Establecer precio y la distribución

<p align=" justify">
  El primer paso es decidir si la app será gratuita o de pago. Tener en cuenta que siempre se podrá convertir una app de pago en una  
  gratuita, pero desgraciadamente (o afortunadamente) no a la inversa. En este punto, también puede marcar en qué países desea que 
  su aplicación se encuentre disponible.
</p>

### 7) Enviar la app a revisión

<p align=" justify">
Antes de poder envíar su app a revisión, repasa la información que ha ido completando. Asegúrese de que el nombre sea el correcto, la ficha de la Play Store contenga información relevante, etc. Si toda la información está completa, verá que cada sección tendrá un check verde.
</p>

<p align=" justify">
  En este punto, tan sólo deberá volver al apartado de ‘Versiones de la aplicación’, marcar la versión que quieres lanzar y seleccionar 
  ‘Revisar y Lanzar’, para comprobar que no hay problemas con la versión. Tan sólo quedará seleccionar ‘Confirmar lanzamiento’ para  
  subir la app a Google Play Store.
</p>

<p align=" justify">
  Siguiendo estos pasos, tanto para el caso de App Store como para Play Store, podrá subir su app en cualquiera de estas tiendas, aunque 
  la decisión final para que su app pueda estar en estas tiendas corresponderá si cumple con las nórmas, reglas, contratos establecidos, 
  entre otras cosas, dependiendo tanto la tienda como también la región y otros factores que pueden determinar su publicación.
</p>
___

# Referencias

- https://www.antevenio.com/blog/2016/10/como-colgar-una-aplicacion-en-la-app-store/
- https://medium.com/devschile/publicando-en-la-app-store-y-no-morir-en-el-intento-1f17553dc8b8
- https://medium.com/@mortegac/tipo-de-licencias-para-desarrolladores-app-store-4fc5acebfd5f
- https://www.youtube.com/watch?v=tg6YcD52jNA&t=1s
- https://www.yeeply.com/blog/guia-subir-app-google-play-store/
