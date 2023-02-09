package Question2_CountingSort;

import java.util.Arrays;

public class Question2_CountingSort {
    public static void main(String[] args) {
        int[] array = {0, 6, 0, 6, 4, 0, 6, 0, 6, 0, 4, 3, 0, 1, 5, 1, 2, 4, 2, 4};
        String[] strings = {"ab", "cd", "ef", "gh", "ij", "ab", "cd", "ef", "gh", "ij", "that", "be", "to", "be", "question", "or", "not", "is", "to", "the"};

        Arrays.fill(strings, 0, strings.length / 2, "-");
        String answer="";

        for(int i = 0; i < array.length - 1; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    int temporary1 = array[i];
                    array[i] = array[j];
                    array[j] = temporary1;

                    String temporary2 = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temporary2;
                }
            }
        }

        for (String string : strings) {
            if (string.equals("-")) {
                answer += string;
            } else {
                answer = answer + string + " ";
            }
        }

        System.out.println(answer);
    }
}
