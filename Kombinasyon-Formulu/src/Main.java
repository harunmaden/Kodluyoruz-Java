import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        long n, r, ntoplam = 1, rtoplam =1,nr, nrtoplam = 1, sonuc;
        Scanner inp = new Scanner(System.in);
        System.out.print("C(n,r) n'yi Giriniz : ");
        n = inp.nextInt();
        System.out.print("C(n,r) r'yi Giriniz : ");
        r =inp.nextInt();
        nr = n - r;

        for (long i = 1; i <= n; i++){

           ntoplam = ntoplam * i;

        }

        for (long i = 1; i <= r; i++){
            rtoplam = rtoplam * i;
        }
        for (long i = 1; i <= nr; i++){
            nrtoplam = nrtoplam * i;
        }
        sonuc = ntoplam / (rtoplam * nrtoplam);

       System.out.println(sonuc);

    }
}
