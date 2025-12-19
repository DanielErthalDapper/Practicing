package Dominio.Funcionario.Nucleo.Exceptions;

public class MesmoTipoContratoException extends MesmoDadoFuncionarioException {
    public MesmoTipoContratoException() {
        super("O TIPO DE CONTRATO DEVE SER DIFERENTE DO ATUAL");
    }
}
