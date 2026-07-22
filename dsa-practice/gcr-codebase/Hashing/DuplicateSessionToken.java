import java.util.HashSet;
import java.util.Set;

public class DuplicateSessionToken {

    public boolean hasDuplicateToken(String[] tokens) {

        Set<String> seen = new HashSet<>();

        for (String token : tokens) {

            if (!seen.add(token)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        DuplicateSessionToken obj = new DuplicateSessionToken();

        String[] tokens = {"abc", "xyz", "pqr", "abc"};

        System.out.println(obj.hasDuplicateToken(tokens));
    }
}