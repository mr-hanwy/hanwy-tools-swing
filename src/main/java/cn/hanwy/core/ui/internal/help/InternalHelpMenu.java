package cn.hanwy.core.ui.internal.help;

import cn.hanwy.core.ui.provider.MenuProvider;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 默认帮助菜单组件
 *
 * @author hanwy
 * @date 2025/8/4
 */
@Component
public class InternalHelpMenu extends MenuProvider<InternalHelpMenuItemProvider> {
    public InternalHelpMenu(List<InternalHelpMenuItemProvider> menuItemProviders) {
        super(menuItemProviders);
    }

    @Override
    public String title() {
        return "帮助";
    }
}