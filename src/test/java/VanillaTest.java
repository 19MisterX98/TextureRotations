import texture.TextureProvider;
import texture.VanillaTextures;

public class VanillaTest {
    public static void main(String[] args) {
        TextureProvider vanilla = new VanillaTextures();
        if (vanilla.getTexture(-1,0,-1, 4) != 0) System.out.println("fail at -1 0 -1");
        if (vanilla.getTexture( 0,0,-1, 4) != 3) System.out.println("fail at 0 0 -1");
        if (vanilla.getTexture( 1,0,-1, 4) != 3) System.out.println("fail at 1 0 -1");
        if (vanilla.getTexture(-2,0, 0, 4) != 3) System.out.println("fail at -2 0 0");
        if (vanilla.getTexture(-1,0, 0, 4) != 0) System.out.println("fail at -1 0 0");
        if (vanilla.getTexture( 0,0, 0, 4) != 2) System.out.println("fail at 0 0 0");
        if (vanilla.getTexture( 1,0, 0, 4) != 0) System.out.println("fail at 1 0 0");
        if (vanilla.getTexture(-1,0, 1, 4) != 3) System.out.println("fail at -1 0 1");
        if (vanilla.getTexture( 0,0, 1, 4) != 1) System.out.println("fail at 0 0 1");
        if (vanilla.getTexture( 1,0, 1, 4) != 0) System.out.println("fail at 1 0 1");

        if (vanilla.getTexture(-538, 67, -575, 2) != 1) System.out.println("fail at -538 67 -575");
        if (vanilla.getTexture(-537, 67, -575, 2) != 1) System.out.println("fail at -537 67 -575");
        if (vanilla.getTexture(-536, 67, -575, 2) != 0) System.out.println("fail at -536 67 -575");
        if (vanilla.getTexture(-535, 67, -575, 2) != 0) System.out.println("fail at -535 67 -575");
        if (vanilla.getTexture(-534, 67, -575, 2) != 1) System.out.println("fail at -534 67 -575");
        if (vanilla.getTexture(-533, 67, -575, 2) != 0) System.out.println("fail at -533 67 -575");
        if (vanilla.getTexture(-532, 67, -575, 2) != 0) System.out.println("fail at -532 67 -575");
        if (vanilla.getTexture(-531, 67, -575, 2) != 1) System.out.println("fail at -531 67 -575");
        if (vanilla.getTexture(-527, 67, -575, 2) != 1) System.out.println("fail at -527 67 -575");
    }
}