public class Main {



    public static final int xMin = -10000, xMax = 10000;
    public static final int zMin = -10000, zMax = 10000;
    public static final int yMin = 10    , yMax = 60;
    public static final int threads = 10;

    //goto TextureFinder class to configure rotations

    public static void main(String[] args) {

        int xtotal = xMax - xMin;
        int perX = xtotal/threads;

        for (int start = xMin; start < xMax; start+= perX+1) {
            TextureFinder a = new TextureFinder(start,start+perX);
            a.start();
        }

    }


}
