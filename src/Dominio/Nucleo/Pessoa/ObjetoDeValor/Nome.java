package Dominio.Nucleo.Pessoa.ObjetoDeValor;

import Dominio.Nucleo.Pessoa.Exceptions.NomeInvalidoException;
import Util.FerramentasValidator;

public class Nome
{
    private final String primeiroNome;
    private final String segundoNome;

    public Nome(String primeiroNome, String segundoNome)
    {
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;

        validarNome(primeiroNome, segundoNome);
    }

    private void validarNome(String primeiroNome, String segundoNome)
    {
        if(primeiroNome.isBlank() || segundoNome.isBlank())
        {
            throw new NomeInvalidoException("ERRO! O NOME NÃO PODE SER VAZIO");
        }
        if(primeiroNome.contains(" ") || segundoNome.contains(" "))
        {
            throw new NomeInvalidoException("ERRO! O NOME NÃO PODE CONTER ESPAÇO");
        }

        //VALIDAÇÃO COM FERRAMENTAS VALIDATIONS

        boolean contemNumero1 = FerramentasValidator.isContemNumero(primeiroNome);
        boolean contemNumero2 = FerramentasValidator.isContemNumero(segundoNome);

        if(contemNumero1 || contemNumero2)
        {
            throw new NomeInvalidoException("ERRO! O NOME NÃO PODE CONTER NÚMEROS");
        }
    }

    public String getPrimeiroNome()
    {
        return primeiroNome;
    }
    public String getSegundoNome()
    {
        return segundoNome;
    }
}
