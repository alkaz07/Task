public class Cat {
    String name;
    IMove moveMethod;

    public void setMoveMethod(IMove moveMethod) {
        this.moveMethod = moveMethod;
    }

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{"  + name +   '}';
    }
}
