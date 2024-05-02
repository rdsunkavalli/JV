package javaBasic;

public class loopsConcepts {
    public static void main(String[] args) {
        //2
        //while loop
        //disadvantage of while loop is, it will generate infinite loop if incremental or decremental condition is not specified.
        System.out.println("while loop");
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        //for loop
        System.out.println("for loop");
        for (int j = 10; j <= 20; j++) {
            System.out.println(j);
        }

        for(int k=30; k>=20; k--){
            System.out.println(k);

        }

    }
}
