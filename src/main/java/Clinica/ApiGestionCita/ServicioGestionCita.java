package Clinica.ApiGestionCita;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServicioGestionCita {

    @Autowired
    private RestTemplate resTem;

    public SalidaCita grabar(Entrada ent) {

        Long idSlo = ent.getIdSlo();
        Long idPac = ent.getIdPac();
        Long idEmp = ent.getIdEmp();

        String urlSlo = "http://ApiSlotHorario/slotHorario/buscar/" + idSlo;
        SlotHorarioDTO slo = resTem.getForObject(urlSlo, SlotHorarioDTO.class);

        String urlHor = "http://ApiHorario/horario/buscar/" + slo.getIdHor();
        HorarioDTO hor = resTem.getForObject(urlHor, HorarioDTO.class);

        String urlEsp = "http://ApiEspecialidad/especialidad/buscar/" + hor.getIdEsp();
        String urlMed = "http://ApiMedico/medico/buscar/" + hor.getIdMed();
        String urlPac = "http://ApiPaciente/paciente/buscar/" + idPac;
        String urlEmp = "http://ApiEmpleado/empleado/buscar/" + idEmp;

        EspecialidadDTO esp = resTem.getForObject(urlEsp, EspecialidadDTO.class);
        MedicoDTO med = resTem.getForObject(urlMed, MedicoDTO.class);
        PacienteDTO pac = resTem.getForObject(urlPac, PacienteDTO.class);
        EmpleadoDTO emp = resTem.getForObject(urlEmp, EmpleadoDTO.class);

        CitaDTO cit = new CitaDTO();
        cit.setIdSlo(slo.getId());
        cit.setFec(hor.getFec());
        cit.setHor(slo.getHorIni() + " - " + slo.getHorFin());
        cit.setPre(hor.getPre());
        cit.setIdPac(pac.getId());
        cit.setIdEsp(esp.getId());
        cit.setIdMed(med.getId());
        cit.setEstPag("Pendiente");
        cit.setIdEmp(ent.getIdEmp());
        cit.setEstCit("Activo");

        String urlCit = "http://ApiCita/cita/grabar";
        CitaDTO citReg = resTem.postForObject(urlCit, cit, CitaDTO.class);

        return buscar(citReg.getId());
    }

    public SalidaCita buscar(Long id) {
        String urlBusCit = "http://ApiCita/cita/buscar/" + id;
        CitaDTO cit = resTem.getForObject(urlBusCit, CitaDTO.class);

        String urlBusPac = "http://ApiPaciente/paciente/buscar/" + cit.getIdPac();
        String urlBusEsp = "http://ApiHistoria/historia/buscar/" + cit.getIdEsp();
        String urlBusMed = "http://ApiHistoria/historia/buscar/" + cit.getIdMed();
        String urlBusEmp = "http://ApiHistoria/historia/buscar/" + cit.getIdEmp();

        PacienteDTO pac = resTem.getForObject(urlBusPac, PacienteDTO.class);
        EspecialidadDTO esp = resTem.getForObject(urlBusEsp, EspecialidadDTO.class);
        MedicoDTO med = resTem.getForObject(urlBusMed, MedicoDTO.class);
        EmpleadoDTO emp = resTem.getForObject(urlBusEmp, EmpleadoDTO.class);

        SalidaCita salCit = new SalidaCita();
        salCit.setId(cit.getId());
        salCit.setFec(cit.getFec());
        salCit.setHor(cit.getHor());
        salCit.setPac(pac);
        salCit.setEsp(esp);
        salCit.setMed(med);
        salCit.setEmp(emp);
        salCit.setPre(cit.getPre());
        salCit.setEstPag(cit.getEstPag());
        salCit.setEstCit(cit.getEstCit());

        return salCit;
    }
}
