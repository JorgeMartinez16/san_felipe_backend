package com.jota.sanfelipe.entities;

import jakarta.persistence.*;


@Entity
@Table(name="washed-service")
public class Washed {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name="employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name="car_id")
    private Car car;

    @ManyToOne
    @JoinColumn(name="avalaibleservice_id")
    private AvalaibleService avalaible_service;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public AvalaibleService getAvalaible_service() {
        return avalaible_service;
    }

    public void setAvalaible_service(AvalaibleService avalaible_service) {
        this.avalaible_service = avalaible_service;
    }
}
