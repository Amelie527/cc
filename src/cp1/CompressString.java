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
        String newString = compressStringHashMap(s);
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
}
