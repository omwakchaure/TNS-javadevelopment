package constructor;

import java.util.Scanner;

public class Condemo {
	
	public Condemo()
	{
		System.out.println("Default constructor");
	}
	
	public Condemo(int id, String name, int age)
	{
		System.out.println("Parametrized constructor");
		System.out.println(id+" "+name+ " "+age);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		System.out.println(data);
		sc.close();
		
		Condemo obj1 = new Condemo();
		Condemo obj = new Condemo(5, "om", 21);

	}

}

