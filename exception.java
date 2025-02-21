// Write a java program for finally block.....

package pack1;

public class A {
    
    public static void main(String[] args) {
        
        try 
        {
            System.out.println("Inside try block.");
            int result = 10 / 0;  // This will throw Arithmetic Exception
        }
        catch (ArithmeticException e) 
        {
            System.out.println("Exception caught: " + e);
        } 
        finally 
        {
            System.out.println("This is the finally block.");
        }
        
        System.out.println("Program continues after the try-catch-finally block.");
    }
}
