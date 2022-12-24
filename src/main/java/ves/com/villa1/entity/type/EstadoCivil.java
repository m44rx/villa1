package ves.com.villa1.entity.type;

public enum EstadoCivil {
    // SOLTERO,
    // CASADO,
    // DIVORCIADO,
    // VIUDO,
    // CONVIVIENTE;


    SOLTERO("SOLTERO"),
    CASADO("CASADO"),
    DIVORCIADO("DIVORCIADO"),
    VIUDO("VIUDO"),
    CONVIVIENTE("CONVIVIENTE");
    


    public String estado;

    public String getEstado(){
        return estado;
    }

    private EstadoCivil(String estado){
        this.estado = estado;
    }
}
