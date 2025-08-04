package cn.hanwy.core.ui.internal.file;

import cn.hanwy.core.ui.provider.MenuProvider;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 默认文件菜单组件
 *
 * @author hanwy
 * @date 2025/8/4
 */
@Component
public class InternalFileMenu extends MenuProvider<InternalFileMenuItemProvider> {
    public InternalFileMenu(List<InternalFileMenuItemProvider> menuItemProviders) {
        super(menuItemProviders);
    }

    @Override
    public String title() {
        return "文件";
    }
}