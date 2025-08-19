import java.util.Scanner;

public class FactorialFunction {

    static int Factorial(int num){
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return(fact);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        int fact = Factorial(num);
        System.out.print("Factorial of "+num+" is "+fact);
    }
}
