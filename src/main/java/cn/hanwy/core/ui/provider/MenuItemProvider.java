package cn.hanwy.core.ui.provider;

import cn.hanwy.core.ui.component.MenuItem;

import java.awt.*;

/**
 * 菜单项组件提供者
 *
 * @author hanwy
 * @date 2025/8/7
 * @see #provide()
 */
public interface MenuItemProvider {
    /**
     * 提供组件的方法
     *
     * @param relative 相对组件
     *
     * @return {@link MenuItem} - 菜单项组件
     */
    MenuItem provide(Component relative);
}