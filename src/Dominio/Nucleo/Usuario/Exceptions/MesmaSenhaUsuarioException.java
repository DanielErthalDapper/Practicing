package Dominio.Nucleo.Usuario.Exceptions;

public class MesmaSenhaUsuarioException extends MesmoDadoUsuarioException {
    public MesmaSenhaUsuarioException() {
        super("A SENHA DEVE SER DIFERENTE DA ATUAL");
    }
}
