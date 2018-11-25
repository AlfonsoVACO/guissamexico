package com.guissa.guissa.sesion;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class AppUserDAO extends JdbcDaoSupport {
 
    @Autowired
    public AppUserDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }
 
    public AppUser findUserAccount(String userName) {
        AppUserMapper mapper = new AppUserMapper();
        try {
            return this.getJdbcTemplate().queryForObject(AppUserMapper.BASE_SQL, new Object[] { userName,userName} , mapper);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
 
}
