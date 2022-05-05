import java.util.Random;
import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();

        int [] tab = new int[30];
        System.out.format("Tablica posiada %d elementów\n", tab.length);
        for(int i=0; i<tab.length; i++)
            tab[i]=r.nextInt(100)+1;
        for(int i=0; i<tab.length; i++)
            if (tab[i]>50){
                System.out.println(tab[i]);
        }
        System.out.println();
    }
}