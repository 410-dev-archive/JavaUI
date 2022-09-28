import luke.hysong.javaui.UIWindowManager;
import luke.hysong.javaui.components.UIButton;
import luke.hysong.javaui.components.UIComboBox;
import luke.hysong.javaui.components.UILabel;
import luke.hysong.javaui.components.UIScene;
import luke.hysong.javaui.components.organizers.VerticalStack;
import luke.hysong.javaui.properties.UIWindowProperty;

import javax.swing.event.MouseInputAdapter;
import java.awt.event.MouseEvent;

public class Example {
    public static void main(String[] args) {
        UIWindowManager.newWindow(
            new UIWindowProperty()
                .name("test")
                .title("Test")
        ).loadScene(
            new UIScene()
                .components(
                    new VerticalStack()
                        .components(
                            new UILabel("Hello World")
                                .width(100),
                            new UIButton("Click Me")
                                .width(100)
                                .action(new MouseInputAdapter() {
                                    public void mouseClicked(MouseEvent e) {
                                        UIWindowManager.newWindow(
                                            new UIWindowProperty()
                                                .name("Popup")
                                                .title("Popup")
                                        ).loadScene(
                                            new UIScene()
                                                .components(
                                                    new UILabel("Hello World")
                                                        .width(100)
                                                        .height(100)
                                                )
                                        );
                                    }
                                }
                            )
                        )
                )
        );
    }
}
