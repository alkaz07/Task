public class Crocodile extends Animal{
    String name;
    private IMove moveMethod;

    public void setMoveMethod(IMove moveMethod) {
        this.moveMethod = moveMethod;
    }

    public Crocodile(String name) {
        this.name = name;
    }

    @Override
    public void move(int distance) {
        System.out.println(name);
        moveMethod.move(distance);
    }
}
