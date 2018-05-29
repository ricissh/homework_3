package homework_3;

import java.util.Scanner;

public class reizrekins {

	public static void main(String[] args) {
		Scanner lt = new Scanner(System.in);
		int v = 0;
		int a = lt.nextInt();
		int i;
		for (i = 0; i <= a; i++) {
			v = a * i;

			System.out.println(a + " * " + i + "=" + v);
		}

	}

}
