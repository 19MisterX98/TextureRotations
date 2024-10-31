package texture;

public class Vanilla21_1Textures implements TextureProvider {

    @Override
    public int getTexture(int x, int y, int z, int mod) {
        int rand = random(TextureProvider.getCoordinateRandom(x, y, z));
        return Math.abs(rand) % mod;
    }

    int random(long seed) {
        seed = (seed ^ multiplier) & mask;
        //nextlong combine 2
        return (int)((seed * 0xBB20B4600A69L + 0x40942DE6BAL) >>> 16);
    }
}
