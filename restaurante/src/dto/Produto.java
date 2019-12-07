package dto;

public class Produto {
	private ETipoProduto TipoProduto;
	private String Nome;
	private String Descricao;
	private int Quantidade;
	private double Preco;
	
	public ETipoProduto getTipoProduto() {
		return TipoProduto;
	}
	public void setTipoProduto(ETipoProduto tipoProduto) {
		TipoProduto = tipoProduto;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public int getQuantidade() {
		return Quantidade;
	}
	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}
	public double getPreco() {
		return Preco;
	}
	public void setPreco(double preco) {
		Preco = preco;
	}
}
