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

public class GetOrganizationInvitationRequest {

    /**
     * The organization ID.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=organization_id")
    private String organizationId;

    /**
     * The organization invitation ID.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=invitation_id")
    private String invitationId;

    @JsonCreator
    public GetOrganizationInvitationRequest(
            String organizationId,
            String invitationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        Utils.checkNotNull(invitationId, "invitationId");
        this.organizationId = organizationId;
        this.invitationId = invitationId;
    }

    /**
     * The organization ID.
     */
    @JsonIgnore
    public String organizationId() {
        return organizationId;
    }

    /**
     * The organization invitation ID.
     */
    @JsonIgnore
    public String invitationId() {
        return invitationId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The organization ID.
     */
    public GetOrganizationInvitationRequest withOrganizationId(String organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = organizationId;
        return this;
    }

    /**
     * The organization invitation ID.
     */
    public GetOrganizationInvitationRequest withInvitationId(String invitationId) {
        Utils.checkNotNull(invitationId, "invitationId");
        this.invitationId = invitationId;
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
        GetOrganizationInvitationRequest other = (GetOrganizationInvitationRequest) o;
        return 
            java.util.Objects.deepEquals(this.organizationId, other.organizationId) &&
            java.util.Objects.deepEquals(this.invitationId, other.invitationId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            organizationId,
            invitationId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetOrganizationInvitationRequest.class,
                "organizationId", organizationId,
                "invitationId", invitationId);
    }
    
    public final static class Builder {
 
        private String organizationId;
 
        private String invitationId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The organization ID.
         */
        public Builder organizationId(String organizationId) {
            Utils.checkNotNull(organizationId, "organizationId");
            this.organizationId = organizationId;
            return this;
        }

        /**
         * The organization invitation ID.
         */
        public Builder invitationId(String invitationId) {
            Utils.checkNotNull(invitationId, "invitationId");
            this.invitationId = invitationId;
            return this;
        }
        
        public GetOrganizationInvitationRequest build() {
            return new GetOrganizationInvitationRequest(
                organizationId,
                invitationId);
        }
    }
}
