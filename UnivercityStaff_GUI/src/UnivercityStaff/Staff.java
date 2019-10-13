/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UnivercityStaff;


public class Staff extends Employee {

    public Staff(String TCKimlik) {
        super(TCKimlik);
    }

    
    @Override
    protected double calcTax() {
        return super.calcTax() / 2;
    }

    
}
