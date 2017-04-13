/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadedesignpattern;

/**
 *
 * @author eng-torky
 */
public class Test {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.operation(100.00, 200.00, '+');
        calc.operation(100.00, 200.00, '-');
        calc.operation(100.00, 200.00, '*');
        calc.operation(100.00, 200.00, '/');
        calc.operation(100.00, 200.00, 'm');
        calc.operation("sss", 200.00, '+');
        calc.operation(100.00, true, '+');
    }

}
