package cn.hanwy.core.ui.provider;

import cn.hanwy.core.ui.component.MenuBar;

import java.awt.*;

/**
 * 菜单栏组件提供者
 *
 * @author hanwy
 * @date 2025/8/7
 * @see #provide(Component)
 */
public interface MenuBarProvider {
    /**
     * 提供组件的方法
     *
     * @param relative 相对组件
     *
     * @return {@link MenuBar} - 菜单栏组件
     */
    MenuBar provide(Component relative);
}