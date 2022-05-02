public class VanillaTest {
    public static void main(String[] args) {
        if (TextureFinder.getTextureTop(-1,0,-1) != 0) System.out.println("fail at -1 0 -1");
        if (TextureFinder.getTextureTop(0,0,-1) != 1) System.out.println("fail at 0 0 -1");
        if (TextureFinder.getTextureTop(1,0,-1) != 0) System.out.println("fail at 1 0 -1");
        if (TextureFinder.getTextureTop(-2,0,0) != 2) System.out.println("fail at -2 0 0");
        if (TextureFinder.getTextureTop(-1,0,0) != 0) System.out.println("fail at -1 0 0");
        if (TextureFinder.getTextureTop(0,0,0) != 0) System.out.println("fail at 0 0 0");
        if (TextureFinder.getTextureTop(1,0,0) != 1) System.out.println("fail at 1 0 0");
        if (TextureFinder.getTextureTop(-1,0,1) != 0) System.out.println("fail at -1 0 1");
        if (TextureFinder.getTextureTop(0,0,1) != 3) System.out.println("fail at 0 0 1");
        if (TextureFinder.getTextureTop(1,0,1) != 0) System.out.println("fail at 1 0 1");


        if (TextureFinder.getTextureSide(-6,0,0) != 1) System.out.println("fail at -6 0 0");
        if (TextureFinder.getTextureSide(-5,0,0) != 0) System.out.println("fail at -5 0 0");
        if (TextureFinder.getTextureSide(-4,0,0) != 1) System.out.println("fail at -4 0 0");
        if (TextureFinder.getTextureSide(-3,0,0) != 1) System.out.println("fail at -3 0 0");
        if (TextureFinder.getTextureSide(-2,0,0) != 0) System.out.println("fail at -2 0 0");
        if (TextureFinder.getTextureSide(-1,0,0) != 0) System.out.println("fail at -1 0 0");
        if (TextureFinder.getTextureSide( 0,0,0) != 0) System.out.println("fail at  0 0 0");
        if (TextureFinder.getTextureSide( 1,0,0) != 1) System.out.println("fail at  1 0 0");
        if (TextureFinder.getTextureSide( 2,0,0) != 0) System.out.println("fail at  2 0 0");
        if (TextureFinder.getTextureSide( 3,0,0) != 0) System.out.println("fail at  3 0 0");
        if (TextureFinder.getTextureSide( 4,0,0) != 1) System.out.println("fail at  4 0 0");
        if (TextureFinder.getTextureSide( 5,0,0) != 1) System.out.println("fail at  5 0 0");
        if (TextureFinder.getTextureSide( 6,0,0) != 0) System.out.println("fail at  6 0 0");
        if (TextureFinder.getTextureSide( 7,0,0) != 1) System.out.println("fail at  7 0 0");
        if (TextureFinder.getTextureSide( 8,0,0) != 0) System.out.println("fail at  8 0 0");

    }
}
