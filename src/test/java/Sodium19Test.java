import texture.Sodium19Textures;
import texture.TextureProvider;

public class Sodium19Test {
    public static void main(String[] args) {
        TextureProvider sodium19 = new Sodium19Textures();
        if (sodium19.getTexture(0,-61,0, 4) != 1) System.out.println("fail at 0 -61 0");
        if (sodium19.getTexture(1,-61,0, 4) != 1) System.out.println("fail at 1 -61 0");
        if (sodium19.getTexture(2,-61,0, 4) != 0) System.out.println("fail at 2 -61 0");
        if (sodium19.getTexture(3,-61,0, 4) != 2) System.out.println("fail at 3 -61 0");
        if (sodium19.getTexture(4,-61,0, 4) != 0) System.out.println("fail at 4 -61 0");
        if (sodium19.getTexture(5,-61,0, 4) != 3) System.out.println("fail at 5 -61 0");
        if (sodium19.getTexture(6,-61,0, 4) != 1) System.out.println("fail at 6 -61 0");
        if (sodium19.getTexture(7,-61,0, 4) != 2) System.out.println("fail at 7 -61 0");
        if (sodium19.getTexture(8,-61,0, 4) != 2) System.out.println("fail at 8 -61 0");
        if (sodium19.getTexture(9,-61,0, 4) != 1) System.out.println("fail at 9 -61 0");
    }
}