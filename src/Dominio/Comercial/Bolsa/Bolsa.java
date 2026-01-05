package Dominio.Comercial.Bolsa;

import Dominio.Comercial.Bolsa.Exception.BolsaException;
import Dominio.Comercial.Bolsa.Exception.PercentualException;
import Dominio.Comercial.Bolsa.ObjetoDeValor.Percentual;

public class Bolsa
{
    private int idBolsa;
    private Percentual percentual;
    private boolean ativa = false;

    public Bolsa(int idBolsa, Percentual percentual, boolean ativa)
    {
        alteraPercentual(percentual);
        alteraidBolsa(idBolsa);
        this.ativa = ativa;
    }

    public void alteraPercentual(Percentual percentual)
    {
        if(percentual == null)
        {
            throw new PercentualException("UMA BOLSA DEVE POSSUIR SEU PERCENTUAL BEM DEFINIDO");
        }

        this.percentual = percentual;
    }

    public void alteraidBolsa(int idBolsa)
    {
        if(idBolsa < 0)
        {
            throw new BolsaException("UMA BOLSA DEVE POSSUIR SEU ID BEM DEFINIDO");
        }

        this.idBolsa = idBolsa;
    }

    public Percentual getPercentual()
    {
        return percentual;
    }
}
