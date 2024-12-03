package Exercitiul2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        try {
            File file = new File("in.txt");
            PrintWriter writer = new PrintWriter("out.txt");
            Scanner scanner = new Scanner(file);
            Scanner scanner1 = new Scanner(System.in);
            String vocale = "aeiouAEIOU";

            System.out.println("Gruparea de litere aleasa: ");
            String grupare = scanner1.next();


            while (scanner.hasNext()) {
                String vers = scanner.nextLine();
                int nr_cuvinte = 1, nr_vocale = 0;
                String sf_vers = vers.substring((vers.length()-grupare.length()),vers.length());
//                if (sf_vers == grupare){
//                    writer.println(vers+"* ");
//                }
                writer.print(vers);
                if(vers.endsWith(grupare)) {
                    writer.print("* ");
                }
                for (int i = 0; i < vers.length(); i++) {
                    char caracter = vers.charAt(i);
                    if (caracter == ' ') {
                        nr_cuvinte++;
                    }
                    for (int j = 0; j < vocale.length(); j++) {
                        if (caracter == vocale.charAt(j)) {
                            nr_vocale++;
                        }
                    }
//                    if (vocale.indexOf(caracter) != -1){
//                        nr_vocale++;
//                    }
                }
                writer.print(" |Vocale: " + nr_vocale + " Cuvinte: " + nr_cuvinte + "|\n");

            }
            writer.close();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fisierul nu a fost gasit" + e);
        }
    }
}
