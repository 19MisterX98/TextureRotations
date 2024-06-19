package texture;

public class Vanilla12Textures implements TextureProvider {

    @Override
    public int getTexture(int x, int y, int z, int mod) {
        int rand = (int)TextureProvider.getCoordinateRandom(x,y,z);
        return Math.abs(rand >> 16) % mod;
    }
}
