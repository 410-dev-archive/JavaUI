package lab.darf.javaui.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Component;
import java.awt.event.KeyListener;

import javax.swing.event.MouseInputAdapter;

import lab.darf.javaui.components.organizers.UIContainerElement;

import javax.swing.JPasswordField;

public class UIPasswordField extends JPasswordField implements UINonContainerElement {
    @Override
    public UIPasswordField visible(boolean visible) {
        setVisible(visible);
        return this;
    }

    @Override
    public UIPasswordField color(Color color) {
        setForeground(color);
        return this;
    }

    @Override
    public UIPasswordField opaque(boolean opaque) {
        setOpaque(opaque);
        return this;
    }

    @Override
    public UIPasswordField width(int width) {
        setSize(width, getHeight());
        return this;
    }

    @Override
    public UIPasswordField height(int height) {
        setSize(getWidth(), height);
        return this;
    }

    @Override
    public UIPasswordField size(int width, int height) {
        setSize(width, height);
        return this;
    }

    @Override
    public UIPasswordField x(int x) {
        setLocation(x, getY());
        return this;
    }

    @Override
    public UIPasswordField y(int y) {
        setLocation(getX(), y);
        return this;
    }

    @Override
    public UIPasswordField location(int x, int y) {
        setLocation(x, y);
        return this;
    }

    @Override
    public UIPasswordField top(UIContainerElement parentComponent, int offset) {
        setLocation(getX(), ((Component) parentComponent).getY() - getHeight() - offset);
        return this;
    }

    @Override
    public UIPasswordField bottom(UIContainerElement parentComponent, int offset) {
        setLocation(getX(), ((Component) parentComponent).getY() + ((Component) parentComponent).getHeight() + offset);
        return this;
    }

    @Override
    public UIPasswordField left(UIContainerElement parentComponent, int offset) {
        setLocation(((Component) parentComponent).getX() - getWidth() - offset, getY());
        return this;
    }

    @Override
    public UIPasswordField right(UIContainerElement parentComponent, int offset) {
        setLocation(((Component) parentComponent).getX() + ((Component) parentComponent).getWidth() + offset, getY());
        return this;
    }

    @Override
    public UIPasswordField centerHorizontal(UIContainerElement parentComponent, int offset) {
        setLocation(((Component) parentComponent).getX() + (((Component) parentComponent).getWidth() - getWidth()) / 2 + offset, getY());
        return this;
    }

    @Override
    public UIPasswordField centerVertical(UIContainerElement parentComponent, int offset) {
        setLocation(getX(), ((Component) parentComponent).getY() + (((Component) parentComponent).getHeight() - getHeight()) / 2 + offset);
        return this;
    }

    @Override
    public UIPasswordField center(UIContainerElement parentComponent) {
        setLocation(((Component) parentComponent).getX() + (((Component) parentComponent).getWidth() - getWidth()) / 2, ((Component) parentComponent).getY() + (((Component) parentComponent).getHeight() - getHeight()) / 2);
        return this;
    }

    @Override
    public UIPasswordField action(MouseInputAdapter onclickevent) {
        addMouseListener(onclickevent);
        return this;
    }

    @Override
    public UIPasswordField action(KeyListener onkeyevent) {
        addKeyListener(onkeyevent);
        return this;
    }

    @Override
    public int getX() {
        return super.getX();
    }

    @Override
    public int getY() {
        return super.getY();
    }

    @Override
    public int getWidth() {
        return super.getWidth();
    }

    @Override
    public int getHeight() {
        return super.getHeight();
    }

    @Override
    public Color getColor() {
        return getForeground();
    }

    @Override
    public UIPasswordField text(String text) {
        setText(text);
        return this;
    }

    @Override
    public UIPasswordField font(Font font) {
        setFont(font);
        return this;
    }

    @Override
    public UIPasswordField fontSize(int size) {
        setFont(getFont().deriveFont(size));
        return this;
    }

    @Override
    public UIPasswordField bold(boolean bold) {
        setFont(getFont().deriveFont(bold ? Font.BOLD : Font.PLAIN));
        return this;
    }

    @Override
    public UIPasswordField italic(boolean italic) {
        setFont(getFont().deriveFont(italic ? Font.ITALIC : Font.PLAIN));
        return this;
    }

    @Override
    public Font getFont() {
        return super.getFont();
    }

    @Override
    public String getText() {
        return new String(super.getPassword());
    }
}
