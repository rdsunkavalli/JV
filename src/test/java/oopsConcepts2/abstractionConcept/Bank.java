package oopsConcepts2.abstractionConcept;

public abstract class Bank {

    public abstract void loan(); //abstract method

    public void credit(){
        System.out.println("Bank..credit");
    }
    public void debit(){
        System.out.println("Bank..debit");
    }


}
