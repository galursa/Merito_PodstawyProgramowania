final class Trojkat{
	private double a;
	private double h;
	Trojkat(double a, double h)
	{
		this.a = a;
		this.h = h;
	}
	void wyswietl()
	{
		System.out.println("Tr�jk�t podstawa = "+a);
		System.out.println("Tr�jk�t wysoko�� = "+h);
	}
}


public class trojkaty {
	public static void main(String[] args) {
		Trojkat t = new Trojkat(2,3);
		t.wyswietl();
	}
}
