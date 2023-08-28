package collectionsPrograms1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetContains {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		Set<Integer> set=new HashSet<>();
		set.add(3);
		set.add(9);
		set.add(1);
		if(set.contains(a))
		{
			System.out.println("Number is present");
		}
		else
		{
			System.out.println("Number is not present");
		}

	}

}
