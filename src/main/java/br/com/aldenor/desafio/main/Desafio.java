package br.com.aldenor.desafio.main;

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        int matrizSize = 3;
        int[][] matriz = new int[matrizSize][matrizSize];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Você tem uma matrizes de " + matrizSize+"x"+matrizSize + " comece a digitar o primeiro elemento.");
        for(int line = 0; line<=(matrizSize-1); line++) {
            for(int column = 0; column<=(matrizSize-1); column++) {
                System.out.println("Digite o elemento da linha " + (line+1) + " e da columa " + (column+1));
                int value;
                try {
                    value = Integer.parseInt(scanner.next());
                } catch (Exception e) {
                    System.out.println("Você não digitou um valor valido, tente novamente");
                    column--;
                    continue;
                }
                matriz[line][column] = value;

            }
        }

        for(int line = 0; line<=(matrizSize-1); line++) {
            for (int column = 0; column <= (matrizSize - 1); column++) {
                System.out.print("["+matriz[line][column]+"] ");
            }
            System.out.println();
        }
    }

}
