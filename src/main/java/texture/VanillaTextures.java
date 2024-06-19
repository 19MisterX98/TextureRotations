package texture;

public class VanillaTextures implements TextureProvider {

    private static final long multiplier = 0x5DEECE66DL;
    private static final long mask = (1L << 48) - 1;

    @Override
    public int getTexture(int x, int y, int z, int mod) {
        int rand = random(TextureProvider.getCoordinateRandom(x, y, z) >> 16);
        return Math.abs(rand) % mod;
    }

    int random(long seed) {
        seed = (seed ^ multiplier) & mask;
        //nextlong combine 2
        return (int)((seed * 0xBB20B4600A69L + 0x40942DE6BAL) >>> 16);
    }
}
