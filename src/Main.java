// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Contact contact = new Contact("John Doe", "johndoe@example.com");
        contact.displayContact();

        BusinessContact businessContact = new BusinessContact("Jane Doe", "janedoe@example.com", "555-555-5555");
        businessContact.displayContact();
    }
}
