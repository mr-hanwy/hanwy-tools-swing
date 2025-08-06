package cn.hanwy.core.util;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.util.Enumeration;

/**
 * 字体工具类
 *
 * @author hanwy
 * @date 2025/8/4
 * @see FontStyle
 * @see #getDefaultFont()
 * @see #createFont(String, FontStyle, int)
 * @see #setGlobalFontForDefaultFont()
 * @see #setGlobalFont(Font)
 */
public class FontUtil {
    /**
     * 最小字体大小
     */
    private final static int MIN_FONT_SIZE = 10;
    /**
     * 最小字体大小
     */
    private final static int MAX_FONT_SIZE = 24;
    /**
     * 默认字体大小
     */
    private final static int DEFAULT_FONT_SIZE = 12;

    /**
     * 获取默认字体
     *
     * @return {@link Font}
     */
    public static Font getDefaultFont() {
        return createFont("微软雅黑", FontStyle.PLAIN, DEFAULT_FONT_SIZE);
    }

    /**
     * 创建新的字体
     *
     * @param fontName 字体名称
     * @param style 字体样式 {@link FontStyle}
     * @param size 字体大小
     *
     * @return {@link Font}
     */
    public static Font createFont(String fontName, FontStyle style, int size) {
        return new Font(fontName, style.getStyle(), Math.min(Math.max(size, MIN_FONT_SIZE), MAX_FONT_SIZE));
    }

    /**
     * 将默认字体设置为全局组件字体
     */
    public static void setGlobalFontForDefaultFont() {
        setGlobalFont(getDefaultFont());
    }

    /**
     * 设置全局组件字体
     *
     * @param font {@link Font}
     */
    public static void setGlobalFont(Font font) {
        FontUIResource fontUIResource = new FontUIResource(font);
        Enumeration<Object> keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            if (value instanceof FontUIResource) {
                UIManager.put(key, fontUIResource);
            }
        }

        for (Window window : Window.getWindows()) {
            SwingUtilities.updateComponentTreeUI(window);
        }
    }

    /**
     * 字体样式
     *
     * @see #PLAIN
     * @see #BOLD
     * @see #ITALIC
     * @see #BOLD_ITALIC
     */
    public enum FontStyle {
        /**
         * 常规，等同于 {@link Font#PLAIN}
         */
        PLAIN(Font.PLAIN),
        /**
         * 粗体，等同于 {@link Font#BOLD}
         */
        BOLD(Font.BOLD),
        /**
         * 斜体，等同于 {@link Font#ITALIC}
         */
        ITALIC(Font.ITALIC),
        /**
         * 粗斜体，等同于 {@link Font#BOLD}|{@link Font#ITALIC}
         */
        BOLD_ITALIC(Font.BOLD | Font.ITALIC);

        final int style;

        FontStyle(int style) {
            this.style = style;
        }

        public int getStyle() {
            return style;
        }
    }
}