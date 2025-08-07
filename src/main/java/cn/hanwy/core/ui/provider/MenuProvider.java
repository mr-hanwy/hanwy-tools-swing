package cn.hanwy.core.ui.provider;

import cn.hanwy.core.ui.component.Menu;

import java.awt.*;

/**
 * 菜单组件提供者
 *
 * @author hanwy
 * @date 2025/8/7
 * @see #provide(Component)
 */
public interface MenuProvider {
    /**
     * 提供组件的方法
     *
     * @param relative 相对组件
     *
     * @return {@link Menu} - 菜单组件
     */
    Menu provide(Component relative);
}