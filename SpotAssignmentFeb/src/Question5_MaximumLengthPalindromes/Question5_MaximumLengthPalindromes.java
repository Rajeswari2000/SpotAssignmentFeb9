package Question5_MaximumLengthPalindromes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question5_MaximumLengthPalindromes {
    public static void main(String[] args) {
        String string = "madamimadam";
        int left=4;
        int right=7;
        int maxLength=0;
        boolean flag = false;
        StringBuilder subString = new StringBuilder(string.substring(left-1,right));
        System.out.println(subString);
        List<StringBuilder> listOfList = helper(subString);
        System.out.println(listOfList);


        for(int i=0;i<listOfList.size();i++){
             for(int j=0;j<subString.length()-1;j++){
                 for(int k=j+1;k<subString.length();k++){
                     flag = isPalindrome(subString.substring(j,k));
                     if(flag){
                         maxLength=Math.max(maxLength,subString.length());
                     }
                 }
             }
        }
    }

    public static boolean isPalindrome(String subString){

        int i=0,j=subString.length();

        while(i<=j){
            if(subString.charAt(i)!=subString.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }

    public static List<StringBuilder> helper (StringBuilder subString){
        List<StringBuilder> listOfList = new ArrayList<>();
        StringBuilder eachString =new StringBuilder("");
        boolean[] isUsed = new boolean[subString.length()];
        findPermutations(eachString,listOfList,subString,isUsed);

        return listOfList;
    }

    public static void findPermutations(StringBuilder eachString,List<StringBuilder> listOfList,StringBuilder subString, boolean[]isUsed){
        if(eachString.length()==subString.length()){
            listOfList.add(new StringBuilder(eachString));
            return;
        }
        Set<Character> set = new HashSet<>();

        for(int i=0;i<subString.length();i++){
            if(isUsed[i]){
                continue;
            }
            if(!(set.add(subString.charAt(i)))){
                continue;
            }

            eachString.append(subString.charAt(i));
            isUsed[i]=true;
            findPermutations(eachString,listOfList,subString,isUsed);
            eachString.deleteCharAt(eachString.length()-1);
            isUsed[i]=false;

        }
    }



}
