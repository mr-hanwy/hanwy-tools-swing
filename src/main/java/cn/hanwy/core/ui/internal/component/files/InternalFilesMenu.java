package cn.hanwy.core.ui.internal.component.files;

import cn.hanwy.core.ui.component.Menu;
import cn.hanwy.core.ui.internal.provider.InternalFilesMenuItemProvider;
import cn.hanwy.core.ui.internal.provider.InternalMenuProvider;

import java.awt.*;
import java.util.List;

/**
 * 默认文件菜单
 *
 * @author hanwy
 * @date 2025/8/7
 */
@org.springframework.stereotype.Component
public class InternalFilesMenu extends Menu implements InternalMenuProvider {
    protected InternalFilesMenu(List<InternalFilesMenuItemProvider> itemProviders) {
        super(itemProviders);
    }

    @Override
    protected String text() {
        return "文件";
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

        int itemCount = getItemCount();
        if (itemCount > 2) {
            insertSeparator(itemCount - 1);
        }

        return this;
    }
}