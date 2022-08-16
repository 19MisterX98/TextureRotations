package texture;

public abstract class TextureProvider {

    protected static long getCoordinateRandom(int x, int y, int z) {
        long l = (long)(x * 3129871) ^ (long)z * 116129781L ^ (long)y;
        l = l * l * 42317861L + l * 11L;
        return l >> 16;
    }

    public int getTexture(int x, int y, int z, int mod) {
        int rand = random(getCoordinateRandom(x, y, z));
        return Math.abs(rand) % mod;
    }

    abstract int random(long seed);
}
