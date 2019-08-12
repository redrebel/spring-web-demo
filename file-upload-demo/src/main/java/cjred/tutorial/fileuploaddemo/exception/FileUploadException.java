package cjred.tutorial.fileuploaddemo.exception;

public class FileUploadException extends RuntimeException {
    public FileUploadException(String message) {
        super(message);
    }

    public FileUploadException(String message, Throwable caues) {
        super(message, caues);
    }
}
