public class NotificationDemo {

    public static void main(String[] args) {

        Notification[] notifications = {
                new EmailNotification("Rahul", "Welcome to our service!"),
                new SMSNotification("Priya", "Your OTP is 458921"),
                new PushNotification("Aman", "Flash Sale starts now!"),
                new EmailNotification("Neha", "Your account has been verified."),
                new SMSNotification("Rohan", "Payment Successful")
        };

        System.out.println("Sending Notifications\n");

        for (Notification notification : notifications) {
            notification.sendNotification();
        }

        System.out.println("All notifications sent successfully.");
    }
}