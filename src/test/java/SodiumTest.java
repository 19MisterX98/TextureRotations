import texture.SodiumTextures;
import texture.TextureProvider;

public class SodiumTest {
    public static void main(String[] args) {
        TextureProvider sodium = new SodiumTextures();
        if (sodium.getTexture( 0,-56,0, 4) != 3) System.out.println("fail at  0 -56 0");
        if (sodium.getTexture( 1,-56,0, 4) != 3) System.out.println("fail at  1 -56 0");
        if (sodium.getTexture( 2,-56,0, 4) != 3) System.out.println("fail at  2 -56 0");
        if (sodium.getTexture( 3,-56,0, 4) != 3) System.out.println("fail at  3 -56 0");
        if (sodium.getTexture( 4,-56,0, 4) != 1) System.out.println("fail at  4 -56 0");
        if (sodium.getTexture( 5,-56,0, 4) != 3) System.out.println("fail at  5 -56 0");
        if (sodium.getTexture( 6,-56,0, 4) != 0) System.out.println("fail at  6 -56 0");
        if (sodium.getTexture( 7,-56,0, 4) != 2) System.out.println("fail at  7 -56 0");
        if (sodium.getTexture( 8,-56,0, 4) != 0) System.out.println("fail at  8 -56 0");
        if (sodium.getTexture( 9,-56,0, 4) != 3) System.out.println("fail at  9 -56 0");
        if (sodium.getTexture(10,-56,0, 4) != 1) System.out.println("fail at 10 -56 0");
        if (sodium.getTexture(11,-56,0, 4) != 1) System.out.println("fail at 11 -56 0");
        if (sodium.getTexture(12,-56,0, 4) != 3) System.out.println("fail at 12 -56 0");
        if (sodium.getTexture(13,-56,0, 4) != 3) System.out.println("fail at 13 -56 0");


        if (sodium.getTexture( 0,-56,1, 2) != 1) System.out.println("fail at  0 -56 1");
        if (sodium.getTexture( 1,-56,1, 2) != 1) System.out.println("fail at  1 -56 1");
        if (sodium.getTexture( 2,-56,1, 2) != 1) System.out.println("fail at  2 -56 1");
        if (sodium.getTexture( 3,-56,1, 2) != 0) System.out.println("fail at  3 -56 1");
        if (sodium.getTexture( 4,-56,1, 2) != 0) System.out.println("fail at  4 -56 1");
        if (sodium.getTexture( 5,-56,1, 2) != 0) System.out.println("fail at  5 -56 1");
        if (sodium.getTexture( 6,-56,1, 2) != 1) System.out.println("fail at  6 -56 1");
        if (sodium.getTexture( 7,-56,1, 2) != 1) System.out.println("fail at  7 -56 1");
        if (sodium.getTexture( 8,-56,1, 2) != 1) System.out.println("fail at  8 -56 1");
        if (sodium.getTexture( 9,-56,1, 2) != 0) System.out.println("fail at  9 -56 1");
        if (sodium.getTexture(10,-56,1, 2) != 1) System.out.println("fail at 10 -56 1");
        if (sodium.getTexture(11,-56,1, 2) != 1) System.out.println("fail at 11 -56 1");
        if (sodium.getTexture(12,-56,1, 2) != 1) System.out.println("fail at 12 -56 1");
        if (sodium.getTexture(13,-56,1, 2) != 1) System.out.println("fail at 13 -56 1");
    }
}
