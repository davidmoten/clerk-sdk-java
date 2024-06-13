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
import java.util.Optional;

public class UpdateJWTTemplateRequest {

    /**
     * The ID of the JWT template to update
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=template_id")
    private String templateId;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends UpdateJWTTemplateRequestBody> requestBody;

    @JsonCreator
    public UpdateJWTTemplateRequest(
            String templateId,
            Optional<? extends UpdateJWTTemplateRequestBody> requestBody) {
        Utils.checkNotNull(templateId, "templateId");
        Utils.checkNotNull(requestBody, "requestBody");
        this.templateId = templateId;
        this.requestBody = requestBody;
    }
    
    public UpdateJWTTemplateRequest(
            String templateId) {
        this(templateId, Optional.empty());
    }

    /**
     * The ID of the JWT template to update
     */
    @JsonIgnore
    public String templateId() {
        return templateId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<UpdateJWTTemplateRequestBody> requestBody() {
        return (Optional<UpdateJWTTemplateRequestBody>) requestBody;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the JWT template to update
     */
    public UpdateJWTTemplateRequest withTemplateId(String templateId) {
        Utils.checkNotNull(templateId, "templateId");
        this.templateId = templateId;
        return this;
    }

    public UpdateJWTTemplateRequest withRequestBody(UpdateJWTTemplateRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = Optional.ofNullable(requestBody);
        return this;
    }

    public UpdateJWTTemplateRequest withRequestBody(Optional<? extends UpdateJWTTemplateRequestBody> requestBody) {
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
        UpdateJWTTemplateRequest other = (UpdateJWTTemplateRequest) o;
        return 
            java.util.Objects.deepEquals(this.templateId, other.templateId) &&
            java.util.Objects.deepEquals(this.requestBody, other.requestBody);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            templateId,
            requestBody);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateJWTTemplateRequest.class,
                "templateId", templateId,
                "requestBody", requestBody);
    }
    
    public final static class Builder {
 
        private String templateId;
 
        private Optional<? extends UpdateJWTTemplateRequestBody> requestBody = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the JWT template to update
         */
        public Builder templateId(String templateId) {
            Utils.checkNotNull(templateId, "templateId");
            this.templateId = templateId;
            return this;
        }

        public Builder requestBody(UpdateJWTTemplateRequestBody requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = Optional.ofNullable(requestBody);
            return this;
        }

        public Builder requestBody(Optional<? extends UpdateJWTTemplateRequestBody> requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }
        
        public UpdateJWTTemplateRequest build() {
            return new UpdateJWTTemplateRequest(
                templateId,
                requestBody);
        }
    }
}
