# Object_References

This project demonstrates the concept of object references in Java. It explains how multiple references can point to the same object and how changes through one reference affect the other.

---

## Features
- Illustrates how multiple references to the same object work.
- Demonstrates how modifying an object through one reference is reflected in others.
- Includes comparison of object references using the `==` operator.

---

## Code Overview

### 1. `Account` Class
- **Attributes**:
    - `owner` (String): Name of the account owner.
    - `balance` (double): Current balance in the account.
- **Constructor**: Initializes the owner and balance attributes.
- **Methods**:
    - `displayAccountInfo()`: Prints the account's owner and balance.
    - `deposit(double amount)`: Adds the specified amount to the balance.
    - `withdraw(double amount)`: Subtracts the specified amount if funds are sufficient.

### 2. `ObjectReferences` Class
- Contains the `main` method, which:
    - Creates an `Account` object and references it with two variables (`account1` and `account2`).
    - Modifies the object through one reference and observes changes via the other reference.
    - Compares the references to determine if they point to the same object.

---

## How to Run

1. Clone the repository or download the project files.
2. Open the project in an IDE such as **IntelliJ IDEA** or **Eclipse**.
3. Compile and run the `ObjectReferences.java` file.

---

## Sample Output

```plaintext
Details from account1 reference:
Owner: Alice, Balance: $1000.0
Details from account2 reference:
Owner: Alice, Balance: $1000.0
500.0 deposited. New balance: $1500.0

After modifying via account2:
Owner: Alice, Balance: $1500.0
Owner: Alice, Balance: $1500.0

account1 and account2 refer to the same object.
