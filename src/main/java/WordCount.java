import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;


public class WordCount {


    public int getCount(String example) {

        if (example == null) throw new IllegalArgumentException();

        StringTokenizer tokenizer = new StringTokenizer(example, ",- ");
        Set<String> set = new HashSet<>();
        while (tokenizer.hasMoreTokens()) {
            String temp = tokenizer.nextToken();
            temp = temp.replace(".", "");
            temp = temp.replace(",", "");
            temp = temp.toLowerCase();
            if (temp.length() > 0) set.add(temp);
        }
        return set.size();


    }
}
