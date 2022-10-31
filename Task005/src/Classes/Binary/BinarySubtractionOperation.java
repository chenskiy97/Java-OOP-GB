package Classes.Binary;

import AbstractClasses.ABinaryOperation;

public class BinarySubtractionOperation extends ABinaryOperation {

    public BinarySubtractionOperation(double firstOperand, double secondOperand) {
        super(firstOperand, secondOperand);
    }

    @Override
    public double calculate() {
        return this.firstOperand - this.secondOperand;
    }
}