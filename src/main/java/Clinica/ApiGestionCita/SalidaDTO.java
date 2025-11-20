
package Clinica.ApiGestionCita;

public class SalidaDTO {
    
    private PacienteDTO pac;
    private HorarioDTO hor;

    public SalidaDTO() {
    }
    
    public SalidaDTO(PacienteDTO pac, HorarioDTO hor) {
        this.pac = pac;
        this.hor = hor;
    }

    public PacienteDTO getPac() {
        return pac;
    }

    public void setPac(PacienteDTO pac) {
        this.pac = pac;
    }

    public HorarioDTO getHor() {
        return hor;
    }

    public void setHor(HorarioDTO hor) {
        this.hor = hor;
    }
    
    
    
}
