package texture;

public class VanillaTextures extends TextureProvider {

    private static final long multiplier = 0x5DEECE66DL;
    private static final long mask = (1L << 48) - 1;

    @Override
    int random(long seed) {
        seed = (seed ^ multiplier) & mask;
        //nextlong combine 2
        return (int)((seed * 0xBB20B4600A69L + 0x40942DE6BAL) >>> 16);
    }
}
