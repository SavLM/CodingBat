package com.savannahmclaurin;

public class StringExercises {
    // 1. Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
    public static String helloName(String name) {
        return "Hello " + name + "!";
    }

    // 2. Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
    public String makeAbba(String a, String b) {
        return a+b+b+a;
    }

    // 3. The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
    public String makeTags(String tag, String word) {
        return "<"+tag+">"+word+"</"+tag+">";
    }

    // 4. Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
    public String makeOutWord(String out, String word) {
        return out.substring(0,2)+word+out.substring(2,4);
    }

    // 5. Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
    public String extraEnd(String str) {
        String s = str.substring(str.length()-2,str.length());
        return s+s+s;
    }

    // 6. Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.
    public String firstTwo(String str) {
        if(str.length()<2){
            return str;
        }
        else{
            return str.substring(0,2);
        }
    }

    // 7. Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
    public String firstHalf(String str) {
        if(str.length()%2==0){
            return str.substring(0,(str.length()/2));
        }
        else{
            return str;
        }
    }

    // 8. Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.
    public String withoutEnd(String str) {
        return str.substring(1,str.length()-1);
    }

    // 9. Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).
    public String comboString(String a, String b) {
        if(a.length()<b.length()){
            return a+b+a;
        }
        else{
            return b+a+b;
        }
    }

    // 10. Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
    public String nonStart(String a, String b) {
        return a.substring(1,a.length())+b.substring(1,b.length());
    }

    // 11. Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.
    public String left2(String str) {
        if(str.length()<3){return str;}
        else{
            return str.substring(2,str.length())+str.substring(0,2);
        }
    }

    // 11. Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.
    public String right2(String str) {
        if(str.length()<3){return str;}
        else{
            return str.substring(str.length()-2,str.length())+str.substring(0,str.length()-2);
        }
    }

    // 12. Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.
    public String theEnd(String str, boolean front) {
        if(front){return str.charAt(0)+"";}
        else{return str.charAt(str.length()-1)+"";}
    }

    // 13. Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.
    public String withouEnd2(String str) {
        if(str.length()<2){return "";}
        else{
            return str.substring(1,str.length()-1);
        }
    }

    // 14. Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.
    public String middleTwo(String str) {
        if(str.length()%2 == 0){
            return str.substring((str.length()/2)-1,(str.length()/2)+1);
        }
        else{
            return str;
        }
    }


    // 15. Given a string, return true if it ends in "ly".
    public boolean endsLy(String str) {
        if(str.length()>1 && str.substring(str.length()-2,str.length()).equals("ly")){
            return true;
        }
        return false;
    }

    // 16. Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.
    public String nTwice(String str, int n) {
        int l = str.length();
        return str.substring(0,n)+str.substring(l-n, l);
    }

    // 17. Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.
    public String twoChar(String str, int index) {
        if(str.length()>index && str.length()>index+1 && index>=0){
            return str.substring(index, index+2);
        }
        return str.substring(0,2);
    }

    // 17. Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.
    public String middleThree(String str) {
        int l = str.length();
        if((l+1)%2 == 0){
            return str.substring( (((l-1)/2)-1), (((l+1)/2)+1) );
        }
        else{
            return str;
        }
    }

    // 18. Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.
    public boolean hasBad(String str) {
        int l = str.length();
        if(l<2){
            return false;
        }
        for(int i=0; i<2 && i+2<l; i++){
            if(str.substring(i,i+3).equals("bad")){
                return true;
            }
        }
        return false;
    }

    // 19. Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.
    public String atFirst(String str) {
        int l = str.length();
        if(l>1){
            return str.substring(0,2);
        }
        else if(l==1){
            return str.charAt(0)+"@";
        }
        else{
            return "@@";
        }
    }

    // 20. Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
    public String lastChars(String a, String b) {
        int la = a.length();
        int lb = b.length();
        char ca;
        char cb;
        if(la>0){
            ca = a.charAt(0);

        }else{
            ca = '@';
        }
        if(lb>0){
            cb = b.charAt(lb-1);
        } else{
            cb ='@';
        }
        return ""+ca+cb;
    }

