package Metodos1;

public class Ex09 {

    public static String ConcatenarStrings(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {

        String primeiraString = "Olá, ";
        String segundaString = "Jaja!";
        
        String resultado = ConcatenarStrings(primeiraString, segundaString);
        System.out.println("Resultado da concatenação: " + resultado);
    }
}