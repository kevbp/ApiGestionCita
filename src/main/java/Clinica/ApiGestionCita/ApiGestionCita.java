/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clinica.ApiGestionCita;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apiGestionCita")
public class ApiGestionCita {

    @Autowired
    private ServicioGestionCita serv;

    @PostMapping("/grabar")
    public CitaDTO grabarCita(@RequestBody Entrada ent) {
        return serv.grabar(ent);
    }
}
