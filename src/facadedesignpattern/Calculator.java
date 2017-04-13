/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadedesignpattern;

import Print.PrintResult;
import check.CheckNumber;
import operation.*;

/**
 *
 * @author eng-torky
 */
public class Calculator {

    CheckNumber checkNum;
    PrintResult printRes;
    Add add;
    Sub sub;
    Multi multi;
    Divide div;

    public Calculator() {
        add = new Add();
        sub = new Sub();
        multi = new Multi();
        div = new Divide();
        printRes = new PrintResult();
        checkNum = new CheckNumber();
    }

    public void operation(Object fNum, Object sNum, char op) {
        if (!(checkNum.isANumber(fNum) && checkNum.isANumber(sNum))) {
            System.out.println("Faild !!!");
        } else {
            switch (op) {
                case '+':
                    printRes.printAns(Double.toString(add.addTwoNumber((double) fNum, (double) sNum)));
                    break;
                case '-':
                    printRes.printAns(Double.toString(sub.subTwoNumber((double) fNum, (double) sNum)));
                    break;
                case '*':
                    printRes.printAns(Double.toString(multi.multiTwoNumber((double) fNum, (double) sNum)));
                    break;
                case '/':
                    printRes.printAns(Double.toString(div.divideTwoNumber((double) fNum, (double) sNum)));
                    break;
                default:
                    System.out.println("Wrong Operation !!!");
            }
        }
    }
}
