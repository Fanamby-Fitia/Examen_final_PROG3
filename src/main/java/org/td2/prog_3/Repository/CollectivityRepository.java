package org.td2.prog_3.Repository;

import org.springframework.stereotype.Repository;
import org.td2.prog_3.Model.Collectivity;

import java.util.*;

@Repository
public class CollectivityRepository {

    private List<Collectivity> data = new ArrayList<>();

    public List<Collectivity> findAll() {
        return data;
    }

    public Optional<Collectivity> findById(Long id) {
        return data.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst();
    }

    public Optional<Collectivity> findByName(String name) {
        return data.stream()
                .filter(c -> c.getName().equalsIgnoreCase(name))
                .findFirst();
    }

    public void save(Collectivity collectivity) {
        data.add(collectivity);
    }
}