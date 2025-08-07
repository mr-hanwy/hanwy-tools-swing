package cn.hanwy.core.ui.internal.component.helps;

import cn.hanwy.core.ui.component.Menu;
import cn.hanwy.core.ui.internal.provider.InternalMenuProvider;

import java.awt.*;
import java.util.List;

/**
 * 默认帮助菜单
 *
 * @author hanwy
 * @date 2025/8/7
 */
@org.springframework.stereotype.Component
public class InternalHelpsMenu extends Menu implements InternalMenuProvider {
    protected InternalHelpsMenu(List<InternalHelpsMenuItemProvider> itemProviders) {
        super(itemProviders);
    }

    @Override
    protected String text() {
        return "帮助";
    }

    /**
     * 提供组件的方法
     *
     * @param relative 相对组件
     *
     * @return {@link Menu} - 菜单组件
     */
    @Override
    public Menu provide(Component relative) {
        build(relative);
        return this;
    }
}