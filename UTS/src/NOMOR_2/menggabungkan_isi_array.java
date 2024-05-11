/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NOMOR_2;

/**
 *
 * @author ASUS
 */
public class menggabungkan_isi_array 
{
    public static void main(String[] args) 
    {
        int array1[] = {1, 2, 3, 4, 5};
        int array2[] = {6, 7, 8, 9, 10};
        
        System.out.print("ARRAY KE-1 : ");
        
         int length = array1.length + array2.length;
        
         int[] array3 = new int[length];
        
        for (int i = 0; i < array1.length; i++){
            array3[i] = array1[i];
            System.out.print(array1[i] + " ");
        }
        
        System.out.println("");
        System.out.print("ARRAY KE-2 : ");
        
        for (int i = 0; i < array2.length; i++){
            array3[i + array1.length] = array2[i];
            System.out.print(array2[i] + " ");
        }
        
        System.out.println("\n");
        System.out.println("GABUNGAN KEDUA ARRAY:");
        
        for (int i = 0; i < array3.length; i++)
        {
            System.out.print(array3[i] + " ");
        }
        System.out.println("");
    }
}
