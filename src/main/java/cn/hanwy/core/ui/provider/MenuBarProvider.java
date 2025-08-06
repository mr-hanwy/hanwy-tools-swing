package cn.hanwy.core.ui.provider;

import cn.hanwy.core.ui.component.MenuBar;

/**
 * 菜单栏组件提供者
 *
 * @author hanwy
 * @date 2025/8/7
 * @see #provide()
 */
public interface MenuBarProvider {
    /**
     * 菜单栏组件提供方法
     *
     * @return {@link MenuBar} - 菜单栏组件
     */
    MenuBar provide();
}