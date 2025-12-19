package Dominio.Nucleo.Usuario.Exceptions;

public class MesmoLoginUsuarioException extends MesmoDadoUsuarioException {
    public MesmoLoginUsuarioException() {
        super("O LOGIN DEVE SER DIFERENTE DO ATUAL");
    }
}
