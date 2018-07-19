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
		System.out.println("Ա����"+emp.getId()+"����"+emp.getName()+"����"+emp.getAge());
	}
       
      
    }
    @Test
    public void test02(){
       SqlSession sqlSession = SqlSessionFacotryUtils.getSqlSession(true);
       String str = "com.iss.mapper.EmpMapper.updateEmp";
       Emp emp = new Emp();
       emp.setId("2");
       emp.setName("С��");
       emp.setAge("23");
       
     
       int i = sqlSession.update(str, emp);
       if (i > 0) {
		System.out.println("�޸ĳɹ�");
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
    	emp.setName("����");
    	emp.setAge("18");
    	int i =session.update(str,emp);
    	
    	if (i>0) {
			System.out.println("��ӳɹ�");
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
    	emp.setName("����");
    	emp.setAge("12");
    	int i = session.update(str,emp);
    	if (i>0) {
			System.out.println("ɾ���ɹ�");
		}
    	session.commit();
    	session.close();
    }
}
