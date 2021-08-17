class Demomulticatch{
public static void main(String args[])
{

try
{

int arr[]=new int [3];
arr[0]=1;
arr[1]=2;
arr[2]=3;


System.out.println(arr[4]);
int data=50/0;
System.out.println(data);

}
catch(ArithmeticException e)
{
System.out.println(e);
}
catch(ArrayIndexOutOfBoundsException ae)
{
System.out.println(ae);
}

finally
{
System.out.println("fianlly block will always be executed");
}
System.out.print("rest of the code");
}
}
