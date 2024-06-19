package texture;

public interface TextureProvider {

    static long getCoordinateRandom(int x, int y, int z) {
        long l = (long)(x * 3129871) ^ (long)z * 116129781L ^ (long)y;
        l = l * l * 42317861L + l * 11L;
        return l;
    }



    int getTexture(int x, int y, int z, int mod);
}
