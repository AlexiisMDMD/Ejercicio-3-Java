import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int numeroAleatorio;


        boolean numeroCorrecto = false;

        System.out.println("Introduce un numero de 1 al 10 ");

        while (!numeroCorrecto) {

            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();

            numeroAleatorio = random.nextInt(1, 10);

            if (num == numeroAleatorio)
            {

                System.out.println("El numero que introdujo es el correcto");
                numeroCorrecto = true;
                System.out.println(numeroAleatorio);

            }

            else
            {

                System.out.println("El numero que introdujo no es correcto (CIngresa otro numero)");
                System.out.println(numeroAleatorio);

            }


        }

    }
}



