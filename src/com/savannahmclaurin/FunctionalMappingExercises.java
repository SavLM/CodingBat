package com.savannahmclaurin;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FunctionalMappingExercises {

    // 1. Given a list of integers, return a list where each integer is multiplied by 2.
    public List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        return nums;
    }

     // 2. Given a list of integers, return a list where each integer is multiplied with itself.
     public List<Integer> square(List<Integer> nums) {
         nums.replaceAll(n -> n*n);
         return nums;
     }

     // 3. Given a list of strings, return a list where each string has "*" added at its end.
     public List<String> addStar(List<String> strings) {
         strings.replaceAll(s -> s+"*");
         return strings;
     }

     // 4. Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.
     public List<String> copies3(List<String> strings) {
         strings.replaceAll(s -> s+s+s);
         return strings;
     }

     // 5. Given a list of strings, return a list where each string has "y" added at its start and end.
     public List<String> moreY(List<String> strings) {
         strings.replaceAll(s->"y"+s+"y");
         return strings;
     }

     // 6. Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.
     public List<Integer> math1(List<Integer> nums) {
         nums.replaceAll(n -> (n+1)*10);
         return nums;
     }

     // 7. Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)
     public List<Integer> rightDigit(List<Integer> nums) {
         nums.replaceAll(n -> n%10);
         return nums;
     }

     // 8. Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).
     public List<String> lower(List<String> strings) {
         strings.replaceAll(s -> s.toLowerCase());
         return strings;
     }

     // 9. Given a list of strings, return a list where each string has all its "x" removed.
     public List<String> noX(List<String> strings) {
         strings.replaceAll(n -> n.replace("x", ""));
         return strings;
     }

     // 10. Given a list of integers, return a list of the integers, omitting any that are less than 0.
     public List<Integer> noNeg(List<Integer> nums) {
         nums.removeIf(n -> n<0);
         return nums;
     }

     // 11. Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note: % by 10)
     public List<Integer> no9(List<Integer> nums) {
         nums.removeIf(n -> n%10==9);
         return nums;
     }

     // 12. Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.
     public List<Integer> noTeen(List<Integer> nums) {
         nums.removeIf(n -> n>=13 && n<=19);
         return nums;
     }

     // 13. Given a list of strings, return a list of the strings, omitting any string that contains a "z". (Note: the str.contains(x) method returns a boolean)
     public List<String> noZ(List<String> strings) {
         strings.removeIf(s -> s.contains("z"));
         return strings;
     }

     // 14. Given a list of strings, return a list of the strings, omitting any string length 4 or more.
     public List<String> noLong(List<String> strings) {
         strings.removeIf(s -> s.length()>=4);
         return strings;
     }

     // 15. Given a list of strings, return a list of the strings, omitting any string length 3 or 4.
     public List<String> no34(List<String> strings) {
         strings.removeIf(s -> s.length()==3 || s.length()==4);
         return strings;
     }

     // 16. Given a list of strings, return a list where each string has "y" added at its end, omitting any resulting strings that contain "yy" as a substring anywhere.
     public List<String> noYY(List<String> strings) {
         strings = strings.stream()
                 .map(s -> s+"y")
                 .filter(s -> !s.contains("yy"))
                 .collect(Collectors.toList());
         return strings;
     }

     // 17. Given a list of non-negative integers, return a list of those numbers multiplied by 2, omitting any of the resulting numbers that end in 2.
     public List<Integer> two2(List<Integer> nums) {
         nums = nums.stream()
                 .map(n -> n*2)
                 .filter(n -> !(n%10==2))
                 .collect(Collectors.toList());
         return nums;
     }

     // 18. Given a list of integers, return a list of those numbers squared and the product added to 10, omitting any of the resulting numbers that end in 5 or 6.
     public List<Integer> square56(List<Integer> nums) {
         nums = nums.stream()
                 .map(n -> (n*n)+10)
                 .filter(n -> !((n%10==5)||(n%10==6)))
                 .collect(Collectors.toList());
         return nums;
     }

}
