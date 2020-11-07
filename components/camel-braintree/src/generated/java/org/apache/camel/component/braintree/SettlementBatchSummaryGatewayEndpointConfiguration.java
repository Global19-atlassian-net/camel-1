
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.braintree;

import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.braintreegateway.SettlementBatchSummaryGateway}.
 */
@ApiParams(apiName = "settlementBatchSummary", 
           description = "Provides methods to interact wit settlement summaries",
           apiMethods = {@ApiMethod(methodName = "generate", signatures={"com.braintreegateway.Result<com.braintreegateway.SettlementBatchSummary> generate(java.util.Calendar settlementDate)", "com.braintreegateway.Result<com.braintreegateway.SettlementBatchSummary> generate(java.util.Calendar settlementDate, String groupByCustomField)"}), }, aliases = {})
@UriParams
@Configurer(extended = true)
public final class SettlementBatchSummaryGatewayEndpointConfiguration extends BraintreeConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "generate")})
    private String groupByCustomField;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "generate"), @ApiMethod(methodName = "generate")})
    private java.util.Calendar settlementDate;

    public String getGroupByCustomField() {
        return groupByCustomField;
    }

    public void setGroupByCustomField(String groupByCustomField) {
        this.groupByCustomField = groupByCustomField;
    }

    public java.util.Calendar getSettlementDate() {
        return settlementDate;
    }

    public void setSettlementDate(java.util.Calendar settlementDate) {
        this.settlementDate = settlementDate;
    }
}
