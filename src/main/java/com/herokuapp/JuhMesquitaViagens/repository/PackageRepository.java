package com.herokuapp.JuhMesquitaViagens.repository;


import com.herokuapp.JuhMesquitaViagens.model.Package;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackageRepository extends JpaRepository<Package, Integer>{

}