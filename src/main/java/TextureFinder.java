import texture.TextureProvider;
import texture.VanillaTextures;

import java.util.ArrayList;
import java.util.List;


public class TextureFinder extends Thread {

    public static final ArrayList<RotationInfo> formation = new ArrayList<>();
    private static final List<RotationInfo> topsAndBottoms = new ArrayList<>();
    private static final List<RotationInfo> sides = new ArrayList<>();

    //search parameters are in the Main class

    static {
        formation.add(new RotationInfo(1, 0, 0, 1, true));
        formation.add(new RotationInfo(1, 1, 0, 1, true));
        formation.add(new RotationInfo(1, 2, 0, 1, true));
        formation.add(new RotationInfo(1, 3, 0, 0, true));
        formation.add(new RotationInfo(1, 4, 0, 0, true));
        formation.add(new RotationInfo(1, 5, 0, 1, true));
        formation.add(new RotationInfo(2, 0, 0, 1, true));
        formation.add(new RotationInfo(2, 1, 0, 1, true));
        formation.add(new RotationInfo(2, 2, 0, 0, true));
        formation.add(new RotationInfo(2, 3, 0, 0, true));
        formation.add(new RotationInfo(2, 4, 0, 0, true));
        formation.add(new RotationInfo(2, 5, 0, 1, true));
        formation.add(new RotationInfo(3, 0, 0, 1, true));
        formation.add(new RotationInfo(3, 3, 0, 1, true));
        formation.add(new RotationInfo(3, 4, 0, 1, true));
        formation.add(new RotationInfo(3, 5, 0, 1, true));
        formation.add(new RotationInfo(6, 0, 0, 1, true));
        formation.add(new RotationInfo(7, 1, 0, 1, true));
        formation.add(new RotationInfo(7, 2, 0, 0, true));
        formation.add(new RotationInfo(7, 3, 0, 0, true));
        formation.add(new RotationInfo(7, 4, 0, 0, true));
        formation.add(new RotationInfo(7, 5, 0, 0, true));
        formation.add(new RotationInfo(8, 1, 0, 0, true));
        formation.add(new RotationInfo(8, 2, 0, 0, true));
        formation.add(new RotationInfo(8, 3, 0, 0, true));
        formation.add(new RotationInfo(8, 4, 0, 1, true));
        formation.add(new RotationInfo(8, 5, 0, 0, true));
        formation.add(new RotationInfo(9, 0, 0, 0, true));
        formation.add(new RotationInfo(9, 1, 0, 1, true));
        formation.add(new RotationInfo(9, 2, 0, 0, true));
        formation.add(new RotationInfo(9, 3, 0, 1, true));
        formation.add(new RotationInfo(9, 4, 0, 0, true));
        formation.add(new RotationInfo(9, 5, 0, 1, true));

        for (RotationInfo info : formation) {
            if(info.isSide) {
                sides.add(info);
            } else {
                topsAndBottoms.add(info);
            }
        }
    }

    private final int startX;
    private final int endX;
    private final TextureProvider textureProvider;

    TextureFinder(int startX, int endX, TextureProvider textureProvider) {
        this.startX = startX;
        this.endX = endX;
        this.textureProvider = textureProvider;
    }

    public void run() {
        long first=System.currentTimeMillis();

        for(int x = startX; x <= endX; x++) {
            for (int z = Main.zMin; z <= Main.zMax; z++) {
                nextAttempt:
                for (int y = Main.yMin; y <= Main.yMax; y++) {
                    for (RotationInfo b : topsAndBottoms) {
                        if(b.rotation != textureProvider.getTexture(x + b.x, y+b.y, z+b.z, 4)) {
                            continue nextAttempt;
                        }
                    }
                    for (RotationInfo b : sides) {
                        if(b.rotation != textureProvider.getTexture(x + b.x, y+b.y, z+b.z, 2)) {
                            continue nextAttempt;
                        }
                    }

                    System.out.println("X: " + x + " Y: " + y + " Z: " + z);
                }
            }
        }
        System.out.println(((System.currentTimeMillis()-first)/1000) + " seconds");
    }
}
