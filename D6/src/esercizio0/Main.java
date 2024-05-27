package esercizio0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Dammi il primo numero");
        int primoNumero = scanner.nextInt();
        System.out.println("Dammi il secondo numero");
        int secondoNumero = scanner.nextInt();
        System.out.println("Il risultato della somma é: " + (primoNumero + secondoNumero));


        scanner.close();
    }

}
