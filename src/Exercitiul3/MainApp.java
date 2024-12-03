package Exercitiul3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sirul original: ");
        String s_o = scanner.next();
        System.out.println("Sirul de introdus: ");
        String s_i = scanner.next();
        System.out.println("Pozitia la care sa se introduca: ");
        int poz = scanner.nextInt();


        StringBuilder stringBuilder = new StringBuilder(s_o);
        stringBuilder.insert(poz,s_i);
        String s_rez = stringBuilder.toString();
        System.out.println("Rezultatul: "+s_rez);
        System.out.println("Pozitia de la care sa se stearga din string: ");
        int poz1 = scanner.nextInt();
        System.out.println("Cate caractere sa se stearga: ");
        int poz2 = scanner.nextInt();
        stringBuilder.delete(poz1, poz1+poz2);
        System.out.println("String-ul rezultat: "+stringBuilder.toString());
    }
}
