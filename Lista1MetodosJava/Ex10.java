package Metodos1;

import java.util.Scanner;

public class Ex10 {

    public static float calcularMedia(float n01, float n02, float n03) {

        float media = (n01+n02+n03)/3;

        return media;
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite 3 numeros e descubra a media");
        System.out.println("-------------------------------");

        System.out.print("Primeiro: ");
        float n01 = leitor.nextFloat();

        System.out.print("Segundo: ");
        float n02 = leitor.nextFloat();

        System.out.print("Terceirp: ");
        float n03 = leitor.nextFloat();

        System.out.println(" A media é  "+calcularMedia(n01,n02,n03)+" !");

        leitor.close();
    }

}
