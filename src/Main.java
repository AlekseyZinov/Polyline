public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1,3);
        Point point2 = new Point(4, 8);
        Point point3 = new Point(5, 9);
        Point point4 = new Point(3, 6);

        PolyLine polyLine = new PolyLine(point1, point2, point3, point4);
        ClosedPolyLine closedPolyLine = new ClosedPolyLine(point1, point2, point3, point4, point1);

        System.out.println(polyLine);
        System.out.println(polyLine.length());
        System.out.println(closedPolyLine);
        System.out.println(closedPolyLine.length());
    }
}
