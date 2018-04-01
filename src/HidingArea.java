public class HidingArea {

    private int bottomX;
    private int bottomY;
    private int topX;
    private int topY;

    public HidingArea(int bottomX, int bottomY, int topX, int topY) {
        this.bottomX = bottomX;
        this.bottomY = bottomY;
        this.topX = topX;
        this.topY = topY;
    }

    public int getBottomX() {
        return bottomX;
    }

    public int getBottomY() {
        return bottomY;
    }

    public int getTopX() {
        return topX;
    }

    public int getTopY() {
        return topY;
    }
}
