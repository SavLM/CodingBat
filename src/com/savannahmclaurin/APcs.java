package com.savannahmclaurin;

import java.util.ArrayList;

public class APcs {
    // 1. Given an array of scores, return true if each score is equal or greater than the one before. The array will be length 2 or more.
    public boolean scoresIncreasing(int[] scores) {
        int temp = 0;
        if(scores.length>0){
            temp = scores[0];
        }
        for(int i = 1; i<scores.length; i++){
            if(scores[i]<temp){
                return false;
            }
            temp=scores[i];
        }
        return true;
    }

    // 2. Given an array of scores, return true if there are scores of 100 next to each other in the array. The array length will be at least 2.
    public boolean scores100(int[] scores) {
        int temp = 0;
        if(scores.length>0){
            temp = scores[0];
        }
        for(int i = 1; i<scores.length; i++){
            if(scores[i]==100 && temp==100){
                return true;
            }
            temp=scores[i];
        }
        return false;
    }

    // 3. Given an array of scores sorted in increasing order, return true if the array contains 3 adjacent scores that differ from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.
    public boolean scoresClump(int[] scores) {
        for(int i = 0; i+2<scores.length; i++){
            if(Math.abs(scores[i]-scores[i+1])<3 && Math.abs(scores[i+1]-scores[i+2])<3 && Math.abs(scores[i]-scores[i+2])<3){
                return true;
            }
        }
        return false;
    }

    // 4. Given an array of scores, compute the int average of the first half and the second half, and return whichever is larger. We'll say that the second half begins at index length/2. The array length will be at least 2. To practice decomposition, write a separate helper method
    //int average(int[] scores, int start, int end) { which computes the average of the elements between indexes start..end. Call your helper method twice to implement scoresAverage(). Write your helper method after your scoresAverage() method in the JavaBat text area. Normally you would compute averages with doubles, but here we use ints so the expected results are exact.
    public int scoresAverage(int[] scores) {
        int f = average(scores,0,scores.length/2);
        int b = average(scores,scores.length/2, scores.length);
        if(f>b){
            return f;
        }
        return b;
    }
    public int average(int[] scores, int start, int end) {
        int sum = 0;
        for(int i = start; i<end; i++){
            sum+=scores[i];
        }
        return sum/(end-start);
    }

    // 5. Given an array of strings, return the count of the number of strings with the given length.
    public int wordsCount(String[] words, int len) {
        int count = 0;
        for(String w : words){
            if(w.length()==len){
                count++;
            }
        }
        return count;
    }

    // 6. Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length.
    public String[] wordsFront(String[] words, int n) {
        String[] ret = new String[n];
        for(int i=0; i<n; i++){
            ret[i] = words[i];
        }
        return ret;
    }

    // 7. Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given length are omitted. See wordsWithout() below which is more difficult because it uses arrays.
    public ArrayList wordsWithoutList(String[] words, int len) {
        ArrayList<String> ret = new ArrayList<String>(0);
        for (String w : words){
            if(w.length()!=len){
                ret.add(w);
            }
        }
        return ret;
        //ret.remove(w);
    }

    // 8. Given a positive int n, return true if it contains a 1 digit. Note: use % to get the rightmost digit, and / to discard the rightmost digit.
    public boolean hasOne(int n) {
        while(n!=0){
            if(n%10==1){
                return true;
            }
            n/=10;
        }
        return false;
    }

    // 9. We'll say that a positive int divides itself if every digit in the number divides into the number evenly. So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly. We'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides itself. Note: use % to get the rightmost digit, and / to discard the rightmost digit.
    public boolean dividesSelf(int n) {
        int temp = n;
        while(temp!=0){
            if((temp%10)==0 || n%(temp%10)!=0){
                return false;
            }
            temp/=10;
        }
        return true;
    }

    // 10. Given an array of positive ints, return a new array of length "count" containing the first even numbers from the original array. The original array will contain at least "count" even numbers.

}
