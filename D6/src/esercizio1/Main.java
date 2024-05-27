package esercizio1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[5];
        for (int i = 0; i < myArray.length; i++) {
            Random randomNum = new Random();
            int num = randomNum.nextInt(1, 10);
            myArray[i] = num;
        }
        System.out.println(Arrays.toString(myArray));

        //int num = 1;

        Scanner scanner = new Scanner(System.in);

        while (num != 0) {
            try {
                System.out.println("Inserisci un numero da 1 a 10 ");
                num = scanner.nextInt();
                if (num == 0) {
                    System.out.println(" Errore!");
                    scanner.close();
                } else if (num <= 10) {
                    System.out.println("In quale posizione, da 1 a 5, vuoi inserire il numero scelto?");
                    int posizioneNumero = scanner.nextInt();

                    if (posizioneNumero > 0 && posizioneNumero <= 5) {
                        myArray[posizioneNumero - 1] = num;

                    } else {
                        System.out.println("Errore, devi inserire un numero tra 1 e 5");
                    }

                    System.out.println("Il tuo array modificato: " + Arrays.toString(myArray));
                }

            } catch (InputMismatchException err) {
                System.out.println("Errore!");
            }
        }
        scanner.close();
    }
}
