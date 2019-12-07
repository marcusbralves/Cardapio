package dto;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class MontaRelatorio {
	private List<Produto> Produto;
	private LocalDate Data;
	private Instant HoraPedido;
	private Random NumeroMesa;
	private double ValorTotal;
	public List<Produto> getProduto() {
		return Produto;
	}
	public void setProduto(List<Produto> produto) {
		Produto = produto;
	}
	public LocalDate getData() {
		return Data;
	}
	public void setData(LocalDate data) {
		Data = data;
	}
	public Instant getHoraPedido() {
		return HoraPedido;
	}
	public void setHoraPedido(Instant horaPedido) {
		HoraPedido = horaPedido;
	}
	public Random getNumeroMesa() {
		return NumeroMesa;
	}
	public void setNumeroMesa(Random numeroMesa) {
		NumeroMesa = numeroMesa;
	}
	public double getValorTotal() {
		return ValorTotal;
	}
	public void setValorTotal(double valorTotal) {
		ValorTotal = valorTotal;
	}
	
	
}
