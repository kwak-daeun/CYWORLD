package album.service.impl;

import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import album.dao.face.AlbumDao;
import album.service.face.AlbumService;

@Service
public class AlbumServiceImpl implements AlbumService {

	// 로그 객체
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	// DAO 객체
	@Autowired private AlbumDao albumDao;

	// Context 객체
	@Autowired private ServletContext context;
}