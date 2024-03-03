import java.util.Scanner;

public class czytajZdanie {
	public static void main(String[] args) {
		Scanner dane = new Scanner(System.in);
		System.out.println("Napisz jakieœ zdanie");
		String zdanie = dane.nextLine();
		System.out.println("Napisa³eœ:");
		System.out.println(zdanie);
		dane.close();
	}
}
