
package Clinica.ApiGestionCita;

public class SalidaCita {
    private Long id;
    private String fec;
    private String hor;
    private PacienteDTO pac;
    private EspecialidadDTO esp;
    private MedicoDTO med;
    private EmpleadoDTO emp;
    private double pre;
    private String estPag;
    private String estCit;

    public SalidaCita() {
    }

    public SalidaCita(Long id, String fec, String hor, PacienteDTO pac, EspecialidadDTO esp, MedicoDTO med, EmpleadoDTO emp, double pre, String estPag, String estCit) {
        this.id = id;
        this.fec = fec;
        this.hor = hor;
        this.pac = pac;
        this.esp = esp;
        this.med = med;
        this.emp = emp;
        this.pre = pre;
        this.estPag = estPag;
        this.estCit = estCit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFec() {
        return fec;
    }

    public void setFec(String fec) {
        this.fec = fec;
    }

    public String getHor() {
        return hor;
    }

    public void setHor(String hor) {
        this.hor = hor;
    }

    public PacienteDTO getPac() {
        return pac;
    }

    public void setPac(PacienteDTO pac) {
        this.pac = pac;
    }

    public EspecialidadDTO getEsp() {
        return esp;
    }

    public void setEsp(EspecialidadDTO esp) {
        this.esp = esp;
    }

    public MedicoDTO getMed() {
        return med;
    }

    public void setMed(MedicoDTO med) {
        this.med = med;
    }

    public EmpleadoDTO getEmp() {
        return emp;
    }

    public void setEmp(EmpleadoDTO emp) {
        this.emp = emp;
    }

    public double getPre() {
        return pre;
    }

    public void setPre(double pre) {
        this.pre = pre;
    }

    public String getEstPag() {
        return estPag;
    }

    public void setEstPag(String estPag) {
        this.estPag = estPag;
    }

    public String getEstCit() {
        return estCit;
    }

    public void setEstCit(String estCit) {
        this.estCit = estCit;
    }
    
    
}
