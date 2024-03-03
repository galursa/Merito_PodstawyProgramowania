import java.util.Random;

public class zamianaCyfrArabskieNaRzymskie {
	public static void main(String[] args) {
		//losujemy liczbê z podanego zakresu i zamieniamy na rzymsk¹
		int liczba;
		Random los = new Random();
		int i=0;
		while(i<10) {
			liczba = los.nextInt(10)+1;
			switch(liczba)
			{
				case 1:
					System.out.println("I");
					break;
				case 2:
					System.out.println("II");
					break;
				case 3:
					System.out.println("III");
					break;
				case 4:
					System.out.println("IV");
					break;
				case 5:
					System.out.println("V");
					break;
				case 6:
					System.out.println("VI");
					break;
				case 7:
					System.out.println("VII");
					break;
				case 8:
					System.out.println("VIII");
					break;
				case 9:
					System.out.println("IX");
					break;
				case 10:
					System.out.println("X");
					break;
			}
			i++;
		}
		
	}
}
