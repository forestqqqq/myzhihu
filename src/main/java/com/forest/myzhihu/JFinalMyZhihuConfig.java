package com.forest.myzhihu;

import com.forest.myzhihu.index.IndexController;
import com.jfinal.config.*;

/**
 * @author zhanghaiwei
 * @version 1.0
 * @date 16/4/20 下午4:32
 */
public class JFinalMyZhihuConfig extends JFinalConfig {
	@Override
	public void configConstant(Constants constants) {
		constants.setDevMode(true);
	}

	@Override
	public void configRoute(Routes routes) {
		routes.add("/", IndexController.class);
	}

	@Override
	public void configPlugin(Plugins plugins) {

	}

	@Override
	public void configInterceptor(Interceptors interceptors) {

	}

	@Override
	public void configHandler(Handlers handlers) {

	}
}
