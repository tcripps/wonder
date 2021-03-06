package er.directtoweb.components;

import com.webobjects.appserver.WOContext;
import com.webobjects.appserver.WOResponse;
import com.webobjects.directtoweb.D2WStatelessComponent;

import er.extensions.components.ERXClickToOpenSupport;

public class ERD2WStatelessComponent extends D2WStatelessComponent {

    public ERD2WStatelessComponent(WOContext aContext) {
        super(aContext);
    }
    /**
     * Returns whether or not click-to-open should be enabled for this component.  By
     * default this returns ERXClickToOpenSupport.isEnabled().
     * 
     * @param response the response
     * @param context the context
     * @return whether or not click-to-open is enabled for this component
     */
    public boolean clickToOpenEnabled(WOResponse response, WOContext context) {
        return ERXClickToOpenSupport.isEnabled();
    }

    /**
     * Adds support for ClickToOpen (TM).
     */
    @Override
    public void appendToResponse(WOResponse response, WOContext context) {
        boolean clickToOpenEnabled = clickToOpenEnabled(response, context); 
        ERXClickToOpenSupport.preProcessResponse(response, context, clickToOpenEnabled);
        super.appendToResponse(response, context);
        ERXClickToOpenSupport.postProcessResponse(getClass(), response, context, clickToOpenEnabled);
    }
    
}
