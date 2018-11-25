package com.guissa.guissa.sesion;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AppUserMapper implements RowMapper<AppUser> {
	 
    public static final String BASE_SQL = "SELECT u.id_user, u.Correo, u.Pass FROM user u WHERE (u.Nic = ? or u.Correo = ? )";
 
    @Override
    public AppUser mapRow(ResultSet rs, int rowNum) throws SQLException {
        Long userId = rs.getLong("id_user");
        String userName = rs.getString("Correo");
        String encrytedPassword = rs.getString("Pass");
 
        return new AppUser(userId, userName, encrytedPassword);
    }
 
}