package Dominio.Funcionario.Professor.Exceptions;

public class MesmoIdiomaException extends ProfessorException {
    public MesmoIdiomaException() {
        super("O IDIOMA DEVE SER DIFERENTE DO ATUAL");
    }
}
