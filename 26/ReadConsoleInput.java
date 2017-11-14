 import java.io.*;

class ReadConsoleInput
 {
     public static void main(String args[]) throws IOException
     {
         
         char chr;
         
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         System.out.print("Enter a character (Press 'q' to quit) : ");
         // read characters now
         do
         {
             chr = (char) br.read();
             System.out.println(chr);
             
         } while(chr != 'q');
         
     }
  }