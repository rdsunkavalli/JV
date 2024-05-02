package javaBasic;

public class ifElseCondition {
    public static void main(String[] args) {
        //3
        //comparison operators ==,<,>,<=,>=,!=

        int a = 30;
        int b = 20;
        if(a>b){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("b is greater than a");
        }

        int c = 100;
        int d = 200;
        if(c==d){
            System.out.println("c and d both are equal");
        }
        else{
            System.out.println("c and d are not equal");
        }

        int e = 50;
        int f= 20;
        int g = 30;
        if(e>f & e>g){
            System.out.println("e is greater than f and g");
        } else if (f>e & f>g) {
            System.out.println("f is greater than e and g");
        }
        else {
            System.out.println("g is greater than e and f");
        }


    }
}
