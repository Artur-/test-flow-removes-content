package com.example.application.views.empty;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.router.Route;

@Route(value = "")
@JsModule("./views/empty/empty-view.ts")
@Tag("empty-view")
public class EmptyView extends LitTemplate {

    @Id
    private Div root;

    public EmptyView() {
    }
}
