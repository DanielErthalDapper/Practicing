package Dominio.Nucleo.Curso;

import Dominio.Nucleo.Curso.Enumeracoes.Idioma;
import Dominio.Nucleo.Curso.Enumeracoes.Modalidade;
import Dominio.Nucleo.Curso.Enumeracoes.Nivel;
import Dominio.Nucleo.Curso.Exception.*;

public class Curso
{
    private Idioma idioma;
    private Modalidade modalidade;
    private Nivel nivel;

    public Curso(Idioma idioma, Modalidade modalidade, Nivel nivel)
    {
        alteraIdioma(idioma);
        alteraModalidade(modalidade);
        alteraNivel(nivel);
    }

    public void alteraIdioma(Idioma idioma)
    {
        if(idioma == null)
        {
            throw new IdiomaException("UM CURSO DEVE POSSUIR SEU IDIOMA BEM DEFINIDO");
        }

        if(igualMeuIdioma(idioma))
        {
            throw new MesmoIdiomaException();
        }
    }

    public void alteraModalidade(Modalidade modalidade)
    {
        if(modalidade == null)
        {
            throw new ModalidadeException("UM CURSO DEVE POSSUIR SUA MODALIDADE BEM DEFINIDA");
        }

        if(igualMinhaModalidade(modalidade))
        {
            throw new MesmaModalidadeException();
        }
    }

    public void alteraNivel(Nivel nivel)
    {
        if(modalidade == null)
        {
            throw new NivelException("UM CURSO DEVE POSSUIR SEU NÍVEL BEM DEFINIDO");
        }

        if(igualMeuNivel(nivel))
        {
            throw new MesmoNivelException();
        }
    }

    public boolean igualMeuIdioma(Idioma idioma)
    {
        return this.idioma.equals(idioma);
    }
    public boolean igualMinhaModalidade(Modalidade modalidade)
    {
        return this.modalidade.equals(modalidade);
    }
    public boolean igualMeuNivel(Nivel nivel)
    {
        return this.nivel.equals(nivel);
    }

    public Idioma getIdioma()
    {
        return idioma;
    }
    public Modalidade getModalidade()
    {
        return modalidade;
    }
    public Nivel getNivel()
    {
        return nivel;
    }
}
