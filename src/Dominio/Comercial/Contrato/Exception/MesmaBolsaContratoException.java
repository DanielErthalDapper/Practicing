package Dominio.Comercial.Contrato.Exception;

public class MesmaBolsaContratoException extends RuntimeException {
    public MesmaBolsaContratoException() {
        super("A BOLSA DEVE SER DIFERENTE DA ATUAL");
    }
}
