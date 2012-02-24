/*
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 * 
 * Copyright 1997-2007 Sun Microsystems, Inc. All rights reserved.
 * 
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License. You can obtain
 * a copy of the License at https://jersey.dev.java.net/CDDL+GPL.html
 * or jersey/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 * 
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at jersey/legal/LICENSE.txt.
 * Sun designates this particular file as subject to the "Classpath" exception
 * as provided by Sun in the GPL Version 2 section of the License file that
 * accompanied this code.  If applicable, add the following below the License
 * Header, with the fields enclosed by brackets [] replaced by your own
 * identifying information: "Portions Copyrighted [year]
 * [name of copyright owner]"
 * 
 * Contributor(s):
 * 
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */

package com.sun.jersey.api;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

/**
 * Common status codes and responses.
 * 
 * @author Paul.Sandoz@Sun.Com
 */
public class Responses {
    public static final int NO_CONTENT = 204;
    
    public static final int NOT_MODIFIED = 304;
    
    public static final int CLIENT_ERROR = 400;

    public static final int NOT_FOUND = 404;
    
    public static final int METHOD_NOT_ALLOWED = 405;
    
    public static final int NOT_ACCEPTABLE = 406;
    
    public static final int CONFLICT = 409;
    
    public static final int PRECONDITION_FAILED = 412;
    
    public static final int UNSUPPORTED_MEDIA_TYPE = 415;
    
    public static ResponseBuilder noContent() {
        return status(NO_CONTENT);
    }
    
    public static ResponseBuilder notModified() {
        return status(NOT_MODIFIED);
    }
    
    public static ResponseBuilder clientError() {
        return status(CLIENT_ERROR);
    }

    public static ResponseBuilder notFound() {
        return status(NOT_FOUND);
    }
    
    public static ResponseBuilder methodNotAllowed() {
        return status(METHOD_NOT_ALLOWED);
    }
    
    public static ResponseBuilder notAcceptable() {
        return status(NOT_ACCEPTABLE);
    }
    
    public static ResponseBuilder conflict() {
        return status(CONFLICT);        
    }
    
    public static ResponseBuilder preconditionFailed() {
        return status(PRECONDITION_FAILED);
    }
    
    public static ResponseBuilder unsupportedMediaType() {
        return status(UNSUPPORTED_MEDIA_TYPE);
    }
    
    private static ResponseBuilder status(int status) {
        return Response.status(status);                
    }
}