public class Main {
    public static void main(String[] args) {
        Square square1 = new Square();
        System.out.println(square1.render());
        Circle circle1 = new Circle();
        System.out.println(circle1.render());
        Shape square2 = new Square();
        System.out.println(square2.render());
        Shape circle2 = new Circle();
        System.out.println(circle2.render());

//        square1.render();
//        System.out.println(Colors.BLACK);
//        circle1.render();
//        System.out.println(" " +Colors.RED);
//        square2.render();
//        circle2.render();
    }
}