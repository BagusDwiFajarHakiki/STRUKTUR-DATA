/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SORTING;

/**
 *
 * @author ASUS
 */
public class insertion 
{
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) 
        {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) 
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6 };

        insertion ob = new insertion();
        ob.sort(arr);

        printArray(arr);
    }    
}
