package model;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

public class Solicitud {
    private int id;

    @NotBlank(message = "El nombre del paciente es obligatorio")
    private String paciente;

    @NotBlank(message = "La especialidad es obligatoria")
    private String especialidad;

    @NotBlank(message = "El estado es obligatorio")
    private String estado;

    @NotNull(message = "La fecha de registro es obligatoria")
    private LocalDate fechaRegistro;

    @NotBlank(message = "El nivel de prioridad es obligatorio")
    private String prioridad;
    
    public Solicitud(int id, String paciente, String especialidad, String estado, LocalDate fechaRegistro, String prioridad) {
        this.id = id;
        this.paciente = paciente;
        this.especialidad = especialidad;
        this.estado = estado;
        this.fechaRegistro = fechaRegistro;
        this.prioridad = prioridad;
}

public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getPaciente() { return paciente; }
    public void setPaciente(String paciente) { this.paciente = paciente; }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public LocalDate getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(LocalDate fechaRegistro) { this.fechaRegistro = fechaRegistro; }

    public String getPrioridad() { return prioridad; }
    public void setPrioridad(String prioridad) { this.prioridad = prioridad; }
}
