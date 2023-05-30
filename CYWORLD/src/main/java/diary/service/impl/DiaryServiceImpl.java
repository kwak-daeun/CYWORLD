package diary.service.impl;

import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import diary.dao.face.DiaryDao;
import diary.service.face.DiaryService;

@Service
public class DiaryServiceImpl implements DiaryService {

	// 로그 객체
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	// DAO 객체
	@Autowired private DiaryDao diaryDao;

	// Context 객체
	@Autowired private ServletContext context;	
}