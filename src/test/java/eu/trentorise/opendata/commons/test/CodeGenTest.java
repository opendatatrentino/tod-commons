/* 
 * Copyright 2015 Trento Rise  (trentorise.eu) 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package eu.trentorise.opendata.commons.test;

import com.google.common.collect.ImmutableList;
import eu.trentorise.opendata.commons.OdtConfig;
import eu.trentorise.opendata.commons.test.codegen.AComplexFat;
import eu.trentorise.opendata.commons.test.codegen.AFatClass;
import eu.trentorise.opendata.commons.test.codegen.AbstractComplexFat;
import eu.trentorise.opendata.commons.test.codegen.ComplexFat;
import eu.trentorise.opendata.commons.test.codegen.FatClass;
import eu.trentorise.opendata.commons.test.codegen.SlimClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author David Leoni
 */
public class CodeGenTest {
    
    @BeforeClass
    public static void setUpClass() {        
        OdtConfig.init(CodeGenTest.class);
    }

    @Test
    public void testCodeGen() {
        
        AFatClass absFat; 
        FatClass fat = FatClass.of();

        assertEquals("", fat.getProp2());

        assertEquals("a", FatClass.builder().setProp2("a").build().getProp2());
        assertEquals(ImmutableList.of(), FatClass.builder().build().getFoos());
        
        assertEquals("b", fat.withProp2("b").getProp2());
                
        ComplexFat complexFat = ComplexFat.of();
       
        assertEquals("a", complexFat.getName());

        assertEquals("b", ComplexFat.builder().setName("b").build().getName());
        
        
        SlimClass slim = SlimClass.of();

        assertEquals("", slim.getProp2());
               
        SlimClass slim2 = SlimClass.of(3, "r",5);
        assertEquals(3, slim2.getProp1());
        assertEquals("r", slim2.getProp2());
        assertEquals(5, slim2.bli());
        
        
    }


}