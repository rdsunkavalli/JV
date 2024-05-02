package oopsConcepts2;

public class testBank {
    public static void main(String[] args) {
        HSBCBank hb = new HSBCBank();
        hb.credit();
        hb.debit();
        hb.transferMoney();
        hb.educationalLoan();
        hb.carLoan();

        System.out.println(Bank.min_bal);

        Bank b = new HSBCBank();
        b.credit();
        b.debit();
        b.transferMoney();






    }

}
