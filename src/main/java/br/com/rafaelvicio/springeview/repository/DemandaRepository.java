package br.com.rafaelvicio.springeview.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.rafaelvicio.springeview.modelo.Demanda;

public interface DemandaRepository extends CrudRepository<Demanda, Long>{
    
}