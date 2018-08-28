/**
 * NOTE: This class is auto generated by the swagger code generator program (unset).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.app.billing_app1.controller;

import com.app.billing_app1.model.BillPayAccountList;
import com.app.billing_app1.model.BillPaymentAccessTokenResponse;
import com.app.billing_app1.model.BillPaymentConfirmation;
import com.app.billing_app1.model.PayeeList;
import com.app.billing_app1.model.SessionResponse;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-28T08:24:52.083-04:00")

@Api(value = "api", description = "the api API")
public interface ApiApi {

    @ApiOperation(value = "Get Bill Payment Eligible Accounts", notes = "Retrieves all bill payment eligible accounts available from the account summary.", response = BillPayAccountList.class, tags={ "bill-payments-endpoint-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "0: Success", response = BillPayAccountList.class),
        @ApiResponse(code = 400, message = "4103: The user is not registered for bill pay.", response = Void.class),
        @ApiResponse(code = 401, message = "1110: Invalid token in Authorization header", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class),
        @ApiResponse(code = 404, message = "Not Found", response = Void.class) })
    
    @RequestMapping(value = "/api/billpay/accounts",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<BillPayAccountList> getBillPayEligibleAccountsUsingGET(@ApiParam(value = "OAuth2 token" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,@ApiParam(value = "Language for the HTTP Request" ) @RequestHeader(value="Accept-Language", required=false) String acceptLanguage,@ApiParam(value = "User Agent who is sending the HTTP Request" ) @RequestHeader(value="User-Agent", required=false) String userAgent,@ApiParam(value = "IP Address of the Server sending the HTTP Request" ) @RequestHeader(value="Host", required=false) String host,@ApiParam(value = "Application Name, Platform and Version. ex: appname=bank_mobile, platform=ios, version=v1.3.2b23" ) @RequestHeader(value="td-client", required=false) String tdClient,@ApiParam(value = "Unique Trace ID to provisioning cross tier traceability" ) @RequestHeader(value="TraceID", required=false) String traceID);


    @ApiOperation(value = "Get Bill Payment Access Token", notes = "This operation synchronizes the bill pay eligible account(s) with the back-end and obtains an access SSO token to the bill pay system. Note that the current profile email address is synchronized. If the email address needs to be updated, the consumer (UI) must invoke another operation, such as the PUT Customer Profile operation, to update the email prior to calling this operation.  This operation is intended to be consumed by browser application.", response = BillPaymentAccessTokenResponse.class, tags={ "bill-payments-endpoint-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "0: Success", response = BillPaymentAccessTokenResponse.class),
        @ApiResponse(code = 400, message = "1201: Invalid request parameter", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "1101: Invalid session id / User token", response = Void.class),
        @ApiResponse(code = 404, message = "Not Found", response = Void.class),
        @ApiResponse(code = 500, message = "1000: Unknown exception occurred", response = Void.class),
        @ApiResponse(code = 503, message = "1001: In Maintenance mode", response = Void.class) })
    
    @RequestMapping(value = "/api/billpay/accesstoken",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<BillPaymentAccessTokenResponse> getBillPayTokenUsingGET(@ApiParam(value = "OAuth2 token" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,@ApiParam(value = "Language for the HTTP Request" ) @RequestHeader(value="Accept-Language", required=false) String acceptLanguage,@ApiParam(value = "User Agent who is sending the HTTP Request" ) @RequestHeader(value="User-Agent", required=false) String userAgent,@ApiParam(value = "IP Address of the Server sending the HTTP Request" ) @RequestHeader(value="Host", required=false) String host,@ApiParam(value = "Application Name, Platform and Version. ex: appname=ngp_web,version=5.0.3" ) @RequestHeader(value="td-client", required=false) String tdClient,@ApiParam(value = "Unique Trace ID to provisioning cross tier traceability" ) @RequestHeader(value="TraceID", required=false) String traceID);


    @ApiOperation(value = "Login", notes = "Authenticates and returns access token for user.", response = SessionResponse.class, tags={ "session-login-endpoint", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SessionResponse.class),
        @ApiResponse(code = 201, message = "Created", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class),
        @ApiResponse(code = 404, message = "Not Found", response = Void.class) })
    
    @RequestMapping(value = "/api/security/login",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<SessionResponse> getLoginUsingPOST( @NotNull@ApiParam(value = "username", required = true) @RequestParam(value = "username", required = true) String username, @NotNull@ApiParam(value = "password", required = true) @RequestParam(value = "password", required = true) String password);


    @ApiOperation(value = "Get Bill Payees", notes = "This operation is intended to be consumed by mobile and tablet clients.", response = PayeeList.class, tags={ "bill-payments-endpoint-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "0: Success", response = PayeeList.class),
        @ApiResponse(code = 400, message = "1201: Invalid request parameter", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "1101: Invalid session id / User token", response = Void.class),
        @ApiResponse(code = 404, message = "Not Found", response = Void.class),
        @ApiResponse(code = 500, message = "1300: System not available - Corillian", response = Void.class),
        @ApiResponse(code = 503, message = "1001: In Maintenance mode", response = Void.class) })
    
    @RequestMapping(value = "/api/billpay/payees",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<PayeeList> getPayeeListUsingGET(@ApiParam(value = "OAuth2 token" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,@ApiParam(value = "Language for the HTTP Request" ) @RequestHeader(value="Accept-Language", required=false) String acceptLanguage,@ApiParam(value = "User Agent who is sending the HTTP Request" ) @RequestHeader(value="User-Agent", required=false) String userAgent,@ApiParam(value = "IP Address of the Server sending the HTTP Request" ) @RequestHeader(value="Host", required=false) String host,@ApiParam(value = "Application Name, Platform and Version. ex: appname=bank_mobile, platform=ios, version=v1.3.2b23" ) @RequestHeader(value="td-client", required=false) String tdClient,@ApiParam(value = "Unique Trace ID to provisioning cross tier traceability" ) @RequestHeader(value="TraceID", required=false) String traceID);


    @ApiOperation(value = "Submit a bill payment", notes = "This operation is intended to be consumed by mobile and tablet clients.", response = BillPaymentConfirmation.class, tags={ "bill-payments-endpoint-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "0: Success", response = BillPaymentConfirmation.class),
        @ApiResponse(code = 201, message = "Created", response = Void.class),
        @ApiResponse(code = 400, message = "1201: Invalid request parameter", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "1101: Invalid session id / User token", response = Void.class),
        @ApiResponse(code = 404, message = "Not Found", response = Void.class),
        @ApiResponse(code = 500, message = "1000: Unknown exception occurred", response = Void.class),
        @ApiResponse(code = 503, message = "1001: In Maintenance mode", response = Void.class) })
    
    @RequestMapping(value = "/api/billpay/",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<BillPaymentConfirmation> postBillPaymentUsingPOST(@ApiParam(value = "OAuth2 token" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,@ApiParam(value = "", allowableValues = "USD, CAD") @RequestParam(value = "amount.currency", required = false) String amountCurrency,@ApiParam(value = "") @RequestParam(value = "fromAccountId", required = false) String fromAccountId,@ApiParam(value = "") @RequestParam(value = "toPayeeId", required = false) String toPayeeId,@ApiParam(value = "") @RequestParam(value = "paymentDate", required = false) String paymentDate,@ApiParam(value = "") @RequestParam(value = "paymentMemo", required = false) String paymentMemo,@ApiParam(value = "Language for the HTTP Request" ) @RequestHeader(value="Accept-Language", required=false) String acceptLanguage,@ApiParam(value = "User Agent who is sending the HTTP Request" ) @RequestHeader(value="User-Agent", required=false) String userAgent,@ApiParam(value = "IP Address of the Server sending the HTTP Request" ) @RequestHeader(value="Host", required=false) String host,@ApiParam(value = "Application Name, Platform and Version. ex: appname=bank_mobile, platform=ios, version=v1.3.2b23" ) @RequestHeader(value="td-client", required=false) String tdClient,@ApiParam(value = "Unique Trace ID to provisioning cross tier traceability" ) @RequestHeader(value="TraceID", required=false) String traceID);


    @ApiOperation(value = "Register for Bill Payment", notes = "Registers the current user with the Bill Pay System. The current profile email address is used for registration. If the email address needs to be updated, the consumer (UI) must invoke another operation, such as the PUT Customer Profile operation, to update the email prior to calling this operation.  This operation is intended to be consumed by browser application.", response = String.class, tags={ "bill-payments-endpoint-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "0: Success", response = String.class),
        @ApiResponse(code = 201, message = "Created", response = Void.class),
        @ApiResponse(code = 400, message = "1201: Invalid request parameter", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "1101: Invalid session id / User token", response = Void.class),
        @ApiResponse(code = 404, message = "Not Found", response = Void.class),
        @ApiResponse(code = 500, message = "1000: Unknown exception occurred", response = Void.class),
        @ApiResponse(code = 503, message = "1001: In Maintenance mode", response = Void.class) })
    
    @RequestMapping(value = "/api/billpay/registration",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<String> registerBillPaymentUsingPOST(@ApiParam(value = "OAuth2 token" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,@ApiParam(value = "Language for the HTTP Request" ) @RequestHeader(value="Accept-Language", required=false) String acceptLanguage,@ApiParam(value = "User Agent who is sending the HTTP Request" ) @RequestHeader(value="User-Agent", required=false) String userAgent,@ApiParam(value = "IP Address of the Server sending the HTTP Request" ) @RequestHeader(value="Host", required=false) String host,@ApiParam(value = "Application Name, Platform and Version. ex: appname=appname=ngp_web,version=5.0.3" ) @RequestHeader(value="td-client", required=false) String tdClient,@ApiParam(value = "Unique Trace ID to provisioning cross tier traceability" ) @RequestHeader(value="TraceID", required=false) String traceID);

}
