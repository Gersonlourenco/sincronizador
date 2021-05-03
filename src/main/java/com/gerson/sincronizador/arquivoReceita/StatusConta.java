package com.gerson.sincronizador.arquivoReceita;

public enum StatusConta {
	A("A"),
	B("B"),
	P("P"),
	I("I");
	
	private String status;
	
	private StatusConta(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
}
