import java.util.ArrayList;
import java.util.List;

public class RegexGenerator {
    char ch;
    Integer frequency;

    public RegexGenerator(char ch, int frequency) {
        this.ch = ch;
        this.frequency = frequency;
    }

    public char getCh() {
        return ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public static List stringToRegex(String string) {
        String eleje = "";
        String egyezettKaraktekerSzama = "^";
        String betuKezdo = "(?=";
        String betuZaro = ")";
        char[] charlist = new char[string.length()];
        string.toLowerCase().getChars(0, string.length(), charlist, 0);
        List<RegexGenerator> uniqchars = new ArrayList<RegexGenerator>();
        for (int i = 0; i < charlist.length; i++) {
            if (!uniqchars.contains(charlist[i])) {
                uniqchars.add(new RegexGenerator(string.charAt(i), 1));
            } else {
                uniqchars.indexOf(charlist[i]); //// charlist[i] értékével korábban már indexelt char-hoz tartozó getFrequency-t kéne meghívni?
            }
        }
        for (int i = 0; i < uniqchars.size(); i++) {
            System.out.println(uniqchars.get(i).getFrequency());
        }

        return uniqchars;
    }
}

