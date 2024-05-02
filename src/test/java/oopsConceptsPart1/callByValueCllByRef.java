package oopsConceptsPart1;

public class callByValueCllByRef {
    //13

    public void testSum(int a, int b){
        System.out.println(a+b);
    }

    int p = 100;
    int q = 200;

    public void swap (callByValueCllByRef t){
        int temp = t.p;
        t.p = t.q;
        t.q = temp;
    }

    public static void main(String[] args) {
        callByValueCllByRef cbv = new callByValueCllByRef();
        int x = 10;
        int y = 20;
        cbv.testSum(x,y); //call by value

        cbv.swap(cbv); //call by reference
        System.out.println("the value of p after swapping is "+ cbv.p);
        System.out.println("the value of q after swapping is "+ cbv.q);





    }





}
