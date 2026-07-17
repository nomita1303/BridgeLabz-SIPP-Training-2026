import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> groups = new HashMap<>();

        for (String str : strs) {

            char[] chars = str.toCharArray();

            Arrays.sort(chars);

            String key = new String(chars);

            groups.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(groups.values());
    }

    public static void main(String[] args) {

        GroupAnagrams obj = new GroupAnagrams();

        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println(obj.groupAnagrams(words));
    }
}