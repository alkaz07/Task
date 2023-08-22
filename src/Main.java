public class Main {
    public static void main(String[] args) {
        Cat x = new Cat("Васька");
        x.setMoveMethod(new Running());
        x.move(15);
        Cat y = new Cat("Барсик");
        y.setMoveMethod(new Running());
        y.move(12);
        y.setMoveMethod(new Jumping(5));
        y.move(17);
    }
}