    // 21. Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
    public String conCat(String a, String b) {
        int al = a.length();
        int bl = b.length();
        if((al>0 && bl>0) && a.charAt(al-1)==b.charAt(0)){
            return a.substring(0,al-1)+b;
        }
        else{
            return a+b;
        }
    }

    // 22. Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
    public String lastTwo(String str) {
        int sl = str.length();
        if(sl>1){
            return str.substring(0,sl-2)+str.charAt(sl-1)+str.charAt(sl-2);
        }
        else{
            return str;
        }
    }

    // 23. Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
    public String seeColor(String str) {
        int sl = str.length();
        if(sl > 2 && str.substring(0,3).equals("red")){
            return "red";
        }
        else if(sl > 3 && str.substring(0,4).equals("blue")){
            return "blue";
        }
        else{
            return "";
        }
    }

    // 24. Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".
    public boolean frontAgain(String str) {
        if(str.length()>1){
            return (str.substring(0,2).equals(str.substring(str.length()-2, str.length())));
        }
        return false;

    }

    // 25. Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.
    public String minCat(String a, String b) {
        int l = a.length();
        if(a.length()>b.length()){
            l = b.length();
        }
        return a.substring(a.length()-l,a.length())+b.substring(b.length()-l,b.length());
    }

    // 26. Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If there are fewer than 2 chars, use whatever is there.
    public String extraFront(String str) {
        int sl = str.length();
        if(sl>1){
            return str.substring(0,2)+str.substring(0,2)+str.substring(0,2);
        }
        else{
            return str+str+str;
        }
    }

    // 27. Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.
    public String without2(String str) {
        int sl = str.length();
        if(sl==2){
            return "";
        }
        else if(sl>1 && str.substring(0,2).equals(str.substring(sl-2, sl))){
            return str.substring(2,sl);
        }
        else{
            return str;
        }
    }

    // 28. Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.
    public String deFront(String str) {
        String s = "";
        int sl = str.length();
        if(sl>0 && str.charAt(0)=='a'){
            s+="a";
        }
        if(sl>1 && str.charAt(1)=='b'){
            s+="b";
        }
        if(sl>2){
            s+=str.substring(2,sl);
        }
        return s;
    }

    // 29. Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.
    public String startWord(String str, String word) {
        int sl = str.length();
        int wl = word.length();
        if(wl==1 && wl<=sl){
            return ""+str.charAt(0);
        }
        if(wl>1 && sl>1 && str.substring(1,wl).equals(word.substring(1,wl))){
            return str.substring(0,wl);
        }
        else {
            return "";
        }
    }

    // 30. Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
    public String withoutX(String str) {
        if(str.length()==0){
            return "";
        }
        String n = "";
        if(str.charAt(0)!='x'){
            n+=str.charAt(0);
        }
        if(str.length()>1){
            n+=str.substring(1,str.length()-1);
        }
        if(str.charAt(str.length()-1)!='x'){
            n+=str.charAt(str.length()-1);
        }
        return n;
    }

    // 31. Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.
    public String withoutX2(String str) {
        String s = "";
        int sl = str.length();
        if(sl>0 && str.charAt(0)!='x'){
            s+=""+str.charAt(0);
        }
        if(sl>1 && str.charAt(1)!='x'){
            s+=""+str.charAt(1);
        }
        if(sl>2){
            s+=str.substring(2,sl);
        }
        return s;
    }

    // 32. Given a string, return a string where for every char in the original, there are two chars.
    public String doubleChar(String str) {
        String ret = "";
        for(int i=0; i<str.length(); i++){
            ret+=""+str.charAt(i)+str.charAt(i);
        }
        return ret;
    }

    // 33. Return the number of times that the string "hi" appears anywhere in the given string.
    public int countHi(String str) {
        int count = 0;
        for(int i=0; i<str.length()-1; i++){
            if(str.substring(i,i+2).equals("hi")){
                count++;
            }
        }
        return count;
    }

