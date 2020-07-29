package otomasyonsistemi;

import java.sql.ResultSet;    
import java.sql.SQLException;    
import java.util.List;    
import org.springframework.jdbc.core.BeanPropertyRowMapper;    
import org.springframework.jdbc.core.JdbcTemplate;    
import org.springframework.jdbc.core.RowMapper;    
import otomasyonsistemi.ogrenci;    

public class ogrenciDao {
	JdbcTemplate template;    
    
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}    
	public int save(ogrenci p){    
	    String sql="insert into ogrenci(ad,soyad,bolum) values('"+p.getAd()+"',"+p.getSoyad()+",'"+p.getBolum()+"')";    
	    return template.update(sql);    
	}    
	public int update(ogrenci p){    
	    String sql="update ogrenci set ad='"+p.getAd()+"', soyad="+p.getSoyad()+",bolum='"+p.getBolum()+"' where id="+p.getId()+"";    
	    return template.update(sql);    
	}    
	public int delete(int id){    
	    String sql="delete from ogrenci where id="+id+"";    
	    return template.update(sql);    
	}    
	public ogrenci getogrById(int id){    
	    String sql="select * from ogrenci where id=?";    
	    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<ogrenci>(ogrenci.class));    
	}    
	public List<ogrenci> getogrenci(){    
	    return template.query("select * from ogrenci",new RowMapper<ogrenci>(){    
	        public ogrenci mapRow(ResultSet rs, int row) throws SQLException {    
	            ogrenci o=new ogrenci();    
	            o.setId(rs.getInt(1));    
	            o.setAd(rs.getString(2));    
	            o.setSoyad(rs.getString(3));    
	            o.setBolum(rs.getString(4));    
	            return o;    
	        }    
	    });    
	} 

}
