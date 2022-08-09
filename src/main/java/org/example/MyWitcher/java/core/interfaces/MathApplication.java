package org.example.MyWitcher.java.core.interfaces;


public class MathApplication {
    private CalculatorService calcService;

    public void setCalculatorService(CalculatorService calcService){
        this.calcService = calcService;
    }

    public double add(int input1, int input2){
        return calcService.add(input1, input2);
    }

    public double del(int input1, int input2){
        return calcService.del(input1, input2);
    }

    public double multiply(int input1, int input2){
        return calcService.multiply(input1, input2);
    }

    public double divide(int input1, int input2){
        return calcService.divide(input1, input2);
    }
}
