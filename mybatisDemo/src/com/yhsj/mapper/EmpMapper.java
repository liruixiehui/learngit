package com.yhsj.mapper;

import java.util.List;

import com.yhsj.bean.Emp;

public interface EmpMapper {
	
	/**
	 * ����EMP
	 * @param emp
	 * @return
	 */
	public int saveEmp(Emp emp);
	
	/**
	 * �޸�EMP
	 * @param emp
	 * @return
	 */
	public int updateEmp(Emp emp);
	
	/**
	 * ɾ��EMP
	 * @param id
	 * @return
	 */
	public int deleteEmp(int empno);
	
	/**
	 * ͨ��ID��ѯEMP
	 * @param id
	 * @return
	 */
	public Emp findEmpById(int empno);
	
	/**
	 * ��ѯ����EMP
	 * @return
	 */
	public List<Emp> findAll();
	
	/**
	 * ����������ѯEmp
	 * @param emp
	 * @return
	 */
	public List<Emp> findEmpByEname(Emp emp);
	
	/**
	 * ����������ѯEmp
	 * @param emp
	 * @return
	 */
	public List<Emp> findEmpByWhere(Emp emp);
	
	public List<Emp> findEmpByChoose(Emp emp);
	
	public List<Emp> findEmpByForeach(Object[] objs);
	
	public List<Emp> findEmpByForeachList(List<Integer> list);
	
	public List<Emp> findEmpByForeachList1(List<Emp> list);
	
	public int updateEmp1(Emp emp);

}
