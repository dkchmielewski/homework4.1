public class Television {
    boolean onOff;

    void turnOn() {
        onOff = true;
    }

    void turnOff() {
        onOff = false;
    }

    void showStatus() {
        System.out.println("Is television on?: " + onOff);
    }
}
