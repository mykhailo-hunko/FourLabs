public class Third {

    public static void main(String[] args) {

        String str = "I will go to school by bus";
        String secondWord = str.split(" ")[1]; // take second word from string
        System.out.println(reverseStringWithRecursion(secondWord));
        System.out.println(reverseStringWithoutRecursion(secondWord));
    }

    public static String reverseStringWithRecursion(String inputString) {
        String startPart;
        String endPart;

        int length = inputString.length();

        // end of Recursion
        if (length <= 1) {
            return inputString;
        }

        endPart = inputString.substring(0, length / 2);

        startPart = inputString.substring(length / 2, length);

        // reverse words with Recursion
        return reverseStringWithRecursion(startPart) + reverseStringWithRecursion(endPart);
    }

    public static String reverseStringWithoutRecursion(String inputString) {
        char[] charArray = inputString.toCharArray();//string to char array(for example -> "line" -> ['l','i','n','e']
        StringBuilder resultString = new StringBuilder();//read: Mutable String
        for (int i = charArray.length - 1; i >= 0; i--) {
            resultString.append(charArray[i]); // add char to string
        }
        return resultString.toString();
    }
}
