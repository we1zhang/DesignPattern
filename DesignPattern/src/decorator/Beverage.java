package decorator;

/**
 * 饮料
 */
public abstract class Beverage {

    public static final int SIZE_SMALL = 0x1;
    public static final int SIZE_MIDDLE = 0x2;
    public static final int SIZE_LARGE = 0x3;

    protected int size;

    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public abstract double cost();
}
