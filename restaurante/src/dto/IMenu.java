package dto;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Random;

public interface IMenu {
	public void VerificaTipoProduto(MontaRelatorio pRel, Produto pProduto, 
			Instant pTempoEstimado,LocalDate pData ,Random pNumeroMesa);
	

}
