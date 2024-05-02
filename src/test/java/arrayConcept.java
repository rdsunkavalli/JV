public class arrayConcept {
    public static void main(String[] args) {
        //6
        //array to store group of values of similar data types
        //starts with index 0
        //Lower bound index 0
        //upper bound index n-1, where n is the size of array
        //one dimensional array

        //disadvantages : Size is static/fixed -> Use collections to solve this problem
        //we can store values with similar data types -> We use Object array to solve this problem.


        //int array
        int[] i = new int[4];
        //To add elements in the array
        i[0] = 10;
        i[1] = 20;
        i[2] = 30;
        i[3] = 40;

        //to print a specific element from array
        System.out.println(i[0]);

        //to print length or size of the array
        System.out.println("The size of array is " + i.length);

        // To print all the values of array
        for (int j = 0; j < i.length; j++) {
            System.out.println(i[j]);
        }

        //double array
        double[] d = new double[4];
        d[0] = 12.33;
        d[1] = 21.22;
        d[2] = 32.55;
        d[3] = 65.55;
        for (int a = 0; a < d.length; a++) {
            System.out.println(d[a]);
        }

        //char array
        char[] c = new char[3];
        c[0] = 'b';
        c[1] = '1';
        c[2] = '$';
        for (int x = 0; x < c.length; x++) {
            System.out.println(c[x]);
        }

        //boolean array
        boolean[] b = new boolean[2];
        b[0] = true;
        b[1] = false;
        for (int y = 0; y < b.length; y++) {
            System.out.println(b[y]);
        }

        //String array
        String[] s = new String[3];
        s[0] = "Test";
        s[1] = "Hello";
        s[2] = "World";
        for (int z = 0; z < s.length; z++) {
            System.out.println(s[z]);
        }
        System.out.println(s.length);

        Object[] ob = new Object[6];
        ob[0] = 100;
        ob[1] = 12.55;
        ob[2] = 'A';
        ob[3] = true;
        ob[4] = "Dublin";
        ob[5] = '$';

        System.out.println(ob[3]);
        System.out.println(ob.length);
        for (int f = 0; f < ob.length; f++) {
            System.out.println(ob[f]);

        }
    }
}
