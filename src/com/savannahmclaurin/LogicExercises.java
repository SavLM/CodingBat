package com.savannahmclaurin;

public class LogicExercises {
    // 1. When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. Return true if the party with the given values is successful, or false otherwise.
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if(!isWeekend && cigars>=40 && cigars<=60){
            return true;
        }
        else if(isWeekend && cigars>=40){
            return true;
        }
        else{
            return false;
        }
    }

    // 2. You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is very stylish, 8 or more, then the result is 2 (yes). With the exception that if either of you has style of 2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe).
    public int dateFashion(int you, int date) {
        if(you>2 && date>2){
            if(you>=8 || date>=8){
                return 2;
            }
            else{
                return 1;
            }
        }
        else{
            return 0;
        }
    }

    // 3. The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is between 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.
    public boolean squirrelPlay(int temp, boolean isSummer) {
        if(temp>=60){
            if(temp<=90 && !isSummer){
                return true;
            }
            else if(temp<=100 && isSummer){
                return true;
            }
            return false;
        }
        else{
            return false;
        }
    }

    // 4. You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
    public int caughtSpeeding(int speed, boolean isBirthday) {
        if((speed>=61 && !isBirthday)||(speed>=66 && isBirthday)){
            if((speed>=81 && !isBirthday)||(speed>=86 && isBirthday)){
                return 2;
            }
            else{
                return 1;
            }
        }
        else{
            return 0;
        }
    }

    // 5. Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.
    public int sortaSum(int a, int b) {
        int sum = a+b;
        if(sum>=10 && sum<=19){
            return 20;
        }
        else{
            return sum;
        }
    }

    // 6. Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation, return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00". Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".
    public String alarmClock(int day, boolean vacation) {
        if(day==0 || day==6){
            if(vacation){
                return "off";
            }
            else{
                return "10:00";
            }
        }
        else{
            if(vacation){
                return "10:00";
            }
            else{
                return "7:00";
            }
        }
    }

    // 7. The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.
    public boolean love6(int a, int b) {
        return (a==6 || b==6 || Math.abs(a-b)==6 || a+b==6);
    }

    // 8. Given a number n, return true if n is in the range 1..10, inclusive. Unless outsideMode is true, in which case return true if the number is less or equal to 1, or greater or equal to 10.
    public boolean in1To10(int n, boolean outsideMode) {
        if(outsideMode){
            return n<=1 || n>=10;
        }
        return n>=1 && n<=10;
    }

    // 9. We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11. Return true if the given non-negative number is special.
    public boolean specialEleven(int n) {
        return n%11==0 || (n-1)%11==0;
    }

    // 10. Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
    public boolean more20(int n) {
        return ((n-1)%20 == 0) || ((n-2)%20 == 0);
    }

    // 11. Return true if the given non-negative number is a multiple of 3 or 5, but not both.
    public boolean old35(int n) {
        return n%3==0 ^ n%5==0;
    }

    // 12. Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38 and 39 return true, but 40 returns false.
    public boolean less20(int n) {
        return ((n+1)%20==0) ||((n+2)%20==0);
    }

    // 13. Given a non-negative number "num", return true if num is within 2 of a multiple of 10.
    public boolean nearTen(int num) {
        return (num % 10 <= 2) || ((num % 10) >= 8);
    }

    // 14. Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky. So if either value is a teen, just return 19.
    public int teenSum(int a, int b) {
        boolean at = a>=13 && a<=19;
        boolean bt = b>=13 && b<=19;
        if(at||bt){
            return 19;
        }
        else{
            return a+b;
        }
    }

    // 15. Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning you only answer if it is your mom calling. In all cases, if you are asleep, you do not answer.
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        return (!isMorning || isMom) && !isAsleep;
    }

    // 16. We are having a party with amounts of tea and candy. Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great. A party is good (1) if both tea and candy are at least 5. However, if either tea or candy is at least double the amount of the other one, the party is great (2). However, in all cases, if either tea or candy is less than 5, the party is always bad (0).
    public int teaParty(int tea, int candy) {
        if(tea>=5 && candy>=5){
            if(tea>=2*candy || candy>=2*tea){
                return 2;
            }
            return 1;
        }
        else{
            return 0;
        }
    }

    // 17. Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged.
    public String fizzString(String str) {
        String ret = "";
        int c = 0;
        if(str.length()>0 && str.charAt(0)=='f'){
            ret+="Fizz";
            c=1;
        }
        if(str.length()>0 && str.charAt(str.length()-1)=='b'){
            ret+="Buzz";
            c=1;
        }
        if(c==0){
            ret = str;
        }
        return ret;
    }

    // 18. Given an int n, return the string form of the number followed by "!". So the int 6 yields "6!". Except if the number is divisible by 3 use "Fizz" instead of the number, and if the number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz".
    public String fizzString2(int n) {
        String ret = "";
        boolean c = false;
        if(n%3==0){
            ret+="Fizz";
            c= true;
        }
        if(n%5==0){
            ret+="Buzz";
            c=true;
        }
        if(!c){
            ret+=n;
        }
        return ret+"!";

    }

    // 19. Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
    public boolean twoAsOne(int a, int b, int c) {
        double val = (a+b+c)/2.0;
        return val==a || val==b || val==c;
    }

    // 20. Given three ints, a b c, return true if b is greater than a, and c is greater than b. However, with the exception that if "bOk" is true, b does not need to be greater than a.
    public boolean inOrder(int a, int b, int c, boolean bOk) {
        return (c>b && bOk) || (c>b && b>a);
    }

    // 21. Given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7. However, with the exception that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5.
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        return ((a<b)&&(b<c))||(equalOk && (a<=b)&&(b<=c));
    }

    // 22. Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.
    public boolean lastDigit(int a, int b, int c) {
        int ad = a%10;
        int bd = b%10;
        int cd = c%10;
        return ad==bd||ad==cd||bd==cd;
    }

    // 23. Given three ints, a b c, return true if one of them is 10 or more less than one of the others.
    public boolean lessBy10(int a, int b, int c) {
        int ab = Math.abs(a-b);
        int bc = Math.abs(b-c);
        int ac = Math.abs(a-c);
        return ab>=10 ||bc>=10 || ac>=10;
    }

    // 24. Return the sum of two 6-sided dice rolls, each in the range 1..6. However, if noDoubles is true, if the two dice show the same value, increment one die to the next value, wrapping around to 1 if its value was 6.
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        int sum = die1+die2;
        if(noDoubles&&die1==die2){
            sum++;
            if(die1==6){
                sum-=6;
            }
            else if(die2==6){
                sum-=6;
            }

        }
        return sum;
    }

    // 25. Given two int values, return whichever value is larger. However if the two values have the same remainder when divided by 5, then the return the smaller value. However, in all cases, if the two values are the same, return 0. Note: the % "mod" operator computes the remainder, e.g. 7 % 5 is 2.
    public int maxMod5(int a, int b) {
        if(a==b){
            return 0;
        }
        else if(a>b ^ a%5==b%5){
            return a;
        }
        else{
            return b;
        }
    }

    // 26. You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. If they are all the value 2, the result is 10. Otherwise if they are all the same, the result is 5. Otherwise so long as both b and c are different from a, the result is 1. Otherwise the result is 0.
    public int redTicket(int a, int b, int c) {
        if(a+b+c == 6){
            return 10;
        }
        else if(a==b && a==c){
            return 5;
        }
        if(a!=b && a!=c){
            return 1;
        }
        else{
            return 0;
        }
    }


    // 27. You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other, the result is 0. If all of the numbers are the same, the result is 20. If two of the numbers are the same, the result is 10.
    public int greenTicket(int a, int b, int c){
        if(a==b || a==c){
            if(b==c){
                return 20;
            }
            return 10;
        }
        if(b==c){
            return 10;
        }
        return 0;
    }

    // 28. You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which we'll call ab, bc, and ac. Consider the sum of the numbers in each pair. If any pair sums to exactly 10, the result is 10. Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5. Otherwise the result is 0.
    public int blueTicket(int a, int b, int c) {
        int ab = a+b;
        int ac = a+c;
        int bc = b+c;
        if(ab==10 || ac==10 || bc==10){
            return 10;
        }
        else if(ab-bc == 10 || ab-ac==10){
            return 5;
        }
        return 0;
    }

    // 29. Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23.
    public boolean shareDigit(int a, int b) {
        int a1 = a/10;
        int a2 = a%10;
        int b1 = b/10;
        int b2 = b%10;
        return (a1==b1 || a1==b2 || a2==b1 || a2==b2);
    }

    // 30. Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a. If the sum has more digits than a, just return a without b.
    public int sumLimit(int a, int b) {
        if(String.valueOf(a+b).length()>String.valueOf(a).length()){
            return a;
        }
        return a+b;
    }

    // 31. We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks.
    public static boolean makeBricks(int small, int big, int goal) {
        int curr = goal/5;
        if(curr<=big) {
            return goal-(5*curr)<=small;
        }
        return (goal-(5*(small/5))-big*5<=small%5);
    }

    // 32. Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.
    public int loneSum(int a, int b, int c) {
        int sum = 0;
        if(a!=b && a!=c){sum+=a;}
        if(b!=a && b!=c){sum+=b;}
        if(c!=a && c!=b){sum+=c;}
        return sum;
    }

    // 33. Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.
    public int luckySum(int a, int b, int c) {
        int sum = 0;
        if(a!=13){
            sum=a;
            if(b!=13){
                sum+=b;
                if(c!=13){
                    sum+=c;
                }
            }
        }
        return sum;
    }

    // 34. Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens. Write a separate helper "public int fixTeen(int n) {"that takes in an int value and returns that value fixed for the teen rule. In this way, you avoid repeating the teen code 3 times (i.e. "decomposition"). Define the helper below and at the same indent level as the main noTeenSum().
    public int noTeenSum(int a, int b, int c) {
        return fixTeen(a)+fixTeen(b)+fixTeen(c);
    }
    public int fixTeen(int n) {
        if(n<20 && n>12 && n!=15 && n!=16){
            return 0;
        }
        return n;
    }

    // 35. For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values. To avoid code repetition, write a separate helper "public int round10(int num) {" and call it 3 times. Write the helper entirely below and at the same indent level as roundSum().
    public int roundSum(int a, int b, int c) {
        return round10(a)+round10(b)+round10(c);
    }

    public int round10(int num) {
        if(num%10<5){
            return (num/10)*10;
        }
        return ((num/10)*10)+10;
    }

    // 36. Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.
    public boolean closeFar(int a, int b, int c) {
        return ((Math.abs(a-b) < 2 && Math.abs(a-c) > 1) || (Math.abs(a-c) <2 && Math.abs(a-b) > 1))  && Math.abs(b-c) > 1;
    }

    // 37. Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.
    public int blackjack(int a, int b) {
        if(b>21){
            b=0;
        }
        if(a>21){
            a=0;
        }
        if(21-a > 21-b){
            return b;
        }
        return a;
    }

    // 38. Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.
    public boolean evenlySpaced(int a, int b, int c) {
        if(a>=b && a>=c){
            if(b>=c){
                return a-b==b-c;
            }
            return a-c==c-b;
        }
        else if(b>=a && b>=c){
            if(a>=c){
                return b-a==a-c;
            }
            return b-c==c-a;
        }
        if(a>=b){
            return c-a==a-b;
        }
        return c-b==b-a;
    }

    // 39. We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each). Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.
    public int makeChocolate(int small, int big, int goal) {
        int curr = goal/5;
        if(curr<=big) {
            if(goal-(5*curr)<=small){
                return goal-(5*curr);
            }
            return -1;
        }
        if(goal-(5*(small/5))-big*5<=small%5){
            return goal-(big*5);
        }
        return -1;
    }

// 2, 2
//




}
