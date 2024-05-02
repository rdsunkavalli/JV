package javaBasic;

public class twoDimensionalArray {
    public static void main(String[] args) {
        //7

        String [][] x = new String[3][5];

        x[0][0] = "a1";
        x[0][1] = "a2";
        x[0][2] = "a3";
        x[0][3] = "a4";
        x[0][4] = "a5";

        x[1][0] = "b1";
        x[1][1] = "b2";
        x[1][2] = "b3";
        x[1][3] = "b4";
        x[1][4] = "b5";

        x[2][0] = "c1";
        x[2][1] = "c2";
        x[2][2] = "c3";
        x[2][3] = "c4";
        x[2][4] = "c5";

        System.out.println("this array contains " +x.length+ " rows");
        System.out.println("this array contains " + x[0].length + " columns");
        for(int row=0;row<x.length;row++){
            for(int col=0;col<x[0].length;col++){
                System.out.println(x[row][col]);
            }
        }

    }
}
