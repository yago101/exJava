package entities;

import java.util.Calendar;
import java.util.Date;

import entities.enums.StatusPedido;

public class Pedido{
	private Integer id;
	private String instante;
	private StatusPedido status;
	
	public Pedido() {
		
	}
	public Pedido(Integer id,String instante,StatusPedido status) {
		this.id = id;
		this.instante = instante;
		this.status = status;
	}
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id=id;
	}
	public String getInstante() {
		return this.instante;
	}
	public void setInstante(String instante) {
		this.instante=instante;
	}
	public StatusPedido getStatus() {
		return this.status;
	}
	public void setStatus(StatusPedido status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Pedido ID = " + id + "\nData e Hora da venda = " + instante + "\nStatus do Pedido = " + status;
	}
	
	
}