package calculatorpackage;

public class MagicCalculator extends Calculator {

    public MagicCalculator() {

    }

    public double squareRoot(double num1) {
        double sum = Math.sqrt(num1);
        System.out.println(sum);
        return sum;
    }

    public double sin(double num1) {
        double sum = Math.sin(num1);
        System.out.println(sum);
        return sum;
    }

    public double cosine(double num1) {
        double sum = Math.cos(num1);
        System.out.println(sum);
        return sum;
    }

    public double tangent(double num1) {
        double sum = Math.tan(num1);
        System.out.println(sum);
        return sum;
    }

    public double factorial(double n) {
        if (n == 0){
            double sum = 1;
            System.out.println(sum);
            return 1;
        }else {
            double sum = n * factorial(n - 1);
            System.out.println(sum);
            return sum;

        }
    }

    public static void main(String[] args) {
        MagicCalculator myMagicCalc = new MagicCalculator();
        myMagicCalc.add(3, 5);
        myMagicCalc.tangent(49);
        myMagicCalc.factorial(45);

    }
}
