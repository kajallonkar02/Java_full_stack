
class Employee{
    String emp_name;
    int emp_id;
    double emp_salary;
    String emp_company;
    double emp_exp;
 
    double increament(int emp_salary){
        double increament_salary = emp_salary+ emp_salary*0.20; 
        return increament_salary;
        // the difference between parameter and argument
        
     }


    // Constructor is a method with same name as class name call hoti h jb object banate h 
    // 2 types parametirized and non parametirized
    Employee(){   // non parametirized
        System.out.println("Constructor called ...");
    }
    // this  super
    // this ye present class ke variable ya method ko access krne ke liye use hota h
    // super yr parent class ke variables ya methods ko access krne ke liye use hota h
 
    Employee(String name,int id,double salary,String company, double exp){
        this.emp_name=name;
        this.emp_id=id;
        this.emp_salary=salary;
        this.emp_company=company;
        this.emp_exp=exp;
    }

 
    public void printDetails(){
        System.out.println("emp name "+emp_name+"\nemp id : "+emp_id);
        System.out.println("emp salary "+emp_salary+"\nemp company : "+emp_company);
        System.out.println("emp Exp "+emp_exp);
    }
 
}