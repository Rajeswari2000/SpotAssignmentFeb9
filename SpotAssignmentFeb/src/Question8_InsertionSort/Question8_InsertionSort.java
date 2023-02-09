package Question8_InsertionSort;

import java.util.Arrays;

public class Question8_InsertionSort {
    public static void main(String[] args) {
        int[]array = {5,3,1,9};
        int i,j;
        int lastSortedIndex;

        for(i=0;i<array.length-1;i++){
            lastSortedIndex=i;
            if(array[i]>array[i+1]){
                int temporary1 = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temporary1;
            }
            for(j=lastSortedIndex;j>0;j--){
                   if(array[j]<array[j-1]){
                       int temporary2 = array[j];
                       array[j] = array[j - 1];
                       array[j - 1] = temporary2;
                   }
            }

        }

        System.out.println(Arrays.toString(array));
    }
}
