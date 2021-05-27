
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class First {

    public static void main(String[] args) {
        String main = "There are line of words to pass the exam or not pass.";
        String[] arr = main.split(" "); // divide to words

        String firstWord = arr[0];
        Arrays.sort(arr, Comparator.comparing(String::length));


        List<String> strings = Arrays.asList(arr);
        int length = strings.size();
        String lastWord = strings.get(length - 1);//delete . from last word
        strings.set(length - 1, lastWord.replace(".", ""));

        int minLength = strings.get(0).length();

        for (int i = 0; i < length; i++) {
            String currentWord = strings.get(i);
            if (currentWord.length() == minLength) {
                if (!currentWord.equals(firstWord)) {
                    System.out.println(currentWord);
                }
            }
        }
    }
}
