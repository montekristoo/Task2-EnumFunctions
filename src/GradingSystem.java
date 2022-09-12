import java.util.NoSuchElementException;

public enum GradingSystem {
    BASIC,
    ACCEPTABLE,
    SUPERIOR,
    LOW;

   private static final GradingSystem[] VALUES = values();

    public boolean hasNext() {
        return ordinal()+1 < VALUES.length;
    }

    public boolean hasPrevious() {
        return ordinal()-1 >= 0;
    }
    public GradingSystem next() {
        return VALUES[ordinal() + 1];
    }

    public GradingSystem previous() {
        return VALUES[ordinal() - 1];
    }

    public void showAll() {
        for (GradingSystem value : VALUES) {
            System.out.println(value);
        }
    }

}
