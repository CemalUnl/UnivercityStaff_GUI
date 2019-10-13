/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UnivercityStaff;


public class Faculty extends Employee {
    private int yearsOfEmployment;

    public Faculty(String TCKimlik) {
        super(TCKimlik);
    }

    public Faculty(int yearsOfEmployment, String TCKimlik) {
        super(TCKimlik);
        this.yearsOfEmployment = yearsOfEmployment;
    }
    
    
    public int getYearsOfEmployment() {
        return yearsOfEmployment;
    }

    public void setYearsOfEmployment(int yearsOfEmployment) {
        this.yearsOfEmployment = yearsOfEmployment;
    }


    // a faculty memeber can become doctore if worked more than 10 years
    public final boolean canBecomeDoctor() { 
        return yearsOfEmployment >= 10;
    }
    


    @Override    
    public int calcVacDays() {
//        super.salary = 400;
        if (this.yearsOfEmployment > 10) {
            return 15;
        }
        else {
            return super.calcVacDays();
        }
    }

    @Override
    public String toString() {
        return super.toString() +  ",Faculty{" + "yearsOfEmployment=" + yearsOfEmployment + '}';
    }

    
    
    
}
