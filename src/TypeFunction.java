public class TypeFunction {
    // with no parameters and no return type.
    static void greet(){
        System.out.println("Hello, Java!");
    }

    // with parameters and no return type.
    static void greetPara(String name){
        System.out.println("Hello, "+name+" !");
    }

    // with parameters and return type.
    static int Add(int a, int b){
        return (a+b);
    }

    // No parameters, but with return type
    static int getNumber() {
        return 42; // returning a fixed number
    }

    public static void main(String[] args) {

        greet();

        greetPara("Ibraheem");

        int sum = Add(8,5);
        System.out.println("Sum: "+sum);

        int num = getNumber();
        System.out.println("Number: "+num);
    }
}
