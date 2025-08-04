package cn.hanwy.core.ui.internal;

import cn.hanwy.core.ui.component.AppFrame;
import cn.hanwy.core.ui.component.AppLabel;
import cn.hanwy.core.ui.component.AppPanel;
import cn.hanwy.core.ui.provider.MenuBarProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

/**
 * 默认主窗体
 *
 * @author hanwy
 * @date 2025/8/4
 */
@Component
public class InternalMainFrame extends AppFrame {
    @Value("${app.title}")
    String appTitle;

    public InternalMainFrame(MenuBarProvider menuBarProvider) {
        this.setPreferredSize(new Dimension(800, 600));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setJMenuBar(menuBarProvider.provide(this));
    }

    @PostConstruct
    public void init() {
        this.setTitle(appTitle);
        super.init();
    }

    /**
     * 初始化 UI
     */
    @Override
    public void initUI() {
        AppPanel panel = new AppPanel(new BorderLayout());

        AppLabel welcomeLabel = new AppLabel("Welcome to " + appTitle, SwingConstants.CENTER);
        welcomeLabel.setFont(welcomeLabel.getFont().deriveFont(Font.BOLD, 24));
        panel.add(welcomeLabel, BorderLayout.CENTER);

        add(panel, BorderLayout.CENTER);
    }
}