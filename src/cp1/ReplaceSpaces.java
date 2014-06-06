package cp1;

/**
 * Created with IntelliJ IDEA.
 * User: rxiao
 * Date: 6/5/14
 * Time: 10:31 PM
 * To change this template use File | Settings | File Templates.
 */

import java.util.*;

public class ReplaceSpaces {

    public static void main(String args[]) {
        String st = "   This is a testing string   ! ha ";
        String newSt = replaceSpaces(st);
        System.out.println(newSt);
    }

    public static String replaceSpacesSimple(String s) {
        System.out.println(s);
        String trimedSt = s.trim();
        System.out.println(trimedSt);
        String newString = trimedSt.replace(" ", "%20");
        System.out.println(newString);
        return newString;
    }

    public static String replaceSpaces(String s) {
        int size = s.length();
        int[] pointerArray = new int[size];
        String trimedString = trimString(s);
        System.out.println(trimedString);
        String newString = replaceSpacesForTrimedString(trimedString);
        return newString;

    }

    public static String replaceSpacesForTrimedString(String s) {
        String newString = "";
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) != ' ') {
                newString += s.charAt(i);
            } else {
                newString += "%20";
            }
        }
        return newString;
    }

    public static String trimString(String s) {
        String newString;
        char[] sArray = s.toCharArray();
        int headPointer = 0;
        int tailPointer = s.length();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == ' ') {
                headPointer++;
            } else {
                break;
            }
        }

        for(int i=s.length()-1; i>=0; i-- ) {
            if(s.charAt(i) == ' ') {
                tailPointer --;
            } else {
                break;
            }
        }

        return s.substring(headPointer, tailPointer);
    }
}
