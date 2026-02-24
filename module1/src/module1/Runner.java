package module1;

public class Runner {

    public static void main(String[] args) {

        Tests myTests = new Tests();   // instantiate object

        myTests.getAverage();          // call method

        System.out.println(myTests);   // calls toString()
    }
}