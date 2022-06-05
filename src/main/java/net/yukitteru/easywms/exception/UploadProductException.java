package net.yukitteru.easywms.exception;

public class UploadProductException extends RuntimeException {
    public UploadProductException(String errorMessage) {
        super(errorMessage);
    }

    public UploadProductException(String errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }
}
