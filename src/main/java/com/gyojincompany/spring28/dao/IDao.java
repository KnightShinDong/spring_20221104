package com.gyojincompany.spring28.dao;

import java.util.ArrayList;

import com.gyojincompany.spring28.dto.ContentDto;

	public interface IDao {  //추상매소드 - 반듯이(강제)로 사용( contentDao)

	public void deleteDao(String mid);
	public void writeDao(String mwriter, String mcontent);
	public ArrayList<ContentDto> listDao();

}
