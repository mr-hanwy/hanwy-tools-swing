package cn.hanwy.core.ui.internal.component;

import cn.hanwy.core.ui.component.MenuBar;
import cn.hanwy.core.ui.internal.provider.InternalMenuProvider;
import cn.hanwy.core.ui.provider.MainFrameMenuBarProvider;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 默认主窗体菜单栏组件
 *
 * @author hanwy
 * @date 2025/8/7
 */
@Component
public class InternalMainFrameMenuBar extends MenuBar implements MainFrameMenuBarProvider {

    protected InternalMainFrameMenuBar(List<InternalMenuProvider> menuProviders) {
        super(menuProviders);
    }


    /**
     * 提供组件的方法
     *
     * @param relative 相对组件
     *
     * @return {@link MenuBar} - 菜单栏组件
     */
    @Override
    public MenuBar provide(java.awt.Component relative) {
        build(relative);
        return this;
    }
}