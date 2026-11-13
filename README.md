

# CAMINO A LA LIGA

## Descripción

CAMINO A LA LIGA es un videojuego de fútbol desarrollado en Java para consola. El jugador elige uno de los ocho equipos disponibles, consulta su plantilla, selecciona a sus once titulares, disputa partidos simulados y consulta una clasificación con los partidos jugados y los puntos obtenidos.

## Objetivo y funcionamiento

Al iniciar el programa, el jugador debe elegir uno de los ocho equipos disponibles.

Después aparece un menú principal con las siguientes opciones:

1. **Ver plantilla:** muestra los veinte jugadores del equipo seleccionado.
2. **Elegir once titular:** permite seleccionar once jugadores diferentes de la plantilla.
3. **Jugar partido:** genera un rival aleatorio y simula el resultado del encuentro.
4. **Clasificación:** muestra los partidos jugados y los puntos acumulados por cada equipo.
5. **Salir:** termina el programa.

### Sistema de puntuación

- **Victoria:** 3 puntos.
- **Empate:** 1 punto para cada equipo.
- **Derrota:** 0 puntos para el equipo del usuario y 3 para el rival.

Los marcadores se generan aleatoriamente, con un máximo de cuatro goles por equipo.

## Equipos disponibles

El juego incluye los siguientes clubes:

- Real Madrid
- Barcelona
- Liverpool
- Manchester City
- PSG
- Roma
- Juventus
- Atlético de Madrid

Cada equipo dispone de una plantilla de veinte jugadores.

## Tecnologías y conceptos utilizados

- Java.
- Scanner para introducir datos mediante teclado.
- Arrays unidimensionales y bidimensionales.
- Variables y constantes.
- Condicionales (`if`, `else if`, `else`).
- Estructura de selección múltiple (`switch`).
- Bucles (`for`, `while` y `do-while`).
- Generación de números aleatorios mediante `Math.random()`.

## Requisitos

- Tener instalado el JDK 21.
- Disponer de una terminal o un entorno de desarrollo compatible con Java, como Visual Studio Code.



## Limitaciones actuales

- Es una aplicación de consola, no tiene interfaz gráfica.
- Los rivales y los resultados se generan aleatoriamente.
- La selección del once titular es obligatoria antes de jugar un partido.
- No se pueden seleccionar jugadores repetidos en una misma alineación.
- Los jugadores seleccionados no influyen en el resultado de los partidos.
- La clasificación acumula los resultados de los encuentros disputados, pero no existe una liga completa con calendario de jornadas.
- Los resultados no se guardan en archivos, por lo que se pierden al cerrar el programa.
- No existe una condición automática para determinar al campeón.

## Autor y versión

- **Proyecto:** CAMINO A LA LIGA.
- **Lenguaje:** Java.
- **Versión:** 1.0.
- **Autor**:Cristian Magro
