package com.DigitalHoues.HospedajeDH.service;

import com.DigitalHoues.HospedajeDH.entities.Categoria;
import com.DigitalHoues.HospedajeDH.repository.categoriaRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class CategoriaService {

    @Autowired
    categoriaRepository categoriaRepository;


    public Optional<Categoria> findById (Long id){
        Optional<Categoria> categoria = categoriaRepository.findById(id);
        return categoria;
    }

    public void delete(Long id){ categoriaRepository.deleteById(id);}

    public Categoria save(Categoria categoria) {
        categoriaRepository.save(categoria);
        return categoria;
    }


}
