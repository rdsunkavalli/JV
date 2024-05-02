package oopsConceptsPart1;

public class FunctionsInJava {

    //7
public void printName(){
    System.out.println("Rama"); //no input, no output
}

public int addition(){
    int a = 10;
    int b = 20;
    int c = a+b;
    return c;   //no input, with output
}

public String hello(){
    String name = "Devi"; //no input, with output
    return name;
}

public int remainder(int c, int d){
    int y= c%d;
 return y; //with input, with output
}


    public static void main(String[] args) {
        FunctionsInJava fij = new FunctionsInJava();
        //fij is the reference variable, referring to this object.
        //After object is created, all nonstatic methods will be given to the object.

        fij.printName();

        int x = fij.addition();
        System.out.println(x);

        int z = fij.remainder(17,5);
        System.out.println(z);

        String nm = fij.hello();
        System.out.println(nm);








    }
}
