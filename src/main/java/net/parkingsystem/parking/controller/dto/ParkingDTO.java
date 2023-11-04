package net.parkingsystem.parking.controller.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ParkingDTO {

    private String id;

    @Size(min = 3, message = "Digite uma licenca válida")
    @NotBlank(message = "Informe a licença do veículo")
    private String license;

    @Size(min = 2, message = "Digite um Estado válido")
    @NotBlank(message = "Informe o estado correspondente")
    private String state;

    @Size(min = 3, message = "Digite um modelo válido")
    @NotBlank(message = "Informe o modelo do veículo")
    private String model;

    @Size(min = 3, message = "Digite uma cor válida")
    @NotBlank(message = "Informe a cor do veículo")
    private String color;

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime entryDate;

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime exitDate;
    private Double bill;
}
