package texture;

public class SodiumTextures extends Sodium19Textures {

    private static final long PHI = 0x9E3779B97F4A7C15L;

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
