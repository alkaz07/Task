public class Running implements IMove{
    @Override
    public void move(int distance) {
        System.out.println("run for "+distance+" meters");
    }
}
