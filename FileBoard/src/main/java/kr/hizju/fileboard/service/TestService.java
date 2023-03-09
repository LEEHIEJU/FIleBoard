package kr.hizju.fileboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hizju.fileboard.dao.TestDAO;

@Service
public class TestService {
	
	@Autowired 
	private TestDAO testDAO;
	
	public String selectToday() {
		return testDAO.selectToday();
	}
}
