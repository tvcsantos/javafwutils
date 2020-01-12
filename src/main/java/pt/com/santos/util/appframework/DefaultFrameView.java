package pt.com.santos.util.appframework;

import org.jdesktop.application.Application;
import org.jdesktop.application.FrameView;

public abstract class DefaultFrameView<T extends Application>
        extends FrameView {
    
    public DefaultFrameView(T application) {
        super(application);
    }

    public final T getTheApplication() {
        return (T)getApplication();
    }

    protected abstract void showAboutBox();
}
