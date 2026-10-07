package com.api.ovgs.domain;

public enum SchedulingStatus {
	PENDENTE,
	CONFIRMADO,
	REAGENDADO,
	CRIADO;

	public SchedulingStatus getKey() {
		return switch (this) {
			case PENDENTE -> SchedulingStatus.PENDENTE;
			case CONFIRMADO -> SchedulingStatus.CONFIRMADO;
			case REAGENDADO -> SchedulingStatus.REAGENDADO;
			case CRIADO -> SchedulingStatus.CRIADO;
		};
	}
}
