package Util;

import Dominio.Funcionario.Nucleo.Exceptions.FuncionarioException;
import Dominio.Funcionario.Nucleo.Funcionario;
import Dominio.Nucleo.Usuario.Enumeracao.NivelAcesso;
import Dominio.Nucleo.Usuario.Exceptions.UsuarioException;
import Dominio.Nucleo.Usuario.Usuario;

public class FerramentasValidator {
    public static boolean isContemMaiuscula(String palavra) {
        for(String maiuscula : Ferramentas.listaMaiusculos) {
            if (palavra.contains(maiuscula)) {
                return true;
            }
        }

        return false;
    }

    public static boolean isContemMinuscula(String palavra) {
        for(String minuscula : Ferramentas.listaMinusculas) {
            if (palavra.contains(minuscula)) {
                return true;
            }
        }

        return false;
    }

    public static boolean isContemCaractereEspecial(String palavra) {
        for(String caractereEspecial : Ferramentas.listaEspeciais) {
            if (palavra.contains(caractereEspecial)) {
                return true;
            }
        }

        return false;
    }

    public static boolean isContemNumero(String palavra) {
        for(String numero : Ferramentas.listaNumeros) {
            if (palavra.contains(numero)) {
                return true;
            }
        }

        return false;
    }

    public static void validarSeEhDiretor(Funcionario funcionario)
    {
        if(funcionario.getNivelAcesso() != NivelAcesso.DIRETOR)
        {
            throw new FuncionarioException("PERMIÇÃO NEGADA! FUNÇÃO EXCLUSIVA DE DIRETORES");
        }
    }
    public static void validarSeNaoEhDiretor(Funcionario funcionario)
    {
        if(funcionario.getNivelAcesso() == NivelAcesso.DIRETOR)
        {
            throw new FuncionarioException("PERMIÇÃO NEGADA! ESSE FUNÇÃO NÃO ESTÁ DISPONÍVEL PARA DIRETORES");
        }
    }
    public static void validarSeEhCoordenador(Funcionario funcionario)
    {
        if(funcionario.getNivelAcesso() != NivelAcesso.COORDENADOR)
        {
            throw new FuncionarioException("PERMIÇÃO NEGADA! FUNÇÃO EXCLUSIVA DE COORDENADORES");
        }
    }
    public static void validarSeEhProfessor(Funcionario funcionario)
    {
        if(funcionario.getNivelAcesso() != NivelAcesso.PROFESSOR)
        {
            throw new FuncionarioException("PERMIÇÃO NEGADA! FUNÇÃO EXCLUSIVA DE PROFESSORES");
        }
    }
    public static void validarSeEhSecretario(Funcionario funcionario)
    {
        if(funcionario.getNivelAcesso() != NivelAcesso.SECRETARIO)
        {
            throw new FuncionarioException("PERMIÇÃO NEGADA! FUNÇÃO EXCLUSIVA DE SECRETÁRIOS");
        }
    }
    public static void validarSeEhVendedor(Funcionario funcionario)
    {
        if(funcionario.getNivelAcesso() != NivelAcesso.VENDEDOR)
        {
            throw new FuncionarioException("PERMIÇÃO NEGADA! FUNÇÃO EXCLUSIVA DE VENDEDORES");
        }
    }
    public static void validarSeNaoEhCoordenador(Funcionario funcionario)
    {
        if(funcionario.getNivelAcesso() == NivelAcesso.COORDENADOR)
        {
            throw new FuncionarioException("PERMIÇÃO NEGADA! ESSE FUNÇÃO NÃO ESTÁ DISPONÍVEL PARA COORDENADORES");
        }
    }
    public static void validarSeNaoEhProfessor(Funcionario funcionario)
    {
        if(funcionario.getNivelAcesso() == NivelAcesso.PROFESSOR)
        {
            throw new FuncionarioException("PERMIÇÃO NEGADA! ESSE FUNÇÃO NÃO ESTÁ DISPONÍVEL PARA PROFESSORES");
        }
    }
    public static void validarSeNaoEhSecretario(Funcionario funcionario)
    {
        if(funcionario.getNivelAcesso() == NivelAcesso.SECRETARIO)
        {
            throw new FuncionarioException("PERMIÇÃO NEGADA! ESSE FUNÇÃO NÃO ESTÁ DISPONÍVEL PARA SECREATÁRIOS");
        }
    }
    public static void validarSeNaoEhVendedor(Funcionario funcionario)
    {
        if(funcionario.getNivelAcesso() == NivelAcesso.VENDEDOR)
        {
            throw new FuncionarioException("PERMIÇÃO NEGADA! ESSE FUNÇÃO NÃO ESTÁ DISPONÍVEL PARA VENDEDORES");
        }
    }
    public static void validarSeEhAluno(Usuario aluno)
    {
        if(aluno.getNivelAcesso() != NivelAcesso.ALUNO)
        {
            throw new UsuarioException("PERMIÇÃO NEGADA! FUNÇÃO EXCLUSIVA PARA ALUNOS");
        }
    }

}
