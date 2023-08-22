public class Crawling implements IMove{
    @Override
    public void move(int distance) {
        System.out.println("crawls for "+distance*100+" centimeters");
    }
}
