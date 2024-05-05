/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author ASUS
 */
public class array_multi_dimensi 
{
    public static void main(SimilaritasString[] args)
    {
        //Cara Pertama
        System.out.println("CARA PERTAMA");
        SimilaritasString name1 [][] = new SimilaritasString [2][2];
        
        name1[0][0] = "nama 1";
        name1[0][1] = "nama 2";
        name1[1][0] = "nama 3";
        name1[1][1] = "nama 4";
        
        System.out.println(name1[0][0]);
        System.out.println(name1[0][1]);
        System.out.println(name1[1][0]);
        System.out.println(name1[1][1]);
        
        System.out.println("");
        
        //Cara Kedua
        System.out.println("CARA KEDUA");
        SimilaritasString name2[][] = {{"nama 1","nama 2"},{"nama 3","nama 4"}};
        
        System.out.println(name2[0][0]);
        System.out.println(name2[0][1]);
        System.out.println(name2[1][0]);
        System.out.println(name2[1][1]);
        
        System.out.println("");
        
        //Cara Ketiga
        System.out.println("CARA KETIGA");
        SimilaritasString name3[][] = {{"nama 1","nama 2"},{"nama 3","nama 4"}};
        
        for(int k=0; k<name3.length; k++)
        {
            for(int b=0; b<name3.length; b++)
            {
                System.out.println(name3[k][b]);
            }
        }
    }
    
}
