package com.idstarcourse.latihan.service;

import com.idstarcourse.latihan.model.Karyawan;
import com.idstarcourse.latihan.model.Rekening;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface RekeningService {
    public Map insert(Rekening rekening);
    public Map update(Rekening rekening);
    public Map delete(Long id);

    public Map getAll(int size, int page);
    public Map getById(Long id);
}
