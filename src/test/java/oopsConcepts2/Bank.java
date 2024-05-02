package oopsConcepts2;

public interface Bank {

    /*
    No main method in interface.
    Only method declaration/prototype. There is no method body.
    We can declare the variables and variables are static by default.
    The value of variables cannot be changed
    We cannot create object of interface.
    Interface is abstract in nature.
    No static methods in interface.
     */

    int min_bal =100;

    public void credit();

    public void debit();

    public void transferMoney();







}
