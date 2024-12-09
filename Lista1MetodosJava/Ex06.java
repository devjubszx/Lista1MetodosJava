package Metodos1;

public class Ex06 {

        public static boolean EhPar(int numero) {
            return numero % 2 == 0;
        }

        public static void main(String[] args) {
            int numero = 10;

            if (EhPar(numero)) {
                System.out.println("Verdadeiro");
            } else {
                System.out.println("Falso.");
            }
        }
    }
