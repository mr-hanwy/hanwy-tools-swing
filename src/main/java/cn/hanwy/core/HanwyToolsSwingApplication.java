package cn.hanwy.core;

import cn.hanwy.core.ui.component.AppFrame;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "cn.hanwy")
public class HanwyToolsSwingApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = new SpringApplicationBuilder(HanwyToolsSwingApplication.class).headless(false)
                                                                                                           .web(WebApplicationType.NONE)
                                                                                                           .run(args);
        AppFrame appFrame = run.getBean(AppFrame.class);
        appFrame.showFrame(null);
    }

}