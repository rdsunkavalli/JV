package oopsConcepts2.abstractionConcept;

public class TestBank {
    public static void main(String[] args) {
        HDFCBank hd = new HDFCBank();
        hd.credit();
        hd.debit();
        hd.loan();
    }
}
