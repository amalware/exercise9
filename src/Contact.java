public class Contact extends Person {
    private String email;
    private String phoneNumber;

    public Contact(String name, String email, String phoneNumber) {
        super(name);
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void contact() {
        System.out.println("Emailing: " + email);
        System.out.println("Calling: "+ phoneNumber);
    }
}
