package Dominio.Nucleo.Curso.Enumeracoes;

public enum Idioma
{
    INGLES(1),
    ESPANHOL(2),
    ALEMAO(3),
    ITALIANO(4),
    FRANCES(5);

    private int id;

    Idioma(int id)
    {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
