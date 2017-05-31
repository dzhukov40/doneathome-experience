package doneathome.restSecond.util;

/**
 * Created by dzhukov on 29.05.17.
 */
public class Status {

    private int code;
    private String message;
    private String description;
    private String stackTrace;


    public Status() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStackTrace() {
        return stackTrace;
    }

    public void setStackTrace(String stackTrace) {
        this.stackTrace = stackTrace;
    }

    @Override
    public String toString() {
        return "Status{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", description='" + description + '\'' +
                ", stackTrace='" + stackTrace + '\'' +
                '}';
    }
}
