package com.imti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**@文件名: Hello.java
 * @类功能说明: 
 * @作者: LiJi
 * @Email: 451710238@qq.com
 * @日期: 2020年9月21日下午10:05:01
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: LiJi</li> 
 * 	 <li>日期: 2020年9月21日下午10:05:01</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Controller
public class Hello {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "SpringBoot你大爷的！提交失败";
	}

}
