package com.savannahmclaurin;

public class ArrayExercises {
    // 1. Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
    public boolean firstLast6(int[] nums) {
        return (nums[0]==6 || nums[nums.length-1]==6);
    }

    // 2. Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
    public boolean sameFirstLast(int[] nums) {
        return(nums.length>0 && nums[0]==nums[nums.length-1]);
    }

    // 3. Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
    public int[] makePi() {
        return new int[]{3,1,4};
    }

    // 4. Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.
    public boolean commonEnd(int[] a, int[] b) {
        return (a[0]==b[0] || a[a.length-1]==b[b.length-1]);
    }

    // 5. Given an array of ints length 3, return the sum of all the elements.
    public int sum3(int[] nums) {
        int sum = 0;
        for(int i : nums){
            sum+=i;
        }
        return sum;
    }

    // 6. Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
    public int[] rotateLeft3(int[] nums) {
        int[] ret = new int[nums.length];
        ret[nums.length-1]=nums[0];
        for(int i = 1; i<nums.length ; i++){
            ret[i-1] = nums[i];
        }
        return ret;
    }

    // 7. Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
    public int[] reverse3(int[] nums) {
        int[] ret = new int[nums.length];
        for(int i = 0; i<nums.length ; i++){
            ret[nums.length-i-1] = nums[i];
        }
        return ret;
    }

    // 8. Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.
    public int[] maxEnd3(int[] nums) {
        int nl = nums.length;
        int larger = 0;
        if(nums[0]>nums[nl-1]){
            larger = nums[0];
        }
        else{
            larger = nums[nl-1];
        }
        for(int i=0; i<nl; i++){
            nums[i] = larger;
        }
        return nums;
    }

    // 9. Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
    public int sum2(int[] nums) {
        int sum = 0;
        for(int i =0 ; i<nums.length && i<2; i++){
            sum+=nums[i];
        }
        return sum;
    }

