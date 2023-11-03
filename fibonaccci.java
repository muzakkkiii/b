import java.util.Scanner;


public class fibonaccci {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int hasil = input.nextInt();
     int angkaTerakhir = 1, a = 0, b;

     System.out.print(0);
     System.out.print(" ");

    for (int l =1; l <= hasil; l++) {
        if (l > 1) {
            b = angkaTerakhir;
            angkaTerakhir = a + b;
            a=b;
            
        }
        System.out.print(angkaTerakhir);
        System.out.print(" ");

    }
     

     


    }
}
