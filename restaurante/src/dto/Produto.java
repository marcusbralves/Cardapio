package dto;

public class Produto {
	public ETipoProduto TipoPedido;
	public String Nome;
	public int Quanitdade;
	public double Preço; 
	public String Descricao;
	public ETipoProduto getTipoPedido() {
		return TipoPedido;
	}
	public void setTipoPedido(ETipoProduto tipoPedido) {
		TipoPedido = tipoPedido;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getQuanitdade() {
		return Quanitdade;
	}
	public void setQuanitdade(int quanitdade) {
		Quanitdade = quanitdade;
	}
	public double getPreço() {
		return Preço;
	}
	public void setPreço(double preço) {
		Preço = preço;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	
}
