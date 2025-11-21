
package Clinica.ApiGestionCita;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apiGestionCita")
public class ApiGestionCita {

    @Autowired
    private ServicioGestionCita serv;

    @PostMapping("/procesarYGrabar")
    public SalidaCita procesarYGrabar(@RequestBody Entrada ent) {
        return serv.grabar(ent);
    }
    
    @GetMapping("/buscar")
    public SalidaCita buscar(@PathVariable Long idHor) {
        return serv.buscar(idHor);
    }
}
