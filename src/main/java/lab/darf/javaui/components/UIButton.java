package lab.darf.javaui.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Component;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.event.MouseInputAdapter;

import lab.darf.javaui.components.organizers.UIContainerElement;

public class UIButton extends JButton implements UINonContainerElement {
    public UIButton(String text) {
        super(text);
    }

    public UIButton() {
        super();
        setOpaque(false);
    }

    @Override
    public UIButton text(String text) {
        setText(text);
        return this;
    }

    @Override
    public UIButton font(Font font) {
        setFont(font);
        return this;
    }

    @Override
    public UIButton fontSize(int size) {
        setFont(getFont().deriveFont(size));
        return this;
    }

    @Override
    public UIButton bold(boolean bold) {
        setFont(getFont().deriveFont(bold ? Font.BOLD : Font.PLAIN));
        return this;
    }

    @Override
    public UIButton italic(boolean italic) {
        setFont(getFont().deriveFont(italic ? Font.ITALIC : Font.PLAIN));
        return this;
    }

    @Override
    public UIButton color(Color color) {
        setForeground(color);
        return this;
    }

    @Override
    public UIButton width(int width) {
        setSize(width, getHeight());
        return this;
    }

    @Override
    public UIButton height(int height) {
        setSize(getWidth(), height);
        return this;
    }

    @Override
    public UIButton size(int width, int height) {
        setSize(width, height);
        return this;
    }

    @Override
    public UIButton x(int x) {
        setLocation(x, getY());
        return this;
    }

    @Override
    public UIButton y(int y) {
        setLocation(getX(), y);
        return this;
    }

    @Override
    public UIButton location(int x, int y) {
        setLocation(x, y);
        return this;
    }

    @Override
    public UIButton top(UIContainerElement parentComponent, int offset) {
        setLocation(getX(), ((Component) parentComponent).getY() - getHeight() - offset);
        return this;
    }

    @Override
    public UIButton bottom(UIContainerElement parentComponent, int offset) {
        setLocation(getX(), ((Component) parentComponent).getY() + ((Component) parentComponent).getHeight() + offset);
        return this;
    }

    @Override
    public UIButton left(UIContainerElement parentComponent, int offset) {
        setLocation(((Component) parentComponent).getX() - getWidth() - offset, getY());
        return this;
    }

    @Override
    public UIButton right(UIContainerElement parentComponent, int offset) {
        setLocation(((Component) parentComponent).getX() + ((Component) parentComponent).getWidth() + offset, getY());
        return this;
    }

    @Override
    public UIButton centerHorizontal(UIContainerElement parentComponent, int offset) {
        setLocation(((Component) parentComponent).getX() + (((Component) parentComponent).getWidth() - getWidth()) / 2 + offset, getY());
        return this;
    }

    @Override
    public UIButton centerVertical(UIContainerElement parentComponent, int offset) {
        setLocation(getX(), ((Component) parentComponent).getY() + (((Component) parentComponent).getHeight() - getHeight()) / 2 + offset);
        return this;
    }

    @Override
    public UIButton center(UIContainerElement parentComponent) {
        setLocation(((Component) parentComponent).getX() + (((Component) parentComponent).getWidth() - getWidth()) / 2, ((Component) parentComponent).getY() + (((Component) parentComponent).getHeight() - getHeight()) / 2);
        return this;
    }

    @Override
    public UIButton action(MouseInputAdapter onclickevent) {
        addMouseListener(onclickevent);
        return this;
    }

    @Override
    public UIButton action(KeyListener onclickevent) {
        addKeyListener(onclickevent);
        return this;
    }

    @Override
    public Color getColor() {
        return getForeground();
    }

    @Override
    public UIButton opaque(boolean opaque) {
        setOpaque(opaque);
        return this;
    }

    @Override
    public UIButton visible(boolean visible) {
        setVisible(visible);
        return this;
    }
}
