package com.tencent.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Properties;

import com.tencent.aspectj.MyTag;

public class ColumUtil {
	
	private static Properties pro = new Properties();

	public static String getColumName(String colum) {
		StringBuffer ff = new StringBuffer("");
		for (int i = 0; i < colum.length(); i++) {
			char c = colum.charAt(i);
			if (!Character.isLowerCase(c)) {
				ff.append("_").append(String.valueOf(c).toLowerCase());
			} else {
				ff.append(c);
			}
		}
		return ff.toString();
	}

	public static String getTableName(String tableName) {
		if (tableName.contains(".")) {
			String[] tables = tableName.split("\\.");
			tableName = tables[tables.length - 1];
		}
		StringBuffer ff = new StringBuffer("");
		for (int i = 0; i < tableName.length(); i++) {
			char c = tableName.charAt(i);
			if (!Character.isLowerCase(c)) {
				if (i == 0)
					ff.append(String.valueOf(c).toLowerCase());
				else
					ff.append("_").append(String.valueOf(c).toLowerCase());
			} else {
				ff.append(c);
			}
		}
		return ff.toString();
	}

	public static String getCreateSql(Object obj) {
		Class<?> clz = obj.getClass();
		Field[] fields = clz.getDeclaredFields();
		StringBuffer sql = new StringBuffer("CREATE TABLE ");
		String tableName = getTableName(clz.getName());
		sql.append(tableName).append(" (");
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			Annotation[] aArray = field.getDeclaredAnnotations();
			boolean isPK = false;
			String length = "0";
			if (aArray != null) {
				for (Annotation an : aArray) {
					MyTag tag = (MyTag) an;
					isPK = tag.isPK();
					length = tag.length();
				}
			}
			String f = field.getName();
			String colum = ColumUtil.getColumName(f);
			try {
				InputStream is = ColumUtil.class.getClass().getResourceAsStream("/type.properties");
				pro.load(is);
				String fileType = field.getType().toString();
				String[] fileTypes = fileType.split("\\.");
				fileType = (String) pro.get(fileTypes[fileTypes.length - 1]);
				// System.out.println(fileType);
				sql.append(colum).append(" ").append(fileType);
				if (!(length.equals("0"))) {
					sql.append("(").append(length).append(")");
				}
				if (isPK) {
					sql.append(" not null primary key ");
				}
				if (i == fields.length - 1)
					sql.append(" )");
				else
					sql.append(" ,");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.err.println(sql.toString());
		return sql.toString();
	}
	
	public static void main(String[] args) throws IOException {
		InputStream resourceAsStream = ColumUtil.class.getClass().getResourceAsStream("/type.properties");
		pro.load(resourceAsStream);
		String property = pro.getProperty("LocalDateTime");
		System.out.println(property);
	}

}
