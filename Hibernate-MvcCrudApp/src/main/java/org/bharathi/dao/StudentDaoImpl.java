package org.bharathi.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import org.bharathi.model.Student;
import org.bharathi.util.HibernateUtil;

//Persistence logic using hibernate
public class StudentDaoImpl implements IStudentDao {

	Session session = HibernateUtil.getSession();
	Student student=null;

	@SuppressWarnings("finally")
	@Override
	public String addStudent(Student student) {
		System.out.println(student);
		
		Transaction transaction = null;
		Boolean flag = false;
		try {
			transaction = session.beginTransaction();
			session.save(student);
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				transaction.commit();
				return "success";
			} else {
				transaction.rollback();
				return "failure";
			}
		}
	}
	
	@Override
	public Student searchStudent(Integer sid) {
		try
		{
			 student=new Student();
			student=session.get(Student.class, sid);
			
			
			
		}catch(HibernateException he)
		{
			he.printStackTrace();
		}
		
		
		return student;
		
		
		
	}

	@Override
	public String deleteStudent(Integer sid) {
		
		Transaction transaction=null;
		Boolean flag=false;
		try
		{
			
			
			
			student=session.get(Student.class, sid);
			transaction=session.beginTransaction();
			session.delete(student);
			flag=true;
			
		}catch(HibernateException e)
		{
			e.printStackTrace();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(flag)
			{
				transaction.commit();
			}
			else
			{
				transaction.rollback();
			}
		}
		
		return "success";
		
		
	}

	@Override
	public String updateStudent(Student student) {
		Transaction transaction=null;
		boolean flag=false;
		try
		{
			
			transaction=session.beginTransaction();
			 session.merge(student);
				flag=true;
			
		}catch(Exception e)
		
		{
			e.printStackTrace();
		}finally
		{
			if(flag)
			{
				transaction.commit();
			}
			
			
			else
			{
				transaction.rollback();
			}
		}
		
		 
		 
			
			return "success";
		
	}

}
