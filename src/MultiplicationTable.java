import java.util.Scanner;

public class MultiplicationTable {

    static void printTable(int num){
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        printTable(num);
    }
}
