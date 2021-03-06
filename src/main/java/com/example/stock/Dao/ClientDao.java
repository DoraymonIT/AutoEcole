package com.example.stock.Dao;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stock.Bean.Client;

@Repository
public interface ClientDao extends JpaRepository<Client, Long> {
Client findByGeneratedcode(String generatedCode);
Client findByNomFR(String nomFR);
Client findByPrenomFR(String prenomFR);
Client findByPrenomFRAndNomFR(String prenomFR,String nomFR);
List<Client> findAll();
public void deleteById(Long id);
public Optional<Client> findById(Long id);
public Client findByImageName(String image);
public List<Client> findByDateExamen(Date dateExamen);
public List<Client> findByCin(String cin);
public List<Client> findByPermisDemande(String permisDemande);
public List<Client> findByDateInscription(Date dateInscription);
}
