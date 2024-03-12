// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Email client = new Email("Amal", "amal@gmail.com");
        Phonenumber phone = new Phonenumber("Police", "911");

        phone.contact();
        client.contact();
    }
}