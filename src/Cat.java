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

    public void move(int d)
    {
        System.out.println(name);
        if(moveMethod!= null)
            moveMethod.move(d);
    }
}
