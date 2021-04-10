package week3;

public class tasks3 {

	public static void main(String[] args) {

		// 1. write a program that can print all even numbers between 0 ~ 1000

		for (int i = 0; i <= 1000; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		
		
		// 2. write a program that can print all odd numbers between 0 ~ 1000
		for (int i = 0; i <= 1000; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		
		
		// 3. write a program that can print a~z

		for (char abc = 97; abc <= 122; abc++) {

			System.out.print(abc + " ");
		}
		System.out.println();

		
		
		// 4. write a program that can print A~Z
		for (char ABC = 65; ABC <= 90; ABC++) {

			System.out.print(ABC + " ");
		}
		System.out.println();

		
		
		// 5. write a program that can print z~a
		for (char cba = 122; cba >= 97; cba--) {

			System.out.print(cba + " ");
		}
		System.out.println();

		
		
		// 6. write a program that can print Z~A
		for (char CBA = 90; CBA >= 65; CBA--) {

			System.out.print(CBA + " ");
		}
		
	}

}
