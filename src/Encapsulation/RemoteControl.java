package Encapsulation;

public class RemoteControl implements Controller{
    private int volume;
    private boolean power;
    private boolean watch;

    public RemoteControl() {
        this.setPower(false);
        this.setWatch(false);
        this.setVolume(50);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public boolean isWatch() {
        return watch;
    }

    public void setWatch(boolean watch) {
        this.watch = watch;
    }

    @Override
    public void turnOn() {
        this.setPower(true);
        System.out.println(" Initializing...");
    }

    @Override
    public void turnOff() {
        this.setPower(false);
        System.out.println("   Goodbye ;)");
    }

    @Override
    public void openMenu() {
        if (this.isPower()) {
            System.out.println("----- MENU -----");
            System.out.println("power on: " + this.isPower());
            System.out.println("Is showing: " + this.isWatch());
            System.out.print("Volume: " + this.getVolume() + " ");
            for (int i = 0; i < this.getVolume(); i += 10) {
                System.out.print("I");
            }
            if (this.getVolume() >= 80) {
                System.out.print("\n!!Warning: volume \nharmful to health!!");
            }
            System.out.println("\n----------------");
        }
    }

    @Override
    public void closeMenu() {
        System.out.println("The menu has been closed.");
    }

    @Override
    public void increaseVolume() {
        if (this.isPower()) {
            this.setVolume(this.getVolume() + 10);
        }
    }

    @Override
    public void decreaseVolume() {
        if (this.isPower()) {
            this.setVolume(this.getVolume() - 10);
        }
    }

    @Override
    public void mute() {
        if (this.isPower() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void unmute() {
        if (this.isPower() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.isPower() && !this.isWatch()) {
            this.setWatch(true);
        }
    }

    @Override
    public void pause() {
        if (this.isPower() && this.isWatch()) {
            this.setWatch(false);
        }
    }
}
