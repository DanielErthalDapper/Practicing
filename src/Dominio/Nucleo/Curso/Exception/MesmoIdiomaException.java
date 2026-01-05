package Dominio.Nucleo.Curso.Exception;

public class MesmoIdiomaException extends CursoException {
    public MesmoIdiomaException() {
        super("O IDIOMA DEVE SER DIFERENTE DO ATUAL");
    }
}
