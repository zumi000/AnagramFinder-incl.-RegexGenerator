import java.util.*;
public class RegexGenerator {
    public static String stringToRegex(String string) {
        String[] charlist = new String[string.length()];
        charlist = string.toLowerCase().split("");
        HashMap<String,Integer> charfreq = new HashMap<>();
        for (int i = 0; i < charlist.length; i++) {
            if (!charfreq.containsKey(charlist[i])) {
                charfreq.put(charlist[i], 1);
            } else {
                charfreq.put(charlist[i], charfreq.get(charlist[i])+1);
            }
        }
        final String[] regexPieces = {"", "^"};
        charfreq.forEach((k,v) -> {
            regexPieces[0] += "(?=";
            for (int i = 0; i < v; i++) {
                regexPieces[0] += ".*" + k;
                regexPieces[1] += ".";
            }
            regexPieces[0] += ")";
        });
        regexPieces[1] += "$";
        return regexPieces[0]+regexPieces[1];
    }
}

