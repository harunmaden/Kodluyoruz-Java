import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        long n, r, sonuc =1 ;
        Scanner inp = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz : ");
        n = inp.nextInt();
        System.out.print("Üs olacak sayıyı giriniz : ");
        r =inp.nextInt();

        for ( int i = 0; i < r; i++){
            sonuc *= n;
        }
        System.out.println(sonuc);

    }
}
