package Metodos1;

import java.util.Scanner;

public class Ex05 {

        public static int MaiorNumero(int numero1, int numero2) {
            return Math.max(numero1, numero2);
        }

        public static void main(String[] args) {
            int num1 = 10;
            int num2 = 20;

            int maior = MaiorNumero(num1, num2);
            System.out.println("O maior número entre " + num1 + " e " + num2 + " é: " + maior);
        }
    }
