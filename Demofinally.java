class Demofinally{
public static void main(String args[])
{
try{int data=50/0;}
catch(ArithmeticException e){
System.out.println(e);}
finally{
System.out.println("finally block will always be executed");}
System.out.print("rest of the code");
}
}
