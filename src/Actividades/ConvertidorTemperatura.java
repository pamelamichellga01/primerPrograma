package Actividades;

public class ConvertidorTemperatura {
    public static void main(String[] args) {
        double temperatura = 30.4;
        double fahrenheit = (temperatura * 1.8) + 32;

        int resultado = (int) fahrenheit;

        System.out.println(resultado);

               /* double temperaturaEnCelsius = 30.4;
                double temperaturaEnFahrenheit = (temperaturaEnCelsius * 1.8) + 32;

                String mensaje = String.format("La temperatura de %f Celsius es equivalente a %f Fahrenheit", temperaturaEnCelsius, temperaturaEnFahrenheit);

                System.out.println(mensaje);

                int temperaturaEnFahrenheitEntero = (int) temperaturaEnFahrenheit;
                System.out.println("La temperatura en Fahrenheit entera es: " + temperaturaEnFahrenheitEntero);*/


    }
}
