package AbstractClasses;

import Interfaces.ExpressionHandler;
import Interfaces.GetCNumValues;
import Interfaces.GetSigns;
import Interfaces.GetValues;
import Classes.Complex.CNum;

import java.util.ArrayList;
import java.util.List;

public abstract class AExpressionProcessor implements GetValues, GetSigns, ExpressionHandler, GetCNumValues {
    protected List<Double> values;
    protected List<String> signs;
    protected List<CNum>   cNums;
    protected String expression;

    public AExpressionProcessor(String expression) {
        this.expression = expression;
        this.values = new ArrayList<>();
        this.signs = new ArrayList<>();
        this.cNums = new ArrayList<>();
    }
}
