package com.idstarcourse.latihan.service;

import com.idstarcourse.latihan.model.KaryawanTraining;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface KaryawanTrainingService {
    public Map insert(KaryawanTraining karyawanTraining);
    public Map update(KaryawanTraining karyawanTraining);
    public Map delete(Long id);

    public Map getAll(int size, int page);
    public Map getById(Long id);
}
