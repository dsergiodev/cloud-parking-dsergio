package net.parkingsystem.parking.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Parking {

    @Id
    @Column(updatable = false, unique = true, nullable = false)
    private String id;

    private String license;
    private String state;
    private String model;
    private String color;
    private LocalDateTime entryDate;
    private LocalDateTime exitDate;
    private Double bill;

    public Parking(String id, String license, String state, String model, String color) {
        this.id = id;
        this.license = license;
        this.state = state;
        this.model = model;
        this.color = color;
    }

    public Parking() {
    }

    @Override
    public String toString() {
        return "Parking{" +
                "id='" + id + '\'' +
                ", license='" + license + '\'' +
                ", state='" + state + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", entryDate=" + entryDate +
                ", exitDate=" + exitDate +
                ", bill=" + bill +
                '}';
    }

}
