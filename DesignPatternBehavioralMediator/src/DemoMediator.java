

public class DemoMediator {
    public static void main(String[] args) {
        User ayogi = new User("Ayogi");
        User prayoga = new User("Prayoga");
        User duden = new User("Duden");
        User ikbal = new User("Ikbal");

        ayogi.sendMessage("Kapan lagu barumu rilis?");
        prayoga.sendMessage("Minggu Depan ya.");
        duden.sendMessage("Wah menarik. Kami tunggu");
        ikbal.sendMessage("Yaaasss Can't Wait");
    }
}
