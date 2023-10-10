package mediatheque;

public interface Visitor {
    String visit(Book book);
    String visit(CD cd);
}
