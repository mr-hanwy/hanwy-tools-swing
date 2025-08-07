package cn.hanwy.core.ui.internal.component.files;

import cn.hanwy.core.ui.component.MenuItem;
import cn.hanwy.core.ui.component.OptionPane;
import cn.hanwy.core.ui.internal.provider.InternalFilesMenuItemProvider;

import java.awt.*;

/**
 * 默认退出菜单项
 *
 * @author hanwy
 * @date 2025/8/7
 */
@org.springframework.stereotype.Component
public class InternalExitMenuItem extends MenuItem implements InternalFilesMenuItemProvider {
    @Override
    protected String text() {
        return "退出";
    }

    @Override
    protected void action(Component relative) {
        int result = OptionPane.showConfirmDialog(relative, "确定要退出应用吗？", "退出提示", OptionPane.YES_NO_OPTION);
        if (result == OptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    /**
     * 提供组件的方法
     *
     * @param relative 相对组件
     *
     * @return {@link MenuItem} - 菜单项组件
     */
    @Override
    public MenuItem provide(Component relative) {
        build(relative);
        return this;
    }
}