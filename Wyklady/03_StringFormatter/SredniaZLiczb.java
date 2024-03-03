import java.util.Scanner;

public class SredniaZLiczb {
	public static void main(String[] args) {
		Scanner dane = new Scanner(System.in);
		System.out.println("Proszê podaæ liczby.");
		int i;
		double suma=0.0;
		for(i=1; i<5;i++)
		{
			if (dane.hasNextDouble())
			{
				suma+=dane.nextDouble();
			}
		}
		System.out.println("Œrednia =");
		suma=suma/(i-1);
		System.out.print(suma);
		dane.close();
	}
}