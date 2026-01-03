package Dominio.Funcionario.Professor.Exceptions;

public class MesmoNivelException extends ProfessorException {
    public MesmoNivelException() {
        super("O NÍVEL DEVE SER DIFERENTE DO ATUAL");
    }
}
