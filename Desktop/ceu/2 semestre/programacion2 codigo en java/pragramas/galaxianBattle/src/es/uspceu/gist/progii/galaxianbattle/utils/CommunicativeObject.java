package es.uspceu.gist.progii.galaxianbattle.utils;

/**
 * A communicative object is an object capable of shout messages through the standard output (console).
 * An object can be assigned a color for its messages, so we can recognize which object is talking when it is
 * involved in a conversation.
 *
 * @author Sergio Saugar García <sergio.saugargarcia@ceu.es>
 */
public abstract class CommunicativeObject {

    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    private String TEXT_COLOR = "";

    /**
     * Sets the color used for its messages.
     *
     * @param color Must be one of the predefined constants in this class.
     */
    protected void setColor(String color) {
        this.TEXT_COLOR = color;
    }

    /**
     * Shouts a message through the standard output.
     *
     * @param message The message.
     */
    protected void say(String message) {
        System.out.println(colorize(message));
    }

    /**
     * Prints a debug message to standard output.
     *
     * @param message The message.
     */
    protected void debug(String message) {
        System.out.println(RED + message + RESET);
    }

    /**
     * Colorizes a message with the selected color for this object (by adding ANSI Codes to the
     * original message).
     *
     * @param message The message.
     *
     * @return A colorized message.
     */
    protected String colorize(String message) {
        return this.TEXT_COLOR + message + RESET;
    }
}
