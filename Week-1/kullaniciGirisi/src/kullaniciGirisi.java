import java.util.Scanner;
// a simple java project to check login information and reset password if needed.

// my version

public class kullaniciGirisi {
    public static void main(String[] args) {
        String userName,password;

        Scanner userInfo = new Scanner(System.in);

        System.out.println("User Name : ");
        userName = userInfo.nextLine();

        System.out.println("Password : ");
        password = userInfo.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Login succesful! ");
        } else {
            System.out.println("Login failed. Wrong input. ");

            // Ask the user if they want to reset the password
            System.out.println("Do you want to reset your password? (yes/no): ");
            String resetOption = userInfo.nextLine();

            if (resetOption.equals("yes")) {
                // Reset password logic
                System.out.println("Enter your new password: ");
                String newPassword = userInfo.nextLine();

                // Check if the new password is different from the incorrect password
                if (!newPassword.equals(password)) {
                    System.out.println("Password created!");
                } else {
                    System.out.println("Password could not be created. Please enter another password.");
                }
            }
        }
    }
}
