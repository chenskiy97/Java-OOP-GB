package AbstractClasses;

import Interfaces.IMathAction;

public abstract class ABinaryOperation implements IMathAction {
    protected double firstOperand;
    protected double secondOperand;

    public ABinaryOperation(double firstOperand, double secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }
}