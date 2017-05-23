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
import org.junit.Assert;
import org.junit.Test;

public class Fam3SilkIconsTest {
    
    @Test
    public void testGetByFileName_nominal_notNull() {
        String iconFileName = "accept.png";

        ExternalResource result = Fam3SilkIcons.get(iconFileName);
        
        Assert.assertNotNull(result);
    }
    
    @Test
    public void testGetByFileName_nominal_mimeTypeNotNUll() {
        String iconFileName = "accept.png";

        ExternalResource result = Fam3SilkIcons.get(iconFileName);
        
        Assert.assertNotNull(result.getMIMEType());
    }
    
    @Test
    public void testGetByFileName_nominal_mimeTypeExpected() {
        String iconFileName = "accept.png";

        ExternalResource result = Fam3SilkIcons.get(iconFileName);
        
        Assert.assertEquals("image/png", result.getMIMEType());
    }
    
    @Test
    public void testGetByFileName_notExistingFile_notNull() {
        String iconFileName = "a.png";

        ExternalResource result = Fam3SilkIcons.get(iconFileName);        
        
        Assert.assertNotNull(result);
    }
    
    @Test
    public void testGetByFileName_notExistingFile_mimeTypeNotNUll() {
        String iconFileName = "a.png";

        ExternalResource result = Fam3SilkIcons.get(iconFileName);
        
        Assert.assertNotNull(result.getMIMEType());
    }
    
    @Test
    public void testGetByFileName_notExistingFile_mimeTypeExpected() {
        String iconFileName = "a.png";

        ExternalResource result = Fam3SilkIcons.get(iconFileName);
        
        Assert.assertEquals("image/png", result.getMIMEType());
    }
    
}
