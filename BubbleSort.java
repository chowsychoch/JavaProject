package udemy;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    private static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter");

        int num = scanner.nextInt();
        int[] arr = new int [num];
        for (int i =0 ; i < num; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(BubbleSort(arr)));
        BubbleSort(arr);
    }

    public static int[] BubbleSort(int[] arr){
        //Perform bubble sort here
        /*for (int i = 0; i < arr.length - 1; i++){
            for (int j=0; j < arr.length -1 -i; j++){
                if (arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }*/
        for (int i = 0; i < arr.length - 1; i++){
            for (int j=0; j < arr.length -1 -i; j++){
                if (arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
