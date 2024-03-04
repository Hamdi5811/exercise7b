public class BusinessContact extends Contact {
    private String phoneNumber;

    public BusinessContact(String name, String email, String phoneNumber) {
        super(name, email);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void displayContact() {
        super.displayContact();
        System.out.println("Phone Number: " + phoneNumber);
    }
}
