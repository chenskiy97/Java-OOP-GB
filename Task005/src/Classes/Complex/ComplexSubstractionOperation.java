package Classes.Complex;

import AbstractClasses.AComplexOperation;

public class ComplexSubstractionOperation extends AComplexOperation {
    public ComplexSubstractionOperation(CNum firstCnum, CNum secondCnum) {
        super(firstCnum, secondCnum);
    }

    @Override
    public CNum calculate() {
        CNum num = new CNum();
        StringBuilder sb = new StringBuilder();
        double firstIm = (this.firstCnum.getSign().equals("+")) ? firstCnum.getIm() : firstCnum.getIm() * -1;
        double secondIm = (this.secondCnum.getSign().equals("+")) ? secondCnum.getIm() : secondCnum.getIm() * -1;
        double re = this.firstCnum.getRe() - this.secondCnum.getRe();
        double im = firstIm - secondIm;
        String sign = (im >= 0) ? "+" : "-";
        String expr = sb.append("(").append(re).append((im >= 0) ? "+" : "").append(im).append("i)").toString();

        num.setRe(re);
        num.setSign(sign);
        num.setIm(im);
        num.setsExpression(expr);
        return num;
    }
}