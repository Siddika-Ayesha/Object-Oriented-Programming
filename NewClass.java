
import java.util.Scanner;

public class NewClass {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = input.nextInt();
        int[] Ayesha_arr = new int[n];

        System.out.println("Enter the values of  array: ");
        for (int i = 0; i < Ayesha_arr.length; i++) {
            Ayesha_arr[i] = input.nextInt();
        }

        for (int i = 0; i < Ayesha_arr.length; i++) {
            System.out.println("The value of array [" + i + "] : " + Ayesha_arr[i]);
        }

        System.out.println("The duplicate values are: ");
        int count =0;
        for (int i = 0; i < Ayesha_arr.length; i++) {
            for (int j = i + 1; j < Ayesha_arr.length; j++) {
                if (Ayesha_arr[i] == Ayesha_arr[j]) {
                    count++;
                    //System.out.println(Ayesha_arr[i]);
                }
                
            }
        }
        
           System.out.println(count);
            System.out.println("\nPrime Numbers Are From The Array");

            for ( int i = 0; i < Ayesha_arr.length; i++) 
            {
                int flag = 0;
                for (int k = 2; k < Ayesha_arr[i]; k++) {
                    if (Ayesha_arr[i] % k == 0) {
                        System.out.println(Ayesha_arr[i] +"is a prime number");
                        flag = flag + 1;
                    }
                }
                System.out.println("The number of prime numbers"+flag);
            }
           
            System.out.println("\nAfter deleting between 5 to 10 the array: ");
            for ( int i = 0; i < Ayesha_arr.length; i++) {
            if(Ayesha_arr[i]>5||Ayesha_arr[i]<10){
            System.out.println(Ayesha_arr[i]);
            }
            }
        }
    }

