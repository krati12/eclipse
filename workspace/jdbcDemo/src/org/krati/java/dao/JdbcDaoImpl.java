package org.krati.java.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.krati.java.model.Circle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Component;

/*
 * This calss will be responsible for taking to databse and get databse valuse
 */
@Component
public class JdbcDaoImpl {
//	@Autowired
	private DataSource dataSource;
/*SimpleJdbcTemplate is combination of JdbcTemplate and NamedParameterJdbcTemplate
 * 	It allows use of ? param and name param as argument.It may not hace all feature 
 * of JdbcTemplate and NamedParameterJdbcTemplate but it have almost all important feature
 */
	private SimpleJdbcTemplate simplejdbcTemplate;
/*	new JdbcTemplate(); is not required here as we are initialising in setDatSource
 * */
 
	private JdbcTemplate jdbcTemplate = new JdbcTemplate(); 
	/*declaring NamedParameterJdbcTemplate.class
	 * 
	 */
	private NamedParameterJdbcTemplate namedparameterJdbcTemplate;
/*
		public Circle getCircle(int CircleId) {
			Connection conn = null;
			try{
			

			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from circle where id =?");
			ps.setInt(1,CircleId);
			Circle circle = null;
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				circle = new Circle(CircleId,rs.getString("name"));
			}
			rs.close();
			ps.close();
			return circle;
			}
			catch(Exception e){
				throw new RuntimeException(e);
				
			}
			finally{
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	*/
		/*Instead of careting prepared statement and get data from result set
		 * we can set dataSource to jdbc template and pass query
		 * jdbcTemplate.queryforInt will return output of string and
		 * there are many more method by which you can get output as per your needs.
		 * 
		 */
		public int getCircleCount(){
			String sql = "Select count(*) from circle";
// not required as set in setDatSource			jdbcTemplate.setDataSource(getDataSource());
			return jdbcTemplate.queryForInt(sql);
		}
		
		public String getCircleName(int circleId){
			String sql = "SELECT NAME FROM CIRCLE WHERE ID = ?";
			return jdbcTemplate.queryForObject(sql, new Object[] {circleId}, String.class);
			
		}
		
	/*if we wnat to map values return from database map with circle object or any user defined object
	 * then use creaet class which implement RowMapper.
	 * Inside that class override method mapRow .
	 * value to resultset is passed by jdbcTemplate and here you can do mapping
	 * call this mapper in jdbcTemplate.queryForObject method.
	 *  jdbcTemplate see resultSet record it will call row mapper and method mapRow will ru.
	 *  jdbcTemplate call rowmapper for each row of resultSet
	 * 	
	 */
	/*JdbcTemplate only work with ? place holder but in future if query 
	 * is changed then you need to to update sequence of Object array
	 * so we need name place holder which is not provided by jdbctemplate
	 */
		public Circle getCircleForId(int circleId){
			String sql = "SELECT * FROM CIRCLE WHERE ID = ?";
		return	jdbcTemplate.queryForObject(sql, new Object[] {circleId},new CircleMapper());

		}
		private static final class CircleMapper implements RowMapper<Circle>{

			@Override
			public Circle mapRow(ResultSet resultSet, int rowNum) throws SQLException {

				Circle circle = new Circle();
				circle.setId(resultSet.getInt("ID"));
				circle.setName(resultSet.getString("Name"));
				return circle;
			}
			
		}
		
		public List<Circle> getAllCircle(){
			String sql = "SELECT * FROM CIRCLE";
			 return jdbcTemplate.query(sql, new CircleMapper());
			
		}
	
		/*insert circle in database*/
		/* you can use update query for stored procedures and for delete too*/
		/* you will call stored procedured name and put in sql statement and run using update method
		 * 
		 */
/*		public void insertCircle(Circle circle){
			String sql ="INSERT INTO CIRCLE (ID,NAME) VALUES (?,?)";
			jdbcTemplate.update(sql, new Object[] {circle.getId(), circle.getName()});
		}*/
		/*
		 * Using org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate.class
		 * this will do all functionlity same as jdbcTemplate and additionally provide faeture of Name 
		 * param.
		 * SqlParameterSource is an interface whch is source for name parameter.as it is interface
		 * so we use class MapSqlParameterSource which implements SqlParameterSource
		 */
		public void insertCircle(Circle circle){
			String sql ="INSERT INTO CIRCLE (ID,NAME) VALUES (:id,:name)";
			SqlParameterSource nameParameters = new  MapSqlParameterSource("id",circle.getId())
															.addValue("name", circle.getName());
			namedparameterJdbcTemplate.update(sql, nameParameters);
			
			
		}
		
		/*you can write DDl statement here also statement which will create table or alter table
		 * or delete table know as data defination language .Execute statement to sun query
		 */
		public void createTriangleTable(){
			String sql = "create Table triangle(ID integer,name varchar(50))";
			jdbcTemplate.execute(sql);
		}

		public DataSource getDataSource() {
			return dataSource;
		}
/*setDataSource is only used for JdbcTemplate
 * so instead of initialising JdbcTemplate in somewhere ele we can do in 
 * setDataSource
 * Instead of Annotating Filed we put autowired here so xml will pass Datasource to this method
 */	
		/*usually only one template is intialise here we write 2 template just for demo purpose
		 * 
		 */
		@Autowired
		public void setDataSource(DataSource dataSource) {
			this.jdbcTemplate = new JdbcTemplate(dataSource);
			this.namedparameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
		}

		public JdbcTemplate getJdbcTemplate() {
			return jdbcTemplate;
		}

		public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
			this.jdbcTemplate = jdbcTemplate;
		}

	}
