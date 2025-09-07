import java.util.Scanner;

// Interface defining the structure for all payment types
interface Payment {
    public void makePayment(double amount, Scanner sc);
}

// Class to handle UPI payments
class UPIPayment implements Payment {
    @Override
    public void makePayment(double amount, Scanner sc) {
        if (amount <= 0) {
            System.out.println("Enter a valid amount!");
        } else {
            System.out.println("Your UPI payment was successful!");
        }
    }
}

// Class to handle Credit Card payments
class CreditCard implements Payment {
    @Override
    public void makePayment(double amount, Scanner sc) {
        if (amount <= 0) {
            System.out.println("Enter a valid amount!");
        } else {
            System.out.println("Your Credit Card payment was successful!");
        }
    }
}

// Class to handle Digital Wallet payments
class WalletPayment implements Payment {
    @Override
    public void makePayment(double amount, Scanner sc) {
        if (amount <= 0) {
            System.out.println("Enter a valid amount!");
        } else {
            System.out.println("Your Wallet payment was successful!");
        }
    }
}

// Class to handle Cash On Delivery (COD) payments
class CashOnDelivery implements Payment {

    // Method to get and validate user's name
    private String getName(Scanner sc) {
        String name;
        do {
            System.out.println("Enter your name: ");
            name = sc.nextLine().trim();
            if (name.isEmpty()) {
                System.out.println("Name cannot be empty!");
            } else if (!name.matches("[a-zA-Z ]+")) {
                System.out.println("Name must contain only letters and spaces");
                name = "";
            }
        } while (name.isEmpty());
        return name;
    }

    // Method to get and validate user's 10-digit mobile number
    private Long getMobileNumber(Scanner sc) {
        Long mobileNumber;
        while (true) {
            System.out.println("Enter 10 digit mobile number: ");
            while (!sc.hasNextLong()) {
                System.out.println("Invalid! Enter numbers only!");
                sc.next();
            }
            mobileNumber = sc.nextLong();
            sc.nextLine(); // consume newline
            if (String.valueOf(mobileNumber).length() == 10) {
                break;
            } else {
                System.out.println("Mobile number must be 10 digits!");
            }
        }
        return mobileNumber;
    }

    // Method to get and validate user's address
    private String getAddress(Scanner sc) {
        String address;
        do {
            System.out.println("Enter your address: ");
            address = sc.nextLine().trim();
            if (address.isEmpty()) {
                System.out.println("Address cannot be empty!");
            }
        } while (address.isEmpty());
        return address;
    }

    // Method to get and validate user's 6-digit pincode
    private Long getPincode(Scanner sc) {
        Long pincode;
        while (true) {
            System.out.println("Enter pincode (6-digit): ");
            while (!sc.hasNextLong()) {
                System.out.println("Invalid! Enter numbers only.");
                sc.next();
            }
            pincode = sc.nextLong();
            sc.nextLine(); // consume newline
            if (String.valueOf(pincode).length() == 6) {
                break;
            } else {
                System.out.println("Pincode must be 6 digits!");
            }
        }
        return pincode;
    }

    // Method to get and validate landmark
    private String getLandmark(Scanner sc) {
        String landmark;
        do {
            System.out.println("Enter landmark: ");
            landmark = sc.nextLine().trim();
            if (landmark.isEmpty()) {
                System.out.println("Landmark cannot be empty!");
            }
        } while (landmark.isEmpty());
        return landmark;
    }

    // Implementation of makePayment for COD
    @Override
    public void makePayment(double amount, Scanner sc) {
        if (amount <= 0) {
            System.out.println("Enter a valid amount!");
            return;
        }

        // Collect user details
        String name = getName(sc);
        Long mobileNumber = getMobileNumber(sc);
        String address = getAddress(sc);
        Long pincode = getPincode(sc);
        String landmark = getLandmark(sc);

        // Display collected details
        System.out.println("========User Details========");
        System.out.println("Name: " + name);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Address: " + address);
        System.out.println("Pincode: " + pincode);
        System.out.println("Landmark: " + landmark);
        System.out.println("Your COD order is placed successfully!");
    }
}

// Main class to run the Payment System CLI
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        // Loop to display menu until user chooses to exit
        do {
            System.out.println("-------------Payment Interface-----------");
            System.out.println("1. Payment through UPI");
            System.out.println("2. Payment through Credit Card");
            System.out.println("3. Payment through Digital Wallet");
            System.out.println("4. Cash On Delivery");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            double amt;
            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    amt = sc.nextDouble();
                    sc.nextLine();
                    Payment upi = new UPIPayment();
                    upi.makePayment(amt, sc);
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    amt = sc.nextDouble();
                    sc.nextLine();
                    Payment cc = new CreditCard();
                    cc.makePayment(amt, sc);
                    break;

                case 3:
                    System.out.print("Enter amount: ");
                    amt = sc.nextDouble();
                    sc.nextLine();
                    Payment wp = new WalletPayment();
                    wp.makePayment(amt, sc);
                    break;

                case 4:
                    System.out.print("Enter amount: ");
                    amt = sc.nextDouble();
                    sc.nextLine();
                    Payment cod = new CashOnDelivery();
                    cod.makePayment(amt, sc);
                    break;

                case 5:
                    System.out.println("Program is exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Enter choice (1-5).");
            }
        } while (choice != 5);
        sc.close();
    }
  }
