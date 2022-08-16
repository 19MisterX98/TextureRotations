package texture;

public class SodiumTextures extends TextureProvider {

    private static final long PHI = 0x9E3779B97F4A7C15L;

    protected static long staffordMix13(long z) {
        z = (z ^ (z >>> 30)) * 0xBF58476D1CE4E5B9L;
        z = (z ^ (z >>> 27)) * 0x94D049BB133111EBL;

        return z ^ (z >>> 31);
    }

    @Override
    int random(long seed) {
        seed ^= seed >>> 33;
        seed *= 0xff51afd7ed558ccdL;
        seed ^= seed >>> 33;
        seed *= 0xc4ceb9fe1a85ec53L;
        seed ^= seed >>> 33;

        long rand1 = staffordMix13(seed += PHI);
        long rand2 = staffordMix13(seed + PHI);

        return (int)(rand1+rand2);
    }
}
