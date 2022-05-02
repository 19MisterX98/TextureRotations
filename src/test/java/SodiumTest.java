public class SodiumTest {
    public static void main(String[] args) {
        if (TextureFinder.getTextureTopSodium( 0,-56,0) != 3) System.out.println("fail at  0 -56 0");
        if (TextureFinder.getTextureTopSodium( 1,-56,0) != 3) System.out.println("fail at  1 -56 0");
        if (TextureFinder.getTextureTopSodium( 2,-56,0) != 3) System.out.println("fail at  2 -56 0");
        if (TextureFinder.getTextureTopSodium( 3,-56,0) != 3) System.out.println("fail at  3 -56 0");
        if (TextureFinder.getTextureTopSodium( 4,-56,0) != 1) System.out.println("fail at  4 -56 0");
        if (TextureFinder.getTextureTopSodium( 5,-56,0) != 3) System.out.println("fail at  5 -56 0");
        if (TextureFinder.getTextureTopSodium( 6,-56,0) != 0) System.out.println("fail at  6 -56 0");
        if (TextureFinder.getTextureTopSodium( 7,-56,0) != 2) System.out.println("fail at  7 -56 0");
        if (TextureFinder.getTextureTopSodium( 8,-56,0) != 0) System.out.println("fail at  8 -56 0");
        if (TextureFinder.getTextureTopSodium( 9,-56,0) != 3) System.out.println("fail at  9 -56 0");
        if (TextureFinder.getTextureTopSodium(10,-56,0) != 1) System.out.println("fail at 10 -56 0");
        if (TextureFinder.getTextureTopSodium(11,-56,0) != 1) System.out.println("fail at 11 -56 0");
        if (TextureFinder.getTextureTopSodium(12,-56,0) != 3) System.out.println("fail at 12 -56 0");
        if (TextureFinder.getTextureTopSodium(13,-56,0) != 3) System.out.println("fail at 13 -56 0");


        if (TextureFinder.getTextureSideSodium( 0,-56,1) != 1) System.out.println("fail at  0 -56 1");
        if (TextureFinder.getTextureSideSodium( 1,-56,1) != 1) System.out.println("fail at  1 -56 1");
        if (TextureFinder.getTextureSideSodium( 2,-56,1) != 1) System.out.println("fail at  2 -56 1");
        if (TextureFinder.getTextureSideSodium( 3,-56,1) != 0) System.out.println("fail at  3 -56 1");
        if (TextureFinder.getTextureSideSodium( 4,-56,1) != 0) System.out.println("fail at  4 -56 1");
        if (TextureFinder.getTextureSideSodium( 5,-56,1) != 0) System.out.println("fail at  5 -56 1");
        if (TextureFinder.getTextureSideSodium( 6,-56,1) != 1) System.out.println("fail at  6 -56 1");
        if (TextureFinder.getTextureSideSodium( 7,-56,1) != 1) System.out.println("fail at  7 -56 1");
        if (TextureFinder.getTextureSideSodium( 8,-56,1) != 1) System.out.println("fail at  8 -56 1");
        if (TextureFinder.getTextureSideSodium( 9,-56,1) != 0) System.out.println("fail at  9 -56 1");
        if (TextureFinder.getTextureSideSodium(10,-56,1) != 1) System.out.println("fail at 10 -56 1");
        if (TextureFinder.getTextureSideSodium(11,-56,1) != 1) System.out.println("fail at 11 -56 1");
        if (TextureFinder.getTextureSideSodium(12,-56,1) != 1) System.out.println("fail at 12 -56 1");
        if (TextureFinder.getTextureSideSodium(13,-56,1) != 1) System.out.println("fail at 13 -56 1");

    }
}
