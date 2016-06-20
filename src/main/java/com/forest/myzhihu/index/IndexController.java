package com.forest.myzhihu.index;

import com.jfinal.core.Controller;

/**
 * @author zhanghaiwei
 * @version 1.0
 * @date 16/4/20 下午4:44
 */
public class IndexController extends Controller{

	public void index() throws Exception{
		renderText("测试首页测试了.....哈哈哈");
	}

}
