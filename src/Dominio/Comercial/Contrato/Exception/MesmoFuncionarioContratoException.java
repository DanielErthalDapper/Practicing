package Dominio.Comercial.Contrato.Exception;

public class MesmoFuncionarioContratoException extends RuntimeException {
    public MesmoFuncionarioContratoException() {
        super("O FUNCIONARIO DEVE SER DIFERENTE DO ATUAL");
    }
}
