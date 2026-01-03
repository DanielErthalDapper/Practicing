package Dominio.Funcionario.Vendedor.ObjetoDeValor;

import Dominio.Funcionario.Vendedor.Exceptions.MetaMensalException;

public class MetaMensal
{
    private final int quantidadeMatriculas = 0;
    private final int mes = 0;
    private final int ano = 0;

    public MetaMensal(int quantidadeMatriculas, int mes, int ano)
    {
        validarQuantidadeMatriculas(quantidadeMatriculas);
        validarMes(mes);
        validarAno(ano);
    }

    public void validarQuantidadeMatriculas(int quantidadeMatriculas)
    {
        if (quantidadeMatriculas <= 0)
        {
            throw new MetaMensalException("A META MENSAL DEVE SER MAIOR QUE ZERO");
        }
    }

    public void validarMes(int mes)
    {
        if (mes < 1 || mes > 12)
        {
            throw new MetaMensalException("MÊS INVÁLIDO");
        }
    }

    public void validarAno(int ano)
    {
        if (ano < 2000)
        {
            throw new MetaMensalException("ANO INVÁLIDO");
        }
    }

    public int getQuantidadeMatriculas()
    {
        return quantidadeMatriculas;
    }

    public int getMes()
    {
        return mes;
    }

    public int getAno()
    {
        return ano;
    }


}
