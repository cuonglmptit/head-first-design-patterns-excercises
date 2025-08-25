package Ch6.CommandPattern;

/**
 * Hottub – Mô_tả_ngắn_về_lớp.
 *
 * <p>
 * Mô_tả_chi_tiết.
 * </p>
 *
 * @author cuonglmptit
 * @since Monday, 25 August 2025
 */
public class Hottub {
    String location;

    public Hottub(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " Hottub is On");
    }

    public void off() {
        System.out.println(location + " Hottub is Off");
    }

    public void bubblesOn() {
        System.out.println(location + " Hottub is bubbling!");
    }

    public void bubblesOff() {
        System.out.println(location + " Hottub is not bubbling");
    }

    public void jetsOn() {
        System.out.println(location + " Hottub jets are on");
    }

    public void jetsOff() {
        System.out.println(location + " Hottub jets are off");
    }

    public void setTemperature(int temperature) {
        System.out.println(location + " Hottub temperature is set to " + temperature + " degrees");
    }

    public void circulate() {
        System.out.println(location + " Hottub is circulating");
    }
}
