package com.example.playground;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.RolesAllowed;

@Route("/")
@RolesAllowed({"STUDENT"})
public class MainView extends VerticalLayout {
    private final SecurityService securityService;

    public MainView(SecurityService securityService) {
        this.securityService = securityService;
        String username = securityService.getAuthenticatedUser().getUsername();
        add(new Text("Welcome " + username));
    }
}
