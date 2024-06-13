/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.LazySingletonValue;
import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class CreateSignInTokenRequestBody {

    /**
     * The ID of the user that can use the newly created sign in token
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user_id")
    private Optional<? extends String> userId;

    /**
     * Optional parameter to specify the life duration of the sign in token in seconds.
     * By default, the duration is 30 days.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("expires_in_seconds")
    private Optional<? extends Long> expiresInSeconds;

    @JsonCreator
    public CreateSignInTokenRequestBody(
            @JsonProperty("user_id") Optional<? extends String> userId,
            @JsonProperty("expires_in_seconds") Optional<? extends Long> expiresInSeconds) {
        Utils.checkNotNull(userId, "userId");
        Utils.checkNotNull(expiresInSeconds, "expiresInSeconds");
        this.userId = userId;
        this.expiresInSeconds = expiresInSeconds;
    }
    
    public CreateSignInTokenRequestBody() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * The ID of the user that can use the newly created sign in token
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> userId() {
        return (Optional<String>) userId;
    }

    /**
     * Optional parameter to specify the life duration of the sign in token in seconds.
     * By default, the duration is 30 days.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> expiresInSeconds() {
        return (Optional<Long>) expiresInSeconds;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the user that can use the newly created sign in token
     */
    public CreateSignInTokenRequestBody withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = Optional.ofNullable(userId);
        return this;
    }

    /**
     * The ID of the user that can use the newly created sign in token
     */
    public CreateSignInTokenRequestBody withUserId(Optional<? extends String> userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }

    /**
     * Optional parameter to specify the life duration of the sign in token in seconds.
     * By default, the duration is 30 days.
     */
    public CreateSignInTokenRequestBody withExpiresInSeconds(long expiresInSeconds) {
        Utils.checkNotNull(expiresInSeconds, "expiresInSeconds");
        this.expiresInSeconds = Optional.ofNullable(expiresInSeconds);
        return this;
    }

    /**
     * Optional parameter to specify the life duration of the sign in token in seconds.
     * By default, the duration is 30 days.
     */
    public CreateSignInTokenRequestBody withExpiresInSeconds(Optional<? extends Long> expiresInSeconds) {
        Utils.checkNotNull(expiresInSeconds, "expiresInSeconds");
        this.expiresInSeconds = expiresInSeconds;
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
        CreateSignInTokenRequestBody other = (CreateSignInTokenRequestBody) o;
        return 
            java.util.Objects.deepEquals(this.userId, other.userId) &&
            java.util.Objects.deepEquals(this.expiresInSeconds, other.expiresInSeconds);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            userId,
            expiresInSeconds);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateSignInTokenRequestBody.class,
                "userId", userId,
                "expiresInSeconds", expiresInSeconds);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> userId = Optional.empty();
 
        private Optional<? extends Long> expiresInSeconds;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the user that can use the newly created sign in token
         */
        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = Optional.ofNullable(userId);
            return this;
        }

        /**
         * The ID of the user that can use the newly created sign in token
         */
        public Builder userId(Optional<? extends String> userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }

        /**
         * Optional parameter to specify the life duration of the sign in token in seconds.
         * By default, the duration is 30 days.
         */
        public Builder expiresInSeconds(long expiresInSeconds) {
            Utils.checkNotNull(expiresInSeconds, "expiresInSeconds");
            this.expiresInSeconds = Optional.ofNullable(expiresInSeconds);
            return this;
        }

        /**
         * Optional parameter to specify the life duration of the sign in token in seconds.
         * By default, the duration is 30 days.
         */
        public Builder expiresInSeconds(Optional<? extends Long> expiresInSeconds) {
            Utils.checkNotNull(expiresInSeconds, "expiresInSeconds");
            this.expiresInSeconds = expiresInSeconds;
            return this;
        }
        
        public CreateSignInTokenRequestBody build() {
            if (expiresInSeconds == null) {
                expiresInSeconds = _SINGLETON_VALUE_ExpiresInSeconds.value();
            }
            return new CreateSignInTokenRequestBody(
                userId,
                expiresInSeconds);
        }

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_ExpiresInSeconds =
                new LazySingletonValue<>(
                        "expires_in_seconds",
                        "2592000",
                        new TypeReference<Optional<? extends Long>>() {});
    }
}
