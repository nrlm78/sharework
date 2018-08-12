package com.mp.Dao;

import java.util.List;
import org.springframework.jdbc.core.RowMapper;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mp.bo.MedicineBo;

public class MedicineDaoImpl implements MedicineDao {

	private JdbcTemplate jdbcTemplate;
	private final String SELECT_ALL_MEDICINE = "select medicine_no,medicine_nm,menufacturer,expiry_month,expiry_year,price,quantity";

	@Override
	public List<MedicineBo> fetchMedicine() {

		return jdbcTemplate.query(SELECT_ALL_MEDICINE, medicineBo);
	}

	RowMapper<MedicineBo> medicineBo = (rs, mNo) -> {

		MedicineBo bo = new MedicineBo();
		bo.setMedicineNo(rs.getInt(1));
		bo.setMedicineName(rs.getString(2));
		bo.setManufacturer(rs.getString(3));
		bo.setExpiryMonth(rs.getInt(4));
		bo.setExpiryYear(rs.getInt(5));
		bo.setPrice(rs.getInt(6));
		bo.setQuantity(rs.getInt(7));

		return bo;

	};

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
