package Classes.Binary;

import AbstractClasses.ABinaryOperation;

public class BinaryDivisionOperation extends ABinaryOperation {

    public BinaryDivisionOperation(double firstOperand, double secondOperand) {
        super(firstOperand, secondOperand);
    }

    @Override
    public double calculate() {
        return this.firstOperand/this.secondOperand;
    }
}