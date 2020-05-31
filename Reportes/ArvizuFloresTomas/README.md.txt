# *ANÁLISIS DE TENSOR FLOW Y QUÉ PROYECTO HARÍAS TÚ*

Tomas T. Arvizu Flores

### 0) Caracerísticas en común de los problemas que se resuelven

    -Son irresolubles deterministicamente en un tiempo práctico
    -El comportamiento estadístico es difícil de determinar con presición 
    -Pueden ser parcialmente resueltos por interpretación «humana»

### 1) Powered by TensorFlow: helping paleographers transcribe medieval text using machine learning

- [TensorFlow en archivo vaticano para leer textos antiguos](https://www.youtube.com/watch?v=v-FgOACRgfs&t=37s)

     Los humanos analizan los textos en un tiempo muy largo, de hecho si se consideran la cantidad de textos que se crean al día y los que se recuperan, se puede decir que el Vaticano no es el único que está en problemas. 
     
     Como se haría computacionalmente es parecido a muchos otros casos donde las formas variadas de un «objeto» hacen difícil resolver el problema. Pensando en una imagen de alguna letra «a» de aquellos textos antiguos, primero se puede descomponer en fragmentos y esos fragmentos pueden ser evaluados por «neuronas», en el fondo, seran evaluados por una función que dirá si cuple con ciertas características para ser de uno u otro símbolo. Después, pasando por varias neuronas la clasificación terminara en decantarse más por una categoría que por otra. Todo con cieto margen de error, pero este error es necesario  porque lo que podemos considerar una «$\alpha$» como una «a» a pesar de ser distintas.
     
     Esa es la idea más básica de analizar una imagen y decir si representa una u otra cosa. Pero, el trabajo va más alla, pues intenta interpretar y traducir los datos. Claro que una vez teniendo el texto, una cosa que para nosotros significa «hola» para alguien del pasado o en cierto contexto pudo haber significado «¿quiere pelear?». En este aspecto se puede hacer un proceso parecido al anterior (dividiendo ahora en palabras), pero las personas que tendrían que estar evaluando el entrenamiento del algoritmo serían especialistas en esa escritura. 
     
### 2) Powered by TensorFlow: utilizing deep learning to better predict extreme weather

- [TensorFlow en Berkeley para predecir desastres climáticos](https://www.youtube.com/watch?v=p45kQklIsd4&t=8s)
    
    A diferencia del caso anterior, el como hacen los humanos esto depende del avance de las computadoras. El análisis de todos los datos climáticos es, a diferencia del caso anterior, de interés mundial. 
    
    Uno de los desarrolladores menciona que se usaron «modelos de segmentación» que estan relacionados con las redes neuronales y se usan para segmentar las imágenesy despues con TensorFlow para mejorar modelos que se ajusten lo «suficientemente bien» para un modelo en especifico. Quizá evaluaron su éxito a partir de análisis hechos por expertos. 
    
    Ahora, una cosa es el manejo de los datos y otra el tratarlos. Se necesita de una capacidad inmensa, por ello que usan computadoras distribuidas en grandes regiones para hacer el trabajo. Puede que cada una de las computadoras reciba la información y funcione como un conjuntos de neuronas y así conectarse con otra computadora que sea el siguiente conjunto de neuronasn, formando todas una red neuronal. 
    
    
### 3) TensorFlow helping Médecins Sans Frontières staff prescribe antibiotics for bacterial infections

- [TensorFlow en laboratorios para analizar eficiencia de antibióticos](https://www.youtube.com/watch?v=DubGH74k34k&feature=emb_logo)

El propóito esta vez es detectarlos antibioticos más afectivos, hoy día los medicamentos para tratar una misma enfermedad son muchisimos y ya ni habla de las bacterias, y aunque parece que esta aplicación no es tan importante como  otras dporque adecta a relativamente pocas personas y solo sirve como una apoyo a las «tecnicas de laboraorio» en realidad se esta viendo a largo plazo
    
El principal objetivo aquí es detectar interacciones entre las bacterias y los antibióticos basados en una imagen de un una prueba. Como se mencionó anteriormente, así como se encontraban los patrones para que un garabato fuera una letra ahora se deben encontrar los patrones para que un antibiotico sea un candidato a curar una enfermedad.

###  4) Powered by TensorFlow: Airbnb uses machine learning to help categorize its listing photos

- [TensorFlow ayudando clientes de Airbnb ](https://www.youtube.com/watch?v=tPb2u9kwh2w)

Básicamente, se optimiza el negocio. Se establece que las personas gustan ciertas imágenes para elegir las casas. Claro que la «mejor» estética de una casa no es completamente modelable, por ello decidieron hacer estadística y tomar es estilo «moderno» como la base (con moderno se refieren a ciertos patrones en las imágenes). No solo catacterizan sus modelos por estilo, sino por el lugar, entonces a este punto puede que usen bastantes algoritmos para realizar el trabajo. 

Nota: a pesar de que el método parece trabajar como los otros, este tiene un problema, esta normalizando lo que a las personas les gusta, que obviamente en un tema muy ambiguo y a menos que sus modelos logre evolucionar es probable que estén acabados

### 5) El proyecto que yo haría

    Aunque puede sonar un poco descabellado, quizá se pueda crear una red neuronal que pueda clasificar los problemas NO LINEALES en términos de sus posibles soluciones. Herramientas como «photomat» resuelven operaciones que en un inicio nos tomarían mucho más tiempo a nosotros. Pero, esas tareas son relativamente sencillas en comparación otras, por qué simplemente para otras tareas no hay un «camino» prestablecido sobre como resolverlas. 

    Primero hay que recordad que casi todo problema puede ser expresado en forma matemática. Luego, durante toda nuestra historia hay personas que piensan «fuera de la caja» y heredan esa forma de pensar después de su muerte. Si se generalizaran los problemas que resolvieron y resultados que obtubieron de una forma matemática más o menos simple y se recolectaran esos datos, entonces se podría entrenar un algoritmo que «piense» como esas personas listas. 
    
    Esto tiene limitantes. Por ejemplo, que apenas daría indicios de como resolver los problemas NO LINEALES debido a la generalización antes mencionada. 
    
    Antes, habría que empezar con la resolución de problemas que ahora se conocen como triviales, tales como integrales, derivadas, probabilidad,...