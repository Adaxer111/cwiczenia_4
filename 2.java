public class Zad2 {
    public static void main(String[] args) {

        int tablica[];
        int dzielenie=4;
        tablica=new int[101];
        for (int i=1, j=1; i<101; i++)
        {
            tablica[i]=j++;
            if (tablica[i]%4==0){
                System.out.println(tablica[i]);

            }
        }
    }
}