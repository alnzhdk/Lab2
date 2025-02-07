public class Lab_2_ { 
    public static void main(String[] args) {
        double x = 2.0;
        int terms = 10;

        double result = calculateExponential(x, terms);
        System.out.println("e^(-" + x + "^2) ≈ " + result);
    }
    public static double calculateExponential(double x, int terms) {
        double sum = 1.0;
        double term = 1.0;

        for (int n = 1; n < terms; n++) {
            term *= (-1) * x * x / n;
            sum += term;
        }

        return sum;
    }
}