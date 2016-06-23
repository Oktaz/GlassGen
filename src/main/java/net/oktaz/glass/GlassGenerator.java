package net.oktaz.glass;

/**
 * Created by Zatko on 1/26/16.
 */
public interface GlassGenerator {

    public String generateMartini(int size) throws GlassGeneratorException;

    public String generateBeer(int size) throws GlassGeneratorException;
}
