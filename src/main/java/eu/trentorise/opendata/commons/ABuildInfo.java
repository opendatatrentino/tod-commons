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
package eu.trentorise.opendata.commons;

import java.io.Serializable;
import org.immutables.value.Value;

/**
 * Class of build related information. This class is used to generate the
 * immutable {@link eu.trentorise.opendata.commons.BuildInfo}.
 *
 * @author David Leoni
 */
@Value.Immutable
@BuilderStylePublic
abstract class ABuildInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * i.e. 1.0
     */
    @Value.Default
    public String getVersion() {
        return "";
    }

    /**
     * i.e. David Leoni
     */
    @Value.Default
    public String getBuiltBy() {
        return "";
    }

    /**
     * i.e. JDK 1.7.0_17
     */
    @Value.Default
    public String getBuildJdk() {
        return "";
    }

    /**
     * i.e. Apache Maven 3.0.5
     */
    @Value.Default
    public String getCreatedBy() {
        return "";
    }

    /**
     * i.e. git commit SHA, i.e. bdd5c2c75e6438da0d23ac8f2368f9e9cacf2087
     */
    @Value.Default
    public String getGitSha() {
        return "";
    }

    /**
     * Returns the source repository url, i.e.
     * https://github.com/opendatatrentino/traceprov
     */
    @Value.Default
    public String getScmUrl() {
        return "";
    }

    /**
     * Returns the timestamp, i.e. 1421246376174
     */
    @Value.Default
    public String getTimestamp() {
        return "";
    }

}
