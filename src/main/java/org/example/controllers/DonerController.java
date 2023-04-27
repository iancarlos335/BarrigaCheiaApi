package org.example.controllers;

import org.example.dto.DonerDTO;
import org.example.entities.Doner;
import org.example.services.DonerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class DonerController {

    @Autowired
    DonerService donerService;

    @GetMapping("/create")
    ResponseEntity<?> criar(@RequestBody DonerDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(donerService.salvar(dto));
    }


//    @GetMapping("takeOne") {
//        ResponseEntity<?> pegarUm (@RequestParam Long id){
//            return ResponseEntity.ok(donerService.encontrarDoador(id));
//        }
//    }
}
