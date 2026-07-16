public interface TextModeration {

    boolean isOffensive(String post);

    default void displayModerationPolicy() {
        System.out.println("No offensive language is allowed.");
    }

    static boolean containsRestrictedWords(String post) {

        return post.toLowerCase().contains("bad");
    }
}