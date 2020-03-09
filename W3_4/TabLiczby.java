
public class TabLiczby {
	public static void main(String[] args) {
		int liczby[][] = {
				{ 1, 2, 3, 4 },
				{ 3, 5, 6, 1 },
				{ 6, 3, 1, 6 },
				{ 4, 2, 5, 1 }
			};
		for (int i=0;i<4;i++)
		{
			for(int j=0; j<4; j++)
			{
				System.out.print(liczby[i][j]+" ");
			}
			System.out.println();
		}
	}
}