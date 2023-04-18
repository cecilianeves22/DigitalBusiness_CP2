package digitalbusiness_cp2;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Usuario {

	private String nome;
	private Long uuid;
	private String email;
	private String nomeMae;
	private String senha;
	private String telefone;
	private int idade;
	private String enderecoCompleto;
	private String cpf;
	private String rg;
	private boolean politicamenteExposta;
	private float rendaMensal;
	private float valorPatrimonio;
	private Calendar dataCadastro;
	private Calendar dataAtualizacao;
	private List<String> listaProduto;
	private TipoPagamento tipo;
	
	public Usuario(UsuarioEntity entity) {
		this.nome = entity.getNome();
		this.uuid = entity.getUuid();
		this.email = entity.getEmail();
		this.nomeMae = entity.getNomeMae();
		this.senha = entity.getSenha();
		this.telefone = entity.getTelefone();
		this.idade = entity.getIdade();
		this.enderecoCompleto = entity.getEnderecoCompleto();
		this.cpf = entity.getCpf();
		this.rg = entity.getRg();
		this.politicamenteExposta = entity.isPoliticamenteExposta();
		this.rendaMensal = entity.getRendaMensal();
		this.valorPatrimonio = entity.getValorPatrimonio();
		this.dataCadastro = entity.getDataCadastro();
		this.dataAtualizacao = entity.getDataAtualizacao();
		this.listaProduto = entity.getListaProduto();
		this.tipo = entity.getTipo();

	}
	
	public Usuario(String string, int i, String string2, String string3, String string4, int j, String string5, String string6, String string7, boolean b, float f, float g, GregorianCalendar gregorianCalendar, GregorianCalendar gregorianCalendar2, String string8, TipoPagamento pix) {}
	
	public Usuario(String nome, Long uuid, String email, String nomeMae, String senha, String telefone, int idade,
			String enderecoCompleto, String cpf, String rg, boolean politicamenteExposta, float rendaMensal,
			float valorPatrimonio, Calendar dataCadastro, Calendar dataAtualizacao, List<String> listaProduto,
			TipoPagamento tipo) {
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
