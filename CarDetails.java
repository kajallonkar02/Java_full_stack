import java.util.Scanner;
public class CarDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputname;
        Car cararr[] = new Car[5];
        for(int i=0; i<5;i++){
            String car_name =sc.nextLine();
            String car_company=sc.nextLine();
            int car_model =sc.nextInt(); sc.nextLine();
            int car_milleage =sc.nextInt(); sc.nextLine();
        
            Car cobj = new Car(car_name, car_company, car_model, car_milleage);
            cararr[i]= cobj;

        }

        Car xyz = cararr[0];
        Car abc = cararr[1];
        Car pqr = cararr[2];
        Car efg = cararr[3];


        xyz.printDetails();
        System.out.println("************************");

        abc.printDetails();
        System.out.println("************************");

        pqr.printDetails();
        System.out.println("************************");

        efg.printDetails();
        System.out.println("************************");
    }
}