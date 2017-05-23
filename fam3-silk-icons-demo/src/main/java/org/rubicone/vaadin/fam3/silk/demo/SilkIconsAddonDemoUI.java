/*
 * Copyright 2017 Jaroslav Bien.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package org.rubicone.vaadin.fam3.silk.demo;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.ExternalResource;
import com.vaadin.server.Resource;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.Accordion;
import com.vaadin.ui.Button;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;
import javax.servlet.annotation.WebServlet;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.rubicone.vaadin.fam3.silk.Fam3SilkIcon;

@Theme("silkiconsaddondemotheme")
@Title("Vaadin Famfamfam Silk Icons addon demo")
public class SilkIconsAddonDemoUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        VerticalLayout mainLayout = new VerticalLayout();
        
        mainLayout.addComponent(this.createTitle());
        
        mainLayout.addComponent(this.createButtonWithIcon());
        mainLayout.addComponent(this.createLink());
        mainLayout.addComponent(this.createImage());
        mainLayout.addComponent(this.createPanel());
        mainLayout.addComponent(this.createCheckBox());
        mainLayout.addComponent(this.createTextField());
        mainLayout.addComponent(this.createTabSheet());
        mainLayout.addComponent(this.createAccordion());
        mainLayout.addComponent(this.createComboBox());
        mainLayout.addComponent(this.createMenuBar());
        
        super.setContent(mainLayout);
    }
    
    private Label createTitle() {
        return new Label("<h1>Vaadin Famfamfam Silk Icons addon demo</h1>", ContentMode.HTML);
    }
    
    private Button createButtonWithIcon() {
        return new Button("button with icon", Fam3SilkIcon.BUG);
    }
    
    private Link createLink() {
        Link l = new Link("link with icon", new ExternalResource("http://rubicone.org"));
        l.setIcon(Fam3SilkIcon.LINK);
        return l;
    }
    
    private Image createImage() {
        return new Image("Icon as image", Fam3SilkIcon.FLAG_RED);
    }
    
    private Panel createPanel() {
        Panel p = new Panel("panel with icon");
        p.setIcon(Fam3SilkIcon.ANCHOR);
        p.setContent(new Label("content"));
        return p;
    }
    
    private CheckBox createCheckBox() {
        CheckBox cb = new CheckBox("see colors");
        cb.setIcon(Fam3SilkIcon.RAINBOW);
        return cb;
    }
    
    private TextField createTextField() {
        TextField tf = new TextField("Username");
        tf.setPlaceholder("enter username");
        tf.addStyleName(ValoTheme.TEXTFIELD_INLINE_ICON);
        tf.setIcon(Fam3SilkIcon.USER);
        return tf;
    }
    
    private TabSheet createTabSheet() {
        TabSheet ts = new TabSheet();
        ts.setCaption("TabSheet with icons in tabs");
        TabSheet.Tab tab1 = ts.addTab(new Label("sun"), "tab 1");
        tab1.setIcon(Fam3SilkIcon.WEATHER_SUN);
        TabSheet.Tab tab2 = ts.addTab(new Label("rain"), "tab 2");
        tab2.setIcon(Fam3SilkIcon.WEATHER_RAIN);
        TabSheet.Tab tab3 = ts.addTab(new Label("lightning"), "tab 3");
        tab3.setIcon(Fam3SilkIcon.WEATHER_LIGHTNING);
        return ts;
    }
    
    private Accordion createAccordion() {
        Accordion a = new Accordion();
        a.setCaption("Accordion with icons in tabs");
        a.addTab(new Label("blue"), "tab 1", Fam3SilkIcon.FLAG_BLUE);
        a.addTab(new Label("yellow"), "tab 2", Fam3SilkIcon.FLAG_YELLOW);
        a.addTab(new Label("red"), "tab 3", Fam3SilkIcon.FLAG_RED);
        return a;
    }
    
    @AllArgsConstructor
    @Getter
    private static class SportComboBoxItemWrapper {

        private String name;
        private Resource icon;

    }
    
    private ComboBox createComboBox() {
        ComboBox<SportComboBoxItemWrapper> cb = new ComboBox("combo box with icons");
        cb.setItemCaptionGenerator(SportComboBoxItemWrapper::getName);
        cb.setItemIconGenerator(SportComboBoxItemWrapper::getIcon);
        cb.setEmptySelectionAllowed(false);
        
        cb.setItems(new SportComboBoxItemWrapper("biliard", Fam3SilkIcon.SPORT_8BALL),
                new SportComboBoxItemWrapper("football", Fam3SilkIcon.SPORT_FOOTBALL),
                new SportComboBoxItemWrapper("tennis", Fam3SilkIcon.SPORT_RAQUET),
                new SportComboBoxItemWrapper("soccer", Fam3SilkIcon.SPORT_SOCCER));
        
        return cb;
    }
        
    private MenuBar createMenuBar() {
        MenuBar mb = new MenuBar();
        MenuBar.MenuItem file = mb.addItem("File", null);
        file.addItem("Save", Fam3SilkIcon.DISK, null);
        file.addItem("Save All", Fam3SilkIcon.DISK_MULTIPLE, null);
        return mb;
    }

    @WebServlet(urlPatterns = "/*", name = "SilkIconsAddonDemoUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = SilkIconsAddonDemoUI.class, productionMode = false)
    public static class SilkIconsAddonDemoUIServlet extends VaadinServlet {
    }
    
}
