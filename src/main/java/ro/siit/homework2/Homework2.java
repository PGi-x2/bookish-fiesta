package ro.siit.homework2;

import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {
        // write your code here

        String IMC = ("Indicele Masei Musculare - (IMC): ");
        System.out.println(IMC);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti inaltimea (m): ");
        float Inaltimea = scanner.nextFloat();
        System.out.println("Introduceti greutatea (kg): ");
        float Greutatea = scanner.nextFloat();
        System.out.println(IMC + Greutatea / (Math.pow(Inaltimea, 2)));
        float f = (float) (Greutatea / (Math.pow(Inaltimea, 2)));

        if (f <= 18.49) {
            System.out.println("Status sanatate: 'Subponderal! - √ Risc de boala'");
        } else if (f >= 18.50 && f <= 24.99) {
            System.out.println("Status sanatate: 'Greutate normala - Fara risc de boala!'");
        } else if (f >= 25.00 && f <= 29.99) {
            System.out.println("Status sanatate: 'Supraponderal! - √ Risc de boala'");
        } else if (f >= 30.00 && f <= 34.99) {
            System.out.println("Status sanatate: 'Obezitate de gradul I! - √ Risc de boala'");
        } else if (f >= 35.00 && f <= 39.99) {
            System.out.println("Status sanatate: 'Obezitate de gradul II! - √ Risc de boala'");
        } else if (f >= 40.00) {
            System.out.println("Status sanatate: 'Obezitate MORBIDA! - √ Risc de boala'");
        }else {
            System.out.println(IMC +"invalid :(");
        }
    }
}

