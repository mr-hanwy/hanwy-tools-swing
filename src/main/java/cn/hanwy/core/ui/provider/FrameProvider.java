package cn.hanwy.core.ui.provider;

import cn.hanwy.core.ui.component.Frame;

/**
 * 窗体组件提供者
 *
 * @author hanwy
 * @date 2025/8/7
 * @see #provide()
 */
public interface FrameProvider {
    /**
     * 窗体组件提供方法
     *
     * @return {@link Frame} - 窗体组件
     */
    Frame provide();
}