package texture;

public interface TextureProvider {

    long multiplier = 0x5DEECE66DL;
    long mask = (1L << 48) - 1;

    private static long getCoordRandom(int x, int y, int z) {
        long l = (long)(x * 3129871) ^ (long)z * 116129781L ^ (long)y;
        l = l * l * 42317861L + l * 11L;
        return l;
    }

    static int getCoordinateRandomLegacy(int x, int y, int z) {
        return (int)getCoordRandom(x, y, z) >> 16;
    }

    static long getCoordinateRandom(int x, int y, int z) {
        return getCoordRandom(x, y, z) >> 16;
    }



    int getTexture(int x, int y, int z, int mod);
}
