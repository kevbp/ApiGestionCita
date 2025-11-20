
package Clinica.ApiGestionCita;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServicioGestionCita {
    
    @Autowired
    private RestTemplate resTem;

    public CitaDTO grabar(Entrada ent) {
        String urlSal = "http://ApiNuevaCita/apiNuevaCita/salida";
        SalidaDTO sal = resTem.getForObject(urlSal, SalidaDTO.class);

        CitaDTO cit = new CitaDTO();
        cit.setIdHor(sal.getHor().getId());
        cit.setIdPac(sal.getPac().getId());
        cit.setIdEsp(sal.getHor().getIdEsp());
        cit.setIdMed(sal.getHor().getIdMed());
        cit.setFec(sal.getHor().getFec());
        cit.setHor(sal.getHor().getHorIni());
        cit.setPre(sal.getHor().getPre());
        cit.setEstPag("Pendiente");
        cit.setIdEmp(ent.getIdEmp());
        cit.setEstCit("Activo");

        String urlCit = "http://ApiCita/cita/grabar";
        CitaDTO citReg = resTem.postForObject(urlCit, cit, CitaDTO.class);

        return citReg;
    }
}
