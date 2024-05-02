package oopsConceptsPart1;

public class overLoadMainMtd {
    //26

    public static void main(String args) {
        System.out.println(args);
    }

    public static void main(String s,int a, int b) {
        System.out.println(s+(a+b));

    }
    public static void main(String[] args) {
        System.out.println("executing main method");

        main("executing main method 2");
        main ("executing 3rd main method ",10, 20);


    }
}
