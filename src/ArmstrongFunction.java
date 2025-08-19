import java.util.Scanner;

public class ArmstrongFunction {
    static boolean IsArmstrong(int num){
        int original = num, digits = 0, sum = 0;
        int temp = num;
        while(temp>0){
            temp /= 10;
            digits++;
        }
        while(num>0){
            int digit = num % 10;
            sum += Math.pow(digit,digits);
            num /= 10;
        }
        return (sum == original);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. to be checked Armstrong: ");
        int num = input.nextInt();
        if(IsArmstrong(num)){
            System.out.print(num+" is Armstrong");
        }else{
            System.out.print(num+" is NOT Armstrong");
        }
    }
}
