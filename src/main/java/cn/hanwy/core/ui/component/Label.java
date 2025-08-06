package cn.hanwy.core.ui.component;

import javax.swing.*;

/**
 * 文本标签组件
 *
 * @author hanwy
 * @date 2025/8/7
 */
public class Label extends JLabel {
    public Label(String text, Icon icon, int horizontalAlignment) {
        super(text, icon, horizontalAlignment);
    }

    public Label(String text, int horizontalAlignment) {
        super(text, horizontalAlignment);
    }

    public Label(String text) {
        super(text);
    }

    public Label(Icon image, int horizontalAlignment) {
        super(image, horizontalAlignment);
    }

    public Label(Icon image) {
        super(image);
    }

    public Label() {
    }
}