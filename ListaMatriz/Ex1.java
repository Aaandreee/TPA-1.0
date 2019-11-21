import java.util.*;
public class Ex1 {
	public static void main(String[]args) {
		int a [][]= new int [4][4];
		int i=0,j=0,n=2;
		for(i=0;i<4;i++) {
			System.out.print("\n");
			for(j=0;j<4;j++) {
				a[i][j] = n;
				n=n*2;
				System.out.print(a[i][j]+" ");
			}
		}
	}
}