public class Phonenumber extends Contact {
    private String phoneNumber;

    public Phonenumber(String name, String phoneNumber) {
        super(name);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void contact() {
        System.out.println("Call: " + phoneNumber);
    }

}