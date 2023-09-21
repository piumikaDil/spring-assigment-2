package lk.ijse.assigment;//Author : Piumika Dilshan
//Connect : piumikadil@gmail.com

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import lk.ijse.assigment.config.WebAppConfig;
import lk.ijse.assigment.config.WebRootConfig;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
{

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{WebRootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebAppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
