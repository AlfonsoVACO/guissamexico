package com.guissa.guissa.sesion;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class AppRoleDAO extends JdbcDaoSupport {
 
    @Autowired
    public AppRoleDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }
 
    public List<String> getRoleNames(Long userId) {
    	String sql ="SELECT p.Descripcion FROM tipo_usuario p inner join user u on (u.id_tipo_usuario = p.id_tipo_usuario)  WHERE u.id_user = ?";
        return this.getJdbcTemplate().queryForList(sql,  new Object[] { userId }, String.class);
    }
     
}