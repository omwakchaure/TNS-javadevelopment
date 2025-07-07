package encapsulation;

import java.util.Scanner;

public class Encapsulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Demo obj = new Demo();

        System.out.print("Enter serial number: ");
        int serial = input.nextInt();
        input.nextLine(); // consume newline

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // Set values using setters
        obj.setSerialNum(serial);
        obj.setName(name);
        obj.setAge(age);

        
        System.out.println(obj);
        input.close();
    }
}

