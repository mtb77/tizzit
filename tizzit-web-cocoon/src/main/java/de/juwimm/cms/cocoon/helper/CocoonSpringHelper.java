/**
 * Copyright (c) 2009 Juwi MacMillan Group GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.juwimm.cms.cocoon.helper;

import java.util.Map;

import javax.servlet.ServletContext;

import org.apache.cocoon.environment.http.HttpEnvironment;
import org.apache.log4j.Logger;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * 
 * @author <a href="sascha.kulawik@juwimm.com">Sascha-Matthias Kulawik</a>
 * @version $Id$
 */
public class CocoonSpringHelper {
	private static Logger log = Logger.getLogger(CocoonSpringHelper.class);
	private static WebApplicationContext webApplicationContext = null;

	public static final String WEB_SERVICE_SPRING = "webServiceSpring";
	public static final String SAFEGUARD_SERVICE_SPRING = "safeguardServiceSpring";
	public static final String SEARCHENGINE_SERVICE_SPRING = "searchengineService";
	public static final String PLUGIN_CACHE_ACCESSOR = "pluginCacheAccessor";
	public static final String MODIFIED_DATE_CONTENT_HANDLER = "modifiedDateContentHandler";

	public static Object getBean(Map objectModel, String beanName) {
		if (webApplicationContext == null) {
			if (log.isDebugEnabled()) log.debug("CocoonSpringHelper resolves WebApplicationContext");
			ServletContext servContext = (ServletContext) objectModel.get(HttpEnvironment.HTTP_SERVLET_CONTEXT);
			webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(servContext);
		}
		return webApplicationContext.getBean(beanName);
	}

}
