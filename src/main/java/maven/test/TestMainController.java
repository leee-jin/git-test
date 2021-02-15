package maven.test;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestMainController {
	
	/** EgovMessageSource */
	@Resource(name = "messageSource")
	MessageSource messageSource;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TestMainController.class);
	
	/**
	 * @param kwrdAnalyVO
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/test/main.do")
	public String kwrdMain(Model model, HttpServletRequest request) throws Exception {
		System.out.println("main");
		return "/main";
	}

}
