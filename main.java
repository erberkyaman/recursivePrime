import java.util.Scanner;
public class recursivePrime {
    static boolean prime(int a,int b){
        if(a==1){
            System.out.print(a+ " Bir Asal Sayı Değil");
            return false;
        } else if (a==b){
            System.out.print(a+" Bir Asal Sayıdır");
            return true;
        } else if (a%b==0) {
            System.out.print(a+ " Bir Asal Sayı Değil");
            return false;
        }
        return prime(a,b+1);


    }
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n,index=2;

    System.out.print("Sayıyı Giriniz: ");
    n= input.nextInt();

    prime(n,index);

    }
}
