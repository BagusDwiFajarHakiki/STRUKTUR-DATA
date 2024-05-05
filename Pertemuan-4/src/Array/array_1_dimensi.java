/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Array;

/**
 *
 * @author ASUS
 */
public class array_1_dimensi 
{
    public static void main(SimilaritasString[] args) 
    {
        int nilai[] = new int [5];
        nilai[0] = 100;
        nilai[1] = 200;
        nilai[2] = 300;
        nilai[3] = 400;
        nilai[4] = 500;
        
        System.out.print("Nilai Array         = ");
        for(int i = 0; i < nilai.length; i++)
        {
            System.out.print(nilai[i] + " ");
        }
       
        System.out.println();
        
        int NilaiTerendah = nilai[0];
        for(int i = 0; i < nilai.length; i++)
        {
            if(nilai[i] < NilaiTerendah)
            {
                NilaiTerendah = nilai[i];
            }
        }
        
        int NilaiTertinggi = nilai[0];
        for(int i = 0; i < nilai.length; i++)
        {
            if(nilai[i] > NilaiTertinggi)
            {
                NilaiTertinggi = nilai[i];
            }
        }
        
        int total = 0;
        for(int i = 0; i < nilai.length; i++)
        {
            total += nilai[i];
        }
        int rata2 = total / nilai.length;
        
        System.out.println("Nilai Terendah      = " + NilaiTerendah);
        System.out.println("Nilai Tertinggi     = " + NilaiTertinggi);
        System.out.println("Nilai Rata-rata     = " + rata2);
    }
    
}
