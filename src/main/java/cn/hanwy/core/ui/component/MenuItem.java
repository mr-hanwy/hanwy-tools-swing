package cn.hanwy.core.ui.component;

import javax.swing.*;
import java.awt.*;

/**
 * 菜单项组件
 *
 * @author hanwy
 * @date 2025/8/7
 */
public abstract class MenuItem extends JMenuItem {
    protected abstract String text();

    protected abstract void action(Component relative);

    protected void build(Component relative) {
        setText(text());
        addActionListener(e -> action(relative));
    }
}