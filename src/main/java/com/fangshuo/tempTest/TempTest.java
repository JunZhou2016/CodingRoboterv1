package com.fangshuo.tempTest;

import com.fangshuo.codefactory.utils.Logger;

public class TempTest{
	public static void main(String[] args) {
		// 项目在硬盘上的基础路径
	/* String PROJECT_PATH = System.getProperty("user.dir");
	 System.out.println("---------"+PROJECT_PATH+"-----------");*/
	 /*String modelNameUpperCamel = "wisdomPark";
	 String upStr = StringUtils.toUpperCaseFirstOne(modelNameUpperCamel);
	 System.out.println("############"+upStr+"############");*/
	 /*String categoryStr = "ServiceImpl";
	 String substring = categoryStr.substring(0, categoryStr.length()-5);
	 System.out.println(substring);*/
	
	 /*List<Column> columnList = new ArrayList<Column>();
	 Column column1 = new Column("role","id");
	 Column column2 = new Column("role","name");
	 Column column3 = new Column("role","age");
	 
	 columnList.add(column1);
	 columnList.add(column2);
	 columnList.add(column3);
	 
	 Table table = new Table();
     table.setColumnSet(columnList);
	 
	 Logger.info(DBUtils.tableToString(table));*/
		
     /*StuFilter stuFilter = new StuFilter();
     stuFilter.setId("20142213");
     stuFilter.setName("zj");
     Logger.info(stuFilter.toString());*/
		
	/*String underScoreStr = "Park_ar";
	String lowerCaseFirstOne = DBUtils.toLowerCaseFirstOne(underScoreStr);
	String result = DBUtils.underScoreCase2CamelCase(lowerCaseFirstOne);
	Logger.info(result);*/
	
	/*Long msg = System.currentTimeMillis();
	Logger.info(msg.toString());*/
		
		/*Gson gson = new Gson();
		//User user = new User();
		ImgInfo4QN returnBody = new ImgInfo4QN();
		String json = gson.toJson(returnBody);
		Logger.info(json);
		Logger.info("{\"key\":\"$(key)\",\"hash\":\"$(etag)\",\"bucket\":\"$(bucket)\",\"fsize\":$(fsize)}");
	*/
		String imgAccessLink = "http://ouuy81imh.bkt.clouddn.com/00002.jpg";
		String fileName = imgAccessLink.substring(imgAccessLink.lastIndexOf("/")+1);
		Logger.info(fileName);
	}
	
	/*public static String listToString(List<Column> columnList) {
		Iterator<Column> it = columnList.iterator();
		String modelFormatStr = null;
		if (columnList.isEmpty()) {
		     return "\"[]\"";
		   }else {
			   String tableName = columnList.get(0).getTableName();
			   String tableNameUpperCamel = StringUtils.toUpperCaseFirstOne(tableName);
			   StringBuilder buffer = new StringBuilder(16);
			   buffer.append("\""+tableNameUpperCamel+"[");
			   while(it.hasNext()) {
				   Column columnEle = it.next();
				   buffer.append(columnEle.getColumnName()+"=\"+" + columnEle.getColumnName() + "+\",");
			   }
			   int lastIndexOfComma = buffer.lastIndexOf(",");
			    modelFormatStr = buffer.substring(0, lastIndexOfComma);
			    modelFormatStr = modelFormatStr + "]\"";
		   }
		return modelFormatStr;
	}*/
}
