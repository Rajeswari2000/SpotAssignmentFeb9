package Question10_DivisibleByK;

public class Question10_DivisibleByK {
    public static void main(String[] args) {
        int[]array = {1,2,3,4,5,6};
        int k=5;
        int sum;
        int count=0;

        for(int i=0;i< array.length-1;i++){
            for(int j=i+1;j< array.length;j++){
                sum = array[i]+array[j];
                if(sum%k==0) count++;
            }
        }

        System.out.println("The no.of pairs having their sum equals "+k+ " is: "+count);
    }
}
