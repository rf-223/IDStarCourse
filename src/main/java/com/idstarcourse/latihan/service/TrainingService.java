package com.idstarcourse.latihan.service;

import com.idstarcourse.latihan.model.Rekening;
import com.idstarcourse.latihan.model.Training;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public interface TrainingService {
    public Map insert(Training training);
    public Map update(Training training);
    public Map delete(Long id);

    public Map getAll(int size, int page);
    public Map getById(Long id);
}
