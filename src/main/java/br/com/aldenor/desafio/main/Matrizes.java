package br.com.aldenor.desafio.main;

import java.util.Scanner;

public class Matrizes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroDaMatrizQuadratica = 3;
        int i, j;
        int matriz[][] = new int[numeroDaMatrizQuadratica][numeroDaMatrizQuadratica];

        for(i=0; i<numeroDaMatrizQuadratica; i++) {
            System.out.println("Infome os elementos da linha " + (i+1));
            for(j=0; j<numeroDaMatrizQuadratica; j++) {
                System.out.print("m ["+i+"] ["+j+"] = ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        for(i=0; i<numeroDaMatrizQuadratica; i++) {
            System.out.print((i+1)+" Linha: ");
            for(j=0; j<numeroDaMatrizQuadratica; j++) {
                System.out.print("["+matriz[i][j]+"] ");
            }
            System.out.println();
        }

    }

}
