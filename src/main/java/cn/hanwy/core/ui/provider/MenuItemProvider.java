package cn.hanwy.core.ui.provider;

import cn.hanwy.core.ui.component.AppMenuItem;

import java.awt.*;

/**
 * 菜单项组件提供者
 *
 * @author hanwy
 * @date 2025/8/4
 */
public abstract class MenuItemProvider {
    private final AppMenuItem menuItem;

    public MenuItemProvider() {
        menuItem = new AppMenuItem(text());
    }

    public AppMenuItem provide(Component owner) {
        menuItem.addActionListener(e -> actionListener(owner));
        return menuItem;
    }

    public abstract String text();

    public abstract void actionListener(Component owner);
}