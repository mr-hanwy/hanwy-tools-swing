package cn.hanwy.core.ui.provider;

import cn.hanwy.core.ui.component.AppMenu;

import java.awt.*;
import java.util.List;

/**
 * 菜单组件提供者
 *
 * @author hanwy
 * @date 2025/8/4
 */
public abstract class MenuProvider<T extends MenuItemProvider> {
    private final List<T> menuItemProviders;
    private final AppMenu menu;

    public MenuProvider(List<T> menuItemProviders) {
        this.menuItemProviders = menuItemProviders;
        menu = new AppMenu(title());
    }

    public AppMenu provide(Component owner) {
        menuItemProviders.forEach(menuItemProvider -> menu.add(menuItemProvider.provide(owner)));
        return menu;
    }

    public abstract String title();
}