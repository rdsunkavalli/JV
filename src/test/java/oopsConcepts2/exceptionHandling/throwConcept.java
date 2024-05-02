package oopsConcepts2.exceptionHandling;

public class throwConcept {
    public static void main(String[] args) {
        System.out.println("ABC");
        try {
            throw new Exception("Rama");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("PQR");
    }
}
