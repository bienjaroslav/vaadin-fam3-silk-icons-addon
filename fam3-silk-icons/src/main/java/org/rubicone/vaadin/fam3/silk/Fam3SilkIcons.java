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

package org.rubicone.vaadin.fam3.silk;

import com.vaadin.server.ExternalResource;
import com.vaadin.shared.ApplicationConstants;

/**
 * Famfamfam silk icons. Provides icons by specifying their filename. You may want to use as well directly the {@link Fam3SilkIcon}.
 * <p>
 * <b>Usage:</b><br>
 * <code>
 * ExternalResource icon = Fam3SilkIcons.get("accept.png");<br>
 * <br>
 * Button button = new Button();<br>
 * button.setCaption("OK");<br>
 * button.setIcon(icon);<br>
 * </code>
 * <p>
 * <b>Icons collection:</b><br>
 * The Famfamfam Silk Icons are created by <a href="http://www.famfamfam.com/lab/icons/silk/">Mark James</a>. The icons version currently included is 1.3.
 * <p>
 * <b><i>Note on icons license:</i></b><br>
 * The Famfamfam Silk Icons by <a href="http://www.famfamfam.com/lab/icons/silk/">Mark James</a> are available under a
 * <a href="https://creativecommons.org/licenses/by/2.5/">Creative Commons Attribution 2.5 License</a>. You are free to use the icons. Please do not forget to provide 
 * attribution in your work (see <a href="http://www.famfamfam.com/lab/icons/silk/">famfamfam website</a> for further details).
 * 
 * @author Jaroslav Bien
 * @since 1.0
 * @see Fam3SilkIcon
 * @see <a href="http://www.famfamfam.com/lab/icons/silk/">Famfamfam Silk Icons by Mark James</a>
 */
public class Fam3SilkIcons {
    
    /** Icons files directory path. */
    public static final String ICONS_FILES_DIRECTORY_PATH = ApplicationConstants.VAADIN_PROTOCOL_PREFIX + "addons/fam3silk/icons/";
    
    /**
     * Returns the famfamfam silk icon external resource by icon's filename. If the icon with the specified name does not exist the external resource is returned,
     * the UI component will display non-existing-image-placeholder (blank square) as per particular browser UX.
     * 
     * @param iconFileName icon filename
     * @return the famfamfam silk icon external resource
     */
    public static ExternalResource get(String iconFileName) {
        return new ExternalResource(ICONS_FILES_DIRECTORY_PATH + iconFileName);
    }
    
}
