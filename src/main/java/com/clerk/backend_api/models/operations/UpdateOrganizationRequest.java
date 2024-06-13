/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.SpeakeasyMetadata;
import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public class UpdateOrganizationRequest {

    /**
     * The ID of the organization to update
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=organization_id")
    private String organizationId;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private UpdateOrganizationRequestBody requestBody;

    @JsonCreator
    public UpdateOrganizationRequest(
            String organizationId,
            UpdateOrganizationRequestBody requestBody) {
        Utils.checkNotNull(organizationId, "organizationId");
        Utils.checkNotNull(requestBody, "requestBody");
        this.organizationId = organizationId;
        this.requestBody = requestBody;
    }

    /**
     * The ID of the organization to update
     */
    @JsonIgnore
    public String organizationId() {
        return organizationId;
    }

    @JsonIgnore
    public UpdateOrganizationRequestBody requestBody() {
        return requestBody;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the organization to update
     */
    public UpdateOrganizationRequest withOrganizationId(String organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = organizationId;
        return this;
    }

    public UpdateOrganizationRequest withRequestBody(UpdateOrganizationRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateOrganizationRequest other = (UpdateOrganizationRequest) o;
        return 
            java.util.Objects.deepEquals(this.organizationId, other.organizationId) &&
            java.util.Objects.deepEquals(this.requestBody, other.requestBody);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            organizationId,
            requestBody);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateOrganizationRequest.class,
                "organizationId", organizationId,
                "requestBody", requestBody);
    }
    
    public final static class Builder {
 
        private String organizationId;
 
        private UpdateOrganizationRequestBody requestBody;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the organization to update
         */
        public Builder organizationId(String organizationId) {
            Utils.checkNotNull(organizationId, "organizationId");
            this.organizationId = organizationId;
            return this;
        }

        public Builder requestBody(UpdateOrganizationRequestBody requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }
        
        public UpdateOrganizationRequest build() {
            return new UpdateOrganizationRequest(
                organizationId,
                requestBody);
        }
    }
}
