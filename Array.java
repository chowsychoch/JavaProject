package udemy;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    private static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args){
        int [] myIntArray = new int [25];
        System.out.println(""+ Arrays.toString(myIntArray));
        for (int i =0; i < myIntArray.length; i++){
            myIntArray[i] = i * 10;
        }

        int[] myIntegers = getIntegers(5);
        //for (int i =0; i < myIntegers.length; i++){
           // System.out.println(myIntegers[i]);
        //}

        int[] sortedIntegers = sortedInt(myIntegers);
        for (int i =0; i <sortedIntegers.length; i++){
            System.out.println(sortedIntegers[i]);
        }
        //System.out.println("Average is "+getAverage(myIntegers));
    }
    //Sorted Array in dec
    public static int[] sortedInt(int[] myInt){
        int[] sorted = new int[myInt.length];
        //Copy new array
        for (int i =0; i <myInt.length;i++){
            sorted[i] = myInt[i];
        }
        /* Alternative
        int[] sortedArr = Arrays.copyOf(myInt, myInt.length);
        Arrays.sort(sortedArr);
        return sortedArr;*/

        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for (int i =0; i <sorted.length - 1; i++){
                if (sorted[i] < sorted [i+1]){
                    //swap
                    temp = sorted[i];
                    sorted[i] = sorted[i+1];
                    sorted[i+1] = temp;
                    flag =true;
                }
            }
        }
        return sorted;
    }

    public static int[] getIntegers(int number){
        int [] values = new int[number];
        System.out.println("Enter 5 int");
        for (int i=0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array){
        int sum=0;
        for (int i=0; i <array.length; i++){
            sum+= array[i];
        }
        return sum / array.length;
    }

}
