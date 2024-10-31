package texture;

public class VanillaTextures implements TextureProvider {

    @Override
    public int getTexture(int x, int y, int z, int mod) {
        long seed = TextureProvider.getCoordinateRandom(x, y, z);
        seed = (seed ^ multiplier);
        // nextInt(mod)
        seed = seed * multiplier + 11L & mask;
        int next = (int)(seed >> 48 - 31);
        return (int) ((mod * (long)next) >> 31);
    }
}