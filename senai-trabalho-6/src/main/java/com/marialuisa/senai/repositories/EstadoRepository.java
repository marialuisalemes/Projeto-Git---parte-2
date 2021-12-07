package com.marialuisa.senai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marialuisa.senai.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

} 