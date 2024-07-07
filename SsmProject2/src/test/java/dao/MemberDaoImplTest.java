package dao;

import org.junit.Test;

import dao.impl.MemberDaoImpl;
import model.Member;

public class MemberDaoImplTest {
	private static MemberDaoImpl mdi=new MemberDaoImpl();
	
	@Test
	public void addTest()
	{
		mdi.add(new Member("abc","yy","456","台北","000"));
		
		
		System.out.println("success");
	}
	
	//@Test
	public void selectAllTest()
	{
		System.out.println(mdi.selectAll());
	}
	
	//@Test
	public void selectByIdTest()
	{
		System.out.println(mdi.selectById(14));
	}
	
	//@Test
	public void updateTest()
	{
		Member[] m=mdi.selectById(1).toArray(new Member[1]);
		m[0].setPassword("123456789");
		m[0].setName("abcd1234");
		
		mdi.update(m[0]);
	}
	
	//@Test
	public void deleteTest()
	{
		mdi.delete(20);
		System.out.println("delete success");
	}

}