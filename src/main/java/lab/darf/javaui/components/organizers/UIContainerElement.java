package lab.darf.javaui.components.organizers;

import lab.darf.javaui.components.UIElement;

public interface UIContainerElement extends UIElement {
    public UIContainerElement components(UIElement ...components);
    public UIContainerElement update();
}
