package org.krati.java.dao;

import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

/*
 * Instaed of creating object of SimpleJdbcTemplate and initialse it we 
 * extend SimpleJdbcDaoSupport.
 * SimpleJdbcDaoSupport have SimpleJdbcTemplate sa member variable
 * we dont need to define it just get that variable in our class
 * use getSimpleJdbcTemplate.
 * to initialise variable with datasource we can add that in XML
 * we cannot do autowired as we dont have that member variable  "SimpleJdbcTemplate"
 * in this class we have it in superclass"SimpleJdbcDaoSupport" and have access over it
 * 
 */

public class SimpleJdbcDaoImpl extends SimpleJdbcDaoSupport {
	public int getCircleCount(){
		String sql = "Select count(*) from circle";
//not required as set in setDatSource			jdbcTemplate.setDataSource(getDataSource());
		return this.getSimpleJdbcTemplate().queryForInt(sql);
	}

}
