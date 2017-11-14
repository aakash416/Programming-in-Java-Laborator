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
 class ClassC extends ClassA
{
    public void dispC()
    {
        System.out.println("disp() method of ClassC");
    }
}
  class ClassD extends ClassA
{
    public void dispD()
    {
        System.out.println("disp() method of ClassD");
    }
}
public class HierarchicalInheritanceTest 
{
    public static void main(String args[])
    {
        //Assigning ClassB object to ClassB reference
        ClassB b = new ClassB();
        //call dispB() method of ClassB
        b.dispB();
        //call dispA() method of ClassA
        b.dispA();
        
        
        //Assigning ClassC object to ClassC reference
        ClassC c = new ClassC();
        //call dispC() method of ClassC
        c.dispC();
        //call dispA() method of ClassA
        c.dispA();
        
        //Assigning ClassD object to ClassD reference
        ClassD d = new ClassD();
        //call dispD() method of ClassD
        d.dispD();
        //call dispA() method of ClassA
        d.dispA();
    }
}