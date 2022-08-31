package in.spdev.aop.aspectj.around.beans;

public class Calculator {
    public int add(int x,int y){
        System.out.println("Calculator.add()");
        return x+y;
    }
    public int mul(int x,int y){
        System.out.println("Calculator.mul()");
        return x*y;
    }
}