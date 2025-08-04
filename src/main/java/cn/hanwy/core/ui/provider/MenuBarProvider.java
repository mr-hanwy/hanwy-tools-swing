package cn.hanwy.core.ui.provider;

import cn.hanwy.core.ui.component.AppMenuBar;

import java.awt.*;

/**
 * 菜单栏组件提供者
 *
 * @author hanwy
 * @date 2025/8/4
 */
public abstract class MenuBarProvider {
    public abstract AppMenuBar provide(Component owner);
}