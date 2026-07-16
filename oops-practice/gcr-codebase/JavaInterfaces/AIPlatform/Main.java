public class Main {

    public static void main(String[] args) {

        String[] posts = {

                "Welcome to our community",
                "Buy Now and get 50% OFF",
                "This is a bad comment",
                "Enjoy your day"
        };

        ContentModerator moderator = new ContentModerator();

        moderator.displayModerationPolicy();

        System.out.println();

        moderator.checkPosts(posts);
    }
}