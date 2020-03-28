package com.tencent.present;

import com.tencent.entity.Person;
import com.tencent.util.ColumUtil;
import com.tencent.util.DBHelper;

import java.sql.SQLException;

/**
 * @ClassName: TestMain
 * @Description: 根据实体创建表测试
 * @author: zhang.xiaoming
 * @date: 2018年6月27日 上午10:59:49
 */
public class TestMain {

	static DBHelper db1 = null;

	public static void main(String[] args) {
		String sql = ColumUtil.getCreateSql(new Person());
		db1 = new DBHelper(sql);
		try {
			db1.pst.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
