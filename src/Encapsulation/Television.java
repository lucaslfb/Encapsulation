package Encapsulation;

public class Television {
    public static void main(String[] args) {
        RemoteControl r0 = new RemoteControl();
        r0.turnOn();
        r0.play();
        r0.decreaseVolume();
        r0.openMenu();
    }
}
