package models;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "DEPT")
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_departamento;
    private String nombre;
    private String ubicacion;

    // Relación one-to-many opcional
    @OneToMany(mappedBy = "departamento")
    List<Empleado> empleados;

    // Constructor sin parámetros
    public Departamento() {}

    // Constructor con parámetros
    public Departamento(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    // Getters y setters
    public int getId_departamento() {
        return id_departamento;
    }

    public void setId_departamento(int id_departamento) {
        this.id_departamento = id_departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
}

