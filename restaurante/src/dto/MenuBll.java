package dto;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class MenuBll implements IMenu{

	@Override
	public void VerificaTipoProduto(MontaRelatorio pRel, Produto pProduto, Instant lTempoEstimado,LocalDate pData, Random pNumeroMesa) {
		if(pProduto.getTipoProduto() == ETipoProduto.Prato ) {
			pRel.setHoraPedido(lTempoEstimado);			
		}
		pRel.setData(pData);
		pRel.setNumeroMesa(pNumeroMesa);
		
		
		
	}


	

}
