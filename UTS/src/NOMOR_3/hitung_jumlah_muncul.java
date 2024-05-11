/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NOMOR_3;

/**
 *
 * @author ASUS
 */
public class hitung_jumlah_muncul 
{
    public static void main(String[] args) 
    {
        int[] array = {2, 1, 3, 1, 4, 2, 1};
        
        System.out.println("NILAI AWAL ARRAY : ");
        for(int k = 0; k < array.length; k++)
        {
            System.out.print(array[k] + " ");
        }
        
        System.out.println("");
        
        int max = array[0];

        for (int i = 1; i < array.length; i++) 
        {
            if (array[i] > max) 
            {
                max = array[i];
            }
        }

        int[] freq = new int[max + 1];

        for (int i = 0; i < array.length; i++) 
        {
            freq[array[i]]++;
        }

        System.out.println("JUMLAH KEMUNCULAN SETIAP KEMUNCULAN : ");
        for (int i = 0; i < freq.length; i++) 
        {
            if (freq[i] != 0) 
            {
                System.out.println("ANGKA " + i + " = " + freq[i] + " KALI");
            }
        }
    }
}
