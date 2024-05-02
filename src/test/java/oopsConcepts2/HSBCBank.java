package oopsConcepts2;

public class HSBCBank implements Bank, BankUS {

    public void credit(){
        System.out.println("HSBC.....Credit");
    }
    public void debit(){
        System.out.println("HSBC.....Debit");
    }
    public void  transferMoney(){
        System.out.println("HSBC.....transfer money");

    }

    public void mutualFund(){
        System.out.println("HSBC.....mutual fund");
    }
    public void educationalLoan(){
        System.out.println("HSBC.....educational loan");
    }
    public void carLoan(){
        System.out.println("HSBC.....carLoan");
    }
}
