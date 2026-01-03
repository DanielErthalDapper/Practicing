package Dominio.Funcionario.Professor.ObjetoDeValor;

import Dominio.Funcionario.Professor.Enumeracoes.Idioma;
import Dominio.Funcionario.Professor.Enumeracoes.Nivel;
import Dominio.Funcionario.Professor.Exceptions.EspecialidadeException;

public class Especialidade
{
    private Nivel nivel;
    private Idioma idioma;

    public Especialidade(Nivel nivel, Idioma idioma)
    {
        validarNivel(nivel);
        validarIdioma(idioma);
    }

    public void validarNivel(Nivel nivel)
    {
        if(nivel == null)
        {
            throw new EspecialidadeException("ERRO! O NÍVEL NÃO PODE SER NULO");
        }
        if(nivel.getId() > 3 || nivel.getId() < 1)
        {
            throw new EspecialidadeException("ERRO! O NÍVEL DEVE ESTAR ENTRE OS NÍVEIS PERMITIDOS NO SISTEMA");
        }
    }

    public void validarIdioma(Idioma idioma)
    {
        if(idioma == null)
        {
            throw new EspecialidadeException("ERRO! O IDIOMA NÃO PODE SER NULO");
        }
        if(idioma.getId() < 1 || idioma.getId() > 5)
        {
            throw new EspecialidadeException("ERRO! O IDIOMA DEVE ESTAR ENTRE OS NÍVEIS PERMITIDOS NO SISTEMA");
        }
    }

    public Idioma getIdioma()
    {
        return idioma;
    }

    public Nivel getNivel()
    {
        return nivel;
    }
}
