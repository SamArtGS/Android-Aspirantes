# Proceso de publicación de aplicaciones

# App Store (Apple) 🍎
## Pre-requisitos 📋

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
2. 

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
    - Descripción del producto:  
    Contiene el título de la aplicación (hasta 50 símbolos), una breve descripción (hasta 80 símbolos) y una descripción completa (hasta 4000 símbolos).
    - Capturas de pantalla:  
    Puede agregar de 2 a 8 capturas de pantalla. Con las siguientes características: JPEG o PNG de 24 bits y de 320px a 3840 px.
    - Icono:  
    512 px por 512 px, PNG de 32 bits (con alfa) y tamaño máximo de archivo: 1024 KB.
    - Video promocional:  
    Si tienes algún video promocional, puedes agregar un enlace a tu canal de YouTube.
    - Etiquetas:  
    Puedes elegir de la lista las palabras clave más relevantes para tu aplicación para un mejor ASO.
    - Localización:  
    Si la aplicación admite varios idiomas, menciónalos todos y agrega traducciones de la información de la aplicación. Se recomienda incluir capturas de pantalla e imágenes localizadas. 
    - Tipo de aplicación y categorización:  
    Primero, a través del menú desplegable, selecciona el tipo de aplicación: juego o aplicación. Luego, elije la categoría a la que pertenece tu aplicación.
    - Detalles de contacto:  
    Proporciona los contactos del servicio de soporte: URL del sitio web, correo electrónico y teléfono.
    - Política de privacidad:  
    Google requiere que se agregue un enlace a la Política de privacidad de la applicación.
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