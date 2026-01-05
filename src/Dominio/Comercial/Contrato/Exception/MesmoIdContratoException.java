package Dominio.Comercial.Contrato.Exception;

public class MesmoIdContratoException extends ContratoException {
    public MesmoIdContratoException() {
        super("O ID DEVE SER DIFERENTE DO ATUAL");
    }
}
