/*
 * Copyright 2015 Trento Rise.
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
package eu.trentorise.opendata.commons.test.codegen;

import eu.trentorise.opendata.commons.BuilderStyle;
import java.util.List;
import org.immutables.value.Value;

/**
 *
 * @author David Leoni
 */
@Value.Immutable
@BuilderStyle
public abstract class AFatClass {

    /**
     * Has Parameter annotation so it ends up in the generated of()
     */
    
    @Value.Default
    public int getProp1(){
        return 0;
    }
    
    @Value.Default
    public String getProp2() {
        return "";
    }

    @Value.Default
    public int bli(){
        return 0;
    }

        
    public int bla(){
        return 0;
    }
    
    public abstract List<String> getFoos();
}
