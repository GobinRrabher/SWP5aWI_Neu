package handy;

public class Main {
    public static void main(String[] args) {
        Sim sim = new Sim(1, "32154");
        SDCard card = new SDCard(5000);
        Camera cam = new Camera();

        Phone phone = new Phone(sim, cam, card);
        phone.doCall("1324123");

        phone.takePicture();
        phone.takePicture();

        phone.printAllFiles();
        System.out.println(phone.getFreeSpace());
        phone.takePicture();
        System.out.println(phone.getFreeSpace());
    }
}
