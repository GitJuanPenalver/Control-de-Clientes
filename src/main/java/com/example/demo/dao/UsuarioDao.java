/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dao;

import com.example.demo.domain.Persona;
import com.example.demo.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author jpenalvs
 */
public interface UsuarioDao extends JpaRepository<Usuario, Long>{
    Usuario findByUsername(String username);
    
}
