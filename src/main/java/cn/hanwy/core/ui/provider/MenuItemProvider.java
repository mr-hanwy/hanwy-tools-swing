package cn.hanwy.core.ui.provider;

import cn.hanwy.core.ui.component.MenuItem;

/**
 * 菜单项组件提供者
 *
 * @author hanwy
 * @date 2025/8/7
 * @see #provide()
 */
public interface MenuItemProvider {
    /**
     * 菜单项组件提供方法
     *
     * @return {@link MenuItem} - 菜单项组件
     */
    MenuItem provide();
}