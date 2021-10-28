/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.servicio;

import com.example.demo.dao.PersonaDao;
import com.example.demo.domain.Persona;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaServiceImpl implements PersonaService{

    @Autowired
    private PersonaDao personadao;
    
    @Override
    @Transactional(readOnly=true)
    public List<Persona> listarPersonas() {
        return (List<Persona>) personadao.findAll();
        }

    @Override
    @Transactional
    public void guardar(Persona persona) {
        personadao.save(persona);
    }

    @Override
    @Transactional
    public void eliminar(Persona persona) {
        personadao.delete(persona);
    }

    @Override
    @Transactional(readOnly = true)
    public Persona encontrarPersona(Persona persona) {
      return personadao.findById(persona.getIdPersona()).orElse(null);
    }
    
}
