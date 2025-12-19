package Dominio.Funcionario.Nucleo.Exceptions;

public class MesmoSalarioException extends MesmoDadoFuncionarioException {
    public MesmoSalarioException() {
        super("O SALÁRIO DEVE SER DIFERENTE DO ATUAL");
    }
}
