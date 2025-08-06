package cn.hanwy.core.ui.component;

import javax.swing.*;
import java.awt.*;

/**
 * 窗体组件
 *
 * @author hanwy
 * @date 2025/8/7
 */
public abstract class Frame extends JFrame {
    /**
     * 设置窗体标题文本
     *
     * @return {@link String} - 窗体标题文本
     */
    protected abstract String title();

    /**
     * 初始化用户界面
     */
    protected abstract void initUI();

    /**
     * 构建窗体组件
     */
    protected void build() {
        setTitle(title());
        setContentPane(new Panel(new BorderLayout()));

        initUI();
    }

    /**
     * 显示窗体
     *
     * @param relative <ul>
     * <li>如果<code>relative</code>是<code>null</code>，或者与此<code>relative</code><code>null</code>关联的
     * 是<code>GraphicsConfiguration</code>>，则窗口将放置在屏幕中央。中心点可以用该<code>GraphicsEnvironment .getCenterPoint</code>方法获得。</li>
     * <li>如果<code>relative</code>不是<code>null</code>，但当前未显示，则窗口将放置在与此<code>relative</code>关联的目标<code>GraphicsConfiguration</code>屏幕的中心。</li>
     * <li>如果<code>relative</code>不是<code>null</code>并且显示在屏幕上，则窗口的位置使窗口的中心与<code>relative</code>的中心重合。</li>
     * </ul>
     */
    public void show(Component relative) {
        if (!SwingUtilities.isEventDispatchThread()) {
            SwingUtilities.invokeLater(() -> show(relative));
        }

        pack();
        setLocationRelativeTo(relative);
        setVisible(true);
    }
}