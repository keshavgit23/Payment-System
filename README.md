# Payment-System
A Java-based CLI payment system supporting UPI, Credit Card, Digital Wallet, and Cash on Delivery (COD). Demonstrates OOP concepts like interfaces, polymorphism, and input validation. COD collects detailed user info with validation. Menu-driven and easy to use.  


# PaymentSystemJavaCLI

![Java](https://img.shields.io/badge/Language-Java-blue)
![License](https://img.shields.io/badge/License-MIT-green)

A Java-based **Command Line Interface (CLI) Payment System** allowing users to make payments via **UPI, Credit Card, Digital Wallet, or Cash On Delivery (COD)**. Demonstrates **OOP concepts** like interfaces, polymorphism, and method overriding, with robust **input validation**. COD collects detailed user info, and the menu-driven interface lets users perform multiple transactions easily. Ideal for beginners learning **Java OOP** and **console-based user input handling**.

---

## Features
- Menu-driven CLI for easy navigation.
- Multiple payment options: UPI, Credit Card, Digital Wallet, and COD.
- Input validation for:
  - Payment amount (must be > 0)
  - Name (letters and spaces only)
  - 10-digit mobile number
  - Address (non-empty)
  - 6-digit pincode
  - Landmark (non-empty)
- COD option collects and displays detailed user information.

---

## Technologies Used
- Java SE 8+
- OOP concepts: Interfaces, Classes, Polymorphism
- Scanner class for user input

---

## How to Run
1. Clone the repository:
   ```bash
   git clone <repository-url>
2. Navigate to the project folder and compile:
   ```bash
   javac PaymentSystem.java
3. Run the program:
   ```bash
   java PaymentSystem
4. Follow the on-screen menu to make payments.

## License 
This project is licensed under MIT License - feel free to use and modify it.
