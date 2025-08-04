package cn.hanwy.core.ui.component;

import javax.swing.*;
import java.awt.*;

/**
 * 面板组件基类
 *
 * @author hanwy
 * @date 2025/8/4
 */
public class AppPanel extends JPanel {
    public AppPanel(LayoutManager layout, boolean isDoubleBuffered) {
        super(layout, isDoubleBuffered);
    }

    public AppPanel(LayoutManager layout) {
        super(layout);
    }

    public AppPanel(boolean isDoubleBuffered) {
        super(isDoubleBuffered);
    }

    public AppPanel() {
    }
}