package javaBasic;

public class incrementAndDecrement {
    public static void main(String[] args) {
        //4
        int i=1;
        System.out.println("The value of i is" + i);
        int j = ++i;
        System.out.println("the value of j is:" + j);
        System.out.println("***********");

        int a=1;
        int b = ++a;
        System.out.println("The value of a is" + a);
        System.out.println("the value of b is:" + b);


        System.out.println("***********");
        int k=1;
        int l = k++;
        System.out.println("The value of k is" + k);
        System.out.println("the value of l is:" + l);

    }
}
