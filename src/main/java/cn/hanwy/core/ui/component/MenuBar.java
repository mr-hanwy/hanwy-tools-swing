package cn.hanwy.core.ui.component;

import cn.hanwy.core.ui.provider.MenuProvider;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * 菜单栏组件
 *
 * @author hanwy
 * @date 2025/8/7
 */
public abstract class MenuBar extends JMenuBar {
    private final List<? extends MenuProvider> menuProviders;

    protected MenuBar(List<? extends MenuProvider> menuProviders) {
        this.menuProviders = menuProviders;
    }

    protected void build(Component relative) {
        menuProviders.forEach(menuProvider -> add(menuProvider.provide(relative)));
    }
}