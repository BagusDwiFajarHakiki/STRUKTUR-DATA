/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author ASUS
 */
public class SimilaritasString 
{
    public static void main(SimilaritasString[] args) 
    {
        java.lang.String string1 = "saya suka kopi";
        java.lang.String string2 = "saya tidak suka kopi";

        double similarity = calculateSimilarity(string1, string2);
        
        System.out.println("KALIAMAT YG DI BANDINGKAN : " );
        System.out.println("KALIMAT PERTAMA : " + string1);
        System.out.println("KALIMAT KEDUA : " + string2 );
        
        System.out.println("SIMILARITAS : " + similarity);
    }

    public static double calculateSimilarity(java.lang.String string1, java.lang.String string2) 
    {
        int sameCharCount = 0;

        for (char c : string1.toCharArray()) 
        {
            if (string2.indexOf(c) != -1) 
            {
                sameCharCount++;
            }
        }
        return (double) sameCharCount / Math.max(string1.length(), string2.length()) * 100;
    }
}
