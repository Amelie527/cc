package cp1;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: rxiao
 * Date: 6/5/14
 * Time: 9:34 PM
 * To change this template use File | Settings | File Templates.
 */

import java.util.*;

public class PermutationTest {

    public static void main(String args[]) {
        String a = "hahaha";
        String b = "hahahh";

        System.out.println(isPermutationHashMap(a, b));
    }

    //sort the two strings first and then compare to see if they are the same or not
    public static boolean isPermutation(String a, String b) {
        if(a.length() != b.length()) return false;

        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();

        Arrays.sort(aArray);
        Arrays.sort(bArray);

        String newA = new String(aArray);
        String newB = new String(bArray);

        if(newA.equals(newB)) return true;
        else return false;
    }

    public static boolean isPermutationHashMap(String a, String b) {
        HashMap<Character, Integer> compareMap = new HashMap<Character, Integer>();
        if(a.length() != b.length()) return false;

        for(int i=0; i<a.length(); i++) {
            Character key = a.charAt(i);
            int value = 0;
            if(compareMap.containsKey(key)) {
                value = compareMap.get(key);
            }
            value++;
            compareMap.put(key, value);
        }

        for(int i=0; i<a.length(); i++) {
            Character key = b.charAt(i);
            int value2;
            if(compareMap.containsKey(key)) {
                value2 = compareMap.get(key);
            } else {
                return false;
            }
            value2 --;
            if(value2 < 0) return false;
            else {
                compareMap.put(key, value2);
            }
        }

        return true;
    }

}
