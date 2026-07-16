public class ContentModerator
        implements TextModeration, SpamDetection {

    @Override
    public boolean isOffensive(String post) {

        return TextModeration.containsRestrictedWords(post);
    }

    @Override
    public boolean isSpam(String post) {

        return post.toLowerCase().contains("buy now");
    }

    @Override
    public void displayModerationPolicy() {

        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }

    public void checkPosts(String[] posts) {

        for (String post : posts) {

            if (isSpam(post))
                System.out.println("Spam Post : " + post);

            else if (isOffensive(post))
                System.out.println("Offensive Post : " + post);

            else
                System.out.println("Valid Post : " + post);
        }
    }
}