package ves.com.villa1.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import ves.com.villa1.entity.type.EstadoCivil;
import ves.com.villa1.entity.type.GradoInstruccion;
import ves.com.villa1.entity.type.Sexo;
import ves.com.villa1.entity.type.TipoDocumentoIdentidad;

@Getter
@Setter
public class PersonaDto {
    
    private int id;
    private String nombre;
    private String apellidoMaterno;
    private String apellidoPaterno;
    private TipoDocumentoIdentidad tipoDocumentoIdentidad;
    private String documentoIdentidad;
    private String email;
    private String direccion;
    private String telefono;
    private String celular;
    
    private EstadoCivil estadoCivil;
    private Sexo sexo;
    private GradoInstruccion gradoInstruccion;
    private LocalDate fechNacimiento;
}
