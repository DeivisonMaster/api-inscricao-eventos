package br.com.evento.exception;

public class EventoLotadoException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public EventoLotadoException(String msg) {
		super(msg);
	}
}
