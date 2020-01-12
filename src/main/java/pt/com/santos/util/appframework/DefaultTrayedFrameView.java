package pt.com.santos.util.appframework;

import javax.swing.ImageIcon;
import pt.com.santos.util.gui.awt.JXTrayIcon;

public abstract class DefaultTrayedFrameView
        <T extends DefaultSingleFrameApplication>
        extends TrayedFrameView<T>
{
    public DefaultTrayedFrameView(T application) {
        super(application);
        if (getTheApplication().getFrameIcon() != null)
            getFrame().setIconImage(
                    getTheApplication().getFrameIcon().getImage());
    }

    @Override
    protected String getTrayApplicationName() {
        return getTheApplication().getShortName();
    }

    @Override
    protected JXTrayIcon createTrayIcon() {
        ImageIcon icon = getTheApplication().getTrayImageIcon();
        if (icon != null) return new JXTrayIcon(icon.getImage());
        return null;
    }
}
