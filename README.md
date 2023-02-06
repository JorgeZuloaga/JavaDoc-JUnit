# JavaDoc-JUnit
En esta actividad seguiremos trabajando con Git, pero esta vez aplicando los conceptos de JavaDoc y JUnit vistos en clase.

Requerimiento 1

Documentar y hacer las pruebas unitarias de la siguiente clase

public class Soldado {

              private boolean estaMuerto;

              private int numeroBalas;

             

              //Crear los métodos “get” y “set” de los atributos cuando se vayan a hacer las pruebas y la documentación. Aquí no se han creado porque no aportan nada

             

              public boolean puedeDisparar() {

                            if(this.numeroBalas > 0) {

                                          return true;

                            }                          

                            return false;

              }

             

              public void disparar(Soldado sol) {

                            this.numeroBalas--;

                            sol.estaMuerto = true;

              }

}

Valoración: 5 puntos sobre 10

Requerimiento 2

Documentar y hacer las pruebas unitarias de la siguiente clase

public class Jugador {

              private int dorsal;

              private int numeroTarjetasAmarillas;

              private int numeroTarjetasRojas;

                           

//Crear los métodos “get” y “set” de los atributos cuando se vayan a hacer las pruebas y la documentación. Aquí no se han creado porque no aportan nada

 

              public void ponerDorsal(int dorsal) {

                            if(dorsal >= 1 && dorsal <= 30) {

                                          this.dorsal = dorsal;

                            }else {

                                          this.dorsal = -1;

                            }

              }

             

              public boolean estaExpulsado() {

                            boolean expulsado = false;                                                  

                            if(numeroTarjetasAmarillas == 2) {

                                          expulsado = true;

                            }                          

                            if(numeroTarjetasRojas == 1) {

                                          expulsado = true;

                            }                          

                            return expulsado;

              }            

}

 

Valoración: 5 puntos sobre 10

Consideraciones

Para la entrega, es necesario la creación de un pequeño documento formal sobre la actividad (portada, explicación, diagramas, etc.), indicando los componentes del equipo, las decisiones tomadas y la labor de cada integrante del equipo.

En el documento de la asignatura debe venir reflejado la dirección de GitHub con la que se ha trabajado.

Para la actividad todos los integrantes deben aportar una posible solución y luego elegirán cual será la solución final mediante consenso. Todos los integrantes deberán de subir su rama de desarrollo al repositorio remoto de GITHUB con sus soluciones.

Para la entrega, se subirá el código fuente comprimido a la plataforma, incluyendo un documento PDF con todo lo necesario para demostrar el correcto funcionamiento de la actividad (resultados, capturas de pantalla, ficheros, fotos, etc.). No es necesario que el documento PDF sea muy extenso, pero SÍ que incluya, al menos, las capturas de los resultados obtenidos y la explicación de los puntos clave de la actividad realizada. También puede ser valido para la entrega subir el PDF con la URL de acceso al repositorio GITHUB sin necesidad de incluir el código fuente.
