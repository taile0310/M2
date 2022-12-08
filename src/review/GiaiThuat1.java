package review;

public class GiaiThuat {
    public static void main(String[] args) {
        String[] strings = new String[]{"flower", "flow", "flight"};
        String str = "";
        for (int i = 0; i < strings.length; i++) {
            if (strings[0].charAt(i) == strings[1].charAt(i)) {
                if (strings[0].charAt(i) == strings[2].charAt(i)) {
                    str += strings[0].charAt(i);
                }
            }
        }
        System.out.println(str);
    }
}
