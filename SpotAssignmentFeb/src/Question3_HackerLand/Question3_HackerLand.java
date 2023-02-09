package Question3_HackerLand;

import java.util.Arrays;

public class Question3_HackerLand {
    public static void main(String[] args) {
        int [] expenditure = {2,3,4,2,3,6,8,4,5};
        int noOfDays = 9 ;
        int trailingDays = 5;
        int [] array;
        int count=0;

        for(int i=0;i<noOfDays-trailingDays-1;i++){
            array = Arrays.copyOfRange(expenditure,i,i+trailingDays);
            Arrays.sort(array);
            int median = findMedian(array);

            if(expenditure[trailingDays+i]>=(2*median))count++;
        }

        System.out.println("The notification is sent "+count+" times.");
    }

    public static int findMedian(int[]array){
        int median;
        int n= array.length;
        if(n%2!=0) median = array[(n/2)];
        else median = array[(n/2)-1]+array[n/2];

        return median;
    }
}
