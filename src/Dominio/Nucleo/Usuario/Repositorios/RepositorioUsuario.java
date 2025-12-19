package Dominio.Nucleo.Usuario.Repositorios;

import Dominio.Nucleo.Pessoa.ObjetoDeValor.CPF;
import Dominio.Nucleo.Usuario.ObjetoDeValor.Login;
import Dominio.Nucleo.Usuario.Usuario;

public interface RepositorioUsuario
{
    void salvar(Usuario usuario);
    void atualizar(Usuario usuario);
    void excluir(Long id);
    boolean existeCpf(CPF cpf);
    boolean existeId(Long id);
    Usuario buscarPorId(Long id);
    Usuario buscarPorLogin(Login login);
}
