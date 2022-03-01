
package ex.pkg1;

import java.util.Scanner;
public class Ex1 {

    
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       int n= input.nextInt();
       if(n%2==0){
           System.out.println("The number is even!");
       }
       else{
        System.out.println("The number is odd!");
       }
    }
    
}
