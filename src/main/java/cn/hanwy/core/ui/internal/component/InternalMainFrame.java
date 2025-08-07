package cn.hanwy.core.ui.internal.component;

import cn.hanwy.core.ui.component.Frame;
import cn.hanwy.core.ui.provider.MainFrameMenuBarProvider;
import cn.hanwy.core.ui.provider.MainFrameProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

/**
 * 默认主窗体
 *
 * @author hanwy
 * @date 2025/8/7
 */
@Component
public class InternalMainFrame extends Frame implements MainFrameProvider {
    /**
     * 读取配置文件中的 app.title
     */
    @Value("${app.title}")
    private String appTitle;

    protected InternalMainFrame(MainFrameMenuBarProvider mainFrameMenuBarProvider) {
        super(mainFrameMenuBarProvider);
    }

    /**
     * 设置窗体标题文本
     *
     * @return {@link String} - 窗体标题文本
     */
    @Override
    @PostConstruct
    protected String title() {
        return appTitle;
    }

    /**
     * 初始化用户界面
     */
    @Override
    protected void initUI() {
        setPreferredSize(new Dimension(800, 600));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * 窗体组件提供方法
     *
     * @return {@link Frame} - 窗体组件
     */
    @Override
    public Frame provide() {
        build();
        return this;
    }
}