/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws.kinesis;

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
public class KinesisComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.aws.kinesis.KinesisConfiguration getOrCreateConfiguration(KinesisComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.aws.kinesis.KinesisConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        KinesisComponent target = (KinesisComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": getOrCreateConfiguration(target).setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "amazonkinesisclient":
        case "amazonKinesisClient": getOrCreateConfiguration(target).setAmazonKinesisClient(property(camelContext, com.amazonaws.services.kinesis.AmazonKinesis.class, value)); return true;
        case "autodiscoverclient":
        case "autoDiscoverClient": getOrCreateConfiguration(target).setAutoDiscoverClient(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.aws.kinesis.KinesisConfiguration.class, value)); return true;
        case "iteratortype":
        case "iteratorType": getOrCreateConfiguration(target).setIteratorType(property(camelContext, com.amazonaws.services.kinesis.model.ShardIteratorType.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxresultsperrequest":
        case "maxResultsPerRequest": getOrCreateConfiguration(target).setMaxResultsPerRequest(property(camelContext, int.class, value)); return true;
        case "proxyhost":
        case "proxyHost": getOrCreateConfiguration(target).setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": getOrCreateConfiguration(target).setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyprotocol":
        case "proxyProtocol": getOrCreateConfiguration(target).setProxyProtocol(property(camelContext, com.amazonaws.Protocol.class, value)); return true;
        case "region": getOrCreateConfiguration(target).setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey":
        case "secretKey": getOrCreateConfiguration(target).setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "sequencenumber":
        case "sequenceNumber": getOrCreateConfiguration(target).setSequenceNumber(property(camelContext, java.lang.String.class, value)); return true;
        case "shardclosed":
        case "shardClosed": getOrCreateConfiguration(target).setShardClosed(property(camelContext, org.apache.camel.component.aws.kinesis.KinesisShardClosedStrategyEnum.class, value)); return true;
        case "shardid":
        case "shardId": getOrCreateConfiguration(target).setShardId(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return java.lang.String.class;
        case "amazonkinesisclient":
        case "amazonKinesisClient": return com.amazonaws.services.kinesis.AmazonKinesis.class;
        case "autodiscoverclient":
        case "autoDiscoverClient": return boolean.class;
        case "basicpropertybinding":
        case "basicPropertyBinding": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "configuration": return org.apache.camel.component.aws.kinesis.KinesisConfiguration.class;
        case "iteratortype":
        case "iteratorType": return com.amazonaws.services.kinesis.model.ShardIteratorType.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "maxresultsperrequest":
        case "maxResultsPerRequest": return int.class;
        case "proxyhost":
        case "proxyHost": return java.lang.String.class;
        case "proxyport":
        case "proxyPort": return java.lang.Integer.class;
        case "proxyprotocol":
        case "proxyProtocol": return com.amazonaws.Protocol.class;
        case "region": return java.lang.String.class;
        case "secretkey":
        case "secretKey": return java.lang.String.class;
        case "sequencenumber":
        case "sequenceNumber": return java.lang.String.class;
        case "shardclosed":
        case "shardClosed": return org.apache.camel.component.aws.kinesis.KinesisShardClosedStrategyEnum.class;
        case "shardid":
        case "shardId": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        KinesisComponent target = (KinesisComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return getOrCreateConfiguration(target).getAccessKey();
        case "amazonkinesisclient":
        case "amazonKinesisClient": return getOrCreateConfiguration(target).getAmazonKinesisClient();
        case "autodiscoverclient":
        case "autoDiscoverClient": return getOrCreateConfiguration(target).isAutoDiscoverClient();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "configuration": return target.getConfiguration();
        case "iteratortype":
        case "iteratorType": return getOrCreateConfiguration(target).getIteratorType();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
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
        case "sequencenumber":
        case "sequenceNumber": return getOrCreateConfiguration(target).getSequenceNumber();
        case "shardclosed":
        case "shardClosed": return getOrCreateConfiguration(target).getShardClosed();
        case "shardid":
        case "shardId": return getOrCreateConfiguration(target).getShardId();
        default: return null;
        }
    }
}

