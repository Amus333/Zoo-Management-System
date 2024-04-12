public interface Flyable {

    public default void fly() {
        System.out.println("This animal is now flying...");
    }
}
