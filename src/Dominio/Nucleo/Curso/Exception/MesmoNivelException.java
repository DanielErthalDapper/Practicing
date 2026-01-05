package Dominio.Nucleo.Curso.Exception;

public class MesmoNivelException extends CursoException {
    public MesmoNivelException() {
        super("O NÍVEL DEVE SER DIFERENTE DO ATUAL");
    }
}
