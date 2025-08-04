package cn.hanwy.core.ui.internal.help;

import cn.hanwy.core.ui.component.AppOptionPane;

import java.awt.*;

/**
 * 默认关于菜单项组件
 *
 * @author hanwy
 * @date 2025/8/4
 */
@org.springframework.stereotype.Component
public class InternalAboutMenuItem extends InternalHelpMenuItemProvider {
    @Override
    public String text() {
        return "关于";
    }

    @Override
    public void actionListener(Component owner) {
        String msg = "Java version: " + System.getProperty("java.version") +
                "\nSpringBoot version: 2.7.6";
        AppOptionPane.showMessageDialog(owner, msg, "关于", AppOptionPane.INFORMATION_MESSAGE);
    }
}