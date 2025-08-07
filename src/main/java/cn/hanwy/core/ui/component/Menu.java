package cn.hanwy.core.ui.component;

import cn.hanwy.core.ui.provider.MenuItemProvider;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * 菜单组件
 *
 * @author hanwy
 * @date 2025/8/7
 */
public abstract class Menu extends JMenu {
    private final List<? extends MenuItemProvider> itemProviders;

    protected Menu(List<? extends MenuItemProvider> itemProviders) {
        this.itemProviders = itemProviders;
    }

    protected abstract String text();

    protected void build(Component relative) {
        setText(text());
        itemProviders.forEach(itemProvider -> add(itemProvider.provide(relative)));
    }
}