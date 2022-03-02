
package lab.pkg3;

import java.util.Arrays;
import java.util.Scanner;
public class LAB3 {

    public static void main(String[] args) {
        System.out.println("How many number you want to insert");
        Scanner input=new Scanner(System.in);
       int n=input.nextInt();
       int[]number=new int[n];
       for(int i=0;i<n;i++){
       number[i]=input.nextInt();
       }
       
        Arrays.sort(number);
        System.out.println("Ascending Order");
        for(int i=0;i<number.length;i++){
            System.out.print( " " +number[i]);
        }
    }
    
}
