package oopsConceptsPart1;

public class wrapperClasConcept {
    public static void main(String[] args) {

        //12
        // Integer, Double, Boolean

        String x = "100";
        System.out.println(x+20);
        //String to integer conversion
        int i = Integer.parseInt(x);
        System.out.println(i+20);

        //String to double conversion
        String y = "12.33";
        double d = Double.parseDouble(y);
        System.out.println(d+10);

        //String to boolean conversion
        String a = "true";
        boolean b = Boolean.parseBoolean(a);
        System.out.println(b);

        //integer to String conversion
        int j = 5;
        String s = String.valueOf(j);
        System.out.println(s+"00000");










    }
}
