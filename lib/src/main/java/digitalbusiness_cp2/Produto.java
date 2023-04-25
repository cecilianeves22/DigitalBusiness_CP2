package digitalbusiness_cp2;

import java.util.Calendar;

public class Produto {

	private String nome;
	private int uuid;
	private Calendar dataCadastro;
	private Calendar dataAtualizacao;
	private boolean habilitado;
	
	public Produto(ProdutoEntity entity) {}
	
	public Produto(String nome, int uuid, Calendar dataCadastro, Calendar dataAtualizacao, boolean habilitado) {
		super();
		this.nome = nome;
		this.uuid = uuid;
		this.dataCadastro = dataCadastro;
		this.dataAtualizacao = dataAtualizacao;
		this.habilitado = habilitado;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getUuid() {
		return uuid;
	}
	public void setUuid(int uuid) {
		this.uuid = uuid;
	}
	public Calendar getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public Calendar getDataAtualizacao() {
		return dataAtualizacao;
	}
	public void setDataAtualizacao(Calendar dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	public boolean isHabilitado() {
		return habilitado;
	}
	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}
	
	
}
