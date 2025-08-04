package cn.hanwy.core.ui.internal.file;

import cn.hanwy.core.ui.component.AppOptionPane;

import java.awt.*;

/**
 * 默认退出菜单项组件
 *
 * @author hanwy
 * @date 2025/8/4
 */
@org.springframework.stereotype.Component
public class InternalExitMenuItemInternal extends InternalFileMenuItemProvider {
    @Override
    public String text() {
        return "退出";
    }

    @Override
    public void actionListener(Component owner) {
        int result = AppOptionPane.showConfirmDialog(owner, "确定要退出程序吗？", "退出提示", AppOptionPane.YES_NO_OPTION);
        if (result == AppOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
}