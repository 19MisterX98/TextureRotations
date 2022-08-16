import texture.TextureProvider;
import texture.VanillaTextures;

public class VanillaTest {
    public static void main(String[] args) {
        TextureProvider vanilla = new VanillaTextures();
        if (vanilla.getTexture(-1,0,-1, 4) != 0) System.out.println("fail at -1 0 -1");
        if (vanilla.getTexture( 0,0,-1, 4) != 1) System.out.println("fail at 0 0 -1");
        if (vanilla.getTexture( 1,0,-1, 4) != 0) System.out.println("fail at 1 0 -1");
        if (vanilla.getTexture(-2,0, 0, 4) != 2) System.out.println("fail at -2 0 0");
        if (vanilla.getTexture(-1,0, 0, 4) != 0) System.out.println("fail at -1 0 0");
        if (vanilla.getTexture( 0,0, 0, 4) != 0) System.out.println("fail at 0 0 0");
        if (vanilla.getTexture( 1,0, 0, 4) != 1) System.out.println("fail at 1 0 0");
        if (vanilla.getTexture(-1,0, 1, 4) != 0) System.out.println("fail at -1 0 1");
        if (vanilla.getTexture( 0,0, 1, 4) != 3) System.out.println("fail at 0 0 1");
        if (vanilla.getTexture( 1,0, 1, 4) != 0) System.out.println("fail at 1 0 1");


        if (vanilla.getTexture(-6,0,0, 2) != 1) System.out.println("fail at -6 0 0");
        if (vanilla.getTexture(-5,0,0, 2) != 0) System.out.println("fail at -5 0 0");
        if (vanilla.getTexture(-4,0,0, 2) != 1) System.out.println("fail at -4 0 0");
        if (vanilla.getTexture(-3,0,0, 2) != 1) System.out.println("fail at -3 0 0");
        if (vanilla.getTexture(-2,0,0, 2) != 0) System.out.println("fail at -2 0 0");
        if (vanilla.getTexture(-1,0,0, 2) != 0) System.out.println("fail at -1 0 0");
        if (vanilla.getTexture( 0,0,0, 2) != 0) System.out.println("fail at  0 0 0");
        if (vanilla.getTexture( 1,0,0, 2) != 1) System.out.println("fail at  1 0 0");
        if (vanilla.getTexture( 2,0,0, 2) != 0) System.out.println("fail at  2 0 0");
        if (vanilla.getTexture( 3,0,0, 2) != 0) System.out.println("fail at  3 0 0");
        if (vanilla.getTexture( 4,0,0, 2) != 1) System.out.println("fail at  4 0 0");
        if (vanilla.getTexture( 5,0,0, 2) != 1) System.out.println("fail at  5 0 0");
        if (vanilla.getTexture( 6,0,0, 2) != 0) System.out.println("fail at  6 0 0");
        if (vanilla.getTexture( 7,0,0, 2) != 1) System.out.println("fail at  7 0 0");
        if (vanilla.getTexture( 8,0,0, 2) != 0) System.out.println("fail at  8 0 0");
    }
}
