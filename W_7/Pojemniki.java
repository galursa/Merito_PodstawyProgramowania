class Kawa{
	public String gatunek;
}

class Herbata{
	public String rodzaj;
}

public class Pojemniki {
	public static void main(String[] args) {
		Pojemnik<String> s = new Pojemnik<String>("Dzie� dobry");
		Pojemnik<Integer> i = new Pojemnik<Integer>(123);
		Pojemnik<Kawa> k = new Pojemnik<Kawa>(new Kawa());
		Pojemnik<Herbata> h = new Pojemnik<Herbata>(new Herbata());
		System.out.println("Pojemnik Integer: "+i.zwrocElement());
		System.out.println("Pojemnik String: "+s.zwrocElement());
		System.out.println("Pojemnik Kawa: "+k.zwrocElement());
		System.out.println("Pojemnik Herbata: "+h.zwrocElement());
		Kawa arabika = k.zwrocElement();
		System.out.println("Zwarto�� pojemnika przepisana do obiektu typu Kawa: "+arabika);
	}
}

