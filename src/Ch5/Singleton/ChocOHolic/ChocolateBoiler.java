package Ch5.Singleton.ChocOHolic;

/**
 * ChocolateBoiler – Lớp singleton để đun chocolate.
 *
 * <p>
 * Sử dụng enum để tạo singleton.
 * </p>
 *
 * @author cuonglmptit
 * @since Monday, 21 July 2025
 */
public enum ChocolateBoiler {
    UNIQUE_INSTANCE;

    private boolean empty;
    private boolean boiled;

    ChocolateBoiler() {
        empty = true;
        boiled = true;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            System.out.println("Filling the boiler with a milk/chocolate mixture");
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
            System.out.println("Boiling the mixture");
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
            System.out.println("Draining the boiled milk and chocolate");
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
