
package array2;
import java.util.Scanner;

public class array2 {
    public static void main(String[]args){
        System.out.println("How many students CGPA you want to insert?");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        double[] array=new double[n];
        System.out.print("Enter CGPA ");
    for(int i = 0; i < n; i++) {
      array[i]=input.nextDouble();
    }
        
        
        double maxValue=array[0];
        double minValue=array[0];
        for(int i=1;i<n;i++){
            if(maxValue<array[i]){
            maxValue=array[i];
            }
            if(minValue>array[i]){
            minValue=array[i];
            }
        }
        System.out.println("Heighst CGPA = "+ maxValue);
        System.out.println("Lowest CGPA = "+ minValue);
    }
}
