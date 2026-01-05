package Dominio.Comercial.Bolsa.ObjetoDeValor;

import Dominio.Comercial.Bolsa.Exception.PercentualException;

public class Percentual
{
    private int valor;

    public Percentual(int valor)
    {
        validarValor(valor);
    }

    public void validarValor(int valor)
    {
        if(valor < 0 || valor > 100)
        {
            throw new PercentualException("");
        }

        this.valor = valor;
    }

    public int getValor()
    {
        return valor;
    }
}
