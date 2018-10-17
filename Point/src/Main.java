public class Main {
    public static void main(String[] args) {
        Point point = new Point(4,10);
        MoveablePoint moveablePoint = new MoveablePoint(7,9);

        System.out.println(point.toString());

        System.out.println(moveablePoint.toString());

        moveablePoint.move();
        System.out.println(moveablePoint.toString());
    }
}