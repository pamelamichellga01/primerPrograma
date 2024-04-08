import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluacion = 0;
        double totalEvaluaciones=0;

        while (nota != -1) {
            System.out.println("Escribe la nota que le darias a la pelicula Matrix");
            nota = teclado.nextDouble();

            if (nota != -1) {
                mediaEvaluacion += nota;
                totalEvaluaciones++;
            }
        }
        System.out.println("La media de evaluaciones para Matrix es: " + mediaEvaluacion / totalEvaluaciones);
    }
}
