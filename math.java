
package Task3;
import java.lang.Math;
import java.util.Scanner;
public class math {
    public static void main(String[]args){
        System.out.println("Enter an Integer");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        System.out.println("Absolute Value of a = "+Math.abs(a));
        double d=4.5;
        System.out.println("Ciel Value of d = "+ Math.ceil(d));
        System.out.println("Floor Value of d = "+ Math.floor(d));
        System.out.println("Round Value of d = "+ Math.round(d));
        System.out.println("Square Root Value of d = "+ Math.sqrt(d));
        
        int x=3,y=-10,z=15;
        int min1=Math.min(x, y);
        int min2=Math.min(min1, z);
        System.out.println("Minimum number "+ min2);
      for(int i=0;i<5;i++){
        double rand=(Math.random() *5)+200;
       System.out.println("Random number "+ (int)rand);
      }
    }
}
