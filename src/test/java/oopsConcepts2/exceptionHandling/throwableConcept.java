package oopsConcepts2.exceptionHandling;

public class throwableConcept {

    public void sum(){
        try{
           int i=9/0;
        }
        catch(Throwable e){
         e.printStackTrace();
            System.out.println("ABC");
        }
    }



    public static void main(String[] args) {

throwableConcept tc1 = new throwableConcept();
tc1.sum();
        System.out.println("test");
    }


}
