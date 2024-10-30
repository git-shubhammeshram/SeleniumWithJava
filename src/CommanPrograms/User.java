package CommanPrograms;

import java.util.*;

public class User {

   /* Question:
    You are tasked with creating a simple banking system where multiple users can log in to check their balance, deposit money, and withdraw money. The system should allow a user to:
    Log in using a valid username and password.
    Deposit money into their account.
    Withdraw money, ensuring that they cannot withdraw more than their current balance.
    Check their current balance.
    Log out, returning to the main menu where another user can log in.
    Once a user logs in, they should be able to perform multiple operations (deposit, withdraw, check balance) without being asked to log in again until they choose to log out.*/
   private String userName;
    private Integer accountBalance;

    public User(String userName, Integer accountBalance) {
        this.userName = userName;
        this.accountBalance = accountBalance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Integer accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }

    public static void main(String[] args) {
        // List of users with their initial account balances
        List<User> userList = Arrays.asList(
                new User("Shubham", 10000),
                new User("Ramesh", 20000),
                new User("Aman", 30000),
                new User("Gauri", 40000)
        );

        // Map to store username and password as key-value pairs
        Map<String, Integer> userCredentials = new HashMap<>();
        userCredentials.put("Shubham", 8888);
        userCredentials.put("Ramesh", 1111);
        userCredentials.put("Aman", 2222);
        userCredentials.put("Gauri", 3333);

        Scanner scan = new Scanner(System.in);

        mainMenu:
        while (true) {
            User loggedInUser = null;
            System.out.println("Welcome to SBI! Please log in.");

            // Login process
            while (loggedInUser == null) {
                System.out.println("Enter Username:");
                String username = scan.next();
                System.out.println("Enter Password:");
                int password = scan.nextInt();

                loggedInUser = login(username, password, userCredentials, userList);
                if (loggedInUser == null) {
                    System.out.println("Invalid username or password. Please try again.");
                } else {
                    System.out.println("Login successful! Welcome, " + loggedInUser.getUserName());
                }
            }

            // Operations after login
            while (true) {
                System.out.println("Press 1. Deposit 2. Withdraw 3. Check Balance 4. Exit");
                int choice = scan.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter Amount to Deposit:");
                        int amountDeposit = scan.nextInt();
                        depositMoney(loggedInUser, amountDeposit);
                        break;
                    case 2:
                        System.out.println("Enter Amount to Withdraw:");
                        int amountWithdraw = scan.nextInt();
                        withdrawMoney(loggedInUser, amountWithdraw);
                        break;
                    case 3:
                        checkBalance(loggedInUser);
                        break;
                    case 4:
                        System.out.println("Logging out... Returning to main menu.");
                        continue mainMenu;  // Log out and return to main menu (login screen)
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        }
    }

    // Login Method with Map for username and password
    public static User login(String username, int password, Map<String, Integer> userCredentials, List<User> userList) {
        // Check if username exists and password matches
        if (userCredentials.containsKey(username) && userCredentials.get(username).equals(password)) {
            // Find and return the user object corresponding to the username
            for (User user : userList) {
                if (user.getUserName().equals(username)) {
                    return user;
                }
            }
        }
        return null; // Return null if login fails
    }

    // Deposit Money
    public static void depositMoney(User user, int cash) {
        int updatedBalance = user.getAccountBalance() + cash;
        user.setAccountBalance(updatedBalance);
        System.out.println("Money deposited! Current Balance: " + updatedBalance);
    }

    // Withdraw Money
    public static void withdrawMoney(User user, int cash) {
        if (user.getAccountBalance() >= cash) {
            int updatedBalance = user.getAccountBalance() - cash;
            user.setAccountBalance(updatedBalance);
            System.out.println("Withdrawal successful! Current Balance: " + updatedBalance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Check Balance
    public static void checkBalance(User user) {
        System.out.println("Current Balance: " + user.getAccountBalance());
    }
}
