import java.util.Scanner;

public class czytajZdanie {
	public static void main(String[] args) {
		Scanner dane = new Scanner(System.in);
		System.out.println("Napisz jakie� zdanie");
		String zdanie = dane.nextLine();
		System.out.println("Napisa�e�:");
		System.out.println(zdanie);
		dane.close();
	}
}
