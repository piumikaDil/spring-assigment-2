package lk.ijse.assigment.config;
//Author : Piumika Dilshan
//Connect : piumikadil@gmail.com

import lk.ijse.assigment.WebAppInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = WebAppInitializer.class)
public class WebAppConfig {

}
