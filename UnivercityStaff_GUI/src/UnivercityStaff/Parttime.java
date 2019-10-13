/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UnivercityStaff;


public final class Parttime extends Faculty{
    private int hoursWorked;

    public Parttime(int yearsOfEmployment, String TCKimlik) {
        super(yearsOfEmployment, TCKimlik);
    }

    public Parttime(String TCKimlik) {
        super(TCKimlik);
    }
        
    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    
    @Override
    public double calcSalary() {
        return this.hoursWorked * super.getSalary();
    }    
}
