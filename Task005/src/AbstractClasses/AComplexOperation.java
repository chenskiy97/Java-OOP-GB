package AbstractClasses;

import Interfaces.IComplexAction;
import Classes.Complex.CNum;

public abstract class AComplexOperation implements IComplexAction {
    protected CNum firstCnum;

    public AComplexOperation(CNum firstCnum, CNum secondCnum) {
        this.firstCnum = firstCnum;
        this.secondCnum = secondCnum;
    }

    protected CNum secondCnum;
}
