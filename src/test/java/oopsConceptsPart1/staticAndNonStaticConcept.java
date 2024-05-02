package oopsConceptsPart1;

public class staticAndNonStaticConcept {

    //10
    int sum = 10;
    static String s = "Hello";

    public void sendMail()
    {
        System.out.println("sendMail");
    }

    public static void printName() {
        System.out.println("print name Tom");

    }

    public static void main(String[] args) {
        staticAndNonStaticConcept stnnst = new staticAndNonStaticConcept();

        System.out.println(s); //static variables can be called directly
        System.out.println(stnnst.sum); //no-static variables can be called through object.

        printName(); //static methods can be called directly
        staticAndNonStaticConcept.printName(); //static methods can be called through class name;
        stnnst.sendMail(); //no-static methods can be called through object.


    }
}
