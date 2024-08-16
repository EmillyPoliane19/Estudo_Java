package faculdade.estruturadedados.exceptions;

public class StackEmptyException extends RuntimeException{
    public StackEmptyException(String erro) {
        super(erro);
    }
}
