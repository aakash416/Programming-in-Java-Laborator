 class ClassA 
{
    public void dispA()
    {
        System.out.println("disp() method of ClassA");
    }
}
 class ClassB extends ClassA 
{
    public void dispB()
    {
        System.out.println("disp() method of ClassB");
    }
}
public class ClassC extends ClassB
{
    public void dispC()
    {
        System.out.println("disp() method of ClassC");
    }
    public static void main(String args[])
    {
        //Assigning ClassC object to ClassC reference
        ClassC c = new ClassC();
        //call dispA() method of ClassA
        c.dispA();
        //call dispB() method of ClassB
        c.dispB();
        //call dispC() method of ClassC
        c.dispC();
    }
}
