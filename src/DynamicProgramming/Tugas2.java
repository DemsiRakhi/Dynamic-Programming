package DynamicProgramming;
import java.util.Scanner;
public class Tugas2 {
    public static int Input()
    {
        Scanner baca = new Scanner(System.in);
        System.out.print("Berat Barang yang Dibawa: ");
        int berat = baca.nextInt();
        
        return berat;
    }
    
    public static void Proses(int berat, int[] Berat, int[] Harga)
    {
        int jumlah = 0;
        for (int i = 0;i < Berat.length; i++)
        {
            int a = 0;
            while(berat >= Berat[i])
            {
                berat = berat - Berat[i];
                a++;
            }            
            int total = a * Harga[i];
            System.out.println(Berat[i] + "Kg Sebanyak " + a + " Barang,Dengan Harga Rp " + total);
            jumlah = jumlah + total;
        }
        System.out.println("\nTotal Bayaran : Rp " + jumlah);
    }
    
    public static void main(String[] args) 
    {                
        int[] Berat = new int[] {7, 5, 4, 3, 2};
        int[] Harga = new int[] {10000, 7000, 5000, 3000, 2000};
        int berat = Input();
        Proses(berat, Berat, Harga);
    }
}
