/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NOMOR_5;

import static NOMOR_6.transposisi_matriks.printMatrix;

/**
 *
 * @author ASUS
 */
public class matriks_identitas 
{
    public static void main(String[] args) 
    {
        int[][] matrix = 
        {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        printMatrix(matrix);

        System.out.println("");
        if (isIdentity(matrix)) 
        {
            System.out.println("MATRIX ADALAH MATRIX IDENTITAS.");
        } 
        else 
        {
            System.out.println("MATRIX BUKAN MATRIX IDENTITAS.");
        }
    }

    public static boolean isIdentity(int[][] matrix) 
    {
        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = 0; j < matrix[i].length; j++) 
            {
                if (i == j && matrix[i][j] != 1) 
                {
                    return false;
                }
                if (i != j && matrix[i][j] != 0) 
                {
                    return false;
                }
            }
        }
        return true;
    }
}
