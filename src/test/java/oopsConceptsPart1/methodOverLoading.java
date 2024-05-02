package oopsConceptsPart1;

public class methodOverLoading {
    //9
    //24

    public void sum(int a, int b){
        int d = a+b;
        System.out.println(d);
    }

    public void sum(int a, int b, int c){
        int d = a+b+c;
        System.out.println(d);
    }



    public static void main(String[] args) {
        methodOverLoading movl = new methodOverLoading();
        movl.sum(10, 20);
        movl.sum(10,20,30);
    }
}
