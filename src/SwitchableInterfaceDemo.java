interface Switchable {
    void turnOn();
}

class RoomLight implements Switchable {
    public void turnOn() {
        System.out.println("Light is turned ON.");
    }
}

class CeilingFan implements Switchable {
    public void turnOn() {
        System.out.println("Fan is turned ON.");
    }
}

public class SwitchableInterfaceDemo {
    public static void main(String[] args) {
        RoomLight light = new RoomLight();
        CeilingFan fan = new CeilingFan();

        light.turnOn();
        fan.turnOn();
    }
}