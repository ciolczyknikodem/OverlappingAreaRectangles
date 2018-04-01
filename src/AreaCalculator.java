import static java.lang.Math.abs;

public class AreaCalculator {

    public long handleCommonArea(HidingArea area1, HidingArea area2) {
        
        if (rectanglesHaveCommonArea(area1, area2)) {
            return calculateCommonArea(area1, area2);
        }

        return 0;
    }

    private boolean rectanglesHaveCommonArea(HidingArea area1, HidingArea area2) {

        if (
            area1.getBottomY() > area2.getTopY() ||
            area1.getTopY() < area2.getBottomY() ||
            area1.getBottomX() > area2.getTopX() ||
            area1.getTopX() < area2.getBottomX()
                ) {
            return false;
        }
        return true;
    }

    private long calculateCommonArea(HidingArea area1, HidingArea area2) {
        int left = Math.max(area1.getBottomX(), area2.getBottomX());
        int right = Math.max(Math.min(area1.getTopX(), area2.getTopX()), left);

        int bottom = Math.max(area1.getBottomY(), area2.getBottomY());
        int top = Math.max(Math.min(area1.getTopY(), area2.getTopY()), bottom);

        int sideA = abs(left) + abs(right);
        int sideB = abs(bottom) + abs(top);

        return sideA * sideB;
    }
}
