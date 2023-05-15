/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgb.Controler;

import com.portfolio.mgb.Dto.dtoExperiencia;
import com.portfolio.mgb.Entity.Experiencia;
import com.portfolio.mgb.Security.Controller.Mensaje;
import com.portfolio.mgb.Service.SExperiencia;
import io.micrometer.common.util.StringUtils;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author samab
 */
@RestController
@RequestMapping("experiencia")//localhost:8080/experiencia
@CrossOrigin(origins={"*"})

public class CExperiencia {
   
    @Autowired
    SExperiencia sExperiencia;
    
    @GetMapping ("/lista")
    public ResponseEntity<List<Experiencia>> lista(){
        List<Experiencia> list = sExperiencia.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoExperiencia dtoexp){
        if(StringUtils.isBlank(dtoexp.getNombrE()))
            return new ResponseEntity(new Mensaje("El nombre se coloca obligatoriamente"), HttpStatus.BAD_REQUEST);
        //if(sExperiencia.existsByNombreE(dtoexp.getNombrE()))
        //    return new ResponseEntity(new Mensaje("Experiencia existente"), HttpStatus.BAD_REQUEST);
        
        
        System.err.println(dtoexp.getTitlE());
        Experiencia experiencia = new Experiencia (
                dtoexp.getNombrE(), 
                dtoexp.getDescripcionE(), 
                dtoexp.getTitlE(), 
                dtoexp.getTypE(), 
                dtoexp.getDatE()
        );
        
        sExperiencia.save(experiencia);
        
        return new ResponseEntity(new Mensaje("Experiencia Agregada"), HttpStatus.OK);
    }
    

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update (@PathVariable("id") int id, @RequestBody dtoExperiencia dtoexp){
        //validacion de si existe la id
        if(!sExperiencia.existsById(id))
            return new ResponseEntity (new Mensaje("El id no existe"), HttpStatus.BAD_REQUEST);
        
        //compara nombre de experiencias
        //if (sExperiencia.existsByNombreE(dtoexp.getNombrE()) && sExperiencia.getByNombreE(dtoexp.getNombrE())
        //        .get().getId() != id)
        //    return new ResponseEntity(new Mensaje("Esa experiencia es existente"), HttpStatus.BAD_REQUEST);
        
        if(StringUtils.isBlank((dtoexp.getNombrE())))          
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        
        System.err.println(dtoexp.getTitlE());
        Experiencia experiencia = sExperiencia.getOne(id).get();
        experiencia.setNombrE(dtoexp.getNombrE());
        experiencia.setDescripcionE(dtoexp.getDescripcionE());
        experiencia.setTitlE(dtoexp.getTitlE());
        experiencia.setTypE(dtoexp.getTypE());
        experiencia.setDatE(dtoexp.getDatE());
        
        sExperiencia.save(experiencia);
        return new ResponseEntity(new Mensaje("Experiencia actualizada"), HttpStatus.OK);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        //validacion de si existe la id
        if(!sExperiencia.existsById(id))
            return new ResponseEntity (new Mensaje("El id no existe"), HttpStatus.BAD_REQUEST);
        
        sExperiencia.delete(id);
        
        return new ResponseEntity(new Mensaje("Experiencia eliminada"), HttpStatus.OK);
    }
}