    // 10. Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
    public int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1],b[1]};
    }

    // 11. Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.
    public int[] makeEnds(int[] nums) {
        return new int[]{nums[0],nums[nums.length-1]};
    }

    // 12. Given an int array length 2, return true if it contains a 2 or a 3.
    public boolean has23(int[] nums) {
        return nums[0]==2||nums[0]==3||nums[1]==2||nums[1]==3;
    }

    // 13. Given an int array length 2, return true if it does not contain a 2 or 3.
    public boolean no23(int[] nums) {
        return !(nums[0]==2||nums[0]==3||nums[1]==2||nums[1]==3);
    }

    // 14. Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
    public int[] makeLast(int[] nums) {
        int[] ret = new int[2*nums.length];
        ret[ret.length-1] = nums[nums.length-1];
        return ret;
    }

    // 15. Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.
    public boolean double23(int[] nums) {
        int c2 = 0;
        int c3 = 0;
        for(int i : nums){
            if(i==2){
                c2++;
                if(c2>=2){
                    return true;
                }
            }
            else if(i==3){
                c3++;
                if(c3>=2){
                    return true;
                }
            }
        }
        return false;
    }

    // 16. Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.
    public int[] fix23(int[] nums) {
        boolean was2 = false;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==2){
                was2 = true;
            }
            else if(nums[i]==3 && was2 == true){
                was2 = false;
                nums[i] = 0;
            }
            else{
                was2 = false;
            }
        }
        return nums;
    }

    // 17. Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
    public int start1(int[] a, int[] b) {
        int count = 0;
        if(a.length>0 && a[0]==1){count++;}
        if(b.length>0 && b[0]==1){count++;}
        return count;
    }

    // 18. Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which has the largest sum. In event of a tie, return a.
    public int[] biggerTwo(int[] a, int[] b) {
        if(a[0]+a[1] < b[0]+b[1]){
            return b;
        }
        else{
            return a;
        }
    }

    // 19. Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. The original array will be length 2 or more.
    public int[] makeMiddle(int[] nums) {
        return new int[]{nums[(nums.length/2)-1],nums[(nums.length/2)]};
    }

    // 20. Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
    public int[] plusTwo(int[] a, int[] b) {
        return new int[]{a[0],a[1],b[0],b[1]};
    }

    // 20. Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.
    public int[] swapEnds(int[] nums) {
        int i = nums[0];
        nums[0] = nums[nums.length-1];
        nums[nums.length-1] = i;
        return nums;
    }

    // 21. Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.
    public int[] midThree(int[] nums) {
        int l = (nums.length+1)/2;
        return new int[]{nums[l-2], nums[l-1], nums[l]};
    }

    // 22. Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.
    public int maxTriple(int[] nums) {
        int l = ((nums.length+1)/2)-1;
        if(nums[0]>=nums[nums.length-1]){
            if(nums[0]>=nums[l]){
                return nums[0];
            }
            else{
                return nums[l];
            }
        }
        else if(nums[nums.length-1]>=nums[l]){
            return nums[nums.length-1];
        }
        else{
            return nums[1];
        }
    }

    // 23. Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.
    public int[] frontPiece(int[] nums) {
        int l;
        if(nums.length>1){
            l=2;
        }
        else{
            l=nums.length;
        }
        int[] ret = new int[l];
        for(int i=0; i<l; i++){
            ret[i] = nums[i];
        }
        return ret;
    }

    // 24. We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
    public boolean unlucky1(int[] nums) {
        boolean reta = nums.length>1 && nums[0]==1 && nums[1]==3;
        boolean retb = nums.length>2 && nums[1]==1 && nums[2]==3;
        boolean retd = nums.length>1 && nums[nums.length-2]==1 && nums[nums.length-1]==3;
        if(reta || retb || retd){
            return true;
        }
        else {
            return false;
        }
    }

    // 25. Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the elements from b. The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.
    public int[] make2(int[] a, int[] b) {
        int[] ret = new int[2];
        int c = 0;
        for(int i : a){
            if(c<ret.length){
                ret[c]=i;
                c++;
            }
        }
        for(int j : b){
            if(c<ret.length){
                ret[c]=j;
                c++;
            }
        }
        return ret;
    }

    // 26. Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array is length 0, ignore that array.
    public int[] front11(int[] a, int[] b) {
        int l = 0;
        boolean al = a.length>0;
        boolean bl = b.length>0;

        if(al && bl){
            return new int[]{a[0],b[0]};
        }
        else if(al){
            return new int[]{a[0]};
        }
        else if(bl){
            return new int[]{b[0]};
        }
        else{
            return new int[]{};
        }
    }

    // 27. Return the number of even ints in the given array.
    public int countEvens(int[] nums) {
        int count = 0;
        for(int i : nums){
            if(i%2==0){
                count++;
            }
        }
        return count;
    }

    // 28. Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.
    public int bigDiff(int[] nums) {
        int l = nums[0];
        int s = nums[0];
        for(int i : nums){
            l = Math.max(l,i);
            s = Math.min(s, i);
        }
        return l-s;
    }

    // 29. Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average. You may assume that the array is length 3 or more.
    public int centeredAverage(int[] nums) {
        int s = nums[0];
        int l = nums[0];
        int sum = 0;
        for(int i : nums){
            s=Math.min(i,s);
            l=Math.max(i,l);
            sum+=i;
        }
        return (sum-s-l)/(nums.length-2);
    }

    // 30. Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.
    public int sum13(int[] nums) {
        int sum = 0;
        boolean was13 = false;
        for(int i : nums){
            if(i==13){
                was13 = true;
            }
            else if(!was13){
                sum+=i;
            }
            else{
                was13=false;
            }
        }
        return sum;
    }

    // 31. Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.
    public int sum67(int[] nums) {
        boolean was6 = false;
        int sum = 0;
        for(int i : nums){
            if(was6 && i==7){
                was6=false;
            }
            else if(!was6){
                if(i!=6){
                    sum+=i;
                }
                else{
                    was6=true;
                }
            }
        }
        return sum;
    }

    // 32. Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
    public boolean has22(int[] nums) {
        boolean was2 = false;
        for(int i : nums){
            if(i==2){
                if(was2){
                    return true;
                }
                else{
                    was2=true;
                }
            }
            else{
                was2=false;
            }
        }
        return false;
    }

    // 33. Given an array of ints, return true if the array contains no 1's and no 3's.
    public boolean lucky13(int[] nums) {
        for(int i : nums){
            if(i==1 || i==3){
                return false;
            }
        }
        return true;
    }

    // 34. Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
    public boolean sum28(int[] nums) {
        int sum2 = 0;
        for (int i : nums){
            if(i==2){
                sum2+=2;
            }
        }
        return sum2==8;
    }

    // 35. Given an array of ints, return true if the number of 1's is greater than the number of 4's
    public boolean more14(int[] nums) {
        int count = 0;
        for (int i : nums){
            if(i==1){
                count++;
            }
            else if(i==4){
                count--;
            }
        }
        return count>0;
    }

    // 36. Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1. The given n may be 0, in which case just return a length 0 array. You do not need a separate if-statement for the length-0 case; the for-loop should naturally execute 0 times in that case, so it just works. The syntax to make a new int array is: new int[desired_length]
    public int[] fizzArray(int n) {
        int[] ret = new int[n];
        for(int i = 0; i<n ; i++){
            ret[i] = i;
        }
        return ret;
    }

    // 37. Given an array of ints, return true if every element is a 1 or a 4.
    public boolean only14(int[] nums) {
        for(int i : nums){
            if(i!=1 && i!=4){
                return false;
            }
        }
        return true;
    }

    // 38. Given a number n, create and return a new string array of length n, containing the strings "0", "1" "2" .. through n-1. N may be 0, in which case just return a length 0 array. Note: String.valueOf(xxx) will make the String form of most types. The syntax to make a new string array is: new String[desired_length]
    public String[] fizzArray2(int n) {
        String[] ret = new String[n];
        for(int i=0; i<n; i++){
            ret[i] = String.valueOf(i);
        }
        return ret;
    }

    // 39. Given an array of ints, return true if it contains no 1's or it contains no 4's.
    public boolean no14(int[] nums) {
        boolean was1 = false;
        boolean was4 = false;
        for(int i : nums){
            if(i == 1){
                was1 = true;
                if(was4){
                    return false;
                }
            }
            if(i == 4){
                was4 = true;
                if(was1){
                    return false;
                }
            }
        }
        return true;
    }

    // 40. We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, at least one of the pair is that value. Return true if the given value is everywhere in the array.
    public boolean isEverywhere(int[] nums, int val) {
        for(int i=0; i+1<nums.length; i++){
            if(nums[i]!=val && nums[i+1]!=val){
                return false;
            }
        }
        return true;
    }


    // 41. Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.
    public boolean either24(int[] nums) {
        boolean was4 = false;
        boolean was2 = false;
        for(int i=0; i+1<nums.length; i++){
            if(nums[i]==2 && nums[i+1]==2){
                if(was4){
                    return false;
                }
                was2 = true;
            }
            if(nums[i]==4 && nums[i+1]==4){
                if(was2){
                    return false;
                }
                was4 = true;
            }
        }
        return was2^was4;
    }

    // 42. Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in nums2 (at the same index). Return the count of the number of times that the two elements differ by 2 or less, but are not equal.
    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for(int i=0; i<nums1.length; i++){
            if(Math.abs(nums1[i]-nums2[i])>0 && Math.abs(nums1[i]-nums2[i])<3){
                count++;
            }
        }
        return count;
    }

    // 43. Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's separated by one element, such as with {7, 1, 7}.
    public boolean has77(int[] nums) {
        for(int i=0; i+2<nums.length; i++){
            if(nums[i]==7 && nums[i+1]==7 || nums[i]==7 && nums[i+2]==7 || nums[i+1]==7 && nums[i+2]==7){
                return true;
            }
        }
        return false;
    }

    // 44. Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.
    public boolean has12(int[] nums) {
        boolean was1 = false;
        for(int i: nums){
            if(i==1){
                was1 = true;
            }
            else if(was1 && i==2){
                return true;
            }
        }
        return false;
    }

    // 45. Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.
    public boolean modThree(int[] nums) {
        for(int i=0; i+2<nums.length; i++){
            if(nums[i]%2==0 && nums[i+1]%2==0 && nums[i+2]%2==0){
                return true;
            }
            else if(nums[i]%2!=0 && nums[i+1]%2!=0 && nums[i+2]%2!=0){
                return true;
            }
        }
        return false;
    }

    // 46. Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.
    public boolean haveThree(int[] nums) {
        int count3 = 0;
        for(int i=0; i+1<nums.length; i++){
            if((nums[i]==3 && nums[i+1]==3) || count3>3){
                return false;
            }
            else if(nums[i]==3){
                count3++;
            }
        }
        if(nums.length>0 && nums[nums.length-1]==3){
            count3++;
        }
        return count3==3;
    }

    // 47. Given an array of ints, return true if every 2 that appears in the array is next to another 2.
    public boolean twoTwo(int[] nums) {
        boolean was2 = false;
        for(int i=0; i+1<nums.length; i++){
            if((nums[i]==2 && (nums[i+1]!=2 && !was2))){
                return false;
            }
            else if(nums[i]==2 && nums[i+1]==2){
                was2 = true;
            }
            else{
                was2 = false;
            }
        }
        if(nums.length>1 && nums[nums.length-2]!=2 && nums[nums.length-1]==2){
            return false;
        }
        else if((nums.length==1 && nums[0]==2)){
            return false;
        }
        return true;
    }

    // 48. Return true if the group of N numbers at the start and end of the array are the same. For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for n=1 and n=3. You may assume that n is in the range 0..nums.length inclusive.
    public boolean sameEnds(int[] nums, int len) {
        for(int i = 0 ; i < len ; i++){
            if(nums[i]!=nums[nums.length-len+i]){
                return false;
            }
        }
        return true;
    }

    // 49. Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.
    public boolean tripleUp(int[] nums) {
        for(int i=0; i+2<nums.length; i++){
            if(nums[i+1]==nums[i]+1 && nums[i+2]==nums[i]+2){
                return true;
            }
        }
        return false;
    }

    // 50. Given start and end numbers, return a new array containing the sequence of integers from start up to but not including end, so start=5 and end=10 yields {5, 6, 7, 8, 9}. The end number will be greater or equal to the start number. Note that a length-0 array is valid.
    public int[] fizzArray3(int start, int end) {
        int[] ret = new int[end-start];
        for(int i=0; i<end-start; i++){
            ret[i] = start+i;
        }
        return ret;
    }

    // 51. Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and return the given array, or return a new array.
    public int[] shiftLeft(int[] nums) {
        int start = 0;
        for(int i=0; i<nums.length; i++){
            if(i==0){
                start=nums[0];
            }
            if(i+1<nums.length){
                nums[i]=nums[i+1];
            }
            else{
                nums[nums.length-1]=start;
            }
        }
        return nums;
    }

    // 52. For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.
    public int[] tenRun(int[] nums) {
        boolean start=false;
        int sub = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%10==0){
                start=true;
                sub = nums[i];
            }
            else if(start){
                nums[i]=sub;
            }
        }
        return nums;
    }

    // 53. Given a non-empty array of ints, return a new array containing the elements from the original array that come before the first 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.
    public int[] pre4(int[] nums) {
        int count = 0;
        for(int i : nums){
            if(i==4){
                break;
            }
            count++;
        }
        int[] ret =  new int[count];
        for(int j=0; j<count; j++){
            ret[j] = nums[j];
        }
        return ret;
    }

    // 54. Given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.
    public int[] post4(int[] nums) {
        int count = 0;
        for(int i = nums.length-1 ; i>=0 ; i--){
            if(nums[i]==4){
                break;
            }
            count++;
        }
        int[] ret =  new int[count];
        for(int j=0; j<count; j++){
            ret[j] = nums[nums.length-count+j];
        }
        return ret;
    }

    // 55. We'll say that an element in an array is "alone" if there are values before and after it, and those values are different from it. Return a version of the given array where every instance of the given value which is alone is replaced by whichever value to its left or right is larger.
    public int[] notAlone(int[] nums, int val) {
        int[] ret = nums;
        for(int i=0; i+2<nums.length; i++){
            if(nums[i+1]==val && nums[i]!=val && nums[i+2]!=val){
                ret[i] = ret[i];
                ret[i+1]=larger(nums[i],nums[i+2]);
                ret[i+2]=ret[i+2];
            }
        }
        return ret;
    }

    public int larger(int a, int b){
        if(a>b){
            return a;
        }
        return b;
    }

    // 56. Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are grouped at the start of the array. The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array.
    public int[] zeroFront(int[] nums) {
        int[] ret = new int[nums.length];
        int endc = nums.length-1;
        for(int i = nums.length-1 ; i >= 0 ; i--){
            if(nums[i]!=0){
                ret[endc]=nums[i];
                endc--;
            }
        }
        return ret;
    }

    // 57. Return a version of the given array where all the 10's have been removed. The remaining elements should shift left towards the start of the array as needed, and the empty spaces a the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and return the given array or make a new array.
    public int[] withoutTen(int[] nums) {
        int[] ret = new int[nums.length];
        int begc = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]!=10){
                ret[begc]=nums[i];
                begc++;
            }
        }
        return ret;
    }

    // 58. Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array. If there is no odd value to the right of the zero, leave the zero as a zero.
    public int[] zeroMax(int[] nums) {
        int oddnum = 0;
        for(int i=nums.length-1 ; i>=0 ; i--){
            if(nums[i]==0){
                nums[i]=oddnum;
            }
            else if(nums[i]%2!=0 && nums[i]>oddnum){
                oddnum=nums[i];
            }
        }
        return nums;
    }

    // 59. Return an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and return the given array, or make a new array.
    public int[] evenOdd(int[] nums) {
        int[] ret = new int[nums.length];
        int endc = nums.length-1;
        int begc = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]%2==0){
                ret[begc]=nums[i];
                begc++;
            }
            else{
                ret[endc]=nums[i];
                endc--;
            }
        }
        return ret;
    }

    // 60. Consider the series of numbers beginning at start and running up to but not including end, so for example start=1 and end=5 gives the series 1, 2, 3, 4. Return a new String[] array containing the string form of these numbers, except for multiples of 3, use "Fizz" instead of the number, for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz". In Java, String.valueOf(xxx) will make the String form of an int or other type. This version is a little more complicated than the usual version since you have to allocate and index into an array instead of just printing, and we vary the start/end instead of just always doing 1..100.
    public String[] fizzBuzz(int start, int end) {
        String[] ret = new String[end-start];
        for(int i=start ; i<end ; i++){
            if(i%3==0){
                if(i%5==0){
                    ret[i-start] = "FizzBuzz";
                }
                else{
                    ret[i-start] = "Fizz";
                }
            }
            else if(i%5==0){
                ret[i-start] = "Buzz";
            }
            else{
                ret[i-start] = String.valueOf(i);
            }
        }
        return ret;
    }

    // 61. Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)
    public int maxSpan(int[] nums) {
        int count=0;
        for(int i = 0; i<nums.length ; i++){
            for(int j = nums.length-1; j>=i ; j--){
                if(nums[i]==nums[j]){
                    if(j-i+1>count){
                        count=j-i+1;
                    }
                    break;
                }
            }
        }
        return count;
    }

    // 62. Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is immediately followed by a 4. Do not move the 3's, but every other number may move. The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.
    public int[] fix34(int[] nums) {
        boolean done = false;
        int temp = 0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==3 && nums[i+1]!=4){
                for(int j=0; j<nums.length; j++){
                    if(((j>0 && nums[j-1]!=3) || j==0) && nums[j]==4){
                        nums[j]=nums[i+1];
                        nums[i+1]=4;
                    }
                }
            }
        }
        return nums;
    }

    // 63. Return an array that contains exactly the same numbers as the given array, but rearranged so that every 4 is immediately followed by a 5. Do not move the 4's, but every other number may move. The array contains the same number of 4's and 5's, and every 4 has a number after it that is not a 4. In this version, 5's may appear anywhere in the original array.
    public int[] fix45(int[] nums) {
        boolean done = false;
        int temp = 0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==4 && nums[i+1]!=5){
                for(int j=0; j<nums.length; j++){
                    if(((j>0 && nums[j-1]!=4) || j==0) && nums[j]==5){
                        nums[j]=nums[i+1];
                        nums[i+1]=5;
                    }
                }
            }
        }
        return nums;
    }

    // 64. Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
    public boolean canBalance(int[] nums) {
        int l = nums.length;
        int li = 0;
        int ri = l-1;
        int lsum = 0;
        int rsum = 0;
        boolean done = false;
        while(li<=ri){
            if(lsum>rsum && nums[ri]>=0){
                rsum+=nums[ri];
                ri--;
            }
            else{
                lsum+=nums[li];
                li++;
            }
        }
        return lsum==rsum;
    }

    // 65. Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.
    public boolean linearIn(int[] outer, int[] inner) {
        int i = 0;
        for(int out : outer){
            if(i>=inner.length){
                return true;
            }
            else if(inner[i]==out){
                i++;
            }
            else if(inner[i]<out){
                return false;
            }
        }
        return i>=inner.length;
    }

    // 66. Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).
    public int[] squareUp(int n) {
        int[] ret = new int[n*n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j<=i){
                    ret[(n*i)+n-j-1]=j+1;
                }
            }
        }
        return ret;
    }

    // 67. Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.
    public int[] seriesUp(int n) {
        int sum = 0;
        int[] ret = new int[n*(n+1)/2];
        for(int i=0; i<n; i++){
            sum=0;
            for(int j=0; j<=2*i; j++){
                if(j<i){
                    sum+=j+1;
                }
                else{
                    ret[sum+j-i]=j-i+1;
                }

            }
        }
        return ret;
    }

    // 68. We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.
    public int maxMirror(int[] nums) {
        int ret = 0;
        int li = 0;
        int ri = nums.length-1;
        int i = 0;
        int sum = 0;
        while(li<nums.length){
            sum=0;
            ri=nums.length-1;
            i=0;
            while(ri>=0 && li+i<nums.length){
                if(nums[li+i]==nums[ri]){
                    sum++;
                    i++;
                }
                else{
                    sum=0;
                }
                if(sum>ret){
                    ret = sum;
                }
                ri--;
            }
            li++;
        }
        return ret;
    }

    // 69. Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array.
    public int countClumps(int[] nums) {
        int sum = 0;
        int temp;
        boolean clump = false;
        if(nums.length>2){
            temp = nums[0];
        }
        else{
            return 0;
        }
        for(int i=1; i<=nums.length; i++){
            if(i<nums.length && temp == nums[i]){
                clump=true;
            }
            else{
                if(clump){
                    sum++;
                }
                if(i<nums.length){
                    temp = nums[i];
                }
                clump = false;
            }
        }
        return sum;
    }



}
