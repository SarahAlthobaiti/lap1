
import java.util.Scanner;;

public class lap1{

    // Scanner declear
    static Scanner scnr = new Scanner(System.in);
    // CONSTANT VARIBALE !
    public static final int limit = 5;
    // Method read from the user
    public static void readUserSequence(int[] arrayToFill, int limit){

        for(int i = 0; i < limit; i++ ){

            arrayToFill[i] = scnr.nextInt();

            if( i != limit - 1){

            System.out.println("Enter the next number");
            }
        }

        isPalindrom(arrayToFill, limit);


    }


    public static boolean isPalindrom(int[] originalArray, int limit){


        
        int[] reArray =  new int[30];

        for(int i = 0 , j = limit - 1; i < limit ; i++ , j--){

            reArray[i] = originalArray[j];

        }
        boolean flag = true;
        for(int i = 0; i < limit; i++){

            if(reArray[i] != originalArray[i]){

                flag = false;
                break;
            }

        
        }
        if(flag == true){

            displayArray(originalArray, limit);

            System.out.println("your array is palindrom!");
            return true;
        }
        else{
            displayArray(originalArray, limit);
            System.out.println("your array is not palindrom!");
            return false;


        }



        
    }



    public static void displayArray(int[] arrayToDisplay,int limit){

        System.out.print("Your array is : [");
        for(int i = 0; i < limit; i++){

            int number = arrayToDisplay[i];
            if( i == limit -1){
                System.out.println(number+"]");
                break;
            }
            System.out.print(number +",");
        }



    }











public static void main(String[] args){

   int array[] = new int[30];

   System.out.println("Enter only 5 numbers");
   readUserSequence(array, limit);








}



}