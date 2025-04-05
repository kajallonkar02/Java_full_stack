import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<5; i++){
            int temp =sc.nextInt();
            arr[i] = temp;
        }
        System.out.println("***********************");
        for(int i=0; i<5; i++){
            System.out.println(arr[i]);
        }
    }
}
