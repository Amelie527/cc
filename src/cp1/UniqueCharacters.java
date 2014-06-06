package cp1;

/**
 * Created with IntelliJ IDEA.
 * User: rxiao
 * Date: 6/5/14
 * Time: 8:50 PM
 * To change this template use File | Settings | File Templates.
 */
import java.util.*;

public class UniqueCharacters {

    public static void main(String args[]) {
        boolean result = isUniqueSortedString("abcdesfglkjis");
        System.out.println(result);
    }

    public static boolean isUniqueHashMap(String s) {
        HashMap<Character, Integer> bufferHashMap = new HashMap<Character, Integer>();
        int size = s.length();
        for(int i=0; i<size; i++) {
            Character key = s.charAt(i);
            if(bufferHashMap.containsKey(key)) return false;
            else {
                bufferHashMap.put(key, 1);
            }
        }
        return true;
    }

    public static boolean isUniqueArray(String s) {
        int size = s.length();
        int[] bufferArray = new int[256];
        for(int i=0; i<size; i++) {
            Character c = s.charAt(i);
            int index = Character.getNumericValue(c);
            if(bufferArray[index] > 0) return false;
            else bufferArray[index]++;
        }
        return true;
    }

    //Time is n square which is not a good way to do it
    public static boolean isUniqueWODataStructure(String s) {
        int size = s.length();
        for(int i=0; i<size; i++){
            Character pointer = s.charAt(i);
            for(int j=i+1; j<size; j++) {
                if(s.charAt(j) == pointer) return false;
            }
        }
        return true;
    }

    //Compare with the method above, try to sort a string and compare the connected two, time is O(n)
    public static boolean isUniqueSortedString(String s) {
        char[] sArray = s.toCharArray();
        Arrays.sort(sArray);
        String newString = new String(sArray);
        System.out.println(newString);
        for(int i=0; i<newString.length(); i++){
            if(i!=newString.length()-1) {
                if(newString.charAt(i) == newString.charAt(i+1)) return false;
            }
        }
        return true;
    }
}
