package Desafio;

import java.util.Scanner;

public class AppBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre = "Tony Stark";
        String tipoCuenta = "Corriente";
        double saldoDisponible = 1599.99;
        int opcion = 0;

        String cliente = """
                ***************************************************************************
                Nombre del cliente: %s
                Tipo de cuenta: %s
                Saldo disponible: %.2f $
                
                ***************************************************************************
                """.formatted(nombre, tipoCuenta, saldoDisponible);
        System.out.println(cliente);

        String presentacion = """
                ** Escriba el numero de la opcion deseada **
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;

        while (opcion != 9){
            System.out.println(presentacion);
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El saldo actualizado es : " + saldoDisponible + "$");
                    break;
                case 2:
                    System.out.println("¿Cual es el valor que deseas retirar? ");
                    double retirar = scanner.nextDouble();

                    if (saldoDisponible > retirar) {
                        saldoDisponible -= retirar;
                        System.out.println("Saldo retirar: " + saldoDisponible + "$");
                    }else {
                        System.out.println("Saldo insuficiente");
                    }
                    break;
                case 3:
                    System.out.println("¿Cual es el saldo que desea depositar?");
                    double depositar = scanner.nextDouble();
                    saldoDisponible +=depositar;
                    System.out.println("El saldo actualizado: " + saldoDisponible + " $");
                    break;
                case 9:
                    System.out.println("Finalizando el programa. Muchas gracias por usar nuestros servicios");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
