// Generated by the WOLips Templateengine Plug-in at Oct 1, 2006 2:16:32 PM

import com.webobjects.foundation.NSLog;

import er.extensions.appserver.ERXApplication;

public class Application extends ERXApplication {
    
    public static void main(String argv[]) {
    	ERXApplication.main(argv, Application.class);
    }

    public Application() {
        super();
        NSLog.out.appendln("Welcome to " + this.name() + " !");
        /* ** put your initialization code in here ** */
    }
}