package org.td2.prog_3.Services;

import org.springframework.stereotype.Service;
import org.td2.prog_3.Exception.BadRequestException;
import org.td2.prog_3.Exception.NotFoundException;
import org.td2.prog_3.Model.Collectivity;
import org.td2.prog_3.Repository.CollectivityRepository;

import java.util.List;

@Service
public class CollectivityServices {

    private CollectivityRepository repository;

    public CollectivityServices(CollectivityRepository repository) {
        this.repository = repository;
    }

    public Collectivity create(Collectivity collectivity) {

        if (repository.findByName(collectivity.getName()).isPresent()) {
            throw new BadRequestException("Collectivity name already exists");
        }

        repository.save(collectivity);
        return collectivity;
    }

    public List<Collectivity> getAll() {
        return repository.findAll();
    }

    public Collectivity getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Collectivity not found"));
    }
}