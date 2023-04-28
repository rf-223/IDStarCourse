package com.idstarcourse.latihan.service;

import com.idstarcourse.latihan.model.Karyawan;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface KaryawanService {
    public Map insert(Karyawan karyawan);
    public Map update(Karyawan karyawan);
    public Map delete(Long id);

    public Map getAll(int size, int page);
    public Map getById(Long id);
}
