package br.com.aldenor.desafio.main;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {
        int numberForVector = 8;
        int[] a = new int[numberForVector], b = new int[numberForVector];
        System.out.println("Temos dois vetores de " + numberForVector + " elementos, " +
                "um será copia do outro, porém, você precisa digitar os " + numberForVector + " para fazer a copia dos dados.");
        int x = 1;
        while(x <= numberForVector) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o " +x+" elemento do vetor A.");
            int valor = scanner.nextInt();
            a[(x-1)] = valor;
            b[(x-1)] = (valor*2);
            x++;
        }
        System.out.println("O vetor atingiu o maximo pré-definido.");
        System.out.println("Vetor A igual: "+ Arrays.toString(a));
        System.out.println("Vetor B igual: "+ Arrays.toString(b));
    }

}
