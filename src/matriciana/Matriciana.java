//By Lorenzo Tardini
package matriciana;
import java.util.Scanner; 
import java.util.Random;
import java.lang.Math; // da aggiungere integrazione numeri negativi, coming in the near future (controllo con il valore assoluto di n)

public class Matriciana 
{   
    static int tabulazia(int immigrata_main) //funzione di tabulazione. in base ai caratteri di un numero determina il numero di spazi da mettere (n<=0)
    {
        int lunghezzanumero=10, i=0;
        while(i<10&&immigrata_main<1000000000)
        {
            if(immigrata_main<lunghezzanumero)System.out.print(" ");
            lunghezzanumero=lunghezzanumero*10;
            i++;
        }
        if(immigrata_main>=1000000000)System.out.print(" ");
        return 0;
    }
    
    public static void main(String[] args) 
    {
        Scanner kekkeroni = new Scanner(System.in);
        int rigo, colonno, da_tabulare, checkiamo=1;
        Random casualo = new Random();
        
        while(checkiamo == 1)//controlla che l'utente abbia effettivamente detto di generare una matrice
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
                    matricio[i][j] = casualo.nextInt(Integer.MAX_VALUE); //rand tra 0 e 2,147,483,647             
                } 
            }
            for(int i=0; i<colonno; i++)
            {
                for(int j=0; j<rigo; j++)
                {
                    da_tabulare = matricio[i][j];
                    System.out.print(matricio[i][j]);
                    tabulazia(da_tabulare);    
                } 
                System.out.println();
            }
            checkiamo = 1;
            System.out.print("un'altra? (0/1)"); //genera una ulteriore matrice se richiesta dall'utente, altrimenti il programma finisce
            checkiamo = kekkeroni.nextInt();
            System.out.println();
            if(checkiamo <0|| checkiamo >1)checkiamo=0;  
        }
    }   
}
