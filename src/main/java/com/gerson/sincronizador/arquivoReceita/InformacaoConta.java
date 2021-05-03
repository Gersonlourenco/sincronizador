package com.gerson.sincronizador.arquivoReceita;

public class InformacaoConta {
	private String agencia;
	private String conta;
	//considerando que não serão realizadas operações com precisão
	private Double saldo;
	private StatusConta status;
	
	public InformacaoConta(String agencia, String conta, Double saldo, StatusConta status) {
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
		this.status = status;		
	}

	public String getAgencia() {
		return agencia;
	}

	public String getConta() {
		return conta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public StatusConta getStatus() {
		return status;
	}		
}
