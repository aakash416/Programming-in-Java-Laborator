/* Java Program Example - One Dimensional Array Program */
		
import java.util.Scanner;

public class JavaProgram
{
   public static void main(String args[])
   {
   
       int arr[] = new int[50];
       int n, i;
       Scanner scan = new Scanner(System.in);
	   
       System.out.print("How Many Element You Want to Store in Array ? ");
       n = scan.nextInt();
	   
       System.out.print("Enter " + n + " Element to Store in Array : ");
       for(i=0; i<n; i++)
       {
           arr[i] = scan.nextInt();
       }
	   
       System.out.print("Elements in Array is :\n");
       for(i=0; i<n; i++)
       {
           System.out.print(arr[i] + "  ");
       }
	   
   }
}