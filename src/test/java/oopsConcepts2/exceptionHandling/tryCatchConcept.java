package oopsConcepts2.exceptionHandling;

public class tryCatchConcept {
    public static void main(String[] args) {
        try{
         int i = 9/0;
        }
        catch(ArithmeticException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("pass");
    }
}
