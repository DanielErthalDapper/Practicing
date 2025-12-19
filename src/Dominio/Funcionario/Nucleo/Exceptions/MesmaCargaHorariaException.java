package Dominio.Funcionario.Nucleo.Exceptions;

public class MesmaCargaHorariaException extends RuntimeException {
    public MesmaCargaHorariaException() {
        super("A CARGA HORÁRIA DEVE SER DIFERENTE DA ATUAL");
    }
}
