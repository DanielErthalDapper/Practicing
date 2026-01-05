package Dominio.Nucleo.Curso.Enumeracoes;

public enum Modalidade
{
    PRESENCIAL(1),
    ONLINE(2);

    private int id;

    Modalidade(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }
}
