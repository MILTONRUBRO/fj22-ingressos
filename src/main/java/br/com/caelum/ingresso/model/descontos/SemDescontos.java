package br.com.caelum.ingresso.model.descontos;

import java.math.BigDecimal;

class SemDescontos implements Desconto{

	@Override
	public BigDecimal aplicarDescontoSobre(BigDecimal precoOriginal) {
		// TODO Auto-generated method stub
		return precoOriginal;
	}

}
