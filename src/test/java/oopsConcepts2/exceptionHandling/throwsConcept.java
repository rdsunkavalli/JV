package oopsConcepts2.exceptionHandling;

public class throwsConcept {

    public void div() throws ArithmeticException{
        int i =9/0;
    }

    public  void sum(){
        try {
            div();
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }


    }
    public static void main(String[] args) {

        throwsConcept tc = new throwsConcept();
        tc.sum();
        System.out.println("ABC");


    }



}
