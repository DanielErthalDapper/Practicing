package Dominio.Funcionario.Nucleo.ObjetoDeValor;

import Dominio.Funcionario.Nucleo.Exceptions.SalarioinvalidoException;

import java.math.BigDecimal;

public class Salario
{
    private BigDecimal valor;

    public Salario(BigDecimal valor)
    {
        validarSalario(valor);
    }

    public void validarSalario(BigDecimal valor)
    {
        if(valor == null)
        {
            throw new SalarioinvalidoException("ERRO! O SALÁRIO NÃO PODE SER VAZIO");
        }
        if(valor.compareTo(new BigDecimal("500,00")) < 0)
        {
            throw new SalarioinvalidoException("ERRO! O SALÁRIO NÃO PODE SER MENOR QUE 500,00");
        }

        this.valor = valor;
    }

    public BigDecimal getValor()
    {
        return valor;
    }
}
