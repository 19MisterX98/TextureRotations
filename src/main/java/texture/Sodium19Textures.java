package texture;

public class Sodium19Textures extends Vanilla21_1Textures {

    protected static long staffordMix13(long z) {
        z = (z ^ (z >>> 30)) * 0xBF58476D1CE4E5B9L;
        z = (z ^ (z >>> 27)) * 0x94D049BB133111EBL;

        return z ^ (z >>> 31);
    }

    @Override
    int random(long seed) {
        long l = seed ^ 7640891576956012809L;
        long m = l + -7046029254386353131L;

        l = staffordMix13(l); //lo
        m = staffordMix13(m); //hi

        return (int)(Long.rotateLeft(l + m, 17) + l);
    }
}
