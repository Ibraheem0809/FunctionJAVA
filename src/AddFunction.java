import java.util.Scanner;

public class AddFunction {

    static int Add(int a, int b) {
        return(a+b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd integer: ");
        int num2 = input.nextInt();
        int sum = Add(num1,num2);
        System.out.print("Sum of "+num1+" and "+num2+" is "+sum);
    }

}
