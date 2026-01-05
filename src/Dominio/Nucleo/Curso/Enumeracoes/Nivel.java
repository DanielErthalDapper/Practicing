package Dominio.Nucleo.Curso.Enumeracoes;

public enum Nivel
{
    BASICO(1),
    INTERMEDIARIO(2),
    AVANCADO(3);

    private int id;

    Nivel(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }
}
