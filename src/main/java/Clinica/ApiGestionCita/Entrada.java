package Clinica.ApiGestionCita;

public class Entrada {

    private Long idPac;
    private Long idSlo;
    private Long idEmp;

    public Entrada() {
    }

    public Entrada(Long idPac, Long idSlo, Long idEmp) {
        this.idPac = idPac;
        this.idSlo = idSlo;
        this.idEmp = idEmp;
    }

    public Long getIdPac() {
        return idPac;
    }

    public void setIdPac(Long idPac) {
        this.idPac = idPac;
    }

    public Long getIdSlo() {
        return idSlo;
    }

    public void setIdSlo(Long idSlo) {
        this.idSlo = idSlo;
    }

    public Long getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(Long idEmp) {
        this.idEmp = idEmp;
    }

    
}
