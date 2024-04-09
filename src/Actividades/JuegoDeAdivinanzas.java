package Actividades;

import java.util.Random;
import java.util.Scanner;

public class JuegoDeAdivinanzas {
    public static void main(String[] args) {
        /*Crea un programa que simule un juego de adivinanzas. El programa debe generar
        un número aleatorio entre 0 y 100, y pedir al usuario que intente adivinar ese
        número en un máximo de 5 intentos. En cada intento, el programa debe informar si
        el número ingresado por el usuario es mayor o menor que el número generado.
Consejos:
Para generar un número aleatorio en Java: new Random().nextInt(100);
Utiliza el Scanner para obtener los datos del usuario.
Utiliza una variable para contar los intentos.
Utiliza un bucle para controlar los intentos.
Utiliza la instrucción ‘break;’ para salir del bucle.*/

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numero = random.nextInt(100);
        System.out.println(numero);
        int numeroIngresadoUsuario= 0;
        int intento = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa un numero: ");
            numeroIngresadoUsuario = scanner.nextInt();
            intento++;
            if (numeroIngresadoUsuario != numero && intento != 5) {
                if (numeroIngresadoUsuario > numero) {
                    System.out.println("El numero: " + numeroIngresadoUsuario + " es mayor y llevas " + intento + " intentos" );
                }else {
                    System.out.println("El numero: " + numeroIngresadoUsuario + " es  menor y llevas " + intento + " intentos");
                }
            } else if (numeroIngresadoUsuario != numero && intento == 5){
                System.out.println("haz superado el numero de intentos disponibles");
            } else if (numeroIngresadoUsuario==numero) {
                System.out.println("Haz adivinado el numero secreto");
                break;
            }
        }
    }
}

/*
public class JuegoDeAdivinacion {
    public static void main(String[] args) {

                Scanner lector = new Scanner(System.in);
                int numeroGenerado = new Random().nextInt(100); // genera un número aleatorio entre 0 y 100
                int intentos = 0;

                while (intentos < 5) {
                    System.out.print("Introduzca un número entre 0 e 100: ");
                    int numeroDelUsuario = lector.nextInt();
                    intentos++;

                    if (numeroDelUsuario == numeroGenerado) {
                        System.out.println("Felicidades, adivinaste el número en " + intentos + " intentos!");
                        break; // interrumpe el loop while
                    } else if (numeroDelUsuario < numeroGenerado) {
                        System.out.println("El número que escribiste es menor al número generado.");
                    } else {
                        System.out.println("El número que escribiste es mayor al número generado.");
                    }
                }

                if (intentos == 5) {
                    System.out.println("Lo siento, no conseguiste adivinar el número en 5 intentos. El número era " + numeroGenerado);
                }
            }
        }

* */
