package oopsConcepts2;

public class FinallyConcept {
    public static void divison(){
        try{
            int i = 10;
            System.out.println("inside try block");
            int k = i / 0;
        }
//the finally block will execute even after commenting catch block
        catch(ArithmeticException e){
            System.out.println("inside catch block");
            System.out.println("facing zero error");

        }
        finally {
            System.out.println("execute this code after any exception");
        }

    }

    public static void main(String[] args) {
        divison();


    }

}
