class TrojmianKwadratowy{
	// a*x^2+b*x+c=0
	double a;
	double b;
	double c;
	
	void wyswietl()
	{
		System.out.println(a+"*x^2+"+b+"*x+"+c+"=0");
	}
	
	double delta()
	{
		return b*b - 4*a*c;
	}
	
	double x1()   //x1=-b-|delta/2a
	{
		double d = this.delta();
		if (d>=0) {	
			return (-b - Math.sqrt(d))/(2*a);
		}else {
			System.out.println("Delta ujemna. Brak pierwiastków");
			return -200;
		}
	 }
	double x2()   //x1=-b-|delta/2a
	{
		double d = this.delta();
		if (d>=0) {	
			return (-b + Math.sqrt(d))/(2*a);
		}else {
			System.out.println("Delta ujemna. Brak pierwiastków");
			return -200;
		}
	 }
	 
	
}


public class Trojmian {
	public static void main(String[] args) {
		TrojmianKwadratowy trojmian = new TrojmianKwadratowy();
		trojmian.a = 1; //delta ujemna
		trojmian.b = 2;
		trojmian.c = 3;
		trojmian.wyswietl();
		System.out.println("Delta ="+trojmian.delta());
		System.out.println(trojmian.x1());
		System.out.println(trojmian.x2());
		TrojmianKwadratowy trojmian1 = new TrojmianKwadratowy();
		trojmian1.a = 2; //delta dodatnia
		trojmian1.b = 5;
		trojmian1.c = 1;
		trojmian.wyswietl();
		System.out.println("Delta ="+trojmian1.delta());
		System.out.println(trojmian1.x1());
		System.out.println(trojmian1.x2());
		TrojmianKwadratowy trojmian2 = new TrojmianKwadratowy();
		trojmian2.a = 2; //delta równa zero
		trojmian2.b = 4;
		trojmian2.c = 2;
		trojmian.wyswietl();
		System.out.println("Delta ="+trojmian2.delta());
		System.out.println(trojmian2.x1());
		System.out.println(trojmian2.x2());
	}
}
