package ves.com.villa1.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import ves.com.villa1.entity.type.EstadoCivil;
import ves.com.villa1.entity.type.GradoInstruccion;
import ves.com.villa1.entity.type.Sexo;
import ves.com.villa1.entity.type.TipoDocumentoIdentidad;

@Getter
@Setter
@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 50)
    private String nombre;
    @Column(length = 100)
    private String apellidoMaterno;
    @Column(length = 100)
    private String apellidoPaterno;
    private TipoDocumentoIdentidad tipoDocumentoIdentidad;
    @Column(length = 20)
    private String documentoIdentidad;
    @Column(length = 150)
    private String email;
    @Column(length = 255)
    private String direccion;
    @Column(length = 8)
    private String telefono;
    @Column(length = 9)
    private String celular;
    @Column(length = 15)
    @Enumerated(EnumType.STRING)
    private EstadoCivil estadoCivil;
    @Column(length = 2)
    private Sexo sexo;
    @Column(length = 15)
    private GradoInstruccion gradoInstruccion;
    @Column(length = 20)
    private LocalDate fechNacimiento;
}
