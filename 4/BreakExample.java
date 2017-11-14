class BreakExample{

      public static void main(String args[]){
           
            for(int count=1;count<=100;count++;
            {
                  if(count==10){
                        break;
                  }
                  System.out.println("The value of num is : " +count);
            }
      System.out.println("Outside loop");
      }
}