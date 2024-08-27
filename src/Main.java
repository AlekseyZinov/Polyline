public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1, 3);
        Point point2 = new Point(4, 8);
        Point point3 = new Point(5, 9);
        Point point4 = new Point(3, 6);

        Line line = new Line(point1, point2);
        PolyLine polyLine = new PolyLine(point1, point2, point3, point4);
        ClosedPolyLine closedPolyLine = new ClosedPolyLine(point1, point2, point3, point4, point1);

        System.out.println(line);
        System.out.println(getLength(line));
        System.out.println(polyLine);
        System.out.println(getLength(polyLine));
        System.out.println(closedPolyLine);
        System.out.println(getLength(closedPolyLine));

    }

    public static double getLength (Measurable mes) {
        return mes.getLength();
    }
}
