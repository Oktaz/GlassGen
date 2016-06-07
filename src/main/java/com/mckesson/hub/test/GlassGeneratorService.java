package com.mckesson.hub.test;


public class GlassGeneratorService implements GlassGenerator {


    public String generateMartini(int size) throws GlassGeneratorException {
        if (size < 1) {
            throw new GlassGeneratorException("Size must be 1 or greater");
        }

        Glass glass = new Martini(size);
        return glass.generateGlass();
    }

    public String generateBeer(int size) throws GlassGeneratorException {
        if (size < 1) {
            throw new GlassGeneratorException("Size must be 1 or greater");
        }

        Glass glass = new Beer(size);
        return glass.generateGlass();
    }
}