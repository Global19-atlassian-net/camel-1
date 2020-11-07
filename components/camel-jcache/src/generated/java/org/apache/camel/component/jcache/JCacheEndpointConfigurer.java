/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jcache;

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
public class JCacheEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        JCacheEndpoint target = (JCacheEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "action": target.getConfiguration().setAction(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "cacheconfiguration":
        case "cacheConfiguration": target.getConfiguration().setCacheConfiguration(property(camelContext, javax.cache.configuration.Configuration.class, value)); return true;
        case "cacheconfigurationproperties":
        case "cacheConfigurationProperties": target.getConfiguration().setCacheConfigurationProperties(property(camelContext, java.util.Properties.class, value)); return true;
        case "cacheloaderfactory":
        case "cacheLoaderFactory": target.getConfiguration().setCacheLoaderFactory(property(camelContext, javax.cache.configuration.Factory.class, value)); return true;
        case "cachewriterfactory":
        case "cacheWriterFactory": target.getConfiguration().setCacheWriterFactory(property(camelContext, javax.cache.configuration.Factory.class, value)); return true;
        case "cachingprovider":
        case "cachingProvider": target.getConfiguration().setCachingProvider(property(camelContext, java.lang.String.class, value)); return true;
        case "configurationuri":
        case "configurationUri": target.getConfiguration().setConfigurationUri(property(camelContext, java.lang.String.class, value)); return true;
        case "createcacheifnotexists":
        case "createCacheIfNotExists": target.getConfiguration().setCreateCacheIfNotExists(property(camelContext, boolean.class, value)); return true;
        case "eventfilters":
        case "eventFilters": target.getConfiguration().setEventFilters(property(camelContext, java.util.List.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "expirypolicyfactory":
        case "expiryPolicyFactory": target.getConfiguration().setExpiryPolicyFactory(property(camelContext, javax.cache.configuration.Factory.class, value)); return true;
        case "filteredevents":
        case "filteredEvents": target.getConfiguration().setFilteredEvents(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "lookupproviders":
        case "lookupProviders": target.getConfiguration().setLookupProviders(property(camelContext, boolean.class, value)); return true;
        case "managementenabled":
        case "managementEnabled": target.getConfiguration().setManagementEnabled(property(camelContext, boolean.class, value)); return true;
        case "oldvaluerequired":
        case "oldValueRequired": target.getConfiguration().setOldValueRequired(property(camelContext, boolean.class, value)); return true;
        case "readthrough":
        case "readThrough": target.getConfiguration().setReadThrough(property(camelContext, boolean.class, value)); return true;
        case "statisticsenabled":
        case "statisticsEnabled": target.getConfiguration().setStatisticsEnabled(property(camelContext, boolean.class, value)); return true;
        case "storebyvalue":
        case "storeByValue": target.getConfiguration().setStoreByValue(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.getConfiguration().setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "writethrough":
        case "writeThrough": target.getConfiguration().setWriteThrough(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "action": return java.lang.String.class;
        case "basicpropertybinding":
        case "basicPropertyBinding": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "cacheconfiguration":
        case "cacheConfiguration": return javax.cache.configuration.Configuration.class;
        case "cacheconfigurationproperties":
        case "cacheConfigurationProperties": return java.util.Properties.class;
        case "cacheloaderfactory":
        case "cacheLoaderFactory": return javax.cache.configuration.Factory.class;
        case "cachewriterfactory":
        case "cacheWriterFactory": return javax.cache.configuration.Factory.class;
        case "cachingprovider":
        case "cachingProvider": return java.lang.String.class;
        case "configurationuri":
        case "configurationUri": return java.lang.String.class;
        case "createcacheifnotexists":
        case "createCacheIfNotExists": return boolean.class;
        case "eventfilters":
        case "eventFilters": return java.util.List.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "expirypolicyfactory":
        case "expiryPolicyFactory": return javax.cache.configuration.Factory.class;
        case "filteredevents":
        case "filteredEvents": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "lookupproviders":
        case "lookupProviders": return boolean.class;
        case "managementenabled":
        case "managementEnabled": return boolean.class;
        case "oldvaluerequired":
        case "oldValueRequired": return boolean.class;
        case "readthrough":
        case "readThrough": return boolean.class;
        case "statisticsenabled":
        case "statisticsEnabled": return boolean.class;
        case "storebyvalue":
        case "storeByValue": return boolean.class;
        case "synchronous": return boolean.class;
        case "writethrough":
        case "writeThrough": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        JCacheEndpoint target = (JCacheEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "action": return target.getConfiguration().getAction();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "cacheconfiguration":
        case "cacheConfiguration": return target.getConfiguration().getCacheConfiguration();
        case "cacheconfigurationproperties":
        case "cacheConfigurationProperties": return target.getConfiguration().getCacheConfigurationProperties();
        case "cacheloaderfactory":
        case "cacheLoaderFactory": return target.getConfiguration().getCacheLoaderFactory();
        case "cachewriterfactory":
        case "cacheWriterFactory": return target.getConfiguration().getCacheWriterFactory();
        case "cachingprovider":
        case "cachingProvider": return target.getConfiguration().getCachingProvider();
        case "configurationuri":
        case "configurationUri": return target.getConfiguration().getConfigurationUri();
        case "createcacheifnotexists":
        case "createCacheIfNotExists": return target.getConfiguration().isCreateCacheIfNotExists();
        case "eventfilters":
        case "eventFilters": return target.getConfiguration().getEventFilters();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "expirypolicyfactory":
        case "expiryPolicyFactory": return target.getConfiguration().getExpiryPolicyFactory();
        case "filteredevents":
        case "filteredEvents": return target.getConfiguration().getFilteredEvents();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "lookupproviders":
        case "lookupProviders": return target.getConfiguration().isLookupProviders();
        case "managementenabled":
        case "managementEnabled": return target.getConfiguration().isManagementEnabled();
        case "oldvaluerequired":
        case "oldValueRequired": return target.getConfiguration().isOldValueRequired();
        case "readthrough":
        case "readThrough": return target.getConfiguration().isReadThrough();
        case "statisticsenabled":
        case "statisticsEnabled": return target.getConfiguration().isStatisticsEnabled();
        case "storebyvalue":
        case "storeByValue": return target.getConfiguration().isStoreByValue();
        case "synchronous": return target.getConfiguration().isSynchronous();
        case "writethrough":
        case "writeThrough": return target.getConfiguration().isWriteThrough();
        default: return null;
        }
    }
}

