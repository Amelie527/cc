public class Main {

    public static void main(String[] args) {
        String testString = "This is test String";
        int stringLength = testString.length();
        char[] testArray = new char[stringLength];

        for(int i=0; i<stringLength; i++) {
            testArray[i] = testString.charAt(stringLength-1-i);
        }

        System.out.print(testArray);
    }
}
