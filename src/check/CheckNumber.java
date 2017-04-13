/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package check;

/**
 *
 * @author eng-torky
 */
public class CheckNumber {

    public boolean isANumber(Object obj) {
        if (!(obj instanceof Double)) {
            System.out.printf("(%s) this is not a number !!!\n", obj);
            return false;
        } else {
            return true;
        }
    }

}
