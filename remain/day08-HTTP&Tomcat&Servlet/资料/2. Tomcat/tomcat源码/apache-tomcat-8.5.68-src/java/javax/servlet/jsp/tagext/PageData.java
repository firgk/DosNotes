/*
* Licensed to the Apache Software Foundation (ASF) under one or more
* contributor license agreements.  See the NOTICE file distributed with
* this work for additional information regarding copyright ownership.
* The ASF licenses this file to You under the Apache License, Version 2.0
* (the "License"); you may not use this file except in compliance with
* the License.  You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package javax.servlet.jsp.tagext;

import java.io.InputStream;

/**
 * Translation-time information on a JSP page.  The information
 * corresponds to the XML view of the JSP page.
 *
 * <p>
 * Objects of this type are generated by the JSP translator, e.g.
 * when being passed to a TagLibraryValidator instance.
 */

public abstract class PageData {

    /**
     * Sole constructor. (For invocation by subclass constructors,
     * typically implicit.)
     */
    public PageData() {
        // NOOP by default
    }

    /**
     * Returns an input stream on the XML view of a JSP page.
     * The stream is encoded in UTF-8.  Recall that the XML view of a
     * JSP page has the include directives expanded.
     *
     * @return An input stream on the document.
     */
   public abstract InputStream getInputStream();
}
