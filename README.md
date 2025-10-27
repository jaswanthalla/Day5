#  Bank Simulation System (Java)

A simple **console-based banking system** built in Java that allows users to perform essential banking operations such as **deposits, withdrawals, balance checks**, and **transaction history viewing**.  

This project demonstrates core Java concepts such as **OOP (Object-Oriented Programming)**, **Collections**, **Date/Time APIs**, and **user input handling** using the `Scanner` class.

---

##  Table of Contents
- [Features](#-features)
- [Project Structure](#-project-structure)
- [How It Works](#-how-it-works)
- [Technologies Used](#-technologies-used)
- [Installation & Execution](#-installation--execution)
- [Example Usage](#-example-usage)
- [Code Overview](#-code-overview)
- [Future Improvements](#-future-improvements)
- [License](#-license)

---

##  Features
✅ Create an account with an initial deposit  
✅ Deposit money into your account  
✅ Withdraw money (with balance validation)  
✅ View your current balance  
✅ Track all transactions with timestamps  
✅ Display full transaction history  
✅ Console-based interactive menu  

---

##  Project Structure

BankSimulation/
│
├── BankSimulation.java # Main program (contains the main method)
├── Account.java # Account class for managing deposits, withdrawals, and transactions
├── Transaction.java # Transaction class to store and format transaction details
└── README.md # Project documentation

markdown
Copy code

>  *Note: In your project setup, all classes are combined into one file (`BankSimulation.java`), which is acceptable for simple projects.*

---

##  How It Works

1. The user is prompted to **enter their name** and an **initial deposit**.
2. A new `Account` object is created with the given information.
3. The user interacts with a **menu**:
   - `1`: Deposit money  
   - `2`: Withdraw money  
   - `3`: View current balance  
   - `4`: View transaction history  
   - `5`: Exit the program  
4. All deposits and withdrawals are recorded as `Transaction` objects with timestamps.
5. When the user exits, all transaction data for that session remains printed in the console.

---

##  Technologies Used
- **Java 8+**
- **java.util** (for `Scanner`, `ArrayList`)
- **java.time** (for `LocalDateTime`, `DateTimeFormatter`)

---

##  Installation & Execution

###  Prerequisites
- Install [Java JDK 8 or above](https://www.oracle.com/java/technologies/javase-downloads.html)
- Verify installation:
  ```bash
  java -version
