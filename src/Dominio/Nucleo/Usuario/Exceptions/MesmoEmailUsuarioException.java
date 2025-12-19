package Dominio.Nucleo.Usuario.Exceptions;

public class MesmoEmailUsuarioException extends MesmoDadoUsuarioException {
    public MesmoEmailUsuarioException() {
        super("O EMAIL DEVE SER DIFERENTE DO ATUAL");
    }
}
