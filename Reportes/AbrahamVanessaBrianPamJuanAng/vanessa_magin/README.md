# Proceso de publicación de aplicaciones
# App Store (Apple) 🍎
## Proceso ⚙
1. Crea un ID de Apple  
    Para ello necesitaras una dirección de correo electrónico válida, y puedes hacerlo de diferentes formas:  
    - Durante la configuración de tu nuevo iPhone o MacBook
    - Al usar AppStore o iTunes por primera vez
    - O registrandote en el sitio de Apple.com (https://appleid.apple.com/account/)
2. Unete al programa de desarrolladores de Apple  
    Primero registrate en https://developer.apple.com/, acepta el Acuerdo de desarrollador de Apple y listo, entrarás en el portal del Desarrollador.  
    Posteriormente deberas hacer clic en "Join the Apple Developer Program", despues en "Inscribirse" y por último pagar $99 dólares por una membresía de suscripción de un año.  
    Nota: Después de enviar y pagar tu registro de desarrollador de iOS, deberás esperar a que Apple procese tu pedido.

3. Crea un perfil de aprovisionamiento de distribución de iOS y un certificado de distribución  
    La forma más sencilla de hacerlo es a través de Xcode. Si la firma automática está habilitada, Xcode creará y administrará certificados, firmará identidades y manejará el registro del dispositivo por ti.  
    ¿Cómo firmar manualmente tu aplicación?  
    - Primero, agrega tu cuenta del Programa de desarrollador a Xcode si aún no lo haz hecho  
    - En el menú superior, selecciona Xcode, luego elije Preferencias  
    - Haz clic en Cuentas. En la esquina inferior izquierda de la ventana, presiona el signo + , luego Agregar ID de Apple…   
    - Ingresa el ID de Apple y la contraseña que usas para el Programa de desarrolladores de Apple, luego haz clic en Iniciar sesión  
    - A continuación, habilita la firma automática. En el Editor de proyectos, elije un destino y selecciona General  
    - Desplázate hacia abajo hasta la sección "Firma" y haz clic en el ícono del triángulo para expandir la configuración  
    - Haz clic en la casilla para administrar la firma automáticamente y selecciona tu equipo  
    Cuando conectes un nuevo dispositivo a tu Mac, Xcode lo detectará y lo registrará automáticamente en el perfil de aprovisionamiento de tu equipo. Ten en cuenta que para iniciar tu aplicación en un dispositivo, el dispositivo debe estar registrado en el perfil de aprovisionamiento de tu equipo.

4. Crea un registro de App Store Connect para tu aplicación
    - Para obtener una cuenta de App Store Connect puedes:  
        - Crear tu propia organización de App Store Connect y ser el agente del equipo. Para ello inicia sesión con el ID de Apple que utilizaste para inscribirse en el Programa de desarrolladores de Apple.  
        - O ser invitado por una organización existente como usuario con una función de administrador, técnico o administrador de aplicaciones.    
    - Agregar una nueva aplicación:  
    Para crear un nuevo registro de App Store Connect, necesitarás estos detalles: plataforma, nombre de la aplicación, idioma predeterminado, ID de paquete y SKU.  
    Utiliza palabras clave en el nombre de tu aplicación para optimizar el descubrimiento.  
    El ID del paquete debe coincidir exactamente con el identificador del paquete en el archivo Info.plist del proyecto Xcode (en la sección General> Identidad del objetivo).  
    - Para aplicaciones de paga:  
    Si tienes una aplicación de paga, deberás firmar un contrato que cubra las condiciones de pago.

5. Archiva y carga tu aplicación usando Xcode  
    Antes de que puedas enviar tu aplicación para revisión a través de App Store Connect, debes cargar la compilación a través de Xcode.  
    Para ello:  
    - En Xcode, selecciona Dispositivo iOS genérico como destino de implementación.  
    - Elije Producto en el menú superior y haz clic en Archivar.  
    - El organizador de Xcode se iniciará y mostrará los archivos que hayas creado en el pasado.  
    - Asegúrete de que la compilación actual esté seleccionada y haz clic en Subir a App Store en el panel de la derecha.  
    - Selecciona las credenciales y haz clic en Elegir.  
    - En la siguiente ventana que aparece, haz clic en Cargar.  
    - Aparecerá un mensaje de éxito cuando se complete la carga. Haz clic en Listo.

6. Configura los metadatos de tu aplicación y más detalles en el registro de App Store Connect.  
    En la pestaña "App Store" en App Store Connect, en la página "Información de la aplicación" puedes agregar idiomas, categorías y la URL de la Política de privacidad de tu aplicación.  
    Configura tu aplicación como gratuita o selecciona su nivel de precio en la página "Precios y disponibilidad".  
    En la pestaña "Funciones", puedes agregar configuraciones a cualquier tecnología de la App Store en tu aplicación, como Game Center y compras dentro de la aplicación.  
        
    - App Store:  
        - Sube las capturas de pantalla de tu aplicación (en formato JPEG o PNG y sin barras de estado). Puedes cargar un conjunto de capturas de pantalla para un dispositivo y usarlas para todos los demás tamaños.  
        Haz clic en Guardar después de que tus capturas de pantalla hayan terminado de cargarse.  
        - Ingresa la descripción de tu aplicación, las palabras clave, la URL de soporte y la URL de marketing.  
        La descripción y las palabras clave de su aplicación son fundamentales. Asegúrese de optimizarlos para el descubrimiento.  
        La URL de soporte puede ser tan simple como una página de destino con un formulario de contacto.  
        - En la sección "Información general de la aplicación" carga el ícono de la aplicación, ingresa el número de versión e información de contacto y derechos de autor.  
        El icono de la aplicación debe ser de 1024px x 1024px.  
        El número de versión debe coincidir exactamente con el de Xcode.  
        - Haz clic en Editar junto a "Calificación" y seleccione las opciones aplicables para tu aplicación. Se honesto: tu aplicación puede ser rechazada durante la revisión si no coincide con su calificación.  
        - En la sección "Información de revisión de la aplicación", ingresa tu información de contacto, cualquier nota que tengas para el revisor, configura la fecha de publicación de la versión y guarda los cambios.  
        Para los primeros lanzamientos, normalmente debes dejar la fecha de lanzamiento de la versión como automática.

7. Envía tu aplicación para su revisión  
    Desplázate a la sección "Crear" en el registro de App Store Connect de tu aplicación.  
    Haz clic en "Seleccione una compilación antes de enviar su aplicación".  
    Elije la compilación que cargaste a través de Xcode. Haz clic en Listo, Guardar y luego en Enviar para revisión.  
    Por último, responde las preguntas sobre cumplimiento de exportaciones, derechos de contenido e identificador de publicidad y haz clic en Enviar.  
    El estado de su aplicación ahora es "Esperando revisión".

8. Verifique el estado de su aplicación  
    En App Store Connect, seleccione Actividad en el menú horizontal superior, luego App Store Versions en el panel de la izquierda.  
    - ¿Cuánto tiempo se tarda en obtener la aprobación de la App Store?  
    En la mayoría de los casos, se tarda entre uno y tres días en recibir la aprobación, y su aplicación puede tardar hasta 24 horas en aparecer en la App Store después de la aprobación.  
    - Si la aplicación es rechazada:  
        - Deberás realizar las correcciones necesarias antes de poder enviar tu aplicación nuevamente para su revisión. Utiliza el Centro de resoluciones en App Store Connect para comunicarte con Apple sobre cualquier pregunta que puedas tener. 
        Y no olvides revisar las reglas para asegurarte que no inflijas ninguna, puedes revisarles de manera general en el siguiente apartado o en este link: https://developer.apple.com/app-store/review/guidelines/  
        Una de las razones más comunes de rechazo de la App Store es el rendimiento. Asegúrete de que tu aplicación esté completa, la hayas probado a fondo y hayas corregido todos los errores. El uso de una herramienta de informe de errores durante las pruebas beta ayudará a reducir las posibilidades de que tu aplicación sea rechazada debido a problemas de rendimiento.  
    - Si la aplicación es aprobada:  
        ¡Felicidades! Ahora estás en la App Store. Puede ver descargas, ventas, calificaciones y reseñas directamente en App Store Connect. 🎉🥳
## Reglas 📐
1. Seguridad
    - La aplicación **no** debe tener:  
    Contenido difamatorio, discriminatorio o violento, material abiertamente sexual o pornográfico, comentarios o citas inexactas o engañosas e información y características falsas. 🚫
    - Las aplicaciones con contenido generado por el usuario **deben** incluir:  
    Un método para filtrar el material censurable, mecanismo para informar sobre contenido ofensivo, capacidad de bloquear a usuarios e información de contacto para que los usuarios puedan comunicarse con usted fácilmente. ✔
    - Las aplicaciones de categoría infantil **no** pueden incluir:  
    Enlaces fuera de la aplicación, oportunidades de compra, publicidad ni enviar información de identificación personal o información del dispositivo a terceros. ❌
    -  Las aplicaciones médicas **deben**:  
    Revelar claramente los datos y la metodología para respaldar la precisión de las mediciones de salud y siempre recordar a los 👩‍💼🙎‍♂️👨‍💼 que consulten con un médico además de usar la aplicación y antes de tomar cualquier decisión.
2. Desempeño  
    - Completitud de la aplicación:  
    Los envíos a Revisión de aplicaciones deben ser versiones finales con todos los metadatos necesarios y URL completamente funcionales incluidas; El texto del marcador de posición, los sitios web vacíos y otros contenidos temporales deben eliminarse antes de enviarlos. 
 
    - Prueba Beta:  
    Demostraciones, betas y versiones de prueba de la aplicación no pertenecen a la App Store, use TestFlight en su lugar. 
 
    - Metadatos precisos:  
    La descripción, capturas de pantalla y vistas previas de la aplicación deben reflejar con precisión la experiencia principal de la aplicación y se deben actualizar con las nuevas versiones. Adicionalmente deben ser apropiadas para todo el público (clasificación de edad de 4+), incluso si la aplicación tiene una clasificación más alta. 
 
    - Compatibilidad de hardware:  
    Es recomendable crear aplicaciones universales que los clientes puedan usar en todos sus dispositivos.  
    Las aplicaciones no deben agotar rápidamente la batería, generar calor excesivo o ejecutar procesos en segundo plano no relacionados, como la minería de criptomonedas.  
    Las aplicaciones distribuidas a través de Mac App Store tiene algunos requisitos adicionales, consultelos aquí: https://developer.apple.com/app-store/review/guidelines/#hardware-compatibility

    - Requisitos de software:  
    Las aplicaciones deben ser independientes en sus paquetes y no pueden leer ni escribir datos fuera del área de contenedor designada, ni pueden descargar, instalar o ejecutar código que introduzca o cambie características o funcionalidad de la aplicación, incluidas otras aplicaciones.  
    Se rechazarán las aplicaciones que transmitan virus, archivos, códigos informáticos o programas que puedan dañar o interrumpir el funcionamiento normal del sistema operativo y / o las funciones del hardware.  
    Para más información consulte: https://developer.apple.com/app-store/review/guidelines/#software-requirements

3. Negocios  
    Asegúrate de explicar tu modelo de negocios en tus metadatos y notas de revisión de aplicaciones.  
    Serán rechazadas las aplicaciones caras que intenten engañar a los usuarios con precios irracionalmente altos.  
    
    Si se descubre que has intentado manipular reseñas, se tomarán medidas para preservar la integridad de la App Store, lo que puede incluir la expulsión del Programa para desarrolladores.

4. Diseño  
    Los clientes de Apple valoran mucho los productos que son simples, refinados, innovadores y fáciles de usar, es por ello que debes asegurarte de respetar los siguientes puntos: https://developer.apple.com/app-store/review/guidelines/#design
5. Legal  
    Es tu responsabilidad comprender y asegurarte de que tu aplicación cumpla con todas las leyes locales, y por supuesto, se rechazarán las aplicaciones que soliciten, promuevan o fomenten un comportamiento delictivo o claramente imprudente. En casos extremos, como aplicaciones que faciliten la trata de personas y / o la explotación de niños, se notificará a las autoridades correspondientes.

# Play Store (Google) 🤖
## Proceso ⚙
1. Crear una cuenta de desarrollador de Google:  
    Puedes utilizar cualquiera de tus cuentas de Google actuales o crear una nueva. 
    El proceso incluye firmar el acuerdo de distribución para desarrolladores de Google Play, agregar información personal y pagar una tarifa de registro única de aproximadamente $25 dólares. 💵 
    Por lo general, no se necesitan más de dos días para obtener la aprobación de Google. 
2. Agregar una Merchant Account 🛒:  
    Si planes vender aplicaciones de paga o compras dentro de la aplicación, debes crear una Merchant Account de Google. Donde podras administrar las ventas de aplicaciones y sus pagos mensuales, así como analizar informes de ventas.
    Una vez que termines de crear el perfil de tu Merchant Account, la cuenta de desarrollador se vincula automáticamente a él. 
3. Preparar los documentos 📄:  
    Es recomendable comenzar a preparar el Acuerdo de licencia de usuario final (EULA) y la Política de privacidad con anticipación.  
    Puedes tomar documentos de aplicaciones similares como referencias y crear los tuyos o pedirle a un abogado que lo haga todo desde cero. 👩‍💼👨‍💼  
    EULA es un acuerdo entre el propietario y el usuario del producto. En resumen, contiene: 
    - Qué pueden hacer los usuarios con la aplicación y qué no pueden hacer
    - Tarifas de licencia
    - Información de propiedad intelectual, etc.  
    Los Términos de uso o los Términos y condiciones explican qué servicios se ofrecen a los usuarios y cómo se espera que se comporten a cambio. Aunque Google no exige Condiciones de uso, es mejor publicarlas. Puedes crear un documento, agregando los capítulos de Política de privacidad y Términos de uso.
4. Estudiar las políticas para desarrolladores de Google 🧐:  
    Es el momento de asegurarse de que todas las funciones que se implementaran en la aplicación estén alineadas con las Políticas para desarrolladores de Google.  
    Si Google decide que el producto viola algunos capítulos de la política, puede ser rechazado, bloqueado o incluso eliminado de Play Store.  
    Google trabaja constantemente en sus políticas, y es importante monitorear los cambios y mantenerse actualizado incluso después de que se publique la aplicación. (Para conocer algunas de las reglas más importantes ver el apartado de reglas al final de este documento).
5. Requisitos técnicos 🛠:  
    Antes de pasar al proceso de carga, debes verificar lo siguiente:

    - ID de paquete único:
    El nombre del paquete debe ser adecuado durante la vida útil de la aplicación ya que no se puede cambiar después de la distribución. Puedes establecer el nombre del paquete en el archivo de manifiesto de la aplicación. 

    - Versión de la aplicación firmada con un certificado:
    Cada aplicación debe estar firmada digitalmente con un certificado de desarrollador. El certificado se utiliza para identificar al autor de una aplicación y no se puede volver a generar.

    - Tamaño de la aplicación:
    Google estableció el tamaño límite del archivo cargado: 100 MB para Android 2.3 y superior (nivel de API 9-10, 14 y superior) y 50 MB para versiones inferiores de Android.
    Si tu aplicación excede este límite, siempre puedes cambiar a Archivos de expansión APK. 

    - Formato de archivo:
    Google acepta dos posibles formatos de lanzamiento: paquete de aplicaciones y .apk. Sin embargo, .aab es el preferido. Para utilizar este formato, debes inscribirte en la firma de aplicaciones de Google Play.
6. Crear la aplicación en la consola de Google 🔮:
    - Accede a la pestaña Todas las aplicaciones en el menú
    - Selecciona Crear aplicación
    - Elije el idioma predeterminado de la aplicación en el menú desplegable
    - Agrega una breve descripción de la aplicación
    - Y toca Crear  
    Después de esto, serás llevado a la página de entrada de la tienda, donde deberas agregar los datos completos sobre la aplicación.
7. Store Listing 📊:  
    Contiene la información más importante para la optimización de la tienda de aplicaciones (ASO) y brinda a los usuarios más detalles sobre la aplicación antes de descargarla.  
    
    **- Descripción del producto:** Contiene el título de la aplicación (hasta 50 símbolos), una breve descripción (hasta 80 símbolos) y una descripción completa (hasta 4000 símbolos).  
    **- Capturas de pantalla:** Puede agregar de 2 a 8 capturas de pantalla. Con las siguientes características: JPEG o PNG de 24 bits y de 320px a 3840 px.  
    **- Icono:** 512 px por 512 px, PNG de 32 bits (con alfa) y tamaño máximo de archivo: 1024 KB.  
    **- Video promocional:** Si tienes algún video promocional, puedes agregar un enlace a tu canal de YouTube.  
    **- Etiquetas:** Puedes elegir de la lista las palabras clave más relevantes para tu aplicación para un mejor ASO.  
    **- Localización:** Si la aplicación admite varios idiomas, menciónalos todos y agrega traducciones de la información de la aplicación. Se recomienda incluir capturas de pantalla e imágenes localizadas.  
    **- Tipo de aplicación y categorización:** Primero, a través del menú desplegable, selecciona el tipo de aplicación: juego o aplicación. Luego, elije la categoría a la que pertenece tu aplicación.  
    **- Detalles de contacto:** Proporciona los contactos del servicio de soporte: URL del sitio web, correo electrónico y teléfono.  
    **- Política de privacidad:** Google requiere que se agregue un enlace a la Política de privacidad de la applicación.
8. Calificación del contenido 💯:  
    Para no ser marcado como una aplicación sin clasificar (que puede llevar a la eliminación de la app), realiza un cuestionario de calificación.  
    La información proporcionada en el cuestionario debe ser precisa. Cualquier tergiversación del contenido de la aplicación puede dar lugar a la suspensión o eliminación de la cuenta de Play Store.
    - Haz clic en Guardar cuestionario una vez que completes la encuesta
    - Haz clic en Calcular calificación
    - Al final, haz clic en Aplicar calificación para confirmar la calificación
9. Precio de la aplicación 💰:  
    En la sección Precios y distribución, debes completar la siguiente información sobre la app:
    - Si es gratuita o de pago
    - Países en los que estará disponible
    - Si estará disponible solo en dispositivos específicos
    - Si tiene contenido sensible y no es adecuada para niños menores de 13 años
    - Si contiene anuncios
10. Cargar el APK y enviarlo para revisión ✉:  
    Ve a la sección Lanzamientos de aplicaciones en el panel izquierdo. Aquí encontraras tres opciones para publicar la aplicación: producción, beta y alfa.  
    Una vez que elijas el tipo de lanzamiento, sigue estos pasos:
    - Elije Administrar (Producción / Beta / Alfa)
    - Haz clic en Editar versión
    - Carga un APK o paquete de aplicaciones. El nombre de la versión se agregará automáticamente.
    - Haz clic en Revisar para confirmar los cambios y envia la aplicación a revisión presionando Iniciar lanzamiento a producción.  
    La aplicación se lanzará inmediatamente después de que pase la revisión. Por lo general, demora hasta 2 días. Google dice que el proceso de revisión podría demorar hasta 7 días o incluso más.  
    Una vez que se revisa la aplicación, recibiras una notificación en el Panel de la consola de Google. 

## Reglas 📏
1. Definición de contenido restringido  
    https://www.youtube.com/watch?v=5vzrsCbHIOQ&feature=emb_title
2. Store Listing y promoción  
    https://www.youtube.com/watch?v=DgZWhWBfsXc&feature=emb_title
3. Suplantación de identidad  
    https://www.youtube.com/watch?v=tkfIRg0ZTYY&feature=emb_title
4. Propiedad intelectual  
    https://www.youtube.com/watch?v=x_kJ8Ye107k&feature=emb_title
5. Reglas de monetización y anuncios  
    https://www.youtube.com/watch?v=qxQU9a0VYp8&feature=emb_title
6. Regulación de privacidad, seguridad y engaño  
    https://www.youtube.com/watch?v=zMHv1yH7C4E&feature=emb_title
7. Spam y funcionalidad mínima  
    https://www.youtube.com/watch?v=0PGBqQWgBEA&feature=emb_title  
Para conocer más visita: https://play.google.com/about/developer-content-policy/