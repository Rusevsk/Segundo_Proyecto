package com.example.segundo_proyecto;

public class Nombres {
    private Integer id;
    private String nombre;
    private String apellido;
    private String Usuarios;



    public Nombres(Integer id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        this.Usuarios=this.Usuarios= id+" "+nombre+" "+apellido;
        return Usuarios;
    }
}
