package cn.hanwy.core.ui.component;

import javax.swing.*;
import java.awt.*;

/**
 * 窗体组件基类
 *
 * @author hanwy
 * @date 2025/8/4
 */
public abstract class AppFrame extends JFrame {
    private AppPanel contentPanel;

    /**
     * 初始化
     */
    public void init() {
        contentPanel = new AppPanel(new BorderLayout());
        this.setContentPane(contentPanel);

        initUI();
    }

    /**
     * 显示窗体
     *
     * @param component 参照组件 {@link Component}
     */
    public void showFrame(Component component) {
        if (!SwingUtilities.isEventDispatchThread()) {
            SwingUtilities.invokeLater(() -> showFrame(component));
        }

        this.pack();
        this.setLocationRelativeTo(component);
        this.setVisible(true);
    }

    public AppPanel getContentPanel() {
        return contentPanel;
    }

    /**
     * 初始化 UI
     */
    public abstract void initUI();
}