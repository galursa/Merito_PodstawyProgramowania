import java.util.Random;

public class TablicaKwadrat {
	public static void main(String[] args) {
		/* generujemy tablice liczb losowych i liczymy kwadrat */
		int losowe[] = new int[20];
		Random los = new Random();
		for(int i=0; i<20;i++)
		{
			losowe[i] = los.nextInt(11);
			System.out.format("%4d ", losowe[i]);
		}
		System.out.println();
		for(int i=0;i<20;i++)
		{
			System.out.format("%4d ", losowe[i]*losowe[i]);
		}
		System.out.println();
	}
}
