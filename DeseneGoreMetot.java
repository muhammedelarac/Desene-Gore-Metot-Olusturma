import java.util.Scanner;
/**
 * DeseneGoreMetot
 */
public class DeseneGoreMetot {

    static int negative(int x) {
        if (x <= 0){
            return x;
        }
        else {
            System.out.print(x + " ");
            return negative(x-5);
        }
    }

    static int positive(int x,int y) {
        if(x > y){
            return x;
        }
        else {
            System.out.print(x + " ");
            return positive(x+5,y);
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("Sayiyi giriniz : ");
            int number = input.nextInt();

            positive(negative(number),number);

            if (number == 0){
                break;
            }

            System.out.println("\nCikmak icin 0'i giriniz.");
        }
    }
}
/*
 Senaryolar
N Sayısı : 16
Çıktısı : 16 11 6 1 -4 1 6 11 16 


N Sayısı : 10
Çıktısı : 10 5 0 5 10 


N Sayısı : 25
Çıktısı : 25 20 15 10 5 0 5 10 15 20 25 


N Sayısı : 5
Çıktısı : 5 0 5 
 */