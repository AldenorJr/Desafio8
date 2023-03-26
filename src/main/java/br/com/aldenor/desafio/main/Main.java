package br.com.aldenor.desafio.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> valoresNumbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Você terá que digitar dois números inteiros e positivos para saber o seu Maximo Divisor Comum (MDC), digite o primeiro:");
        while(valoresNumbers.size() < 2) {
            int scannerNumber = scanner.nextInt();
            if(scannerNumber < 0 || scannerNumber == 0) {
                System.out.println("Você digitou um número negativo ou igual a zero.");
                continue;
            }
            valoresNumbers.add(scannerNumber);
            if(valoresNumbers.size() == 2) {
                System.out.println("Calculando o Maximo divisor comum (MDC)...");
                Thread.sleep(2000);
                executeMax(valoresNumbers.get(0), valoresNumbers.get(1));
            } else System.out.println("Agora digite o segundo número.");
        }
    }

    public static void executeMax(int number1, int number2) {
        int mdc = 0;
        while(number2 != 0) {
            mdc = number1%number2;
            number1 = number2;
            number2 = mdc;
        }
        System.out.println("O Maximo Divisor Comum (MDC) é igual: " + number1);
    }

}