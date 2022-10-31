package Classes.Binary;

import AbstractClasses.ABinaryOperation;

public class BinaryMultiplicationOperation extends ABinaryOperation {
    public BinaryMultiplicationOperation(double firstOperand, double secondOperand) {
        super(firstOperand, secondOperand);
    }

    @Override
    public double calculate() {
        return this.firstOperand * this.secondOperand;
    }
}