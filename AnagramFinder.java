import java.util.ArrayList;
import java.util.List;

public class AnagramFinder {
    static String text = "Acronym; Ambigram. Anagram dictionary Anagrammatic    poom: Anagrams, a board kok ? game Blanagram \"Constrained\" writing - Isogram Letter teller bbak baak akab";

    public static void main(String[] args) {

        System.out.println(RegexGenerator.stringToRegex("macisajt"));
        String[] words = text.toLowerCase().split("\\W+");
        List<String> list4 = new ArrayList<String>();
        List<String> list5 = new ArrayList<String>();
        List<String> list6 = new ArrayList<String>();
        List<String> list7 = new ArrayList<String>();
        List<String> list8 = new ArrayList<String>();
        List<String> list9 = new ArrayList<String>();
        List<String> list10 = new ArrayList<String>();
        List<String> list11 = new ArrayList<String>();
        List<String> list12 = new ArrayList<String>();
        List<String> list13 = new ArrayList<String>();
        List<String> list14 = new ArrayList<String>();
        List<String> list15 = new ArrayList<String>();
        List<String> list16 = new ArrayList<String>();
        List<String> list17 = new ArrayList<String>();
        List<String> list18 = new ArrayList<String>();
        List<String> list19 = new ArrayList<String>();
        List<String> list20 = new ArrayList<String>();


        for (int i = 0; i < words.length; i++) {
            switch (words[i].length()) {
                case 4: list4.add(words[i]);
                    break;
                case 5: list5.add(words[i]);
                    break;
                case 6: list6.add(words[i]);
                    break;
                case 7: list7.add(words[i]);
                    break;
                case 8: list8.add(words[i]);
                    break;
                case 9: list9.add(words[i]);
                    break;
                case 10: list10.add(words[i]);
                    break;
                case 11: list11.add(words[i]);
                    break;
                case 12: list12.add(words[i]);
                    break;
                case 13: list13.add(words[i]);
                    break;
                case 14: list14.add(words[i]);
                    break;
                case 15: list15.add(words[i]);
                    break;
                case 16: list16.add(words[i]);
                    break;
                case 17: list17.add(words[i]);
                    break;
                case 18: list18.add(words[i]);
                    break;
                case 19: list19.add(words[i]);
                    break;
                case 20: list20.add(words[i]);
                    break;

            }
        }

        System.out.println("4: " + list4);
        System.out.println("5: " + list5);
        System.out.println("6: " + list6);
        System.out.println("7: " + list7);
        System.out.println("8: " + list8);
        System.out.println("9: " + list9);
        System.out.println("10: " + list10);
        for (int i = 1; i < list4.size(); i++) {
            if (list4.get(i).matches("(?=.*b)(?=.*a.*a)(?=.*k)^....$")) {
                System.out.println(list4.get(i));
            }
        }










}
}
