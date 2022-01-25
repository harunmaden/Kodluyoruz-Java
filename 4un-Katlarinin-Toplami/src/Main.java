import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        int n, toplam=0, o= 0;
        Scanner inp = new Scanner(System.in);
        do {
            System.out.print("Sayı Giriniz : ");
            n = inp.nextInt();
            if(n % 2 == 1){
                o = 1;
            }
            if( n % 4 == 0){
                toplam +=n;

            }
        }while(o == 0);
        System.out.println("4'ün katlarinin toplamı" + toplam);
    }
}
