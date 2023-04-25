package digitalbusiness_cp2;

import java.util.Calendar;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="T_CP2_USUARIO")
public class UsuarioEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long uuid;
	
	@Column(name="nm_usuario")
	private String nome;
	
	@Column(name="ds_email")
	private String email;
	
	@Column(name="nm_mae_usuario")
	private String nomeMae;
	
	@Column(name="ds_senha")
	private String senha;
	
	@Column(name="nr_telefone")
	private String telefone;
	
	@Column(name="nr_idade")
	private int idade;
	
	@Column(name="ds_endereco")
	private String enderecoCompleto;
	
	@Column(name="nr_cpf")
	private String cpf;
	
	@Column(name="nr_rg")
	private String rg;
	
	@Column(name="tp_polit_exposta")
	private boolean politicamenteExposta;
	
	@Column(name="nr_rensa_mensal")
	private float rendaMensal;
	
	@Column(name="vl_patrimonial")
	private float valorPatrimonio;
	
	@Column(name="dt_cadastro")
	private Calendar dataCadastro;
	
	@Column(name="dt_atualizacao")
	private Calendar dataAtualizacao;
	
	@Column(name="lt_produto")
	private List<String> listaProduto;
	
	@Column(name="tp_pagamento")
	private TipoPagamento tipo;
	
	public UsuarioEntity() {}
	
	public UsuarioEntity(Usuario usuario) {
		this.nome = nome;
		this.uuid = uuid;
		this.email = email;
		this.nomeMae = nomeMae;
		this.senha = senha;
		this.telefone = telefone;
		this.idade = idade;
		this.enderecoCompleto = enderecoCompleto;
		this.cpf = cpf;
		this.rg = rg;
		this.politicamenteExposta = politicamenteExposta;
		this.rendaMensal = rendaMensal;
		this.valorPatrimonio = valorPatrimonio;
		this.dataCadastro = dataCadastro;
		this.dataAtualizacao = dataAtualizacao;
		this.listaProduto = listaProduto;
		this.tipo = tipo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getUuid() {
		return uuid;
	}
	public void setUuid(Long uuid) {
		this.uuid = uuid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEnderecoCompleto() {
		return enderecoCompleto;
	}
	public void setEnderecoCompleto(String enderecoCompleto) {
		this.enderecoCompleto = enderecoCompleto;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public boolean isPoliticamenteExposta() {
		return politicamenteExposta;
	}
	public void setPoliticamenteExposta(boolean politicamenteExposta) {
		this.politicamenteExposta = politicamenteExposta;
	}
	public float getRendaMensal() {
		return rendaMensal;
	}
	public void setRendaMensal(float rendaMensal) {
		this.rendaMensal = rendaMensal;
	}
	public float getValorPatrimonio() {
		return valorPatrimonio;
	}
	public void setValorPatrimonio(float valorPatrimonio) {
		this.valorPatrimonio = valorPatrimonio;
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
	public List<String> getListaProduto() {
		return listaProduto;
	}
	public void setListaProduto(List<String> listaProduto) {
		this.listaProduto = listaProduto;
	}
	public TipoPagamento getTipo() {
		return tipo;
	}
	public void setTipo(TipoPagamento tipo) {
		this.tipo = tipo;
	}	
}
