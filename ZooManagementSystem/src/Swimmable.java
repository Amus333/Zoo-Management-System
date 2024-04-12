public interface Swimmable {
    public default void swim() {
        System.out.println("This animal is now swimming...");
    }

}
