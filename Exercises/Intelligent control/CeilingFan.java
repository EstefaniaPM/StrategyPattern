public class CeilingFan {
    String location = "";
    int level;

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void high() {
        level = HIGH;
        System.out.println(location + " ceiling fan is on high");
    }

    public void medium() {
        level = MEDIUM;
        System.out.println(location + " ceiling fan is on medium");
    }

    public void low() {
        level = LOW;
        System.out.println(location + " ceiling fan is on low");
    }

    public void off() {
        level = 0;
        System.out.println(location + " ceiling fan is off");
    }

    public int getSpeed() {
        return this.level;
    }
}