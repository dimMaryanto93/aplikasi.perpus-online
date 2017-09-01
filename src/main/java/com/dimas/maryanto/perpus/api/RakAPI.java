package com.dimas.maryanto.perpus.api;

import com.dimas.maryanto.perpus.dao.RakDao;
import com.dimas.maryanto.perpus.domain.Rak;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rak")
public class RakAPI {

    @Autowired
    private RakDao rakDao;

    public Page<Rak> findAll(Pageable page) {
        return rakDao.findAll(page);
    }
}
