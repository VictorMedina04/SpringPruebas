package com.salesianostriana.dam.clinicavictormedinalejeune01.modelo;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Doctor {

	private long id;
	private double salario;
	private String especialidad1;
	private String especialidad2;
	private LocalDateTime fechaContratacion;

}
