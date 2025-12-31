package Dominio.Nucleo.Usuario.Enumeracao;

public enum NivelAcesso
{
    // ID 1
    DIRETOR(1),
    // ID 2
    COORDENADOR(2),
    // ID 3
    PROFESSOR(3),
    // ID 4
    VENDEDOR(4),
    // ID 5
    SECRETARIO(5),
    // ID 6
    ALUNO(6);

    // ATRIBUTOS
    private final int id;

    // CONSTRUTOR
    NivelAcesso(int id)
    {
        this.id = id;
    }

    // GETTER
    public int getId()
    {
        return id;
    }
}
