import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // nomes Masculinos
        List NomeM = new ArrayList<>();
        // nomes Feminimos
        List NomeF = new ArrayList<>();
        //todos os nomes Digitados
        List NomeD = new ArrayList<>();

        Scanner leia2 = new Scanner(System.in);
        // ex. "Maria -f, Carlos -m"
        System.out.print("Digitar separando por vírgula, os nomes e sexos: ");
        String nome2 = leia2.nextLine();
        String[] nome2Sep = nome2.split(",\\s");
        for (int x = 0; x < nome2Sep.length; x++) {
            NomeD.add(nome2Sep[x]);
        }
        for (int x = 0; x < NomeD.size(); x++) {
            String temp = NomeD.get(x).toString();
            String[] temp2 = temp.split("-");


            if (temp2[1].equals("m")) {
                NomeM.add(temp2[0]);
            } else if (temp2[1].equals("f")){
                NomeF.add(temp2[0]);

            }

        }
        Collections.sort(NomeF);
        Collections.sort(NomeM);
        Collections.sort(NomeD);
        System.out.println("Lista digitada: " + NomeD);
        System.out.println("Nomes femininos: " + NomeF);
        System.out.println("Nomes masculinos: " + NomeM);
    }
}