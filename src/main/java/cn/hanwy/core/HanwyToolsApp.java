package cn.hanwy.core;

import cn.hanwy.core.ui.provider.MainFrameProvider;
import cn.hanwy.core.util.FontUtil;
import org.springframework.boot.Banner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "cn.hanwy")
public class HanwyToolsApp {

    public static void main(String[] args) {
        FontUtil.setGlobalFontForDefaultFont();
        ConfigurableApplicationContext ctx = new SpringApplicationBuilder(HanwyToolsApp.class).headless(false)
                                                                                              .web(WebApplicationType.NONE)
                                                                                              .bannerMode(Banner.Mode.OFF)
                                                                                              .run(args);

        MainFrameProvider mainFrameProvider = ctx.getBean(MainFrameProvider.class);
        mainFrameProvider.provide().show(null);
    }

}