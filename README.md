# Game-ahorcado
## Lógica de Negocio del Juego del Ahorcado:

##  1. <b>Autenticación de Usuario:</b>
Inicio de sesión: El usuario se autentica en la aplicación.
Verificación: Si el usuario existe en la base de datos (BBDD), se permite el acceso y se carga su perfil con información sobre su progreso,
 incluyendo su nivel de dificultad alcanzado, por defecto al inicio (FACIL).
Registro de usuario: Si el usuario no existe, se puede permitir crear una cuenta nueva.

## 2. <b>Selección de Palabra Inicial:</b> 

Consulta a la base de datos: Una vez autenticado, se consulta la base de datos para obtener un conjunto de palabras que corresponden al nivel de 
dificultad en el que se encuentra el usuario. Estas palabras se encuentran almacenadas en bbdd, y tienen asociado su nivel de dificultad.


Nivel de dificultad: El nivel de dificultad del usuario puede estar basado en su historial de juegos (número de victorias o puntos obtenidos) o 
puede ser un nivel inicial que aumenta conforme se avanzan niveles. (Se debe de implementar un algoritmo que en función de los puntos que tenga
 el usuario determine su nivel y lo almacene en bbdd).

Fácil: Palabras más cortas, comunes y simples. (Se genera el 20% de las letras en el comienzo del juego).
Medio: Palabras un poco más largas o menos comunes.(Se genera el 10% de las letras en el comienzo del juego)
Difícil: Palabras más largas, con letras poco frecuentes o complejas.(Se genera el 0% de las letras en el comienzo del juego).
Si es el primer juego o el usuario tiene nivel "FACIL", se seleccionan palabras de la base de datos que estén etiquetadas 
como "fácil".


##  3. <b>Selección de la Letra:</b>

Elección aleatoria: De la palabra seleccionada, se elige una letra aleatoriamente para que el usuario la adivine.
Estado de la palabra: Inicialmente, la palabra se representa como una secuencia de guiones bajos (por ejemplo, _ _ _ _ _ para la palabra "perro").
 La letra seleccionada por el sistema se puede colocar en el lugar correcto si coincide con una de las letras de la palabra, o de lo contrario, 
 el jugador pierde un intento.
##  4.<b>Proceso del Juego:</b> 
Intentos del jugador: El jugador tiene un número limitado de intentos (siempre siendo superior en 1 al número de letras que tenga la palabra).
En cada turno, el jugador elige una letra.
Si la letra está en la palabra, se revela la posición de la letra en la palabra.
Si la letra no está en la palabra, se disminuye el número de intentos disponibles.
El jugador puede ir adivinando más letras, pero si se queda sin intentos (después de los fallos para esa palabra), el juego termina y el jugador pierde.
Mostrar progreso: En cada turno la interfaz muestra:
La palabra con las letras descubiertas.
Los intentos restantes.
Las letras utilizadas.

##  5. <b>Gestión del Nivel de Dificultad:</b>

Superación de nivel: Si el jugador adivina la palabra correctamente antes de quedarse sin intentos, el sistema registra la victoria y avanza
 el jugador al siguiente nivel, este vendrá determinado según el algoritmo implementado por el alumno para determinar el nivel, si supera el
  nivel actual lo actualiza.
Recompensa: En cada victoria, el jugador puede recibir puntos o recompensas (por ejemplo, monedas o logros).
Dificultad progresiva: A medida que el jugador avance, las palabras de la base de datos que correspondan al nivel de dificultad más alto 
se irán seleccionando para ofrecer retos más difíciles.
Progreso en base de datos: El nivel de dificultad alcanzado por el jugador se actualiza en su perfil dentro de la base de datos para que,
 la próxima vez que inicie sesión, se le asignen palabras de un nivel superior según su progreso.

##  6. <b>anejo de Errores y Estado:</b> 
M Límites de intentos: Si el jugador se queda sin intentos, el juego termina y se muestra un mensaje de "Juego Terminado" junto con la palabra correcta. El jugador puede optar por reiniciar el juego.
Palabra incorrecta: Si el jugador introduce una palabra incorrecta como su suposición, se considera un intento fallido adicional y se pierde uno de los intentos disponibles.
##  7. <b>Base de Datos:</b>
Tabla de palabras: La base de datos debe contener una tabla de palabras donde cada palabra tiene un atributo que indica su nivel de dificultad (por ejemplo: dificultad con valores como "fácil", "medio", "difícil").
Tabla de usuarios: En la base de datos también debe haber una tabla de usuarios con su información de autenticación, nivel alcanzado, puntuaciones y progreso.
##  8. <b>Interfaz de Usuario (JavaFx):</b>
La interfaz de usuario debería reflejar claramente el nivel actual, la palabra con las letras adivinadas y los intentos restantes.
También debe mostrar un indicador visual del progreso (por ejemplo, barra de nivel) que se vaya actualizando conforme el jugador avance a través de los niveles de dificultad.
## 9. <b>Lógica para Avance de Niveles:</b>
Cada vez que el usuario complete correctamente un nivel (por ejemplo, adivinar una palabra), el sistema debe actualizar el nivel de dificultad y asignar un conjunto de palabras más difíciles para el siguiente juego.
Es recomendable tener un sistema de medallas o logros para premiar al jugador por alcanzar ciertos hitos, lo cual puede aumentar la motivación del jugador para continuar avanzando.
## 10. <b>Opciones Adicionales que se valoran:</b>
Temporizador: Un temporizador puede añadirse para hacer que el jugador tenga un tiempo limitado por intento o por palabra.
Pistas: El juego podría permitir al jugador obtener una pista (revelar una letra de la palabra) por un costo en puntos.
Otras aportaciones: Se pueden introducir otras aportaciones que se consideren interesantes, por ejemplo permiter añadir entradas de palabras que no existan en la base de datos, y asignarle un grado de dificultad en función de su tamaño.
