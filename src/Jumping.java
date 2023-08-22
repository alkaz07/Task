public class Jumping implements IMove{

    int jumpLength;

    public Jumping(int jLength) {
        this.jumpLength = jLength;
    }

    @Override
    public void move(int distance) {
        int k = distance/ jumpLength;
        for (int i = 0; i < k; i++) {
            System.out.println("jump for "+ jumpLength +" meters");
        }
        System.out.println("jump for "+distance% jumpLength +" meters");
    }
}
