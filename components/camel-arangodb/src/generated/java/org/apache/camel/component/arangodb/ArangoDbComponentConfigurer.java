/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.arangodb;

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
public class ArangoDbComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.arangodb.ArangoDbConfiguration getOrCreateConfiguration(ArangoDbComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.arangodb.ArangoDbConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        ArangoDbComponent target = (ArangoDbComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.arangodb.ArangoDbConfiguration.class, value)); return true;
        case "documentcollection":
        case "documentCollection": getOrCreateConfiguration(target).setDocumentCollection(property(camelContext, java.lang.String.class, value)); return true;
        case "edgecollection":
        case "edgeCollection": getOrCreateConfiguration(target).setEdgeCollection(property(camelContext, java.lang.String.class, value)); return true;
        case "graph": getOrCreateConfiguration(target).setGraph(property(camelContext, java.lang.String.class, value)); return true;
        case "host": getOrCreateConfiguration(target).setHost(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": getOrCreateConfiguration(target).setOperation(property(camelContext, org.apache.camel.component.arangodb.ArangoDbOperation.class, value)); return true;
        case "password": getOrCreateConfiguration(target).setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "port": getOrCreateConfiguration(target).setPort(property(camelContext, int.class, value)); return true;
        case "user": getOrCreateConfiguration(target).setUser(property(camelContext, java.lang.String.class, value)); return true;
        case "vertexcollection":
        case "vertexCollection": getOrCreateConfiguration(target).setVertexCollection(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return boolean.class;
        case "configuration": return org.apache.camel.component.arangodb.ArangoDbConfiguration.class;
        case "documentcollection":
        case "documentCollection": return java.lang.String.class;
        case "edgecollection":
        case "edgeCollection": return java.lang.String.class;
        case "graph": return java.lang.String.class;
        case "host": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "operation": return org.apache.camel.component.arangodb.ArangoDbOperation.class;
        case "password": return java.lang.String.class;
        case "port": return int.class;
        case "user": return java.lang.String.class;
        case "vertexcollection":
        case "vertexCollection": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        ArangoDbComponent target = (ArangoDbComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "configuration": return target.getConfiguration();
        case "documentcollection":
        case "documentCollection": return getOrCreateConfiguration(target).getDocumentCollection();
        case "edgecollection":
        case "edgeCollection": return getOrCreateConfiguration(target).getEdgeCollection();
        case "graph": return getOrCreateConfiguration(target).getGraph();
        case "host": return getOrCreateConfiguration(target).getHost();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "operation": return getOrCreateConfiguration(target).getOperation();
        case "password": return getOrCreateConfiguration(target).getPassword();
        case "port": return getOrCreateConfiguration(target).getPort();
        case "user": return getOrCreateConfiguration(target).getUser();
        case "vertexcollection":
        case "vertexCollection": return getOrCreateConfiguration(target).getVertexCollection();
        default: return null;
        }
    }
}

