public class Email extends Contact {
    private String email;

    public Email(String name, String email) {
        super(name);
        this.email = email;
    }

    @Override
    public void contact() {
        System.out.println("Email: " + email);
    }

}
