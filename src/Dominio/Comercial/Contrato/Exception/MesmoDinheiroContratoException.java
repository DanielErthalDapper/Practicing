package Dominio.Comercial.Contrato.Exception;

public class MesmoDinheiroContratoException extends RuntimeException {
    public MesmoDinheiroContratoException() {
        super("O DINHEIRO DEVE SER DIFERENTE DO ATUAL");
    }
}
