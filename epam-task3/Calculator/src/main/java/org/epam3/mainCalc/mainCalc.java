package org.epam3.mainCalc;

import org.epam3.operate.operate;

public class mainCalc extends Exception{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private final float fnum, snum;
    private final char operation;
    private final operate opr;

    public mainCalc(final float fnumber, final char operate, final float snumber)
    {
        operation = operate;
        fnum = fnumber;
        snum = snumber;

        opr = new operate();
    }

    public float displayResult()
    {
        if(operation == '+')
            return opr.addition(fnum,snum);
        else if(operation == '-')
            return opr.subtraction(fnum,snum);
        else if(operation == '/')
            return opr.division(fnum,snum);
        else if(operation == '*')
            return opr.multiplication(fnum,snum);
        else if(operation == '%')
            return opr.remainder(fnum,snum);
        else
            throw new ArithmeticException();
    }
}
