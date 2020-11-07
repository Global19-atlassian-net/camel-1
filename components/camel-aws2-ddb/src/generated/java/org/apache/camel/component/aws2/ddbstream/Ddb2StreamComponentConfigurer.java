/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws2.ddbstream;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class Ddb2StreamComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.aws2.ddbstream.Ddb2StreamConfiguration getOrCreateConfiguration(Ddb2StreamComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.aws2.ddbstream.Ddb2StreamConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        Ddb2StreamComponent target = (Ddb2StreamComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": getOrCreateConfiguration(target).setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "amazondynamodbstreamsclient":
        case "amazonDynamoDbStreamsClient": getOrCreateConfiguration(target).setAmazonDynamoDbStreamsClient(property(camelContext, software.amazon.awssdk.services.dynamodb.streams.DynamoDbStreamsClient.class, value)); return true;
        case "autodiscoverclient":
        case "autoDiscoverClient": getOrCreateConfiguration(target).setAutoDiscoverClient(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.aws2.ddbstream.Ddb2StreamConfiguration.class, value)); return true;
        case "iteratortype":
        case "iteratorType": getOrCreateConfiguration(target).setIteratorType(property(camelContext, software.amazon.awssdk.services.dynamodb.model.ShardIteratorType.class, value)); return true;
        case "maxresultsperrequest":
        case "maxResultsPerRequest": getOrCreateConfiguration(target).setMaxResultsPerRequest(property(camelContext, int.class, value)); return true;
        case "proxyhost":
        case "proxyHost": getOrCreateConfiguration(target).setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": getOrCreateConfiguration(target).setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyprotocol":
        case "proxyProtocol": getOrCreateConfiguration(target).setProxyProtocol(property(camelContext, software.amazon.awssdk.core.Protocol.class, value)); return true;
        case "region": getOrCreateConfiguration(target).setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey":
        case "secretKey": getOrCreateConfiguration(target).setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "sequencenumberprovider":
        case "sequenceNumberProvider": getOrCreateConfiguration(target).setSequenceNumberProvider(property(camelContext, org.apache.camel.component.aws2.ddbstream.SequenceNumberProvider.class, value)); return true;
        case "trustallcertificates":
        case "trustAllCertificates": getOrCreateConfiguration(target).setTrustAllCertificates(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return java.lang.String.class;
        case "amazondynamodbstreamsclient":
        case "amazonDynamoDbStreamsClient": return software.amazon.awssdk.services.dynamodb.streams.DynamoDbStreamsClient.class;
        case "autodiscoverclient":
        case "autoDiscoverClient": return boolean.class;
        case "basicpropertybinding":
        case "basicPropertyBinding": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "configuration": return org.apache.camel.component.aws2.ddbstream.Ddb2StreamConfiguration.class;
        case "iteratortype":
        case "iteratorType": return software.amazon.awssdk.services.dynamodb.model.ShardIteratorType.class;
        case "maxresultsperrequest":
        case "maxResultsPerRequest": return int.class;
        case "proxyhost":
        case "proxyHost": return java.lang.String.class;
        case "proxyport":
        case "proxyPort": return java.lang.Integer.class;
        case "proxyprotocol":
        case "proxyProtocol": return software.amazon.awssdk.core.Protocol.class;
        case "region": return java.lang.String.class;
        case "secretkey":
        case "secretKey": return java.lang.String.class;
        case "sequencenumberprovider":
        case "sequenceNumberProvider": return org.apache.camel.component.aws2.ddbstream.SequenceNumberProvider.class;
        case "trustallcertificates":
        case "trustAllCertificates": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        Ddb2StreamComponent target = (Ddb2StreamComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return getOrCreateConfiguration(target).getAccessKey();
        case "amazondynamodbstreamsclient":
        case "amazonDynamoDbStreamsClient": return getOrCreateConfiguration(target).getAmazonDynamoDbStreamsClient();
        case "autodiscoverclient":
        case "autoDiscoverClient": return getOrCreateConfiguration(target).isAutoDiscoverClient();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "configuration": return target.getConfiguration();
        case "iteratortype":
        case "iteratorType": return getOrCreateConfiguration(target).getIteratorType();
        case "maxresultsperrequest":
        case "maxResultsPerRequest": return getOrCreateConfiguration(target).getMaxResultsPerRequest();
        case "proxyhost":
        case "proxyHost": return getOrCreateConfiguration(target).getProxyHost();
        case "proxyport":
        case "proxyPort": return getOrCreateConfiguration(target).getProxyPort();
        case "proxyprotocol":
        case "proxyProtocol": return getOrCreateConfiguration(target).getProxyProtocol();
        case "region": return getOrCreateConfiguration(target).getRegion();
        case "secretkey":
        case "secretKey": return getOrCreateConfiguration(target).getSecretKey();
        case "sequencenumberprovider":
        case "sequenceNumberProvider": return getOrCreateConfiguration(target).getSequenceNumberProvider();
        case "trustallcertificates":
        case "trustAllCertificates": return getOrCreateConfiguration(target).isTrustAllCertificates();
        default: return null;
        }
    }
}

