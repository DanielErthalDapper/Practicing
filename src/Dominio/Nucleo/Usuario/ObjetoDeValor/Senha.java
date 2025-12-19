package Dominio.Nucleo.Usuario.ObjetoDeValor;

import Dominio.Nucleo.Usuario.Exceptions.SenhaInvalidaException;
import Util.FerramentasValidator;

public class Senha
{
    private String senha;

    public Senha(String senha)
    {
        validarSenha();
        this.senha = senha;
    }

    private void validarSenha()
    {
        if(senha.isBlank())
        {
            throw new SenhaInvalidaException("ERRO! A SENHA NÃO PODE SER NULA");
        }

        if(senha.length() < 5)
        {
            throw new SenhaInvalidaException("ERRO! A SENHA DEVE TER MAIS DE 5 DIGITOS");
        }

        // VALIDAÇÃO COM FERRAMENTAS VALIDATORS

        boolean contemNumero = FerramentasValidator.isContemNumero(senha);
        boolean contemMaiusculas = FerramentasValidator.isContemMaiuscula(senha);
        boolean contemCaracter = FerramentasValidator.isContemCaractereEspecial(senha);

        if(!contemNumero || contemCaracter || contemMaiusculas)
        {
            throw new SenhaInvalidaException("ERRO! A SENHA DEVE CONTER CARACTERES ESPECIAIS, LETRAS MAIÚSCULAS E NÚMEROS");
        }
    }

    public String getSenha()
    {
        return senha;
    }
}
