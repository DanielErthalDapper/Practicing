package Dominio.Nucleo.Pessoa;

import Dominio.Nucleo.Pessoa.ObjetoDeValor.CPF;
import Dominio.Nucleo.Pessoa.ObjetoDeValor.DataDeNascimento;
import Dominio.Nucleo.Pessoa.ObjetoDeValor.Nome;
import Dominio.Nucleo.Pessoa.ObjetoDeValor.Telefone;

public class Pessoa
{
    private Nome nome;
    private CPF cpf;
    private Telefone telefone;
    private DataDeNascimento dataDeNascimento;
    private Long id;

    public Pessoa(Long id, Nome nome, CPF cpf, Telefone telefone, DataDeNascimento dataDeNascimento)
    {

    }
}
