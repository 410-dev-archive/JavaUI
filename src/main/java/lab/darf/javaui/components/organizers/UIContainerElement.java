package lab.darf.javaui.components.organizers;

import java.util.ArrayList;

import lab.darf.javaui.components.UIElement;

public interface UIContainerElement extends UIElement {
    public UIContainerElement components(UIElement ...components);
    public ArrayList<UIElement> components();
    public UIElement component(String name);
    public UIContainerElement update();
}
