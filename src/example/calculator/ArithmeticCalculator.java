package example.calculator;


import java.util.ArrayList;

public class ArithmeticCalculator<T extends Number> {

    ArrayList<T> results = new ArrayList<>();
    //게터
     public ArrayList<T> getResults() {
        return this.results;
    }
    public void getResultsFindSymbol(double value) {
         results.stream()
                 .filter(num -> num.doubleValue() > value)
                 .forEach(num -> System.out.println(num));
    }
    //세터
    public void setResults(ArrayList<T>results) {
         this.results = results;
    }

    // 2. 사칙연산
    public double calculate(T num1, T num2, OperatorType op) {
        double result = 0;

        try {
            if (op == OperatorType.PLUS) {
                result = num1.doubleValue() + num2.doubleValue();
            } else if (op == OperatorType.MINUS) {
                result = num1.doubleValue() - num2.doubleValue();
            } else if (op == OperatorType.MULTIPLY) {
                result = num1.doubleValue() * num2.doubleValue();
            } else if (op == OperatorType.DIVIDE) {
                result = num1.doubleValue() / num2.doubleValue();
            }
            results.add((T) (Double) result);
            }
        catch (ArithmeticException error) {
            System.out.println("0으로 나눌수 없습니다.");
        }
        return result;


    }
}