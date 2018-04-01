public class Api {

    public static void main(String[] args) {
        HidingArea area1 = new HidingArea(-1, -1, 10, 10);
        HidingArea area2 = new HidingArea(-1, 0, 3, 9);

        AreaCalculator calc = new AreaCalculator();
        long commonArea = calc.handleCommonArea(area1, area2);

        System.out.println(commonArea);

    }
}
