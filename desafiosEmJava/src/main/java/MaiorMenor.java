/*
* Faça um algoritmo que, dada uma entrada de três valores, A, B e C,
* informe qual é o maior e o menor valor. Considerar os valores como numéricos.*/
import java.util.Scanner;
public class MaiorMenor {
    public static void main(String[] args) {
        int a, b, c;
        a = 7; b = 8;  c = 2;

        if (a > b && a > c) {
            System.out.println("Maior " + a);
        } else if (b > a && b > c){
            System.out.println("Maior " + b);
        } else {
            System.out.println("Maior " +  c);
        }

        if (a < b && a < c) {
            System.out.println("Menor " + a);
        } else if (b < a && b < c){
            System.out.println("Menor " + b);
        } else {
            System.out.println("Menor " +  c);
        }

    }
}
