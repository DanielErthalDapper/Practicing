package Dominio.Nucleo.Curso.Exception;

public class MesmaModalidadeException extends CursoException {
    public MesmaModalidadeException() {
        super("A MODALIDADE DEVE SER DIFERENTE DA ATUAL");
    }
}
