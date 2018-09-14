package DynamicProgramming;
import java.util.Scanner;
public class Tugas1 {        
    public static int InputUser()
    {
        Scanner baca = new Scanner(System.in);
        System.out.print("Jumlah Uang: Rp");
        int uang = baca.nextInt();
        
        return uang;
    }
    
    public static void hitung(int uang, int[] pecahan)
    {
        for (int i = 0;i < pecahan.length; i++) 
        {
            int a = 0;
            while(uang >= pecahan[i])
            {
                uang = uang - pecahan[i];
                a++;
            }            
        
            System.out.println("Pecahan Rp" + pecahan[i] + " : " + a);
        }
    }
    
    public static void main(String[] args) 
    {                
        int[] pecahan = new int[] {5000, 2000, 1000, 500, 100};
        int uang = InputUser();
        hitung(uang,pecahan);
    }
}
