package reply.service.impl;

import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reply.dao.face.ReplyDao;
import reply.service.face.ReplyService;

@Service
public class ReplyServiceImpl implements ReplyService {

	// 로그 객체
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	// DAO 객체
	@Autowired private ReplyDao replyDao;

	// Context 객체
	@Autowired private ServletContext context;
}