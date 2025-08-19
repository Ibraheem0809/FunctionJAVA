import java.util.Scanner;

public class PrimeFunction {

    static void IsPrime(int num){
        boolean flag = true;
        if(num <= 1) {
            flag = false;
        }else{
            for (int i = 2; i < num/2; i++) {
                if(num%i == 0){
                    flag = false;
                }
            }
        }

        if(flag){
            System.out.print(num+" is Prime number.");
        }else{
            System.out.print(num+" is NOT Prime number.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. to be check prime: ");
        int num = input.nextInt();
        IsPrime(num);
    }
}
