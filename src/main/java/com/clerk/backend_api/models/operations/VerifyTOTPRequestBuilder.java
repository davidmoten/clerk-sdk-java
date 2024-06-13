/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.models.errors.SDKError;
import com.clerk.backend_api.utils.LazySingletonValue;
import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.stream.Stream;
import org.openapitools.jackson.nullable.JsonNullable;


public class VerifyTOTPRequestBuilder {

    private String userId;
    private Optional<? extends VerifyTOTPRequestBody> requestBody = Optional.empty();
    private final SDKMethodInterfaces.MethodCallVerifyTOTP sdk;

    public VerifyTOTPRequestBuilder(SDKMethodInterfaces.MethodCallVerifyTOTP sdk) {
        this.sdk = sdk;
    }

    public VerifyTOTPRequestBuilder userId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }
                
    public VerifyTOTPRequestBuilder requestBody(VerifyTOTPRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = Optional.of(requestBody);
        return this;
    }

    public VerifyTOTPRequestBuilder requestBody(Optional<? extends VerifyTOTPRequestBody> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public VerifyTOTPResponse call() throws Exception {

        return sdk.verifyTOTP(
            userId,
            requestBody);
    }
}