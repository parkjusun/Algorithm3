package PatternSearch;import java.util.ArrayList;import java.util.List;public class PatternSearch {    public static void main(String[] args) {        String text = "abracadabra“";        String pattern = "abra";        List<Integer> positions = findPatternPositions(text, pattern);        if (positions.isEmpty()) {            System.out.println(-1);        } else {            for (int pos : positions) {                System.out.println(pos + " ");            }        }    }    public static List<Integer> findPatternPositions(String text, String pattern) {        List<Integer> positions = new ArrayList<>();        int n = text.length();        int m = pattern.length();        for (int i = 0; i <= n - m; i++) {            if (text.substring(i, i + m).equals(pattern)) {                positions.add(i);            }        }        return positions;    }}