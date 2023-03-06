package com.example.service1.controller;

import com.example.service1.dto.Service1DTO;
import com.example.service1.service.HomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/")
@RequiredArgsConstructor
public class HomeController {

    private final HomeService homeService;

    @GetMapping
    public ResponseEntity<?> home(){
        return ResponseEntity.ok("Service1: " + homeService.getMysqlUser());
    }

    @GetMapping(path = "all")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(homeService.getAll());
    }

    @PostMapping(path = "add")
    public ResponseEntity<Service1DTO> add(@RequestBody Service1DTO service1DTO){
        return ResponseEntity.ok(homeService.set(service1DTO));
    }

    @PutMapping("/delete")
    public ResponseEntity<?> delete(@RequestBody Service1DTO service1DTO){
        homeService.delete(service1DTO);
        return ResponseEntity.ok("");
    }

}
