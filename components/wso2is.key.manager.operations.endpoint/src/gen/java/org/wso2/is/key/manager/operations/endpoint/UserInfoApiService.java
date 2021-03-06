package org.wso2.is.key.manager.operations.endpoint;

import org.wso2.is.key.manager.operations.endpoint.*;
import org.wso2.is.key.manager.operations.endpoint.dto.*;

import org.apache.cxf.jaxrs.ext.MessageContext;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;


import org.wso2.is.key.manager.operations.endpoint.dto.ClaimListDTO;
import org.wso2.is.key.manager.operations.endpoint.dto.ClaimRequestDTO;
import org.wso2.is.key.manager.operations.endpoint.dto.ErrorDTO;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;


public interface UserInfoApiService {
      public Response userInfoClaimsGeneratePost(ClaimRequestDTO properties, MessageContext messageContext) ;
      public Response userInfoClaimsGet(String username, String domain, String dialect, MessageContext messageContext) ;
}
