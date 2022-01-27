import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        int number;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayıyı giriniz : ");
        number = inp.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;
        while (tempNumber !=0){
            tempNumber/=10;
            basNumber++;
        }
        tempNumber = number;
        while (tempNumber != 0){

            basValue = tempNumber % 10;

            result +=basValue;
            tempNumber /= 10;
        }
        System.out.println(result);
    }
}
