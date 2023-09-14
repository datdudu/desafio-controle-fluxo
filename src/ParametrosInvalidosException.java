
public class ParametrosInvalidosException extends Exception{
    public ParametrosInvalidosException() {
        super("Parâmetros inseridos inválidos");
    }

    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
