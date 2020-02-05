
package matriciana;
import java.util.Scanner; 
import java.util.Random;


public class Matriciana 
{   
    static int tabulazia(int mainniamo)
    {
        if(mainniamo >=0 && mainniamo <10)System.out.print("     ");
        if(mainniamo >=10 && mainniamo <100)System.out.print("    ");
        if(mainniamo >=100 && mainniamo <1000)System.out.print("   ");
        if(mainniamo >=1000 && mainniamo <10000)System.out.print("  ");
        if(mainniamo >=10000 && mainniamo <100000)System.out.print(" ");
        return 0;
    }
    
    public static void main(String[] args) 
    {
        Scanner kekkeroni = new Scanner(System.in);
        int rigo, colonno, spazio, tabuliamo, checkiamo=1;
        Random casualo = new Random();
        
        while(checkiamo == 1)
        {
            System.out.print("righe ");
            rigo = kekkeroni.nextInt();
            System.out.print("colonne ");
            colonno = kekkeroni.nextInt();
            int matricio[][] = new int[colonno][rigo];
            for(int i=0; i<colonno; i++)
            {
                for(int j=0; j<rigo; j++)
                {
                    matricio[i][j] = casualo.nextInt(99999);              
                } 
            }
            for(int i=0; i<colonno; i++)
            {
                for(int j=0; j<rigo; j++)
                {
                    tabuliamo = matricio[i][j];
                    System.out.print(matricio[i][j]);
                    spazio = tabulazia(tabuliamo);    
                } 
                System.out.println();
            }
            checkiamo = 1;
                System.out.print("un'altra? (0/1)");
                checkiamo = kekkeroni.nextInt();
                System.out.println();
                if(checkiamo <0|| checkiamo >1)checkiamo=0;  
        }
    }   
}
