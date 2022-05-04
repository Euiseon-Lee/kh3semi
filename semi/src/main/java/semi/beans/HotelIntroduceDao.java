package semi.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class HotelIntroduceDao {
	
	//목록
	public List<HotelIntroduceDto> selectList() throws Exception{
		Connection con = JdbcUtils.getConnection();
		
		String sql = "select * from hotel_introduce";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		List<HotelIntroduceDto> list = new ArrayList<>();
		
		while(rs.next()) {
			HotelIntroduceDto hotelIntroduceDto = new HotelIntroduceDto();
			
			hotelIntroduceDto.setHotelIntroduceWriter(rs.getString("hotel_introduce_writer"));
			hotelIntroduceDto.setHotelIntroduceHead(rs.getString("hotel_introduce_head"));
			hotelIntroduceDto.setHotelIntroduceContent(rs.getString("hotel_introduce_content"));
			hotelIntroduceDto.setHotelIntroduceNo(rs.getInt("hotel_introduce_no"));
			list.add(hotelIntroduceDto);
		}
	
			con.close();
			
			return list;
	}

	//상세보기 
	public HotelIntroduceDto selectOne(int hotelIntroduceNo) throws Exception {
		Connection con = JdbcUtils.getConnection();
		
		String sql = "select * from hotel_introduce where hotel_introduce_no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, hotelIntroduceNo);
		ResultSet rs = ps.executeQuery();
		
		HotelIntroduceDto hotelIntroduceDto;
		if(rs.next()) {
			hotelIntroduceDto = new HotelIntroduceDto();
			
			hotelIntroduceDto.setHotelIntroduceWriter(rs.getString("hotel_introduce_writer"));
			hotelIntroduceDto.setHotelIntroduceHead(rs.getString("hotel_introduce_head"));
			hotelIntroduceDto.setHotelIntroduceContent(rs.getString("hotel_introduce_content"));
			hotelIntroduceDto.setHotelIntroduceNo(rs.getInt("hotel_introduce_no"));
		}
		else {
			hotelIntroduceDto = null;
		}
		con.close();
		return hotelIntroduceDto;
	}
	
}