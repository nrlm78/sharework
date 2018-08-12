package com.mp.service;

import java.util.ArrayList;
import java.util.List;

import com.mp.Dao.MedicineDao;
import com.mp.bo.MedicineBo;
import com.mp.dto.MedicineDto;

public class MedicineServiceImpl implements MedicineService {

	private MedicineDao dao;

	@Override
	public List<MedicineDto> getMedicine() {
		List<MedicineDto> medicineDtos = null;
		MedicineDto medicineDto = null;
		List<MedicineBo> medicineBos = null;

		medicineBos = dao.fetchMedicine();
		medicineDtos=new ArrayList<>();

		for (MedicineBo medicineBo : medicineBos) {
			medicineDto = new MedicineDto();
			medicineDto.setMedicineName(medicineBo.getMedicineName());
			medicineDto.setManufacturer(medicineBo.getManufacturer());
			medicineDto.setPrice(medicineBo.getPrice());
			medicineDto.setQuantity(medicineBo.getQuantity());

			medicineDtos.add(medicineDto);
			

		}
		System.out.println(" medicineDtos  :   "+medicineDtos);
		return medicineDtos;
	}

	public void setDao(MedicineDao dao) {
		this.dao = dao;
	}

}
