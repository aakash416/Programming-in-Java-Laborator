class Rectangle 
{ 
      int length ; 
      int breadth ; 
        Rectangle() 
        { 
           System.out.println("Constructor with Zero Parameter Called "); 
           length = breadth = 0 ; 
         } 
         Rectangle(int side) 
         { 
            System.out.println("Constructor with One Parameter Called"); 
            length = breadth = side ; 
         } 
         Rectangle(int l,int b) 
         { 
            System.out.println("Constructor with Two Parameters Called"); 
            length = l ; 
            breadth = b ; 
         } 
         int area() 
         { 
           return (length * breadth) ; 
         } 
} 
       class ConstructorOverloading 
{ 
               public static void main(String[] args) 
          { 
                Rectangle r1 = new Rectangle(); //const. with 0-parameter called 
                Rectangle r2 = new Rectangle(5); //const with l parameter called 
                Rectangle r3 = new Rectangle(7,8); //const.with2 parameter called
                System.out.println("Area of First Rectangle is : "+ r1.area( )); 
                System.out. println("Area of Square is : "+ r2.area( )); 
                System.out.println("Area of Second Rectangle is : "+ r3.area( )); 
          } 
} 