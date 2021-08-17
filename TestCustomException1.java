class MyException  extends Exception  
{  
    public MyException (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
}  

class TestCustomException1  
{  
    
    static void validate (int age) throws MyException{    
       if(age < 18){          
        throw new MyException("age is not valid to vote");    
    }  
       else {   
        System.out.println("welcome to vote");   
        }   
     }    
  
    // main method  
    public static void main(String args[])  
    {  
        try  
        {  
            // calling the method   
            validate(13);  
        }  
        catch (MyException ex)  
        {  
            System.out.println("Caught the exception");  
    
            // printing the message from InvalidAgeException object  
            System.out.println("Exception occured: " + ex);  
        }  
  
        System.out.println("rest of the code...");    
    }  
}  