// Main class to demonstrate object references
public class ObjectReferences {
    public static void main(String[] args) {
        // Create an Account object
        Account account1 = new Account("Alice", 1000);

        // Reference account1 with another reference variable
        Account account2 = account1;

        // Display initial details using both references
        System.out.println("Details from account1 reference:");
        account1.displayAccountInfo();

        System.out.println("Details from account2 reference:");
        account2.displayAccountInfo();

        // Modify the object using account2
        account2.deposit(500);

        // Display details again to observe changes
        System.out.println("\nAfter modifying via account2:");
        account1.displayAccountInfo();
        account2.displayAccountInfo();

        // Comparing references
        if (account1 == account2) {
            System.out.println("\naccount1 and account2 refer to the same object.");
        } else {
            System.out.println("\naccount1 and account2 refer to different objects.");
        }
    }
}