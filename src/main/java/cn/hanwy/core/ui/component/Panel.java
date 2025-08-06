package cn.hanwy.core.ui.component;

import javax.swing.*;
import java.awt.*;

/**
 * 面板组件
 *
 * @author hanwy
 * @date 2025/8/7
 */
public class Panel extends JPanel {
    public Panel(LayoutManager layout, boolean isDoubleBuffered) {
        super(layout, isDoubleBuffered);
    }

    public Panel(LayoutManager layout) {
        super(layout);
    }

    public Panel(boolean isDoubleBuffered) {
        super(isDoubleBuffered);
    }

    public Panel() {
    }
}