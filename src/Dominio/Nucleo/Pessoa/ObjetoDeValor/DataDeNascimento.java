package Dominio.Nucleo.Pessoa.ObjetoDeValor;

import Dominio.Nucleo.Pessoa.Exceptions.TelefoneInvalidoException;

import java.time.LocalDate;
import java.time.Period;

public class DataDeNascimento
{
    private final LocalDate dataDeNascimento;

    public DataDeNascimento(LocalDate dataDeNascimento)
    {
        validarDataDeNascimento(dataDeNascimento);
        this.dataDeNascimento = dataDeNascimento;
    }

    private void validarDataDeNascimento(LocalDate dataDeNascimento)
    {
        if(dataDeNascimento == null)
        {
            throw new TelefoneInvalidoException("ERRO! A DATA DE NASCIMENTO NÃO PODE SER VAZIA");
        }
        if(dataDeNascimento.isAfter(LocalDate.now()))
        {
            throw new TelefoneInvalidoException("ERRO! A DATA DA NASCIMENTO NÃO PODE SER FUTURA");
        }
    }

    public LocalDate getDataDeNascimento()
    {
        return dataDeNascimento;
    }

    public int getIdade()
    {
        return Period.between(dataDeNascimento, LocalDate.now()).getYears();
    }
}
