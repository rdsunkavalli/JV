package oopsConcepts2;

public class superKWConstructorB extends superKWConstructorA{
    public superKWConstructorB(){
        super(10);
        System.out.println("child class constructor");
    }

    public static void main(String[] args) {
        superKWConstructorB skb = new superKWConstructorB();
    }


}
