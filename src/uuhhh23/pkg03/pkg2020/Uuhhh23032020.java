package uuhhh23.pkg03.pkg2020;
import java.util.Scanner;

public class Uuhhh23032020 
{
    
    /**insertvett
     * 
     * inserimento numeri nel vettore e in più controlla che tutti siano
     * diversi tra di loro.
     * per farlo utilizza un while e.. hai capito, no?
     * 
     * @param vett
     * @param n 
     */
    static void insertvett(int vett[], int n)
    {
        Scanner scannervar = new Scanner(System.in);
        boolean diversi =true;
        for(int i=0; i<n; i++)
        {
            diversi = false;
            while(diversi==false)
            {
                diversi = true;
                System.out.print("inserisci n ");
                vett[i]= scannervar.nextInt();
                for(int j=0; j<i;j++)
                {
                    if(vett[j]==vett[i]&&i!=j)
                    {
                        diversi = false;
                        System.out.println("i numeri devono essere diversi!");
                    }
                }
            }
        }
    }
    
    /**tremagg
     * 
     * semplice funzione, individua il massimo e i tre precedenti ad esso
     * (basandosi sui massimi trovati in precedenza).
     * 
     * @param vett
     * @param n 
     */
    static void tremagg(int vett[], int n)
    {
        int magg1=Integer.MIN_VALUE, magg2=0, magg3=0;
        for(int i=0; i<n; i++)
        {
            if(vett[i]>magg1)
            {
                magg3=magg2;
                magg2=magg1;
                magg1=vett[i];
            }
        }
        System.out.println("i 3 maggiori sono "+magg1 +" "+magg2+" "+magg3);
    }
    
    
    
    /**magg5 10
     * 
     * individua gli oggetti maggiori di 5 e tra loro quelli anche
     * maggiori di 10.
     * 
     * @param vett
     * @param n 
     */
    static void magg510(int vett[], int n)
    {
        int conta5=0, conta10=0;
        for(int i=0; i<n; i++)
        {
            if(vett[i]>5)
            {
                conta5++;
                if(vett[i]>10)
                {
                    conta10++;
                }
            }
        }
        System.out.println("i maggiori di 5 sono "+conta5+"\nmentre i maggiori di 10 sono "+conta10);
    }
    
    
    
    /**mediamagg
     * 
     * calcola la media di tutti gli oggetti del vettore e 
     * ne individua quelli maggiori.
     * 
     * @param vett
     * @param n 
     */
    static void mediamagg(int vett[], int n)
    {
        double media=0, piumedia=0;
        for(int i=0; i<n; i++)
        {
            media = media + vett[i];
        }
        media = media/n;
        for(int i=0; i<n; i++)
        {
            if(vett[i]>media)
            {
                piumedia++;
            }
        }
        System.out.println("i numeri maggiori della media (" +media+") sono "+(int)piumedia);
    }
    
    
    /**main
     * 
     * il caro vecchio main.
     * 
     * @param args 
     */
    public static void main(String[] args) 
    {
        Scanner scannervar = new Scanner(System.in);
        int n=0, vett[]= new int[100];
        System.out.print("quanti n? ");
        n = scannervar.nextInt();
        insertvett(vett,n);
        tremagg(vett, n);
        magg510(vett, n);    
        mediamagg(vett, n);
    }
    
}
