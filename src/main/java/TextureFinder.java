import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class TextureFinder extends Thread {

    private static final ArrayList<RotationInfo> formation = new ArrayList<>();
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

    private static final long multiplier = 0x5DEECE66DL;
    private static final long addend = 0xBL;
    private static final long mask = (1L << 48) - 1;


    TextureFinder(int startX, int endX) {
        this.startX = startX;
        this.endX = endX;
    }

    public static int getTextureSide(int x, int y, int z) {
        //inicial scramble
        long seed = getCoordinateRandom(x, y, z);
        seed = (seed ^ multiplier) & mask;
        //nextlong combine 2 and mod 2
        return (int)((seed * 0xBB20B4600A69L + 0x40942DE6BAL) >>> 16) & 1;
    }

    public static int getTextureTop(int x, int y, int z) {
        //inicial scramble
        long seed = getCoordinateRandom(x, y, z);
        seed = (seed ^ multiplier) & mask;
        //nextlong combine 2 and mod 4
        return (int)((seed * 0xBB20B4600A69L + 0x40942DE6BAL) >>> 16) & 2;
    }

    private static final long PHI = 0x9E3779B97F4A7C15L;

    public static long getCoordinateRandom(int x, int y, int z) {
        long l = (long)(x * 3129871) ^ (long)z * 116129781L ^ (long)y;
        l = l * l * 42317861L + l * 11L;
        return l >> 16;
    }

    public static int getTextureTopSodium(int x, int y, int z) {
        return Math.abs((int)sodiumRandom(getCoordinateRandom(x, y, z))) % 4;
    }

    public static int getTextureSideSodium(int x, int y, int z) {
        return Math.abs((int)sodiumRandom(getCoordinateRandom(x, y, z))) % 2;
    }

    public static long sodiumRandom(long seed) {
        seed ^= seed >>> 33;
        seed *= 0xff51afd7ed558ccdL;
        seed ^= seed >>> 33;
        seed *= 0xc4ceb9fe1a85ec53L;
        seed ^= seed >>> 33;

        long rand1 = staffordMix13(seed += PHI);
        long rand2 = staffordMix13(seed + PHI);

        return rand1+rand2;
    }

    private static long staffordMix13(long z) {
        z = (z ^ (z >>> 30)) * 0xBF58476D1CE4E5B9L;
        z = (z ^ (z >>> 27)) * 0x94D049BB133111EBL;

        return z ^ (z >>> 31);
    }

    public void run() {
        long first=System.currentTimeMillis();

        for(int x = startX; x <= endX; x++)
            for(int z = Main.zMin; z <= Main.zMax; z++)
                nextAttempt:
                for(int y = Main.yMin; y <= Main.yMax; y++)
                {
                    for(RotationInfo b : topsAndBottoms)
                    {
                        //switch comments for sodium texture rotations
                        if(b.rotation!=getTextureTop(x + b.x, y+b.y, z+b.z)) {
                            continue nextAttempt;
                        }
                        //if(b.rotation!=getTextureTopSodium(x + b.x, y+b.y, z+b.z)) {
                        //    continue nextAttempt;
                        //}
                    }
                    for(RotationInfo b : sides)
                    {
                        if(b.rotation!=getTextureSide(x + b.x, y+b.y, z+b.z)) {
                            continue nextAttempt;
                        }
                        //if(b.rotation!=getTextureSideSodium(x + b.x, y+b.y, z+b.z)) {
                        //    continue nextAttempt;
                        //}
                    }

                    System.out.println("X: "+x+ " Y: "+y+ " Z: "+z);
                }


        System.out.println(((System.currentTimeMillis()-first)/1000) + " seconds");
    }
}
