class A
{
  private interface NestedPA { void paMethod(); }
  protected interface NestedA extends NestedPA { void aMethod(); }
  public interface NestedAA { void aaMethod(); }
}
 
public class NestedInterfaceDemo implements A.NestedA, A.NestedAA
{
  public static void main (String args[])
  {
    A.NestedA na = new NestedInterfaceDemo();
    na.aMethod();
    na.paMethod();
 
    A.NestedAA naa = (A.NestedAA) na;
    naa.aaMethod();
  }
 
  public void aMethod()
  {
    System.out.println("within from aMethod");
  }
 
  public void aaMethod()
  {
    System.out.println("within from aaMethod");
  }
 
  public void paMethod()
  {
    System.out.println("within from paMethod");
  }
}