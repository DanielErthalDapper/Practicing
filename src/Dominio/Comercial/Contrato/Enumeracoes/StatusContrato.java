package Dominio.Comercial.Contrato.Enumeracoes;

public enum StatusContrato
{
    ATIVO(1),
    CANCELADO(2),
    CONCLUIDO(3);

    private int id;

    StatusContrato(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }
}
