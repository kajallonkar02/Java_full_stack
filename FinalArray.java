import java.util.Arrays; 

public class FinalArray{

    public static void main(String[] args){
    // array kya hota hai 
    // it is a collection of similar tyoe of items with fixed length
    // for example int array containing integers(it is datatype)
    // arrays can be of two types based on datatypes
    //             1. Primitive array      ex array of primitive datatypes for ex int,boolean,double  
    //             2. Non primitive array   ex array of some custome class or custom datatype
    // arrays can be also classified based on dimension
    //             1.  1 Dimensional
    //             2.  mutli Dimensional (2d,3d,4d)

    // why we need array
    //   to store similar type of data together in one place at contigious memory location
    //   formula  req_address= starting_addredd + datatype_size*number_of_posiitons
    //   mere pass ek int array hai and mujhe starting address 1000 diya hai to mujhe 10th position be element hoga uska 
    //   memory address find krna hai ??? 
    


    // we have to create two arrays
    //    1--> even_arry
    //    2--> odd_arry
    // it will store repsective even and odd element


    int even_arr[] = new int[25];
    int odd_arr[] = new int[25];
    int ind_even = 0;
    int ind_odd = 0;
    for(int i=1; i<=50; i++){
        if(i%2==0){
            even_arr[ind_even++] = i;
        }
        else{
            odd_arr[ind_odd++] = i;
    
        }

    }

    for(int i = 0; i<ind_even; i++){
        System.out.println(even_arr[i]);
    }


    }
}