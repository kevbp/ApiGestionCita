package Clinica.ApiGestionCita;

public class EspecialidadDTO {

    private Long id;
    private String des;

    public EspecialidadDTO() {
    }

    public EspecialidadDTO(Long id, String des) {
        this.id = id;
        this.des = des;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

}
