package oopsConceptsPart1;

public class localVsGlobalVariable {
    //8

    int a = 10;
    int b = 20;
    int age  = a+b;

    public void sum(int x, int y){
        int s = x+y;
        System.out.println(s);
    }


    public static void main(String[] args) {
        int c =40;
        localVsGlobalVariable lgvariable = new localVsGlobalVariable();
        System.out.println(lgvariable.age);

        lgvariable.sum(100,20);

    }
}
