import java.util.Random;

public class tabLos {
	public static void main(String[] args) {
		Random los = new Random();
		int tabLos[][] = new int[3][4];
		for(int i=0; i<3;i++)
		{
			for(int j=0; j<4;j++)
			{
				tabLos[i][j]=los.nextInt(10);
				System.out.print(tabLos[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
