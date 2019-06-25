package com.savannahmclaurin;

import java.util.HashMap;
import java.util.Map;

public class MapExercises {
    // 1. Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty string.
    public static Map<String, String> mapBully(Map<String, String> map) {
        // put, get, remove, size, containsValue (-key), clear, keySet (values), isEmpty
        if(map.get("a")!=null){
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

    // 2. Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value. In all cases remove the key "c", leaving the rest of the map unchanged.
    public Map<String, String> mapShare(Map<String, String> map) {
        // put, get, remove, size, containsValue (-key), clear, keySet (values), isEmpty
        if(map.get("a")!=null){
            map.put("b", map.get("a"));
        }
        map.remove("c");
        return map;
    }

    // 3. Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys. If both keys are present, append their 2 string values together and store the result under the key "ab".
    public Map<String, String> mapAB(Map<String, String> map) {
        // put, get, remove, size, containsValue (-key), clear, keySet (values), isEmpty
        if(map.get("a")!=null && map.get("b")!=null){
            map.put("ab", map.get("a")+map.get("b"));
        }
        return map;
    }

    // 4. Given a map of food keys and topping values, modify and return the map as follows: if the key "ice cream" is present, set its value to "cherry". In all cases, set the key "bread" to have the value "butter".
    public Map<String, String> topping1(Map<String, String> map) {
        // put, get, remove, size, containsValue (-key), clear, keySet (values), isEmpty
        if(map.get("ice cream")!=null){
            map.put("ice cream", "cherry");
        }
        map.put("bread", "butter");
        return map;
    }

    // 5. Given a map of food keys and their topping values, modify and return the map as follows: if the key "ice cream" has a value, set that as the value for the key "yogurt" also. If the key "spinach" has a value, change that value to "nuts".
    public Map<String, String> topping2(Map<String, String> map) {
        // put, get, remove, size, containsValue (-key), clear, keySet (values), isEmpty
        if(map.get("ice cream")!=null){
            map.put("yogurt", map.get("ice cream"));
        }
        if(map.get("spinach")!=null){
            map.put("spinach", "nuts");
        }
        return map;
    }

    // 6. Given a map of food keys and topping values, modify and return the map as follows: if the key "potato" has a value, set that as the value for the key "fries". If the key "salad" has a value, set that as the value for the key "spinach".
    public Map<String, String> topping3(Map<String, String> map) {
        // put, get, remove, size, containsValue (-key), clear, keySet (values), isEmpty
        if(map.get("potato")!=null){
            map.put("fries", map.get("potato"));
        }
        if(map.get("salad")!=null){
            map.put("spinach", map.get("salad"));
        }
        return map;
    }

    // 7. Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values, remove them both.
    public Map<String, String> mapAB2(Map<String, String> map) {
        // put, get, remove, size, containsValue (-key), clear, keySet (values), isEmpty
        if(map.get("a")!=null && map.get("b")!=null && map.get("a").equals(map.get("b"))){
            map.remove("a");
            map.remove("b");
        }
        return map;
    }

    // 8. Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map (but not both), set the other to have that same value in the map.
    public Map<String, String> mapAB3(Map<String, String> map) {
        // put, get, remove, size, containsValue (-key), clear, keySet (values), isEmpty
        if(map.get("a")!=null && map.get("b")==null){
            map.put("b",map.get("a"));
        }
        else if(map.get("b")!=null && map.get("a")==null){
            map.put("a",map.get("b"));
        }
        return map;
    }

    // 9. Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths, then set "c" to have the longer value. If the values exist and have the same length, change them both to the empty string in the map.
    public Map<String, String> mapAB4(Map<String, String> map) {
        // put, get, remove, size, containsValue (-key), clear, keySet (values), isEmpty
        if(map.get("b")!=null && map.get("a")!=null){
            String a = map.get("a");
            String b = map.get("b");
            if(a.length()>b.length()) map.put("c",map.get("a"));
            else if(b.length()>a.length()) map.put("c",map.get("b"));
            else{
                map.put("a","");
                map.put("b","");
            }
        }
        return map;
    }

    // 10. Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, always with the value 0. For example the string "hello" makes the pair "hello":0. We'll do more complicated counting later, but for this problem the value is simply 0.
    public Map<String, Integer> word0(String[] strings) {
        // put, get, remove, size, containsValue (-key), clear, keySet (values), isEmpty
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String s : strings){
            if(map.get(s)==null) map.put(s,0);
        }
        return map;
    }

    // 11. Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, and the value is that string's length.
    public Map<String, Integer> wordLen(String[] strings) {
        // put, get, remove, size, containsValue (-key), clear, keySet (values), isEmpty
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String s : strings){
            map.put(s,s.length());
        }
        return map;
    }

