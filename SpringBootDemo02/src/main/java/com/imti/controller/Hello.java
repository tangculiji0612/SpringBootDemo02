package com.imti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**@�ļ���: Hello.java
 * @�๦��˵��: 
 * @����: LiJi
 * @Email: 451710238@qq.com
 * @����: 2020��9��21������10:05:01
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: LiJi</li> 
 * 	 <li>����: 2020��9��21������10:05:01</li> 
 *	 <li>����: </li>
 * </pre>
 */
@Controller
public class Hello {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "SpringBoot���ү�ģ��ύʧ��";
	}

}
