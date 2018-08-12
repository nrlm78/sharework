package com.mp.Dao;

import java.util.List;

import com.mp.bo.MedicineBo;

public interface MedicineDao {

	public List<MedicineBo> fetchMedicine();
}
