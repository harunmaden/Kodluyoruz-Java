import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        int n, toplam=0, o= 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        n = inp.nextInt();
        for (int i = 1; i <= n; i *=4){
            System.out.println(i);
        }
       for (int i = 1; i <= n; i *=5){
           System.out.println(i);
       }


    }
}
