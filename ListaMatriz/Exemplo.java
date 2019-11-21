import java.util.Scanner;
public class Exemplo {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		int v[] [] = new int [3] [3];
		int i, j ;
		
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 3;j++) {
				System.out.print("\nEntra valor["+(i+1)+"] ["+(j+1)+"] :: ");
				v[i][j] = ler.nextInt();			}
		}
		
		System.out.print("\n:: VALORES DA MATRIZ ::\n\n");
			for(i = 0; i < 3; i++) {
				for(j = 0; j < 3; j++) {
					System.out.println(" ["+v[i][j]+"] ");
					if( j == 2) {
						System.out.print("\n");
					}
				}
			}
		
	}
}
