import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //the Scanner class is used to take input from the user. It can read data from various sources

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        System.out.println("Enter your age:");
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        System.out.println("Hello " +name);
        System.out.println("You are "+ age+ " Years old");
        scanner.nextLine();
        scanner.close();
    }
}

output:
Enter your age:
nalini
20
Hello nalini
You are 20 Years old
