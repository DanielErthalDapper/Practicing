package Dominio.Comercial.Contrato.Exception;

public class MesmoCursoException extends ContratoException {
    public MesmoCursoException() {
        super("O CURSO DEVE SER DIFERENTE DO ATUAL");
    }
}
