import java.util.Random;

public class Zad1 {
    public static void main(String[] args) {
        Random r = new Random();
        float [] tab = new float[8];
        System.out.format("Tablica ma %d elementów\n", tab.length);
        for(int i=0; i<tab.length; i++)
            tab[i]=r.nextInt(100)+1;
        for(int i=0; i<tab.length; i++)
            System.out.print(tab[i]+" | "+tab[i]/2+" \n" );
        System.out.println();
    }
}