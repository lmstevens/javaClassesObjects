package calculatorpackage;

public class Calculator {

    public Calculator(){

    }
    
    public int add(int num1, int num2){
        int sum = num1 + num2;
        System.out.println(sum);
        return sum;

    }

    public int subtract(int num1, int num2){
        int sum = num1 - num2;
        System.out.println(sum);
        return sum;

    }

    public int multiply(int num1, int num2){
        int sum = num1 * num2;
        System.out.println(sum);
        return sum;

    }

    public float divide(int num1, int num2){
        float sum = num1 / num2;
        System.out.println(sum);
        return sum;

    }

    public int square(int num1){
        int sum = num1 * num1;
        System.out.println(sum);
        return sum;

    }



    public static void main(String[] args) {
        Calculator myCalc = new Calculator();

        myCalc.add(4,5);
        myCalc.subtract(22, 23);
        myCalc.multiply(34, 12);
        myCalc.divide(56, 50);
        myCalc.square(18);

        
    }
}
