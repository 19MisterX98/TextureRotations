public class RotationInfo {

    public final int x;
    public final int y;
    public final int z;
    public final int rotation;
    public final boolean isSide;

    RotationInfo(int x, int y, int z, int rotation, boolean isSide) {
        this.x = x;
        this.y = y;
        this.z = z;
        if(isSide) {
            this.rotation = rotation%2;
        } else {
            this.rotation = rotation;
        }
        this.isSide = isSide;
    }
}
