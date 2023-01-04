/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tasya.peminjamanservice.service;

import com.tasya.peminjamanservice.entity.Peminjaman;
import com.tasya.peminjamanservice.repository.PeminjamanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */

@Service
public class PeminjamanService {
    @Autowired
   private PeminjamanRepository peminjamanRepository;
   
   public Peminjaman savePeminjaman (Peminjaman peminjaman){
       return peminjamanRepository.save(peminjaman);
    }

    public Peminjaman findPeminjamanById(Long peminjamanId){
        return peminjamanRepository.findByPeminjamanId(peminjamanId);
    }
}
