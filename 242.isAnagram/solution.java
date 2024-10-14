
import java.util.Arrays;

public class solution {

    public static void main(String[] args) {
        String s = "racecar";
        String t = "racecar";

        System.out.println(isAnagram(s, t));

    }

    public static boolean isAnagram(String s, String t) {

        char[] first = s.toCharArray();
        char[] second = t.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        return Arrays.equals(first, second);
    }

}
