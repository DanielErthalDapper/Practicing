package Dominio.Comercial.Contrato.Exception;

public class MesmaDataContratoException extends RuntimeException {
    public MesmaDataContratoException() {
        super("A DATA DO CONTRATO DEVE SER DIFERENTE DA ATUAL");
    }
}
