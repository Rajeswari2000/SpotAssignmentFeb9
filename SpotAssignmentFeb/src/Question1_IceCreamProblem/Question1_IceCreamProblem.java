package Question1_IceCreamProblem;

import java.util.HashMap;
import java.util.Map;

public class Question1_IceCreamProblem {
    public static void main(String[] args) {

        int[]cost = {1,3,4,5,6};
        int target=12;
        int[]answer = new int[2];
        boolean flag = false;
        Map <Integer,Integer> map = new HashMap<>();

        for(int i=0;i<cost.length;i++){
            map.put(cost[i],i);
        }

        for(int i=0;i<cost.length;i++){
            if(map.containsKey(target-cost[i]) && (target-cost[i])!=cost[i]){
                flag = true;
                answer[0]=i;
                answer[1]=map.get(target-cost[i]);
                break;
            }
        }

        if(flag) System.out.println("The indices which sum upto the target are "+(answer[0]+1)+" and "+(answer[1]+1));
        else System.out.println("No elements add upto the given target");
    }

}
