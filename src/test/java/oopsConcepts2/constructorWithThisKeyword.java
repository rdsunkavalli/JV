package oopsConcepts2;

public class constructorWithThisKeyword {
int age;
String name;

public constructorWithThisKeyword(int age, String name){
 //21
    this.age = age;
    this.name = name;
    System.out.println(age);
    System.out.println(name);
}

    public static void main(String[] args) {

    constructorWithThisKeyword ct = new constructorWithThisKeyword(10,"Pranav");


    }

}
