package cp1;

/**
 * Created with IntelliJ IDEA.
 * User: rxiao
 * Date: 6/5/14
 * Time: 11:41 PM
 * To change this template use File | Settings | File Templates.
 */
import java.util.*;

public class CompressString {

    public static void main(String args[]) {
        String s = "aabcccccaaadd";
        String test = "test";
        int newString = countSize(s);
        System.out.println(newString);
    }

    public static String compressStringHashMap(String s) {
        HashMap<Character, Integer> sMap = new HashMap<Character, Integer>();
        for(int i=0; i<s.length(); i++) {
            int value = 0;
            Character key = s.charAt(i);
            if(sMap.containsKey(key)) {
                value = sMap.get(key);
            }
            value ++;
            sMap.put(key, value);
        }
        String newString = "";
        for(Character key : sMap.keySet()) {
            newString += (key.toString() + sMap.get(key));
        }
        return newString;
    }

    public static String compressRight(String str) {
        String compressStr = "";
        char pointer = str.charAt(0);
        int count = 1;
        for(int i=1; i<str.length(); i++) {
            if(pointer == str.charAt(i)) {
                count ++;
            } else {
                compressStr += pointer + "" + count;
                pointer = str.charAt(i);
                count = 1;
            }
        }
        return compressStr + pointer + count;
    }

    public static int countSize(String str) {
        String compressStr = "";
        int size = 0;
        char pointer = str.charAt(0);
        int count = 1;
        for(int i=1; i<str.length(); i++) {
            if(pointer == str.charAt(i)) {
                count ++;
            } else {
                compressStr += pointer + "" + count;
                size += (pointer + "" + count).toCharArray().length;
                pointer = str.charAt(i);
                count = 1;
            }
        }
        return size + (pointer + "" + count).toCharArray().length;
    }
}
