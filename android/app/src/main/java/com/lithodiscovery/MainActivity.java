package com.lithodiscovery;

import android.os.Bundle;

import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.LithoView;
import com.facebook.litho.widget.Text;
import com.facebook.react.ReactActivity;

public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "LithoDiscovery";
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ComponentContext context = new ComponentContext(this);

        final Component component = ListItem.create(context).build();
//                .text("Hello World")
//                .textSizeDip(50)
//                .build();

        setContentView(LithoView.create(context, component));
    }
}
