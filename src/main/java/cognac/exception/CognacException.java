package cognac.exception;

public class CognacException extends RuntimeException {
    public CognacException(String m) {
        super(m);
    }

    public CognacException(String m, ASTree t) {
        super(m + " " + t.location());
    }
}
