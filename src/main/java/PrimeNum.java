import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the number");
        int n=input.nextInt();
        boolean isPrime=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        System.out.println(isPrime);
    }
}
