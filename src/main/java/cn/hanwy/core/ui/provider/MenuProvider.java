package cn.hanwy.core.ui.provider;

import cn.hanwy.core.ui.component.Menu;

/**
 * 菜单组件提供者
 *
 * @author hanwy
 * @date 2025/8/7
 * @see #provide()
 */
public interface MenuProvider {
    /**
     * 菜单组件提供方法
     *
     * @return {@link Menu} - 菜单组件
     */
    Menu provide();
}