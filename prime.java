import java.util.Scanner;
public class prime {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    for(int i =2; i<num; i++){
        if(num % i==0){

            System.out.println("non prime");
            break;
        }
    }
}

