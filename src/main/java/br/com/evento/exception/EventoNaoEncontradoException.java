package br.com.evento.exception;

public class EventoNaoEncontradoException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public EventoNaoEncontradoException(String msg) {
		super(msg);
	}

}
