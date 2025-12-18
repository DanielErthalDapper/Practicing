package Dominio.Nucleo.Pessoa.Exceptions;

public class MesmaDataNascimentoException extends MesmoDadoPessoaException {
    public MesmaDataNascimentoException() {
        super("A DATA DE NASCIMENTO DEVE SER DIFERENTE DA ATUAL");
    }
}
