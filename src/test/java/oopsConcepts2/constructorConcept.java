package oopsConcepts2;

public class constructorConcept {
    //21
    public constructorConcept() {
        System.out.println("constructor concept");
    }

    public constructorConcept(int i) {
        System.out.println("constructor concept with 1 parameter");
        System.out.println("the value of i is " + i);
    }

    public constructorConcept(int i, int j) {
        System.out.println("constructor concept with 2 parameters");
        System.out.println("the value of i is " + i);
        System.out.println("the value of j is " + j);
    }

    public static void main(String[] args) {

        constructorConcept cc1 = new constructorConcept();
        constructorConcept cc2 = new constructorConcept(10);
        constructorConcept cc3 = new constructorConcept(10,20);






    }
}
