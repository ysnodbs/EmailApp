public class EmailApp {

    public static void main(String[] args) {
        Email email1 = new Email("Yasin","Odabas");

        email1.setAlternateEmail("mymail@abc.com");
        System.out.println(email1.getAlternateEmail());
    }
}
