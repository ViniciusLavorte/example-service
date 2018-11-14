/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.restservice;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author vinicius
 */
@RestController
public class UserDAO {
      
    @PostMapping("/cidade")
    public Cidade create(@RequestBody Cidade user){
        Random r = new Random(); 
        Long x = r.nextLong();
        user.setID(x);
        return user;
    }

    @GetMapping("/cidade")
    public List <Cidade> read(){
        Random r = new Random();
        Long x = r.nextLong();
        Long y = r.nextLong();
        
        Estado l1 = new Estado(x, "Parana");
        Estado l2 = new Estado(y, "Sao Paulo");
        return Stream.of(
                new Cidade(x,"Umuarama", l1),
                new Cidade(y,"Araraquara",l2)
        
        ).collect(Collectors.toList());
    }
    
    @PutMapping("/cidade")
    public Cidade update(@RequestBody Cidade user){
        user.setNome(user.getNome()+"--- Update");
        return user;
    }
    
    @DeleteMapping("/cidade/{id}")
    public int delete(Long id){
        return 200;
    }
}
