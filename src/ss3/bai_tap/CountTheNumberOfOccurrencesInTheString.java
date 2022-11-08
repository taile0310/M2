package ss3.bai_tap;

public class CountTheNumberOfOccurrencesInTheString {
    public static void main(String[] args) {
        String str = "abccaba";
        char characters = 'a';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (characters == str.charAt(i)) {
                count++;
            }
        }
        System.out.println("'" + characters + "'" + " appears " + count + " times");
    }
}
