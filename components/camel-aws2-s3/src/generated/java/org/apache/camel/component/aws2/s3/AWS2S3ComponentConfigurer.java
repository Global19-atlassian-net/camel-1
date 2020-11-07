/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws2.s3;

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
public class AWS2S3ComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.aws2.s3.AWS2S3Configuration getOrCreateConfiguration(AWS2S3Component target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.aws2.s3.AWS2S3Configuration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        AWS2S3Component target = (AWS2S3Component) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": getOrCreateConfiguration(target).setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "amazons3client":
        case "amazonS3Client": getOrCreateConfiguration(target).setAmazonS3Client(property(camelContext, software.amazon.awssdk.services.s3.S3Client.class, value)); return true;
        case "autocreatebucket":
        case "autoCreateBucket": getOrCreateConfiguration(target).setAutoCreateBucket(property(camelContext, boolean.class, value)); return true;
        case "autodiscoverclient":
        case "autoDiscoverClient": getOrCreateConfiguration(target).setAutoDiscoverClient(property(camelContext, boolean.class, value)); return true;
        case "autoclosebody":
        case "autocloseBody": getOrCreateConfiguration(target).setAutocloseBody(property(camelContext, boolean.class, value)); return true;
        case "awskmskeyid":
        case "awsKMSKeyId": getOrCreateConfiguration(target).setAwsKMSKeyId(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.aws2.s3.AWS2S3Configuration.class, value)); return true;
        case "customeralgorithm":
        case "customerAlgorithm": getOrCreateConfiguration(target).setCustomerAlgorithm(property(camelContext, java.lang.String.class, value)); return true;
        case "customerkeyid":
        case "customerKeyId": getOrCreateConfiguration(target).setCustomerKeyId(property(camelContext, java.lang.String.class, value)); return true;
        case "customerkeymd5":
        case "customerKeyMD5": getOrCreateConfiguration(target).setCustomerKeyMD5(property(camelContext, java.lang.String.class, value)); return true;
        case "deleteafterread":
        case "deleteAfterRead": getOrCreateConfiguration(target).setDeleteAfterRead(property(camelContext, boolean.class, value)); return true;
        case "deleteafterwrite":
        case "deleteAfterWrite": getOrCreateConfiguration(target).setDeleteAfterWrite(property(camelContext, boolean.class, value)); return true;
        case "delimiter": getOrCreateConfiguration(target).setDelimiter(property(camelContext, java.lang.String.class, value)); return true;
        case "destinationbucket":
        case "destinationBucket": getOrCreateConfiguration(target).setDestinationBucket(property(camelContext, java.lang.String.class, value)); return true;
        case "destinationbucketprefix":
        case "destinationBucketPrefix": getOrCreateConfiguration(target).setDestinationBucketPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "destinationbucketsuffix":
        case "destinationBucketSuffix": getOrCreateConfiguration(target).setDestinationBucketSuffix(property(camelContext, java.lang.String.class, value)); return true;
        case "filename":
        case "fileName": getOrCreateConfiguration(target).setFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "includebody":
        case "includeBody": getOrCreateConfiguration(target).setIncludeBody(property(camelContext, boolean.class, value)); return true;
        case "includefolders":
        case "includeFolders": getOrCreateConfiguration(target).setIncludeFolders(property(camelContext, boolean.class, value)); return true;
        case "keyname":
        case "keyName": getOrCreateConfiguration(target).setKeyName(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "moveafterread":
        case "moveAfterRead": getOrCreateConfiguration(target).setMoveAfterRead(property(camelContext, boolean.class, value)); return true;
        case "multipartupload":
        case "multiPartUpload": getOrCreateConfiguration(target).setMultiPartUpload(property(camelContext, boolean.class, value)); return true;
        case "operation": getOrCreateConfiguration(target).setOperation(property(camelContext, org.apache.camel.component.aws2.s3.AWS2S3Operations.class, value)); return true;
        case "overrideendpoint":
        case "overrideEndpoint": getOrCreateConfiguration(target).setOverrideEndpoint(property(camelContext, boolean.class, value)); return true;
        case "partsize":
        case "partSize": getOrCreateConfiguration(target).setPartSize(property(camelContext, long.class, value)); return true;
        case "pojorequest":
        case "pojoRequest": getOrCreateConfiguration(target).setPojoRequest(property(camelContext, boolean.class, value)); return true;
        case "policy": getOrCreateConfiguration(target).setPolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "prefix": getOrCreateConfiguration(target).setPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyhost":
        case "proxyHost": getOrCreateConfiguration(target).setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": getOrCreateConfiguration(target).setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyprotocol":
        case "proxyProtocol": getOrCreateConfiguration(target).setProxyProtocol(property(camelContext, software.amazon.awssdk.core.Protocol.class, value)); return true;
        case "region": getOrCreateConfiguration(target).setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey":
        case "secretKey": getOrCreateConfiguration(target).setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "storageclass":
        case "storageClass": getOrCreateConfiguration(target).setStorageClass(property(camelContext, java.lang.String.class, value)); return true;
        case "trustallcertificates":
        case "trustAllCertificates": getOrCreateConfiguration(target).setTrustAllCertificates(property(camelContext, boolean.class, value)); return true;
        case "uriendpointoverride":
        case "uriEndpointOverride": getOrCreateConfiguration(target).setUriEndpointOverride(property(camelContext, java.lang.String.class, value)); return true;
        case "useawskms":
        case "useAwsKMS": getOrCreateConfiguration(target).setUseAwsKMS(property(camelContext, boolean.class, value)); return true;
        case "usecustomerkey":
        case "useCustomerKey": getOrCreateConfiguration(target).setUseCustomerKey(property(camelContext, boolean.class, value)); return true;
        case "useiamcredentials":
        case "useIAMCredentials": getOrCreateConfiguration(target).setUseIAMCredentials(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return java.lang.String.class;
        case "amazons3client":
        case "amazonS3Client": return software.amazon.awssdk.services.s3.S3Client.class;
        case "autocreatebucket":
        case "autoCreateBucket": return boolean.class;
        case "autodiscoverclient":
        case "autoDiscoverClient": return boolean.class;
        case "autoclosebody":
        case "autocloseBody": return boolean.class;
        case "awskmskeyid":
        case "awsKMSKeyId": return java.lang.String.class;
        case "basicpropertybinding":
        case "basicPropertyBinding": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "configuration": return org.apache.camel.component.aws2.s3.AWS2S3Configuration.class;
        case "customeralgorithm":
        case "customerAlgorithm": return java.lang.String.class;
        case "customerkeyid":
        case "customerKeyId": return java.lang.String.class;
        case "customerkeymd5":
        case "customerKeyMD5": return java.lang.String.class;
        case "deleteafterread":
        case "deleteAfterRead": return boolean.class;
        case "deleteafterwrite":
        case "deleteAfterWrite": return boolean.class;
        case "delimiter": return java.lang.String.class;
        case "destinationbucket":
        case "destinationBucket": return java.lang.String.class;
        case "destinationbucketprefix":
        case "destinationBucketPrefix": return java.lang.String.class;
        case "destinationbucketsuffix":
        case "destinationBucketSuffix": return java.lang.String.class;
        case "filename":
        case "fileName": return java.lang.String.class;
        case "includebody":
        case "includeBody": return boolean.class;
        case "includefolders":
        case "includeFolders": return boolean.class;
        case "keyname":
        case "keyName": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "moveafterread":
        case "moveAfterRead": return boolean.class;
        case "multipartupload":
        case "multiPartUpload": return boolean.class;
        case "operation": return org.apache.camel.component.aws2.s3.AWS2S3Operations.class;
        case "overrideendpoint":
        case "overrideEndpoint": return boolean.class;
        case "partsize":
        case "partSize": return long.class;
        case "pojorequest":
        case "pojoRequest": return boolean.class;
        case "policy": return java.lang.String.class;
        case "prefix": return java.lang.String.class;
        case "proxyhost":
        case "proxyHost": return java.lang.String.class;
        case "proxyport":
        case "proxyPort": return java.lang.Integer.class;
        case "proxyprotocol":
        case "proxyProtocol": return software.amazon.awssdk.core.Protocol.class;
        case "region": return java.lang.String.class;
        case "secretkey":
        case "secretKey": return java.lang.String.class;
        case "storageclass":
        case "storageClass": return java.lang.String.class;
        case "trustallcertificates":
        case "trustAllCertificates": return boolean.class;
        case "uriendpointoverride":
        case "uriEndpointOverride": return java.lang.String.class;
        case "useawskms":
        case "useAwsKMS": return boolean.class;
        case "usecustomerkey":
        case "useCustomerKey": return boolean.class;
        case "useiamcredentials":
        case "useIAMCredentials": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        AWS2S3Component target = (AWS2S3Component) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return getOrCreateConfiguration(target).getAccessKey();
        case "amazons3client":
        case "amazonS3Client": return getOrCreateConfiguration(target).getAmazonS3Client();
        case "autocreatebucket":
        case "autoCreateBucket": return getOrCreateConfiguration(target).isAutoCreateBucket();
        case "autodiscoverclient":
        case "autoDiscoverClient": return getOrCreateConfiguration(target).isAutoDiscoverClient();
        case "autoclosebody":
        case "autocloseBody": return getOrCreateConfiguration(target).isAutocloseBody();
        case "awskmskeyid":
        case "awsKMSKeyId": return getOrCreateConfiguration(target).getAwsKMSKeyId();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "configuration": return target.getConfiguration();
        case "customeralgorithm":
        case "customerAlgorithm": return getOrCreateConfiguration(target).getCustomerAlgorithm();
        case "customerkeyid":
        case "customerKeyId": return getOrCreateConfiguration(target).getCustomerKeyId();
        case "customerkeymd5":
        case "customerKeyMD5": return getOrCreateConfiguration(target).getCustomerKeyMD5();
        case "deleteafterread":
        case "deleteAfterRead": return getOrCreateConfiguration(target).isDeleteAfterRead();
        case "deleteafterwrite":
        case "deleteAfterWrite": return getOrCreateConfiguration(target).isDeleteAfterWrite();
        case "delimiter": return getOrCreateConfiguration(target).getDelimiter();
        case "destinationbucket":
        case "destinationBucket": return getOrCreateConfiguration(target).getDestinationBucket();
        case "destinationbucketprefix":
        case "destinationBucketPrefix": return getOrCreateConfiguration(target).getDestinationBucketPrefix();
        case "destinationbucketsuffix":
        case "destinationBucketSuffix": return getOrCreateConfiguration(target).getDestinationBucketSuffix();
        case "filename":
        case "fileName": return getOrCreateConfiguration(target).getFileName();
        case "includebody":
        case "includeBody": return getOrCreateConfiguration(target).isIncludeBody();
        case "includefolders":
        case "includeFolders": return getOrCreateConfiguration(target).isIncludeFolders();
        case "keyname":
        case "keyName": return getOrCreateConfiguration(target).getKeyName();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "moveafterread":
        case "moveAfterRead": return getOrCreateConfiguration(target).isMoveAfterRead();
        case "multipartupload":
        case "multiPartUpload": return getOrCreateConfiguration(target).isMultiPartUpload();
        case "operation": return getOrCreateConfiguration(target).getOperation();
        case "overrideendpoint":
        case "overrideEndpoint": return getOrCreateConfiguration(target).isOverrideEndpoint();
        case "partsize":
        case "partSize": return getOrCreateConfiguration(target).getPartSize();
        case "pojorequest":
        case "pojoRequest": return getOrCreateConfiguration(target).isPojoRequest();
        case "policy": return getOrCreateConfiguration(target).getPolicy();
        case "prefix": return getOrCreateConfiguration(target).getPrefix();
        case "proxyhost":
        case "proxyHost": return getOrCreateConfiguration(target).getProxyHost();
        case "proxyport":
        case "proxyPort": return getOrCreateConfiguration(target).getProxyPort();
        case "proxyprotocol":
        case "proxyProtocol": return getOrCreateConfiguration(target).getProxyProtocol();
        case "region": return getOrCreateConfiguration(target).getRegion();
        case "secretkey":
        case "secretKey": return getOrCreateConfiguration(target).getSecretKey();
        case "storageclass":
        case "storageClass": return getOrCreateConfiguration(target).getStorageClass();
        case "trustallcertificates":
        case "trustAllCertificates": return getOrCreateConfiguration(target).isTrustAllCertificates();
        case "uriendpointoverride":
        case "uriEndpointOverride": return getOrCreateConfiguration(target).getUriEndpointOverride();
        case "useawskms":
        case "useAwsKMS": return getOrCreateConfiguration(target).isUseAwsKMS();
        case "usecustomerkey":
        case "useCustomerKey": return getOrCreateConfiguration(target).isUseCustomerKey();
        case "useiamcredentials":
        case "useIAMCredentials": return getOrCreateConfiguration(target).isUseIAMCredentials();
        default: return null;
        }
    }
}

