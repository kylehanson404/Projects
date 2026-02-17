import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        // Instantiate Pet 1 (default constructor)
        Pet myPet1 = new Pet();
        System.out.println(myPet1);

        // Instantiate Pet 2 (custom constructor)
        Pet myPet2 = new Pet("Dog", "Buster", 11);
        System.out.println(myPet2);

        // Scanner for user input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter animal type:");
        String type = input.nextLine();

        System.out.println("Enter animal name:");
        String name = input.nextLine();

        System.out.println("Enter animal age:");
        int age = input.nextInt();

        // Instantiate Pet 3 using set methods
        Pet myPet3 = new Pet();
        myPet3.setType(type);
        myPet3.setName(name);
        myPet3.setAge(age);

        System.out.println();
        System.out.println(myPet3);

        input.close();
    }
}
