package Metodos1;

import java.util.Scanner;

public class Ex08 {

        public static long CalcularFatorial(int numero) {
            if (numero < 0) {
                throw new IllegalArgumentException("Número deve ser positivo.");
            }
            long fatorial = 1;
            for (int i = 2; i <= numero; i++) {
                fatorial *= i;
            }
            return fatorial;
        }

        public static void main(String[] args) {
            int numero = 5;

            long resultado = CalcularFatorial(numero);
            System.out.println("O fatorial de " + numero + " é " + resultado + ".");
        }
    }
