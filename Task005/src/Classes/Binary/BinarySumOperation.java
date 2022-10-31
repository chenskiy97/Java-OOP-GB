package Classes.Binary;

import AbstractClasses.ABinaryOperation;

public class BinarySumOperation extends ABinaryOperation {

    public BinarySumOperation(double firstOperand, double secondOperand) {
        super(firstOperand, secondOperand);
    }

    @Override
    public double calculate() {
        return this.firstOperand + this.secondOperand;
    }
}
