package Question7_FindAllSubsets;

import java.util.ArrayList;
import java.util.List;

public class Question7_Subsets {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        List <List<Integer>> ListOfAllSubsets = helper(array);

        System.out.println(ListOfAllSubsets);
    }

    public static List<List<Integer>> helper(int[] array){
        List <List<Integer>> ListOfAllSubsets = new ArrayList<>();
        ArrayList <Integer> eachSubset = new ArrayList<>();

        findSubsets(0,array,eachSubset,ListOfAllSubsets);

        return ListOfAllSubsets;

    }

    public static void findSubsets(int index, int[]array, List<Integer> eachSubset, List <List<Integer>> ListOfAllSubsets){

        //baseCase
        if(index==array.length){
            ListOfAllSubsets.add(new ArrayList<>(eachSubset));
            return;
        }

        //adding elements in eachSubset
        eachSubset.add(array[index]);
        findSubsets(index+1,array,eachSubset,ListOfAllSubsets);

        //removing the last element from eachSubset
        eachSubset.remove(eachSubset.size()-1);
        findSubsets(index+1,array,eachSubset,ListOfAllSubsets);
    }
}
