package cn.hanwy.core.ui.component;

import javax.swing.*;

/**
 * 菜单组件基类
 *
 * @author hanwy
 * @date 2025/8/4
 */
public class AppMenu extends JMenu {
    public AppMenu() {
    }

    public AppMenu(String s) {
        super(s);
    }

    public AppMenu(Action a) {
        super(a);
    }

    public AppMenu(String s, boolean b) {
        super(s, b);
    }
}