/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tasya.peminjamanservice.controller;

import com.tasya.peminjamanservice.entity.Peminjaman;
import com.tasya.peminjamanservice.service.PeminjamanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */

@RestController
@RequestMapping("/peminjaman")
public class PeminjamanController {
    @Autowired
    private PeminjamanService peminjamanService;
    private Long peminjamanId;
    
    @PostMapping("/")
    public Peminjaman savePeminjaman (@RequestBody Peminjaman peminjaman){
        return peminjamanService.savePeminjaman(peminjaman);
    }
    @GetMapping("/{id}")
    public Peminjaman findPeminjamanById(@PathVariable("id")Long PeminjamanId){
        return peminjamanService.findPeminjamanById(peminjamanId);
    }
}
