package br.farn.folhacomercial.eco.dados;

import java.util.List;

import br.farn.folhacomercial.eco.dominio.Empresa;


public interface EmpresaDao {
	
	public void salvar(Empresa empresa);

	public void remover(Empresa empresa);

	public void editar(Empresa empresa);

	public List<Empresa> buscarTodos();

	Empresa findById(long id);

}
