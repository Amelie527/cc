package cp1;

/**
 * Created with IntelliJ IDEA.
 * User: rxiao
 * Date: 6/8/14
 * Time: 2:26 AM
 * To change this template use File | Settings | File Templates.
 */
public class IsSubstring {

    public static void main(String args[]) {
        String test = "aabscidsses";
        String test2 = "dssesaabsci";
        System.out.print(isRotation(test, test2));
    }

    public static boolean isRotation(String str, String str2) {
        if(str.length() != str2.length()) return false;
        int pointer = 0;
        String subString = "";
        for(int i=0; i<str.length(); i++) {
            if(isSubString(str, str2.substring(0, pointer))) pointer ++;
            else {
                break;
            }
        }
        String newString = str.substring(pointer, str.length()) + str.substring(0, pointer);
        if(newString.equals(str2)) return true;
        else return false;
    }

    public static boolean isSubString(String str, String str2) {
        return str.contains(str2);
    }
}
