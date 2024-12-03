package Exercitiul1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    public static void afisare (String []v) {
        for (int i = 0; i < 7; i++)
            System.out.print(v[i]+" ");
    }
    public static void main(String[] args) {
        try {
            File file = new File("in.txt");
            Scanner scanner = new Scanner(file);
            Scanner scanner1 = new Scanner(System.in);
            String v[] = new String[7];
            String jud_cautat;

            for (int i = 0; i < 7; i++){
                v[i] = scanner.next();
            }
            scanner.close();
            Arrays.sort(v);
            afisare(v);

            System.out.println("\nCe judet doriti sa cautati: ");
            jud_cautat = scanner1.next();
            int poz = Arrays.binarySearch(v,jud_cautat);
            System.out.println("Judetul se afla la pozitia "+poz);


        } catch (FileNotFoundException e){
            System.out.println("Fisierul nu a fost gasit"+e);
        }
    }
}
