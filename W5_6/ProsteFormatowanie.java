
public class ProsteFormatowanie {
	public static void main(String[] args) {
	 int calkowita = 1234;
	 double rzeczywista = 12.34;
	 String napis = "Za��� g�l� ja��";
	 System.out.printf("a = %2$3.3f %nb = %1$3d %n", calkowita, rzeczywista);
	 System.out.format("Opowiem Ci ba�� %n%S", napis);
	}
}
