package com.kevin.utils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFacotryUtils {
private static SqlSessionFactory sqlSessionFactory;
public static SqlSessionFactory getSqlSessionFactory(){
	if (sqlSessionFactory == null) {
		InputStream inputStream = null;
		try {
			InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	return sqlSessionFactory;
}
public static SqlSession getSqlSession(boolean commit){
	return getSqlSessionFactory().openSession();
}
}
