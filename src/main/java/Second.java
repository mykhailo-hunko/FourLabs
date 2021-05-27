

public class Second {

    public static void main(String[] args) {
        String main = "There1 are2 str5ing6 wi34th numbers3 and random126 test ";

        String numberOnly= main.replaceAll("[^0-9]", " "); // replace noNumbers to " "
        String after = numberOnly.trim().replaceAll(" +", " ");// remove " "

        System.out.println(after);
    }
}
