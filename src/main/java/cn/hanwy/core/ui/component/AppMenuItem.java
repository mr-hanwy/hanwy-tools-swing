package cn.hanwy.core.ui.component;

import javax.swing.*;

/**
 * 菜单项组件基类
 *
 * @author hanwy
 * @date 2025/8/4
 */
public class AppMenuItem extends JMenuItem {
    public AppMenuItem() {
    }

    public AppMenuItem(Icon icon) {
        super(icon);
    }

    public AppMenuItem(String text) {
        super(text);
    }

    public AppMenuItem(Action a) {
        super(a);
    }

    public AppMenuItem(String text, Icon icon) {
        super(text, icon);
    }

    public AppMenuItem(String text, int mnemonic) {
        super(text, mnemonic);
    }
}