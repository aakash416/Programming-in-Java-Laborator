import java.util.*;
class FULLADDER
{
public static void main(String args[])
{
int a[],b[];
Scanner sc=new Scanner(System.in);
System.out.println("ENTER NUMBER OF BITS : ");
int n=sc.nextInt();
a=new int[n];
b=new int[n];
System.out.println("ENTER ELEMENTS : \nA CONTAINS:");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("B CONTAINS ");
for(int i=0;i<n;i++)
{
b[i]=sc.nextInt();
}
int carry=0;
int sum[]=new int[n];
for(int i=n-1;i>=0;i++)
{
sum[i]=(a[i]+b[i]+carry)%2;
carry=(a[i]+b[i]+carry)/2;
}
System.out.print("FIRST BINARY NUMBER: ");
for(int i=0;i<n;i++)
{
System.out.print(a[i]);
}
System.out.println("");
System.out.print("SECOND BINARY NUMBER: ");
for(int i=0;i<n;i++)
{
System.out.print(b[i]);
}
System.out.println("");

System.out.print("SUM: ");
for(int i=0;i<n;i++)
{
System.out.print(sum[i]);
}
System.out.println("");
System.out.println("CARRY: "+carry);
}

}