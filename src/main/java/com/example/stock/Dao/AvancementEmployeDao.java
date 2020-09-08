package com.example.stock.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stock.Bean.AvancementEmploye;

@Repository
public interface AvancementEmployeDao extends JpaRepository<AvancementEmploye, Long> {

}