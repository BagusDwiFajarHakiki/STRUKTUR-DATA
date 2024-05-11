/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NOMOR_1;

/**
 *
 * @author ASUS
 */
public class membalikkan_isi_array 
{
    public static void main(String[] args) 
    {
        int[] angka = {1, 2, 3, 4, 5};
        
        System.out.print("HASILNYA SEBELUM DIBALIK : ");
        for(int i = 0; i < angka.length; i++)
        {
            System.out.print(angka[i] + " ");
        }
        
        System.out.println("");
        for(int i = 0; i < angka.length / 2; i++)
        {
            int nilai = angka[i];
            angka[i] = angka[angka.length - 1 - i];
            angka[angka.length - 1 - i] = nilai;
        }
        
        System.out.print("HASILNYA SETELAH DIBALIK : ");
        for(int i = 0; i < angka.length; i++)
        {
            System.out.print(angka[i] + " ");
        }
        System.out.println("");
    }
}
