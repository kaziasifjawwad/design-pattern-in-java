package singleton.solution;

public class CalculatorMain {
    public static void main(String[] args) {
        for(int i =1;i<10;i++){
            Calculator calculator = Calculator.getReference();
            int result = calculator.add(i);
            System.out.println(calculator+"===>"+result);
        }
    }
}
