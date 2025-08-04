package cn.hanwy.core.ui.component;

import javax.swing.*;

/**
 * 文本标签组件基类
 *
 * @author hanwy
 * @date 2025/8/4
 */
public class AppLabel extends JLabel {
    public AppLabel(String text, Icon icon, int horizontalAlignment) {
        super(text, icon, horizontalAlignment);
    }

    public AppLabel(String text, int horizontalAlignment) {
        super(text, horizontalAlignment);
    }

    public AppLabel(String text) {
        super(text);
    }

    public AppLabel(Icon image, int horizontalAlignment) {
        super(image, horizontalAlignment);
    }

    public AppLabel(Icon image) {
        super(image);
    }

    public AppLabel() {
    }
}