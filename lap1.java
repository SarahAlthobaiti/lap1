
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

        isPalindrom(arrayToFill, limit); // calling the palindrom method to cheak the array!


    }

    // Chakhing if the array palindrom or not!/////////////////////////////////////
    public static boolean isPalindrom(int[] originalArray, int limit){

        // new array to stor the reverse of the original Array!
        int[] reArray =  new int[30]; 
        for(int i = 0 , j = limit - 1; i < limit ; i++ , j--){

            reArray[i] = originalArray[j];
        }

        // flage to cheak the condition
        boolean flag = true;
        // for loop to cheak the equilty between the original and the reverse one!
        for(int i = 0; i < limit; i++){

            if(reArray[i] != originalArray[i]){ 

                flag = false;
                break;
            }
        }

        //cheak the flag 
        if(flag == true){

            displayArray(originalArray, limit);  // calling the print method to display the original array
            System.out.println("your array is palindrom!");
            return true;
        }
        else{

            displayArray(originalArray, limit);  // calling the print method to display the original array
            System.out.println("your array is not palindrom!");
            return false;

        }

        
    }

    // Method to display the origianl array that user Entered!///////////////////
    public static void displayArray(int[] arrayToDisplay,int limit){

        System.out.print("Your array is : [");
        for(int i = 0; i < limit; i++){

            int number = arrayToDisplay[i];
            // condition to cheak if it's the last number it will print it without comma (orgnaiz the output just!)
            if( i == limit -1){
                System.out.println(number+"]");
                break;
            }
            System.out.print(number +",");
        }

    }

////////////////////////////////////main Method//////////////////////////////

public static void main(String[] args){

   int array[] = new int[30];

   System.out.println("Enter only 5 numbers");
   readUserSequence(array, limit);



}



}