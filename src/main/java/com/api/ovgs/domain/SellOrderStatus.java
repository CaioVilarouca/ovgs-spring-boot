package com.api.ovgs.domain;

public enum SellOrderStatus { // Status Ordem de Venda
	CRIADO,
	PLANEJADA,
	AGENDADA,
	EM_TRANSPORTE,
	ENTREGUE;

	public SellOrderStatus getKey() {
		return switch (this) {
			case CRIADO -> SellOrderStatus.CRIADO;
			case PLANEJADA -> SellOrderStatus.PLANEJADA;
			case AGENDADA -> SellOrderStatus.AGENDADA;
			case EM_TRANSPORTE -> SellOrderStatus.EM_TRANSPORTE;
			case ENTREGUE -> SellOrderStatus.ENTREGUE;
		};
	}
}
