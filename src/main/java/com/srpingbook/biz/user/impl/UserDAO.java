package com.srpingbook.biz.user.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.srpingbook.biz.common.JDBCUtil;
import com.srpingbook.biz.user.UserVO;

public class UserDAO {
	// for jdbc
	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	// sql command
	private final String USER_GET = "select * from users where id=? and password=?";
	
	// CRUD
	// 회원 등록
	/* (non-Javadoc)
	 * @see com.srpingbook.biz.user.impl.UserService#getUser(com.srpingbook.biz.user.UserVO)
	 */
	public UserVO getUser(UserVO vo) {
		UserVO user = null;
		try {
			System.out.println("===> JDBC로 getUser() 기능 처리");
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(USER_GET);
			stmt.setString(1, vo.getId());
			stmt.setString(2, vo.getPassword());
			rs = stmt.executeQuery();
			if(rs.next()) {
				user = new UserVO();
				user.setId(rs.getString("ID"));
				user.setPassword(rs.getString("PASSWORD"));
				user.setName(rs.getString("NAME"));
				user.setRole(rs.getString("ROLE"));
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs,  stmt, conn);
		}
		return user;
	}
}
