package Dominio.Nucleo.Pessoa.Exceptions;

public class MesmoCpfPessoaException extends MesmoDadoPessoaException {
    public MesmoCpfPessoaException() {
        super("O CPF DEVE SER DIFERENTE DO ATUAL");
    }
}
