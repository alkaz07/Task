public class Jumping implements IMove{

    int jLength;

    public Jumping(int jLength) {
        this.jLength = jLength;
    }

    @Override
    public void move(int distance) {
        int k = distance/jLength;
        for (int i = 0; i < k; i++) {
            System.out.println("прыг на "+jLength+" метров");
        }
        System.out.println("прыг на "+distance%jLength+" метров");
    }
}
