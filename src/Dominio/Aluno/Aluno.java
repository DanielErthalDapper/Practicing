package Dominio.Aluno;

import Dominio.Nucleo.Pessoa.ObjetoDeValor.CPF;
import Dominio.Nucleo.Pessoa.ObjetoDeValor.DataDeNascimento;
import Dominio.Nucleo.Pessoa.ObjetoDeValor.Nome;
import Dominio.Nucleo.Pessoa.ObjetoDeValor.Telefone;
import Dominio.Nucleo.Usuario.Enumeracao.NivelAcesso;
import Dominio.Nucleo.Usuario.Exceptions.UsuarioException;
import Dominio.Nucleo.Usuario.ObjetoDeValor.Email;
import Dominio.Nucleo.Usuario.ObjetoDeValor.Login;
import Dominio.Nucleo.Usuario.ObjetoDeValor.Senha;
import Dominio.Nucleo.Usuario.Usuario;
import Dominio.Pedagogico.Nota.Nota;
import Dominio.Pedagogico.Presenca.Presenca;

public class Aluno extends Usuario
{

    public Aluno(Long id, Nome nome, CPF cpf, Telefone telefone, DataDeNascimento dataDeNascimento, Senha senha, Email email, Login login, NivelAcesso nivelAcesso)
    {
        super(id, nome, cpf, telefone, dataDeNascimento, senha, email, login, NivelAcesso.ALUNO);
    }

    public static boolean podeFormar;

    public static boolean podeFormar()
    {
        //AQUI VAI FICAR A REGRA ESPECÍFICA PARA UM ALUNO SE FORMAR... - PRECISA TER ALUNO E TODO O RESTO PRONTINHO PARA FINALIZAR AQUI DIRETO
        if(!Presenca.aprovacaoPossivel)
        {
            throw new UsuarioException("O ALUNO NÃO POSSUI TODOS OS CRITÉRIOS NECESSÁRIOS PARA A APROVAÇÃO");
        }
        if(!Nota.aprovacaoPossivel)
        {
            throw new UsuarioException("O ALUNO NÃO POSSUI TODOS OS CRITÉRIOS NECESSÁRIOS PARA A APROVAÇÃO");
        }

        return true;
    }
}
