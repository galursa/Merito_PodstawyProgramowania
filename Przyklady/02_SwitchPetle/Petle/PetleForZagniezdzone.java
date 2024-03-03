
public class PetleForZagniezdzone {
	public static void main(String[] args) {
		/* Za pomoca dwóch pêtli generujemy wzór:
		 * 1 2 3   i = 1, j=1,2,3,  j+i-1, j=1,2,3
		 * 2 3 4   i = 2, j=1,2,3   j+i-1, j=2,3,4
		 * 3 4 5   i = 3, j=1,2,3   j+i-1, j=3,4,5
		*/
	int koniec = 5;	
	for(int i=1; i<=koniec; i++)
	{
		for(int j=1; j<=koniec; j++)
		{
			System.out.print(j+i-1);
			System.out.print(" ");
		}
		System.out.println();
	}
		
		
	}
}
