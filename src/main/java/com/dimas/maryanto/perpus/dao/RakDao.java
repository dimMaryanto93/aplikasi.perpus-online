package com.dimas.maryanto.perpus.dao;

import com.dimas.maryanto.perpus.domain.Rak;
import com.dimas.maryanto.perpus.repository.RakRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public class RakDao {

    @Autowired
    private RakRepository rakRepository;

    public Page<Rak> findAll(Pageable page) {
        return rakRepository.findAll(page);
    }

    @Transactional(readOnly = false)
    public Rak save(Rak rak) {
        return rakRepository.save(rak);
    }

    @Transactional(readOnly = false)
    public void remove(Rak rak) {
        rakRepository.delete(rak);
    }
}
