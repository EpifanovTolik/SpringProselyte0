package net.proselyte.javaconfig;

public class Message {
    private String message;

    /**
     * Getter and Setter methods
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * toString method
     */
    @Override
    public String toString() {
        return "Message: " + this.message;
    }
}