    // 12. Given an array of non-empty strings, create and return a Map<String, String> as follows: for each string add its first character as a key with its last character as the value.
    public Map<String, String> pairs(String[] strings) {
        // put, get, remove, size, containsValue (-key), clear, keySet (values), isEmpty
        Map<String, String> map = new HashMap<String, String>();
        for(String s : strings){
            map.put(s.substring(0,1),s.substring(s.length()-1,s.length()));
        }
        return map;
    }

    // 13. The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the number of times that string appears in the array.
    public Map<String, Integer> wordCount(String[] strings) {
        // put, get, remove, size, containsValue (-key), clear, keySet (values), isEmpty
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String s : strings){
            if(map.get(s)!=null) map.put(s,map.get(s)+1);
            else map.put(s,1);
        }
        return map;
    }

    // 14. Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen, with the value of all the strings starting with that character appended together in the order they appear in the array.
    public Map<String, String> firstChar(String[] strings) {
        // put, get, remove, size, containsValue (-key), clear, keySet (values), isEmpty
        Map<String, String> map = new HashMap<String, String>();
        for(String s : strings){
            if(map.get(s.substring(0,1))!=null) map.put(s.substring(0,1),map.get(s.substring(0,1))+s);
            else map.put(s.substring(0,1),s);
        }
        return map;
    }

    // 15. Loop over the given array of strings to build a result string like this: when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result. Return the empty string if no string appears a 2nd time.
    public String wordAppend(String[] strings) {
        String ret = "";
        // put, get, remove, size, containsValue (-key), clear, keySet (values), isEmpty
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String s : strings){
            if(map.get(s)!=null) map.put(s,map.get(s)+1);
            else map.put(s,1);
            if(map.get(s)%2==0) ret+= s;
        }
        return ret;
    }

    // 16. Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value is true if that string appears 2 or more times in the array.
    public Map<String, Boolean> wordMultiple(String[] strings) {
        // put, get, remove, size, containsValue (-key), clear, keySet (values), isEmpty
        Map<String, Boolean> map = new HashMap<String, Boolean>();
        for(String s : strings){
            if(map.get(s)!=null) map.put(s,true);
            else map.put(s,false);
        }
        return map;
    }

    // 17. We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2 strings in the array. When a position in the array has been swapped, it no longer matches anything. Using a map, this can be solved making just one pass over the array. More difficult than it looks.
    public String[] allSwap(String[] strings) {
        // put, get, remove, size, containsValue (-key), clear, keySet (values), isEmpty
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0; i<strings.length; i++){
            String s = strings[i];
            if(!s.equals("")){
                if(map.get(s.substring(0,1))==null){
                    map.put(s.substring(0,1),i);
                }
                else{
                    strings[i] = strings[map.get(s.substring(0,1))];
                    strings[map.get(s.substring(0,1))] = s;
                    map.remove(s.substring(0,1));
                }
            }
        }
        return strings;
    }

    // 18. We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2 strings in the array. A particular first char can only cause 1 swap, so once a char has caused a swap, its later swaps are disabled. Using a map, this can be solved making just one pass over the array. More difficult than it looks.
    public String[] firstSwap(String[] strings) {
        // put, get, remove, size, containsValue (-key), clear, keySet (values), isEmpty
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0; i<strings.length; i++){
            String s = strings[i];
            if(!s.equals("")){
                if(map.get(s.substring(0,1))==null){
                    map.put(s.substring(0,1),i);
                }
                else if(map.get(s.substring(0,1))!=strings.length){
                    strings[i] = strings[map.get(s.substring(0,1))];
                    strings[map.get(s.substring(0,1))] = s;
                    map.put(s.substring(0,1),strings.length);
                }
            }
        }
        return strings;
    }
}
