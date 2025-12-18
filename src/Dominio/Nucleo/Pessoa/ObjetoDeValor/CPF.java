package Dominio.Nucleo.Pessoa.ObjetoDeValor;

import Dominio.Nucleo.Pessoa.Exceptions.CpfInvalidoException;
import Util.FerramentasValidator;

public final class CPF
{
    private final String cpf;

    public CPF(String cpf)
    {
        validarCpf(cpf);
        this.cpf = cpf;
    }

    private void validarCpf(String cpf)
    {
        if(cpf.isBlank())
        {
            throw new CpfInvalidoException("ERRO! O CPF NÃO PODE SER VAZIO");
        }
        if(cpf.length() != 11)
        {
            throw new CpfInvalidoException("ERRO! O CPF DEVE TER 11 DÍGITOS VÁLIDOS");
        }
        if(cpf.contains(" "))
        {
            throw new CpfInvalidoException("ERRO! O CPF NÃO PODE TER ESPAÇOS");
        }

        //VALIDAÇÃO COM FERRAMENTAS VALIDATORS
        boolean contemMaiusculas = FerramentasValidator.isContemMaiuscula(cpf);
        boolean contemMinusculas = FerramentasValidator.isContemMinuscula(cpf);
        boolean contemCaracteresEspeciais = FerramentasValidator.isContemCaractereEspecial(cpf);

        if(contemMaiusculas || contemMinusculas || contemCaracteresEspeciais)
        {
            throw new CpfInvalidoException("CPF DEVE CONTER APENAS DÍGITOS VALIDOS");
        }
    }

    public String getCpf()
    {
        return cpf;
    }
}
