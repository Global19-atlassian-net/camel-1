/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.git;

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
public class GitEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        GitEndpoint target = (GitEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowempty":
        case "allowEmpty": target.setAllowEmpty(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "branchname":
        case "branchName": target.setBranchName(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": target.setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "password": target.setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "remotename":
        case "remoteName": target.setRemoteName(property(camelContext, java.lang.String.class, value)); return true;
        case "remotepath":
        case "remotePath": target.setRemotePath(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "tagname":
        case "tagName": target.setTagName(property(camelContext, java.lang.String.class, value)); return true;
        case "type": target.setType(property(camelContext, org.apache.camel.component.git.consumer.GitType.class, value)); return true;
        case "username": target.setUsername(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowempty":
        case "allowEmpty": return boolean.class;
        case "basicpropertybinding":
        case "basicPropertyBinding": return boolean.class;
        case "branchname":
        case "branchName": return java.lang.String.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "operation": return java.lang.String.class;
        case "password": return java.lang.String.class;
        case "remotename":
        case "remoteName": return java.lang.String.class;
        case "remotepath":
        case "remotePath": return java.lang.String.class;
        case "synchronous": return boolean.class;
        case "tagname":
        case "tagName": return java.lang.String.class;
        case "type": return org.apache.camel.component.git.consumer.GitType.class;
        case "username": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        GitEndpoint target = (GitEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowempty":
        case "allowEmpty": return target.isAllowEmpty();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "branchname":
        case "branchName": return target.getBranchName();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "operation": return target.getOperation();
        case "password": return target.getPassword();
        case "remotename":
        case "remoteName": return target.getRemoteName();
        case "remotepath":
        case "remotePath": return target.getRemotePath();
        case "synchronous": return target.isSynchronous();
        case "tagname":
        case "tagName": return target.getTagName();
        case "type": return target.getType();
        case "username": return target.getUsername();
        default: return null;
        }
    }
}

