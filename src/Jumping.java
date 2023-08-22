public class Jumping implements IMove{

    int jLength;

    public Jumping(int jLength) {
        this.jLength = jLength;
    }

    @Override
    public void move(int distance) {
        int k = distance/jLength;
        for (int i = 0; i < k; i++) {
            System.out.println("jump for "+jLength+" meters");
        }
        System.out.println("jump for "+distance%jLength+" meters");
    }
}
