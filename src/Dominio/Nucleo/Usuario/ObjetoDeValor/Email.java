package Dominio.Nucleo.Usuario.ObjetoDeValor;

import Dominio.Nucleo.Usuario.Exceptions.EmailInvalidoException;
import Util.FerramentasValidator;

public class Email
{
    private String email;

    public Email(String email)
    {
        validarEmail();
        this.email = email;
    }

    private void validarEmail()
    {
        if(email.isBlank())
        {
            throw new EmailInvalidoException("ERRO! O EMAIL NÃO PODE SER VAZIO");
        }
        if(email.length() > 50)
        {
            throw new EmailInvalidoException("ERRO! O EMAIL NÃO PODE TER MAIS DE 50 DIGITOS");
        }
        if(!email.contains("@"))
        {
            throw new EmailInvalidoException("ERRO! O EMAIL DEVE CONTER O CARACTER '@'");
        }

        // VALIDAÇÃO COM FERRAMENTAS VALIDATOR

        boolean contemMaiusculas = FerramentasValidator.isContemMaiuscula(email);
        boolean contemNumero = FerramentasValidator.isContemNumero(email);

        if(!contemNumero || contemMaiusculas)
        {
            throw new EmailInvalidoException("ERRO! O EMAIL DEVE CONTER NÚMEROS E MAIÚSCULAS");
        }
    }

    public String getEmail()
    {
        return email;
    }
}
