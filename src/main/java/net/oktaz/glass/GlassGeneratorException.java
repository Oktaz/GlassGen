package net.oktaz.glass;


public class GlassGeneratorException extends Exception {

    public GlassGeneratorException() {
        super();
    }

    public GlassGeneratorException(String message) {
        super(message);
    }

    public GlassGeneratorException(String message, Throwable cause) {
        super(message, cause);
    }

    public GlassGeneratorException(Throwable cause) {
        super(cause);
    }

    protected GlassGeneratorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
