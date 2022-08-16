package texture;

public class Sodium19Textures extends SodiumTextures {

    @Override
    int random(long seed) {
        long l = seed ^ 7640891576956012809L;
        long m = l + -7046029254386353131L;

        l = staffordMix13(l); //lo
        m = staffordMix13(m); //hi

        return (int)(Long.rotateLeft(l + m, 17) + l);
    }
}
