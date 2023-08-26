import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        UnaryOperator < Double > operator = new UnaryOperator<Double>() {
            @Override
            public Double apply(Double san) {
                double sum = Math.sqrt(san);
                return sum;
            }
        };

        System.out.println(operator.apply(25.0));
        


    }

}