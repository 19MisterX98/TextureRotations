import texture.TextureProvider;
import texture.Vanilla12Textures;

public class Vanilla12Test {
    public static void main(String[] args) {
        TextureProvider vanilla = new Vanilla12Textures();
        if (vanilla.getTexture(0, 4, 0, 4) != 3) System.out.println("fail at 0 4 0");
        if (vanilla.getTexture(0, 4, 1, 4) != 2) System.out.println("fail at 0 4 1");
        if (vanilla.getTexture(0, 4, 2, 4) != 3) System.out.println("fail at 0 4 2");
        if (vanilla.getTexture(0, 4, 3, 4) != 3) System.out.println("fail at 0 4 3");
        if (vanilla.getTexture(0, 4, 4, 4) != 3) System.out.println("fail at 0 4 3");
    }
}
