import java.util.*;
public class Exercicio7{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int a[] = new int[5];
        int b[] = new int[5];
        int r = 1;
        int i = 0, j = 0;

        for(i = 0; i<5; i++){
        System.out.println("Digite o"+(i+1)+"ºNumero do Vetor");
        a[i] = ler.nextInt();
    
        }
        
        for(j = 0; j<5; j++){
            r = r*a[i];
            
            

        }
    }
}