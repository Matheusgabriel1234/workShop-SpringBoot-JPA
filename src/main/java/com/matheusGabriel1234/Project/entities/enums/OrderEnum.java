package com.matheusGabriel1234.Project.entities.enums;

public enum OrderEnum {
AGUARDANDO_PAGAMENTO(1),
PAGO(2),
ENVIADO(3),
ENTREGUE(4),
CANCELADO(5);

private int code;
	
private OrderEnum(int code){
	this.code = code;
}

public int getCode() {
	return code;
}

public static OrderEnum valueOf(int code) {
	for(OrderEnum order : OrderEnum.values()) {
		if(order.getCode() == code) {
			return order;
		}
	}
	throw new IllegalArgumentException("OrderStatus invalida");
}

}
