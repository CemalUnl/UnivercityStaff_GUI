/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UnivercityStaff;

public class Employee {
    private String TCKimlik;
    private String name;
    private double salary;

    public Employee(String TCKimlik) {
        this.TCKimlik = TCKimlik;
    }

    public Employee(String TCKimlik, String name) {
        this.TCKimlik = TCKimlik;
        this.name = name;
    }
   
    
    public String getTCKimlik() {
        return TCKimlik;
    }

    public void setTCKimlik(String TCKimlik) {
        this.TCKimlik = TCKimlik;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public int calcVacDays() {
        return 10;
    }
    
    public double calcSalary() {
        return getSalary() - (calcTax() * getSalary());
    }
    
    protected double calcTax() {
        return 0.15;
    }

    @Override
    public String toString() {
        return "Employee{" + "TCKimlik=" + TCKimlik + ", name=" + name + ", salary=" + salary + '}';
    }

    
    
}
