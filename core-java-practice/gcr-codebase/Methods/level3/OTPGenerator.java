public class OTPGenerator {

    public static int generateOTP() {

        return 100000 +
              (int)(Math.random() * 900000);
    }

    public static boolean unique(int[] otp) {

        for(int i = 0; i < otp.length; i++) {

            for(int j = i + 1;
                j < otp.length; j++) {

                if(otp[i] == otp[j])
                    return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] otp = new int[10];

        for(int i = 0; i < otp.length; i++) {

            otp[i] = generateOTP();

            System.out.println(
                    "OTP " + (i+1)
                    + " = "
                    + otp[i]);
        }

        if(unique(otp))
            System.out.println(
                    "All OTPs are unique");
        else
            System.out.println(
                    "Duplicate OTP found");
    }
}