import java.util.Scanner;
public class EmployeeDetails{
    public static void main(String[] args){
        //Employee(String name,int id,double salary,String company, double exp)
        Scanner sc = new Scanner(System.in);
        String inputname;
        int inputid;  // declaration
        double inputsalary;
        String inputcompany;
        double inputexp;
        
        Employee emp1=null;
        Employee emp2=null;
        Employee emp3=null;
        Employee emp4=null;
        Employee emp5=null; 
        for(int i=0;i<5;i++){
            inputname=sc.nextLine();   // initialization 0r assignment of value in variable
            inputid = sc.nextInt(); sc.nextLine();
            inputsalary=sc.nextDouble(); sc.nextLine();
            inputcompany=sc.nextLine();
            inputexp = sc.nextDouble(); sc.nextLine();
            if(i==0){ 
                        emp1 = new Employee(inputname, inputid, inputsalary, inputcompany, inputexp);
                     double final_salary = emp1.increament(45000);
                     System.out.println(final_salary);
            }else if(i==1){
                        emp2 = new Employee(inputname, inputid, inputsalary, inputcompany, inputexp);
            }else if(i==2){
                        emp3 = new Employee(inputname, inputid, inputsalary, inputcompany, inputexp);
            }else if(i==3){
                        emp4 = new Employee(inputname, inputid, inputsalary, inputcompany, inputexp);
            }else if(i==4){
                        emp5 = new Employee(inputname, inputid, inputsalary, inputcompany, inputexp);
            }
        } 

    //    Employee emp1 = new Employee(inputname, 101, 10.10, "Google", 5.5d);
    //    Employee emp2 = new Employee(inputname, 102, 5.10, "TCS", 2.5d);
    //    Employee emp3 = new Employee(inputname, 103, 8.10, "Meta", 2.5d);
    //    Employee emp4 = new Employee(inputname, 104, 9.1, "Apple", 5.5d);
    //    Employee emp5 = new Employee(inputname, 105, 6.15, "Google", 9.5d);
       emp1.printDetails();
       System.out.println("**********************************");
       emp2.printDetails();
       System.out.println("**********************************");
       emp3.printDetails();
       System.out.println("**********************************");
       emp4.printDetails();
       System.out.println("**********************************");
       emp5.printDetails();
       System.out.println("**********************************");
 
    }
}
