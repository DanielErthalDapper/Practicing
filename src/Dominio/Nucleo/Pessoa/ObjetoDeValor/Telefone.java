package Dominio.Nucleo.Pessoa.ObjetoDeValor;

import Dominio.Nucleo.Pessoa.Exceptions.TelefoneInvalidoException;
import Util.FerramentasValidator;

public class Telefone
{
    private final String numeroTelefone;

    public Telefone(String numeroTelefone)
    {
        validarTelefone(numeroTelefone);
        this.numeroTelefone = numeroTelefone;
    }

    private void validarTelefone(String numeroTelefone)
    {
        if(numeroTelefone.isBlank())
        {
            throw new TelefoneInvalidoException("ERRO! O NÚMERO DE TELEFONE NÃO PODE SER VAZIO");
        }
        if(numeroTelefone.contains(" "))
        {
            throw new TelefoneInvalidoException("ERRO! O NÚMERO DE TELEFONE NÃO PODE CONTER ESPAÇOS VAZIOS");
        }
        if(numeroTelefone.length() != 11)
        {
            throw new TelefoneInvalidoException("ERRO! O NÚMERO DE TELEFONE DEVE TER 11 DÍGITOS");
        }

        //

        boolean contemMaiusculas = FerramentasValidator.isContemMaiuscula(numeroTelefone);
        boolean contemMinusculas = FerramentasValidator.isContemMinuscula(numeroTelefone);
        boolean contemCaracter = FerramentasValidator.isContemCaractereEspecial(numeroTelefone);

        if(contemCaracter || contemMaiusculas || contemMinusculas)
        {
            throw new TelefoneInvalidoException("ERRO! O NÚMERO DE TELEFONE DEVE CONTER SOMENTE NÚMEROS");
        }
    }

    public String getNumeroTelefone()
    {
        return numeroTelefone;
    }
}