    // 35. Return true if the string "cat" and "dog" appear the same number of times in the given string.
    public boolean catDog(String str) {
        int catcount = 0;
        int dogcount = 0;
        for(int i=0; i<str.length()-2; i++){
            if(str.substring(i,i+3).equals("cat")){
                catcount++;
            }
            else if(str.substring(i,i+3).equals("dog")){
                dogcount++;
            }
        }
        return catcount == dogcount;
    }

    // 36. Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
    public int countCode(String str) {
        int count = 0;
        for(int i=0; i<str.length()-3; i++){
            if(str.substring(i,i+2).equals("co") && str.charAt(i+3)=='e'){
                count++;
            }
        }
        return count;
    }

    // 37. Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.
    public boolean endOther(String a, String b) {
        if(a.length()<=b.length()){
            return b.substring(b.length()-a.length(), b.length()).toLowerCase().equals(a.toLowerCase());
        }
        return a.substring(a.length()-b.length(), a.length()).toLowerCase().equals(b.toLowerCase());
    }

    // 38. Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
    public boolean xyzThere(String str) {
        if (str.length() > 2 && str.substring(0, 3).equals("xyz")) {
            return true;
        }
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) != '.' && str.substring(i + 1, i + 4).equals("xyz")) {
                return true;
            }
        }
        return false;
    }

    // 39. Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
    public boolean bobThere(String str) {
        for(int i=0; i<str.length()-2; i++){
            if(str.charAt(i)=='b' && str.charAt(i+2)=='b'){
                return true;
            }
        }
        return false;
    }

    // 40. We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
    public boolean xyBalance(String str) {
        int x=0;
        int y=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='x'){
                x=1;
                y=0;
            }
            else if(str.charAt(i)=='y'){
                y=1;
            }
        }
        return y==1 || x==0;
    }

    // 41. Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
    public String mixString(String a, String b) {
        String ret = "";
        int al = a.length();
        int bl = b.length();
        for(int i=0; i<al||i<bl;i++){
            if(i<al){
                ret+=a.charAt(i);
            }
            if(i<bl){
                ret+=b.charAt(i);
            }
        }
        return ret;
    }

    // 42. Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.
    public String repeatEnd(String str, int n) {
        String ret = "";
        for(int i=0; i<n*n; i++){
            ret+=str.charAt(str.length()-n+(i%n));
        }
        return ret;
    }

    // 43. Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1 characters of the string, and so on. You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).
    public String repeatFront(String str, int n) {
        String ret = "";
        for(int i=n-1; i>=0; i--){
            ret+=str.substring(0,(i%n)+1);
        }
        return ret;
    }

    // 44. Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.
    public String repeatSeparator(String word, String sep, int count) {
        String ret = "";
        for(int i=0; i<count; i++){
            ret+=word+sep;
        }
        return ret.substring(0,ret.length()-sep.length());
    }

    // 45. Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().
    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0,n);
        for (int i = n; i <= str.length()-n; i++) {
            if (str.substring(i,i+n).equals(prefix)) {
                return true;
            }
        }
        return false;
    }

    // 46. Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.
    public boolean xyzMiddle(String str) {
        int middleS = (str.length()/2)-2;
        int middleE = (str.length()/2);
        if(str.length()%2 != 0){
            middleS = (int)(Math.floor(str.length()/2.0))-1;
            middleE = (int)(Math.floor(str.length()/2.0));
        }
        for (int i = middleS; i>=0 && i+2 <str.length() && i< middleE ; i++) {
            if (str.substring(i, i+3).equals("xyz")) {
                return true;
            }
        }
        return false;
    }

    // 47. A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of brea
    public String getSandwich(String str) {
        String checkBread = "     ";
        boolean wasBread = false;
        boolean secondBread = false;
        String temp = "";
        String ret = "";
        for(int i=0; i<str.length(); i++){
            checkBread=checkBread.substring(1,5)+str.charAt(i);
            if(checkBread.equals("bread")){
                if(wasBread){
                    secondBread=true;
                    ret+=temp;
                    temp="";
                }else{
                    wasBread=true;
                }
            }
            if(wasBread){
                temp+=str.charAt(i);
            }
        }
        if(secondBread){
            return ret.substring(1,ret.length()-4);
        }
        return "";
    }

    // 48. Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.
    public boolean sameStarChar(String str) {
        for(int i=1; i+1 < str.length(); i++){
            if(str.charAt(i)=='*' && str.charAt(i-1)!=str.charAt(i+1)){
                return false;
            }
        }
        return true;
    }

    // 49. Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.
    public String oneTwo(String str) {
        String ret = "";
        int iter = str.length()-(str.length()%3);
        for(int i= 0; i<iter; i+=3){
            ret+=""+str.charAt(i+1)+str.charAt(i+2)+str.charAt(i);
        }
        return ret;
    }

    // 50. Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
    public String zipZap(String str) {
        String ret = "";
        if(str.length()!=0){
            ret+=str.charAt(0);
        }
        for(int i=1 ; i<str.length(); i++){
            if((i+1==str.length()) || ((i+1 < str.length()) && (str.charAt(i-1)!='z' || str.charAt(i+1)!='p') )){
                ret+=str.charAt(i);
            }
        }
        return ret;
    }

    // 51. Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
    public String starOut(String str) {
        String ret = "";
        boolean wasStar = false;
        for(int i=0 ; i<str.length(); i++){
            if(str.charAt(i)=='*'){
                if(i-1>=0 && ret.length()>0 && !wasStar){
                    ret = ret.substring(0,ret.length()-1);
                }
                wasStar=true;
            }
            else if(str.charAt(i)!='*' && !wasStar){
                ret+=str.charAt(i);
            }
            else{
                wasStar = false;
            }
        }
        return ret;
    }

    // 52. Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.
    public String plusOut(String str, String word) {
        String ret = "";
        for(int i = 0 ; i<str.length(); i++){
            if(i+word.length()-1<str.length() && str.substring(i,i+word.length()).equals(word)){
                ret+=word;
                i+=word.length()-1;
            }
            else{
                ret+='+';
            }
        }
        return ret;
    }

    // 53. Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.
    public String wordEnds(String str, String word) {
        String ret = "";
        for(int i = 0 ; i<str.length(); i++){
            if(i+word.length()-1<str.length() && str.substring(i,i+word.length()).equals(word)){
                if(i-1>-1){
                    ret+=str.charAt(i-1);
                }
                if(i+word.length()<str.length()){
                    ret+=str.charAt(i+word.length());
                }
                i+=word.length()-1;
            }
        }
        return ret;
    }

    // 54. Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
    public int countYZ(String str) {
        int count = 0;
        for(int i = 0 ; i<=str.length(); i++){
            if(i-1>-1 && ( i==str.length() || !Character.isLetter(str.charAt(i))) && (Character.toLowerCase(str.charAt(i-1))=='z' || Character.toLowerCase(str.charAt(i-1))=='y')){
                count++;
            }
        }
        return count;
    }

    // 55. Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
    public String withoutString(String base, String remove) {
        String ret = "";
        for(int i = 0 ; i<base.length(); i++){
            if(i+remove.length()-1<base.length() && base.substring(i,i+remove.length()).toLowerCase().equals(remove.toLowerCase())){
                i+=remove.length()-1;
            }
            else{
                ret+=base.charAt(i);
            }
        }
        return ret;
    }

    // 56. Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).
    public boolean equalIsNot(String str) {
        int count = 0;
        for(int i = 0 ; i<str.length(); i++){
            if(i+1<str.length() && str.substring(i,i+2).equals("is")){
                count++;
            }
            else if(i+2<str.length() && str.substring(i,i+3).equals("not")){
                count--;
            }
        }
        return count==0;
    }

    // 57. We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the g's in the given string are happy.
    public boolean gHappy(String str) {
        boolean stillgood = false;
        for(int i=0 ; i<str.length(); i++){
            if(str.charAt(i)=='g'){
                i++;
                while(i<str.length() && str.charAt(i)=='g'){
                    stillgood = true;
                    i++;
                }
                if(!stillgood){
                    return false;
                }
                stillgood=false;
            }
        }
        return true;
    }

    // 58. We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples in the given string. The triples may overlap.
    public int countTriple(String str) {
        int count = 0;
        String temp = "";
        int tempcount = 0;
        for(int i=0 ; i+2<str.length(); i++){
            temp = "" + str.charAt(i)+str.charAt(i)+str.charAt(i);
            if(str.substring(i,i+3).equals(temp)){
                count++;
            }
        }
        return count;
    }

    // 59. Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters. Return 0 if there are no digits in the string. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
    public int sumDigits(String str) {
        int sum=0;
        for(int i=0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                sum+=Integer.parseInt(""+str.charAt(i));
            }
        }
        return sum;
    }

    // 60. Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. For example, sameEnds("abXab") is "ab".
    public String sameEnds(String str) {
        if(str.length()==0 || isCopy(str)){
            return str.substring(0,str.length()/2);
        }
        else{
            int l=str.length();
            String newS ="";
            if(l%2==0){
                newS = str.substring(0, (str.length()/2)-1) + str.substring((str.length()/2)+1,str.length());
            }
            else{
                newS = str.substring(0, (str.length()/2)) + str.substring((str.length()/2)+1,str.length());
            }
            return sameEnds(newS);
        }
    }
    public Boolean isCopy(String str){
        int l=str.length();
        if(l%2==0){
            return str.substring(0, str.length()/2).equals(str.substring(str.length()/2,str.length()));
        }
        else{
            return str.substring(0, (str.length()/2)+1).equals(str.substring(str.length()/2,str.length()));
        }
    }

    // 61. Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string. In other words, zero or more characters at the very begining of the given string, and at the very end of the string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".
    public String mirrorEnds(String str) {
        if(str.length()==0 || isPalindrome(str)){
            return str;
        }
        else{
            int l=str.length();
            String newS =str;
            while(!isPalindrome(newS)){
                if(l%2==0){
                    newS = newS.substring(0, (newS.length()/2)-1) + newS.substring((newS.length()/2)+1,newS.length());
                }
                else{
                    newS = newS.substring(0, (newS.length()/2)) + newS.substring((newS.length()/2)+1,newS.length());
                }
            }
            return newS.substring(0,newS.length()/2);
        }
    }

    public Boolean isPalindrome(String str){
        int l=str.length();
        String mirror = "";
        for(int i=str.length()-1; i>-1; i--){
            mirror += str.charAt(i);
        }
        return (str.equals(mirror));
    }

    // 62. Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.
    public static int maxBlock(String str) {
        int count = 0;
        String temps = "";
        for(int i=0 ; str.length()>0 && i <str.length()+1; i++){
            if(i<str.length() && temps.length()>0 && str.charAt(i)==temps.charAt(0)){
                temps+=str.charAt(i);
            }
            else if(i<str.length()) {
                temps = "" + str.charAt(i);
            }
            if(temps.length()>=count){
                count = temps.length();
            }
        }
        return count;
    }

    // 63. Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
    public int sumNumbers(String str) {
        int sum = 0;
        boolean newint = false;
        String temp = "";
        for(int i = 0; i<str.length(); i++){
            while(i<str.length() && Character.isDigit(str.charAt(i))){
                newint = true;
                temp += str.charAt(i);
                i++;
            }
            if(newint){
                sum+=Integer.parseInt(temp);
                newint = false;
                temp= "";
            }
        }
        return sum;
    }

    // 64. Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not". The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count.
    public String notReplace(String str) {
        boolean waschar = false;
        String ret = "";
        for(int i = 0; i<str.length() ; i++){
            if(i+1<str.length() && str.substring(i,i+2).equals("is") && !waschar && (i+3>str.length() || !Character.isLetter(str.charAt(i+2))) ){
                ret+="is not";
                i++;
            }
            else{
                ret += str.charAt(i);
            }
            waschar = Character.isLetter(str.charAt(i));
        }
        return ret;
    }



}
