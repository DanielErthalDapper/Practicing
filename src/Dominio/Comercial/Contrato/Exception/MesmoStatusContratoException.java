package Dominio.Comercial.Contrato.Exception;

public class MesmoStatusContratoException extends RuntimeException {
    public MesmoStatusContratoException() {
        super("O STATUS DO CONTRATO DEVE SER DIFERENTE DO ATUAL");
    }
}
