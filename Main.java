package test;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Statyczne.Bezieur(Statyczne.wczytaj("czajnik.txt"),3,3,"plik.txt");
        Statyczne.Bezieur(Statyczne.wczytaj("filizanka.txt"),3,3,"plik2.txt");
        Statyczne.Bezieur(Statyczne.wczytaj("lyzka.txt"),3,3,"plik3.txt");
    }
}
