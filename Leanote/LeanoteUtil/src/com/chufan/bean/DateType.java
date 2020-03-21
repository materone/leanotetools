package com.chufan.bean;

import com.alibaba.fastjson.annotation.JSONField;

public class DateType {
	@JSONField(name="$$date")
	public Long $$date;

	/**
	 * @return the $$date
	 */
	public Long get$$Date() {
		return $$date;
	}

	/**
	 * @param $$date the $$date to set
	 */
	public void set$$Date(Long $$date) {
		this.$$date = $$date;
	}
	
}
