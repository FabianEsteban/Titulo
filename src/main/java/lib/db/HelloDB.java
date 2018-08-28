package lib.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


import lib.classTI.clase;

public class HelloDB {

	@SuppressWarnings("finally")
	public static ArrayList<clase> getVariable() throws Exception {
		System.out.println("ENTRA");
		PreparedStatement ps = null;
		String sql = "";
		ArrayList<clase> data = new ArrayList<clase>();
		ConnectionDB db = new ConnectionDB();
		try{
			sql = "select * from datos";
			
			ps = db.conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				clase c = new clase();
				c.setNombre(rs.getString("nombre"));
				data.add(c);
			}
			rs.close();
			ps.close();
			db.conn.close();
		}catch(Exception ex){
			System.out.println("Error getclase:"+ex.getMessage());
		}
		finally{
			ps.close();
			db.close();

		return data;
		}
	}
}
