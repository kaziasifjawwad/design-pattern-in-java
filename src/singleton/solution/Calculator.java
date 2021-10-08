package singleton.solution;

public class Calculator {
    private static Calculator reference;

    private Calculator(){
        System.out.println("hello people");
    }

    public static Calculator getReference(){
        if(Calculator.reference==null){
            Calculator.reference=new Calculator();
        }
        return Calculator.reference;
    }

    public int add(int a){
        return a*a;
    }
}
