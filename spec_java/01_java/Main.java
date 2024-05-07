import java.util.Arrays;

// public class HelloWorld{
//     public static void main(String[] args) {
//         // esempio con un array di interi
//         int[] intArray = {1, 2, 3, 4, 5};
//         System.out.println(Arrays.toString(intArray)); // Output: [1, 2, 3, 4, 5]

//         // Esempio con array di stringhe
//         String[] strArray = {"John", "Mary", "Bob"};
//         System.out.println(Arrays.toString(strArray)); // Output: [John, Mary, Bob]
        
//         String[][] deepArray = {{"John", "Mary"}, {"Alice", "Bob"}};
//         System.out.println(Arrays.toString(deepArray));
//         System.out.println(Arrays.deepToString(deepArray));
//     }
// }

import java.util.Scanner;

public class Main {
    // Definizione della costante IVA
    public static final double IVA = 0.22; // 22%

    // Definizione della funzione per calcolare l'IVA
    public static double calcolaIVA(double importo) {
        double importoIVA = importo * IVA;
        return importoIVA;
    }

    public static void main(String[] args) {
        // Creazione di un oggetto Scanner per leggere l'input dell'utente
        Scanner scanner = new Scanner(System.in);

        // Input dell'importo
        System.out.print("Inserisci l'importo: ");
        double importo = scanner.nextDouble();
        
        // Chiamata alla funzione per calcolare l'IVA
        double importoIVA = calcolaIVA(importo);
        
        // Stampare l'importo e l'IVA
        System.out.println("L'IVA sull'importo di " + importo + " è: " + importoIVA);

        // Calcolare e stampare il totale
        double totale = importo + importoIVA;
        System.out.println("Il totale con IVA è: " + totale);

        // Chiudere lo scanner
        scanner.close();
    }
}
