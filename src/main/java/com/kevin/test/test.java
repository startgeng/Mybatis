package com.kevin.test;

import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.kevin.entity.Emp;
import com.kevin.utils.SqlSessionFacotryUtils;

public class test {
    @Test
    public void test(){
       SqlSession sqlSession = SqlSessionFacotryUtils.getSqlSession(true);
       
       String str = "com.iss.mapper.EmpMapper.findEmpById";
       String id = "2";
       System.out.println("aaaa");
       
       Emp emp =  sqlSession.selectOne(str, id);
       if (emp !=null) {
		System.out.println("员工名"+emp.getId()+"姓名"+emp.getName()+"年龄"+emp.getAge());
	}
       
      
    }
    @Test
    public void test02(){
       SqlSession sqlSession = SqlSessionFacotryUtils.getSqlSession(true);
       String str = "com.iss.mapper.EmpMapper.updateEmp";
       Emp emp = new Emp();
       emp.setId("2");
       emp.setName("小红");
       emp.setAge("23");
       
     
       int i = sqlSession.update(str, emp);
       if (i > 0) {
		System.out.println("修改成功");
	}
       sqlSession.commit();
       sqlSession.close();
    }
    @Test
    public void test03(){
    	SqlSession session = SqlSessionFacotryUtils.getSqlSession(true);
    	String str = "com.iss.mapper.EmpMapper.InsertEmp";
    	Emp emp = new Emp();
    	emp.setId("1");
    	emp.setName("张三");
    	emp.setAge("18");
    	int i =session.update(str,emp);
    	
    	if (i>0) {
			System.out.println("添加成功");
		}
    	session.commit();
    	session.close();
    }
    @Test
    public void test04(){
    	SqlSession session = SqlSessionFacotryUtils.getSqlSession(true);
    	String str = "com.iss.mapper.EmpMapper.DeleteEmp";
    	Emp emp = new Emp();
    	emp.setId("1");
    	emp.setName("张三");
    	emp.setAge("12");
    	int i = session.update(str,emp);
    	if (i>0) {
			System.out.println("删除成功");
		}
    	session.commit();
    	session.close();
    }
}
