package com.mckesson.hub.test;


public class Beer implements Glass {

    private int size;

    public Beer(int size) {
        this.size = size;
    }

    public String generateGlass() {

        StringBuilder glassBuilder = new StringBuilder();
        glassBuilder.append(buildTop() + "\n");
        glassBuilder.append(buildBody(size));
        glassBuilder.append(buildBottom(size));

        return glassBuilder.toString();
    }

    private String buildBottom(int size) {
        StringBuilder bottomBuilder = new StringBuilder("|");
        for (int x = 0; x < size; x++) {
            bottomBuilder.append("_");
        }
        bottomBuilder.append("|");

        return bottomBuilder.toString();
    }

    private String buildBody(int bodySize) {

        if (bodySize <= 1) {
            return "";
        }

        StringBuilder bodyBuilder = new StringBuilder("|");
        for (int x = 0; x < size; x++) {
            bodyBuilder.append(" ");
        }
        bodyBuilder.append("|\n");

        bodyBuilder.append(buildBody(bodySize - 1));

        return bodyBuilder.toString();
    }

    public String buildTop() {
        StringBuilder builder = new StringBuilder(" ");

        for (int x = 0; x < size; x++) {
            builder.append("_");
        }

        return builder.toString();
    }
}
