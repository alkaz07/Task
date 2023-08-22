public class Main {
    public static void main(String[] args) {
        exemple1Cats();
        exemple2Croc();
    }

    private static void exemple2Croc() {
        Crocodile gena = new Crocodile("Гена");
        gena.setMoveMethod(new Jumping(1));
        gena.move(12);
        gena.setMoveMethod(new Running());
        gena.move(13);
    }

    private static void exemple1Cats() {
        Cat x = new Cat("Васька");
        x.setMoveMethod(new Running());
        x.move(15);
        Cat y = new Cat("Барсик");
        y.setMoveMethod(new Running());
        y.move(12);
        y.setMoveMethod(new Jumping(5));
        y.move(17);
        y.setMoveMethod(new Crawling());
        y.move(5);
        y.setMoveMethod(a -> System.out.println("I'm laying. Don't want to move."));
        y.move(120);

        Cat z = new Cat("Zero");
        z.setMoveMethod(len->{
            if(len > 20)
            {
                //System.out.println("разбег 8");
                z.setMoveMethod(new Running());
                z.move(8);
                System.out.println("летим "+(len-20));
                //System.out.println("пробег 12");
                z.setMoveMethod(new Running());
                z.move(12);
            }
            else {
                z.setMoveMethod(new Running());
                z.move(len);
            }
        });
        z.move(14);
    }
}