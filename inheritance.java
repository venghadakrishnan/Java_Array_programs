class Employee{  // base class also SUPER CLASS or parent class
    String name;
    double salary;
    Employee(String n , double s){
        name = n;
        salary = s;
    }
    Employee(){
        name = " ";
        salary = 0.0;
    }
    // #getter and setter
    String getname(){
        return name;
    }
    void setname(String n){
        name = n;
    }

    double getSalary(){
        return salary;
    }
    void setSalary(double s){
        salary = s;
    }
    // if we want to raise the salary
    void raiseSalary(double percentage){
        salary += salary*percentage/100; 
        // System.out.println(salary);   
    }
    
// TO AVOID THE REPUTATIONS WE ARE CREATING THE MANAGER CLASS AS CHILD CLASS FORM THE EMPLOYEE CLASS
 class Manager extends Employee{  //dreived class also SUBCLASS or child class
    // in java SUPER and SUBCLASS are mainly used::
    double bonus;
    Manager(String n, double s ,double b){
        name = n;
        salary = s;
        bonus = b;
    }
    void setBonus(double b){
        bonus = b;
    }
 }

}

public class inheritance {
    public static void main(String[] args){
        Employee e1 = new Employee("Ram", 35000);
        System.out.println(e1.getname());
        // e1.raiseSalary(10);
        System.out.println(e1.getSalary());
    }
    
}
