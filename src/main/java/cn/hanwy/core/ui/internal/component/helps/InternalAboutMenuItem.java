package cn.hanwy.core.ui.internal.component.helps;

import cn.hanwy.core.ui.component.MenuItem;
import cn.hanwy.core.ui.component.OptionPane;

import java.awt.*;

/**
 * 默认关于菜单项
 *
 * @author hanwy
 * @date 2025/8/7
 */
@org.springframework.stereotype.Component
public class InternalAboutMenuItem extends MenuItem implements InternalHelpsMenuItemProvider {
    @Override
    protected String text() {
        return "关于";
    }

    @Override
    protected void action(Component relative) {
        String msg = "Java version: " + System.getProperty("java.version");
        msg += "\nSpring Boot version: 2.7.6";
        OptionPane.showMessageDialog(relative, msg, "关于", OptionPane.INFORMATION_MESSAGE);
    }

    /**
     * 提供组件的方法
     *
     * @param relative 相对组件
     *
     * @return {@link MenuItem} - 菜单项组件
     */
    @Override
    public MenuItem provide(Component relative) {
        build(relative);
        return this;
    }
}