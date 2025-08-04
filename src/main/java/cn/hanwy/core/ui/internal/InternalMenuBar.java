package cn.hanwy.core.ui.internal;

import cn.hanwy.core.ui.component.AppMenuBar;
import cn.hanwy.core.ui.provider.MenuBarProvider;
import cn.hanwy.core.ui.provider.MenuProvider;

import java.awt.*;
import java.util.List;

/**
 * 默认菜单栏组件
 *
 * @author hanwy
 * @date 2025/8/4
 */
@org.springframework.stereotype.Component
public class InternalMenuBar extends MenuBarProvider {
    private final List<MenuProvider> menuProviders;

    public InternalMenuBar(List<MenuProvider> menuProviders) {this.menuProviders = menuProviders;}

    @Override
    public AppMenuBar provide(Component owner) {
        AppMenuBar menuBar = new AppMenuBar();
        menuProviders.forEach(menuProvider -> {menuBar.add(menuProvider.provide(owner));});
        return menuBar;
    }
}