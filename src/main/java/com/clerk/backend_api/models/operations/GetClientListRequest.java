/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.LazySingletonValue;
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

public class GetClientListRequest {

    /**
     * Applies a limit to the number of results returned.
     * Can be used for paginating the results together with `offset`.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    private Optional<? extends Long> limit;

    /**
     * Skip the first `offset` results when paginating.
     * Needs to be an integer greater or equal to zero.
     * To be used in conjunction with `limit`.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    private Optional<? extends Long> offset;

    @JsonCreator
    public GetClientListRequest(
            Optional<? extends Long> limit,
            Optional<? extends Long> offset) {
        Utils.checkNotNull(limit, "limit");
        Utils.checkNotNull(offset, "offset");
        this.limit = limit;
        this.offset = offset;
    }
    
    public GetClientListRequest() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * Applies a limit to the number of results returned.
     * Can be used for paginating the results together with `offset`.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> limit() {
        return (Optional<Long>) limit;
    }

    /**
     * Skip the first `offset` results when paginating.
     * Needs to be an integer greater or equal to zero.
     * To be used in conjunction with `limit`.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> offset() {
        return (Optional<Long>) offset;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Applies a limit to the number of results returned.
     * Can be used for paginating the results together with `offset`.
     */
    public GetClientListRequest withLimit(long limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.ofNullable(limit);
        return this;
    }

    /**
     * Applies a limit to the number of results returned.
     * Can be used for paginating the results together with `offset`.
     */
    public GetClientListRequest withLimit(Optional<? extends Long> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }

    /**
     * Skip the first `offset` results when paginating.
     * Needs to be an integer greater or equal to zero.
     * To be used in conjunction with `limit`.
     */
    public GetClientListRequest withOffset(long offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = Optional.ofNullable(offset);
        return this;
    }

    /**
     * Skip the first `offset` results when paginating.
     * Needs to be an integer greater or equal to zero.
     * To be used in conjunction with `limit`.
     */
    public GetClientListRequest withOffset(Optional<? extends Long> offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = offset;
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
        GetClientListRequest other = (GetClientListRequest) o;
        return 
            java.util.Objects.deepEquals(this.limit, other.limit) &&
            java.util.Objects.deepEquals(this.offset, other.offset);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            limit,
            offset);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetClientListRequest.class,
                "limit", limit,
                "offset", offset);
    }
    
    public final static class Builder {
 
        private Optional<? extends Long> limit;
 
        private Optional<? extends Long> offset;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Applies a limit to the number of results returned.
         * Can be used for paginating the results together with `offset`.
         */
        public Builder limit(long limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = Optional.ofNullable(limit);
            return this;
        }

        /**
         * Applies a limit to the number of results returned.
         * Can be used for paginating the results together with `offset`.
         */
        public Builder limit(Optional<? extends Long> limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = limit;
            return this;
        }

        /**
         * Skip the first `offset` results when paginating.
         * Needs to be an integer greater or equal to zero.
         * To be used in conjunction with `limit`.
         */
        public Builder offset(long offset) {
            Utils.checkNotNull(offset, "offset");
            this.offset = Optional.ofNullable(offset);
            return this;
        }

        /**
         * Skip the first `offset` results when paginating.
         * Needs to be an integer greater or equal to zero.
         * To be used in conjunction with `limit`.
         */
        public Builder offset(Optional<? extends Long> offset) {
            Utils.checkNotNull(offset, "offset");
            this.offset = offset;
            return this;
        }
        
        public GetClientListRequest build() {
            if (limit == null) {
                limit = _SINGLETON_VALUE_Limit.value();
            }
            if (offset == null) {
                offset = _SINGLETON_VALUE_Offset.value();
            }
            return new GetClientListRequest(
                limit,
                offset);
        }

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_Limit =
                new LazySingletonValue<>(
                        "limit",
                        "10",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_Offset =
                new LazySingletonValue<>(
                        "offset",
                        "0",
                        new TypeReference<Optional<? extends Long>>() {});
    }
}
