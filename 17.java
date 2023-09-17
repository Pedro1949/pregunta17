import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numerosIntroducidos = 0;
        int sumaImpares = 0;
        int cantidadImpares = 0;
        int mayorPar = Integer.MIN_VALUE;

        System.out.println("Ingrese numeros. Con un negativo se detiene:");

        while (true) {
            int numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            numerosIntroducidos++;

            if (numero % 2 != 0) {
                sumaImpares += numero;
                cantidadImpares++;
            } else if (numero > mayorPar) {
                mayorPar = numero;
            }
        }

        if (numerosIntroducidos > 0) {
            double mediaImpares = (double) sumaImpares / cantidadImpares;

            System.out.println("Cantidad de números introducidos: " + numerosIntroducidos);
            System.out.println("Media de los números impares: " + mediaImpares);
            
        } else {
            System.out.println("No se introdujeron números.");
        }
    }
}
