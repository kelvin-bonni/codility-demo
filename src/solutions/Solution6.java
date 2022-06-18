package solutions;

import java.util.*;

public class Solution6 {

    public static void main(String[] args) {
        Solution6 solution1 = new Solution6();
        System.out.println(solution1.solution(new String[] {"i", "like", "berlin", "i", "like", "to", "to", "code", "code","code","i","i"}, 2));
    }

    public static List<String> solution(String[] words, int k){
//        Map<String, Integer> map = new HashMap<>();
//        List<String> resultArr = new ArrayList<>();
//
//        for(int i=0; i < words.length; i++){
//            if(map.containsKey(words[i])){
//                map.replace(words[i], map.get(words[i])+1);
//            }else
//                map.put(words[i], 1);
//        }
//
//        System.out.println(map);
//        //return the max value in the map and remove
//        for(int i=0; i<k; i++){
//            String key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
//            resultArr.add(key);
//            map.remove(key, map.get(key));
//        }
//
//        return resultArr;

        if (words == null || words.length == 0) {
            return new ArrayList<>();
        }

        Map<String, Integer> map = new HashMap<>();
        for (String s : words) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        List<String> candidates = new ArrayList<>(map.keySet());
        candidates.sort((w1, w2) -> !map.get(w1).equals(map.get(w2)) ?
                map.get(w2) - map.get(w1) : w1.compareTo(w2));

        return candidates.subList(0, k);
    }
}
