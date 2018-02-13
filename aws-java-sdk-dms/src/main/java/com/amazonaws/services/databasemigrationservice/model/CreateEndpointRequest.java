/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/CreateEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters, digits,
     * and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
     * </p>
     */
    private String endpointIdentifier;
    /**
     * <p>
     * The type of endpoint.
     * </p>
     */
    private String endpointType;
    /**
     * <p>
     * The type of engine for the endpoint. Valid values, depending on the EndPointType, include mysql, oracle,
     * postgres, mariadb, aurora, redshift, S3, sybase, dynamodb, mongodb, and sqlserver.
     * </p>
     */
    private String engineName;
    /**
     * <p>
     * The user name to be used to login to the endpoint database.
     * </p>
     */
    private String username;
    /**
     * <p>
     * The password to be used to login to the endpoint database.
     * </p>
     */
    private String password;
    /**
     * <p>
     * The name of the server where the endpoint database resides.
     * </p>
     */
    private String serverName;
    /**
     * <p>
     * The port used by the endpoint database.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The name of the endpoint database.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * Additional attributes associated with the connection.
     * </p>
     */
    private String extraConnectionAttributes;
    /**
     * <p>
     * The KMS key identifier that will be used to encrypt the connection parameters. If you do not specify a value for
     * the KmsKeyId parameter, then AWS DMS will use your default encryption key. AWS KMS creates the default encryption
     * key for your AWS account. Your AWS account has a different default encryption key for each AWS region.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * Tags to be added to the endpoint.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the certificate.
     * </p>
     */
    private String certificateArn;
    /**
     * <p>
     * The SSL mode to use for the SSL connection.
     * </p>
     * <p>
     * SSL mode can be one of four values: none, require, verify-ca, verify-full.
     * </p>
     * <p>
     * The default value is none.
     * </p>
     */
    private String sslMode;
    /**
     * <p>
     * Settings in JSON format for the target Amazon DynamoDB endpoint. For more information about the available
     * settings, see the <b>Using Object Mapping to Migrate Data to DynamoDB</b> section at <a
     * href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DynamoDB.html"> Using an Amazon DynamoDB
     * Database as a Target for AWS Database Migration Service</a>.
     * </p>
     */
    private DynamoDbSettings dynamoDbSettings;
    /**
     * <p>
     * Settings in JSON format for the target S3 endpoint. For more information about the available settings, see the
     * <b>Extra Connection Attributes</b> section at <a
     * href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html"> Using Amazon S3 as a Target for AWS
     * Database Migration Service</a>.
     * </p>
     */
    private S3Settings s3Settings;
    /**
     * <p>
     * Settings in JSON format for the source MongoDB endpoint. For more information about the available settings, see
     * the <b>Configuration Properties When Using MongoDB as a Source for AWS Database Migration Service</b> section at
     * <a href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MongoDB.html"> Using Amazon S3 as a Target
     * for AWS Database Migration Service</a>.
     * </p>
     */
    private MongoDbSettings mongoDbSettings;

    /**
     * <p>
     * The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters, digits,
     * and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
     * </p>
     * 
     * @param endpointIdentifier
     *        The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters,
     *        digits, and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
     */

    public void setEndpointIdentifier(String endpointIdentifier) {
        this.endpointIdentifier = endpointIdentifier;
    }

    /**
     * <p>
     * The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters, digits,
     * and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
     * </p>
     * 
     * @return The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters,
     *         digits, and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
     */

    public String getEndpointIdentifier() {
        return this.endpointIdentifier;
    }

    /**
     * <p>
     * The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters, digits,
     * and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
     * </p>
     * 
     * @param endpointIdentifier
     *        The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters,
     *        digits, and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointRequest withEndpointIdentifier(String endpointIdentifier) {
        setEndpointIdentifier(endpointIdentifier);
        return this;
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint.
     * @see ReplicationEndpointTypeValue
     */

    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * 
     * @return The type of endpoint.
     * @see ReplicationEndpointTypeValue
     */

    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationEndpointTypeValue
     */

    public CreateEndpointRequest withEndpointType(String endpointType) {
        setEndpointType(endpointType);
        return this;
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint.
     * @see ReplicationEndpointTypeValue
     */

    public void setEndpointType(ReplicationEndpointTypeValue endpointType) {
        withEndpointType(endpointType);
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationEndpointTypeValue
     */

    public CreateEndpointRequest withEndpointType(ReplicationEndpointTypeValue endpointType) {
        this.endpointType = endpointType.toString();
        return this;
    }

    /**
     * <p>
     * The type of engine for the endpoint. Valid values, depending on the EndPointType, include mysql, oracle,
     * postgres, mariadb, aurora, redshift, S3, sybase, dynamodb, mongodb, and sqlserver.
     * </p>
     * 
     * @param engineName
     *        The type of engine for the endpoint. Valid values, depending on the EndPointType, include mysql, oracle,
     *        postgres, mariadb, aurora, redshift, S3, sybase, dynamodb, mongodb, and sqlserver.
     */

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    /**
     * <p>
     * The type of engine for the endpoint. Valid values, depending on the EndPointType, include mysql, oracle,
     * postgres, mariadb, aurora, redshift, S3, sybase, dynamodb, mongodb, and sqlserver.
     * </p>
     * 
     * @return The type of engine for the endpoint. Valid values, depending on the EndPointType, include mysql, oracle,
     *         postgres, mariadb, aurora, redshift, S3, sybase, dynamodb, mongodb, and sqlserver.
     */

    public String getEngineName() {
        return this.engineName;
    }

    /**
     * <p>
     * The type of engine for the endpoint. Valid values, depending on the EndPointType, include mysql, oracle,
     * postgres, mariadb, aurora, redshift, S3, sybase, dynamodb, mongodb, and sqlserver.
     * </p>
     * 
     * @param engineName
     *        The type of engine for the endpoint. Valid values, depending on the EndPointType, include mysql, oracle,
     *        postgres, mariadb, aurora, redshift, S3, sybase, dynamodb, mongodb, and sqlserver.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointRequest withEngineName(String engineName) {
        setEngineName(engineName);
        return this;
    }

    /**
     * <p>
     * The user name to be used to login to the endpoint database.
     * </p>
     * 
     * @param username
     *        The user name to be used to login to the endpoint database.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name to be used to login to the endpoint database.
     * </p>
     * 
     * @return The user name to be used to login to the endpoint database.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The user name to be used to login to the endpoint database.
     * </p>
     * 
     * @param username
     *        The user name to be used to login to the endpoint database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointRequest withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * The password to be used to login to the endpoint database.
     * </p>
     * 
     * @param password
     *        The password to be used to login to the endpoint database.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password to be used to login to the endpoint database.
     * </p>
     * 
     * @return The password to be used to login to the endpoint database.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The password to be used to login to the endpoint database.
     * </p>
     * 
     * @param password
     *        The password to be used to login to the endpoint database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointRequest withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * <p>
     * The name of the server where the endpoint database resides.
     * </p>
     * 
     * @param serverName
     *        The name of the server where the endpoint database resides.
     */

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The name of the server where the endpoint database resides.
     * </p>
     * 
     * @return The name of the server where the endpoint database resides.
     */

    public String getServerName() {
        return this.serverName;
    }

    /**
     * <p>
     * The name of the server where the endpoint database resides.
     * </p>
     * 
     * @param serverName
     *        The name of the server where the endpoint database resides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointRequest withServerName(String serverName) {
        setServerName(serverName);
        return this;
    }

    /**
     * <p>
     * The port used by the endpoint database.
     * </p>
     * 
     * @param port
     *        The port used by the endpoint database.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port used by the endpoint database.
     * </p>
     * 
     * @return The port used by the endpoint database.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port used by the endpoint database.
     * </p>
     * 
     * @param port
     *        The port used by the endpoint database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointRequest withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The name of the endpoint database.
     * </p>
     * 
     * @param databaseName
     *        The name of the endpoint database.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the endpoint database.
     * </p>
     * 
     * @return The name of the endpoint database.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the endpoint database.
     * </p>
     * 
     * @param databaseName
     *        The name of the endpoint database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * Additional attributes associated with the connection.
     * </p>
     * 
     * @param extraConnectionAttributes
     *        Additional attributes associated with the connection.
     */

    public void setExtraConnectionAttributes(String extraConnectionAttributes) {
        this.extraConnectionAttributes = extraConnectionAttributes;
    }

    /**
     * <p>
     * Additional attributes associated with the connection.
     * </p>
     * 
     * @return Additional attributes associated with the connection.
     */

    public String getExtraConnectionAttributes() {
        return this.extraConnectionAttributes;
    }

    /**
     * <p>
     * Additional attributes associated with the connection.
     * </p>
     * 
     * @param extraConnectionAttributes
     *        Additional attributes associated with the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointRequest withExtraConnectionAttributes(String extraConnectionAttributes) {
        setExtraConnectionAttributes(extraConnectionAttributes);
        return this;
    }

    /**
     * <p>
     * The KMS key identifier that will be used to encrypt the connection parameters. If you do not specify a value for
     * the KmsKeyId parameter, then AWS DMS will use your default encryption key. AWS KMS creates the default encryption
     * key for your AWS account. Your AWS account has a different default encryption key for each AWS region.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key identifier that will be used to encrypt the connection parameters. If you do not specify a
     *        value for the KmsKeyId parameter, then AWS DMS will use your default encryption key. AWS KMS creates the
     *        default encryption key for your AWS account. Your AWS account has a different default encryption key for
     *        each AWS region.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The KMS key identifier that will be used to encrypt the connection parameters. If you do not specify a value for
     * the KmsKeyId parameter, then AWS DMS will use your default encryption key. AWS KMS creates the default encryption
     * key for your AWS account. Your AWS account has a different default encryption key for each AWS region.
     * </p>
     * 
     * @return The KMS key identifier that will be used to encrypt the connection parameters. If you do not specify a
     *         value for the KmsKeyId parameter, then AWS DMS will use your default encryption key. AWS KMS creates the
     *         default encryption key for your AWS account. Your AWS account has a different default encryption key for
     *         each AWS region.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The KMS key identifier that will be used to encrypt the connection parameters. If you do not specify a value for
     * the KmsKeyId parameter, then AWS DMS will use your default encryption key. AWS KMS creates the default encryption
     * key for your AWS account. Your AWS account has a different default encryption key for each AWS region.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key identifier that will be used to encrypt the connection parameters. If you do not specify a
     *        value for the KmsKeyId parameter, then AWS DMS will use your default encryption key. AWS KMS creates the
     *        default encryption key for your AWS account. Your AWS account has a different default encryption key for
     *        each AWS region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * Tags to be added to the endpoint.
     * </p>
     * 
     * @return Tags to be added to the endpoint.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags to be added to the endpoint.
     * </p>
     * 
     * @param tags
     *        Tags to be added to the endpoint.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Tags to be added to the endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Tags to be added to the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Tags to be added to the endpoint.
     * </p>
     * 
     * @param tags
     *        Tags to be added to the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the certificate.
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) for the certificate.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the certificate.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the certificate.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the certificate.
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) for the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointRequest withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * <p>
     * The SSL mode to use for the SSL connection.
     * </p>
     * <p>
     * SSL mode can be one of four values: none, require, verify-ca, verify-full.
     * </p>
     * <p>
     * The default value is none.
     * </p>
     * 
     * @param sslMode
     *        The SSL mode to use for the SSL connection.</p>
     *        <p>
     *        SSL mode can be one of four values: none, require, verify-ca, verify-full.
     *        </p>
     *        <p>
     *        The default value is none.
     * @see DmsSslModeValue
     */

    public void setSslMode(String sslMode) {
        this.sslMode = sslMode;
    }

    /**
     * <p>
     * The SSL mode to use for the SSL connection.
     * </p>
     * <p>
     * SSL mode can be one of four values: none, require, verify-ca, verify-full.
     * </p>
     * <p>
     * The default value is none.
     * </p>
     * 
     * @return The SSL mode to use for the SSL connection.</p>
     *         <p>
     *         SSL mode can be one of four values: none, require, verify-ca, verify-full.
     *         </p>
     *         <p>
     *         The default value is none.
     * @see DmsSslModeValue
     */

    public String getSslMode() {
        return this.sslMode;
    }

    /**
     * <p>
     * The SSL mode to use for the SSL connection.
     * </p>
     * <p>
     * SSL mode can be one of four values: none, require, verify-ca, verify-full.
     * </p>
     * <p>
     * The default value is none.
     * </p>
     * 
     * @param sslMode
     *        The SSL mode to use for the SSL connection.</p>
     *        <p>
     *        SSL mode can be one of four values: none, require, verify-ca, verify-full.
     *        </p>
     *        <p>
     *        The default value is none.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DmsSslModeValue
     */

    public CreateEndpointRequest withSslMode(String sslMode) {
        setSslMode(sslMode);
        return this;
    }

    /**
     * <p>
     * The SSL mode to use for the SSL connection.
     * </p>
     * <p>
     * SSL mode can be one of four values: none, require, verify-ca, verify-full.
     * </p>
     * <p>
     * The default value is none.
     * </p>
     * 
     * @param sslMode
     *        The SSL mode to use for the SSL connection.</p>
     *        <p>
     *        SSL mode can be one of four values: none, require, verify-ca, verify-full.
     *        </p>
     *        <p>
     *        The default value is none.
     * @see DmsSslModeValue
     */

    public void setSslMode(DmsSslModeValue sslMode) {
        withSslMode(sslMode);
    }

    /**
     * <p>
     * The SSL mode to use for the SSL connection.
     * </p>
     * <p>
     * SSL mode can be one of four values: none, require, verify-ca, verify-full.
     * </p>
     * <p>
     * The default value is none.
     * </p>
     * 
     * @param sslMode
     *        The SSL mode to use for the SSL connection.</p>
     *        <p>
     *        SSL mode can be one of four values: none, require, verify-ca, verify-full.
     *        </p>
     *        <p>
     *        The default value is none.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DmsSslModeValue
     */

    public CreateEndpointRequest withSslMode(DmsSslModeValue sslMode) {
        this.sslMode = sslMode.toString();
        return this;
    }

    /**
     * <p>
     * Settings in JSON format for the target Amazon DynamoDB endpoint. For more information about the available
     * settings, see the <b>Using Object Mapping to Migrate Data to DynamoDB</b> section at <a
     * href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DynamoDB.html"> Using an Amazon DynamoDB
     * Database as a Target for AWS Database Migration Service</a>.
     * </p>
     * 
     * @param dynamoDbSettings
     *        Settings in JSON format for the target Amazon DynamoDB endpoint. For more information about the available
     *        settings, see the <b>Using Object Mapping to Migrate Data to DynamoDB</b> section at <a
     *        href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DynamoDB.html"> Using an Amazon DynamoDB
     *        Database as a Target for AWS Database Migration Service</a>.
     */

    public void setDynamoDbSettings(DynamoDbSettings dynamoDbSettings) {
        this.dynamoDbSettings = dynamoDbSettings;
    }

    /**
     * <p>
     * Settings in JSON format for the target Amazon DynamoDB endpoint. For more information about the available
     * settings, see the <b>Using Object Mapping to Migrate Data to DynamoDB</b> section at <a
     * href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DynamoDB.html"> Using an Amazon DynamoDB
     * Database as a Target for AWS Database Migration Service</a>.
     * </p>
     * 
     * @return Settings in JSON format for the target Amazon DynamoDB endpoint. For more information about the available
     *         settings, see the <b>Using Object Mapping to Migrate Data to DynamoDB</b> section at <a
     *         href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DynamoDB.html"> Using an Amazon
     *         DynamoDB Database as a Target for AWS Database Migration Service</a>.
     */

    public DynamoDbSettings getDynamoDbSettings() {
        return this.dynamoDbSettings;
    }

    /**
     * <p>
     * Settings in JSON format for the target Amazon DynamoDB endpoint. For more information about the available
     * settings, see the <b>Using Object Mapping to Migrate Data to DynamoDB</b> section at <a
     * href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DynamoDB.html"> Using an Amazon DynamoDB
     * Database as a Target for AWS Database Migration Service</a>.
     * </p>
     * 
     * @param dynamoDbSettings
     *        Settings in JSON format for the target Amazon DynamoDB endpoint. For more information about the available
     *        settings, see the <b>Using Object Mapping to Migrate Data to DynamoDB</b> section at <a
     *        href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DynamoDB.html"> Using an Amazon DynamoDB
     *        Database as a Target for AWS Database Migration Service</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointRequest withDynamoDbSettings(DynamoDbSettings dynamoDbSettings) {
        setDynamoDbSettings(dynamoDbSettings);
        return this;
    }

    /**
     * <p>
     * Settings in JSON format for the target S3 endpoint. For more information about the available settings, see the
     * <b>Extra Connection Attributes</b> section at <a
     * href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html"> Using Amazon S3 as a Target for AWS
     * Database Migration Service</a>.
     * </p>
     * 
     * @param s3Settings
     *        Settings in JSON format for the target S3 endpoint. For more information about the available settings, see
     *        the <b>Extra Connection Attributes</b> section at <a
     *        href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html"> Using Amazon S3 as a Target
     *        for AWS Database Migration Service</a>.
     */

    public void setS3Settings(S3Settings s3Settings) {
        this.s3Settings = s3Settings;
    }

    /**
     * <p>
     * Settings in JSON format for the target S3 endpoint. For more information about the available settings, see the
     * <b>Extra Connection Attributes</b> section at <a
     * href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html"> Using Amazon S3 as a Target for AWS
     * Database Migration Service</a>.
     * </p>
     * 
     * @return Settings in JSON format for the target S3 endpoint. For more information about the available settings,
     *         see the <b>Extra Connection Attributes</b> section at <a
     *         href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html"> Using Amazon S3 as a Target
     *         for AWS Database Migration Service</a>.
     */

    public S3Settings getS3Settings() {
        return this.s3Settings;
    }

    /**
     * <p>
     * Settings in JSON format for the target S3 endpoint. For more information about the available settings, see the
     * <b>Extra Connection Attributes</b> section at <a
     * href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html"> Using Amazon S3 as a Target for AWS
     * Database Migration Service</a>.
     * </p>
     * 
     * @param s3Settings
     *        Settings in JSON format for the target S3 endpoint. For more information about the available settings, see
     *        the <b>Extra Connection Attributes</b> section at <a
     *        href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html"> Using Amazon S3 as a Target
     *        for AWS Database Migration Service</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointRequest withS3Settings(S3Settings s3Settings) {
        setS3Settings(s3Settings);
        return this;
    }

    /**
     * <p>
     * Settings in JSON format for the source MongoDB endpoint. For more information about the available settings, see
     * the <b>Configuration Properties When Using MongoDB as a Source for AWS Database Migration Service</b> section at
     * <a href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MongoDB.html"> Using Amazon S3 as a Target
     * for AWS Database Migration Service</a>.
     * </p>
     * 
     * @param mongoDbSettings
     *        Settings in JSON format for the source MongoDB endpoint. For more information about the available
     *        settings, see the <b>Configuration Properties When Using MongoDB as a Source for AWS Database Migration
     *        Service</b> section at <a href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MongoDB.html">
     *        Using Amazon S3 as a Target for AWS Database Migration Service</a>.
     */

    public void setMongoDbSettings(MongoDbSettings mongoDbSettings) {
        this.mongoDbSettings = mongoDbSettings;
    }

    /**
     * <p>
     * Settings in JSON format for the source MongoDB endpoint. For more information about the available settings, see
     * the <b>Configuration Properties When Using MongoDB as a Source for AWS Database Migration Service</b> section at
     * <a href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MongoDB.html"> Using Amazon S3 as a Target
     * for AWS Database Migration Service</a>.
     * </p>
     * 
     * @return Settings in JSON format for the source MongoDB endpoint. For more information about the available
     *         settings, see the <b>Configuration Properties When Using MongoDB as a Source for AWS Database Migration
     *         Service</b> section at <a
     *         href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MongoDB.html"> Using Amazon S3 as a
     *         Target for AWS Database Migration Service</a>.
     */

    public MongoDbSettings getMongoDbSettings() {
        return this.mongoDbSettings;
    }

    /**
     * <p>
     * Settings in JSON format for the source MongoDB endpoint. For more information about the available settings, see
     * the <b>Configuration Properties When Using MongoDB as a Source for AWS Database Migration Service</b> section at
     * <a href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MongoDB.html"> Using Amazon S3 as a Target
     * for AWS Database Migration Service</a>.
     * </p>
     * 
     * @param mongoDbSettings
     *        Settings in JSON format for the source MongoDB endpoint. For more information about the available
     *        settings, see the <b>Configuration Properties When Using MongoDB as a Source for AWS Database Migration
     *        Service</b> section at <a href="http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MongoDB.html">
     *        Using Amazon S3 as a Target for AWS Database Migration Service</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointRequest withMongoDbSettings(MongoDbSettings mongoDbSettings) {
        setMongoDbSettings(mongoDbSettings);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEndpointIdentifier() != null)
            sb.append("EndpointIdentifier: ").append(getEndpointIdentifier()).append(",");
        if (getEndpointType() != null)
            sb.append("EndpointType: ").append(getEndpointType()).append(",");
        if (getEngineName() != null)
            sb.append("EngineName: ").append(getEngineName()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername()).append(",");
        if (getPassword() != null)
            sb.append("Password: ").append(getPassword()).append(",");
        if (getServerName() != null)
            sb.append("ServerName: ").append(getServerName()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getExtraConnectionAttributes() != null)
            sb.append("ExtraConnectionAttributes: ").append(getExtraConnectionAttributes()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getCertificateArn() != null)
            sb.append("CertificateArn: ").append(getCertificateArn()).append(",");
        if (getSslMode() != null)
            sb.append("SslMode: ").append(getSslMode()).append(",");
        if (getDynamoDbSettings() != null)
            sb.append("DynamoDbSettings: ").append(getDynamoDbSettings()).append(",");
        if (getS3Settings() != null)
            sb.append("S3Settings: ").append(getS3Settings()).append(",");
        if (getMongoDbSettings() != null)
            sb.append("MongoDbSettings: ").append(getMongoDbSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEndpointRequest == false)
            return false;
        CreateEndpointRequest other = (CreateEndpointRequest) obj;
        if (other.getEndpointIdentifier() == null ^ this.getEndpointIdentifier() == null)
            return false;
        if (other.getEndpointIdentifier() != null && other.getEndpointIdentifier().equals(this.getEndpointIdentifier()) == false)
            return false;
        if (other.getEndpointType() == null ^ this.getEndpointType() == null)
            return false;
        if (other.getEndpointType() != null && other.getEndpointType().equals(this.getEndpointType()) == false)
            return false;
        if (other.getEngineName() == null ^ this.getEngineName() == null)
            return false;
        if (other.getEngineName() != null && other.getEngineName().equals(this.getEngineName()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null && other.getServerName().equals(this.getServerName()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getExtraConnectionAttributes() == null ^ this.getExtraConnectionAttributes() == null)
            return false;
        if (other.getExtraConnectionAttributes() != null && other.getExtraConnectionAttributes().equals(this.getExtraConnectionAttributes()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getSslMode() == null ^ this.getSslMode() == null)
            return false;
        if (other.getSslMode() != null && other.getSslMode().equals(this.getSslMode()) == false)
            return false;
        if (other.getDynamoDbSettings() == null ^ this.getDynamoDbSettings() == null)
            return false;
        if (other.getDynamoDbSettings() != null && other.getDynamoDbSettings().equals(this.getDynamoDbSettings()) == false)
            return false;
        if (other.getS3Settings() == null ^ this.getS3Settings() == null)
            return false;
        if (other.getS3Settings() != null && other.getS3Settings().equals(this.getS3Settings()) == false)
            return false;
        if (other.getMongoDbSettings() == null ^ this.getMongoDbSettings() == null)
            return false;
        if (other.getMongoDbSettings() != null && other.getMongoDbSettings().equals(this.getMongoDbSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointIdentifier() == null) ? 0 : getEndpointIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEndpointType() == null) ? 0 : getEndpointType().hashCode());
        hashCode = prime * hashCode + ((getEngineName() == null) ? 0 : getEngineName().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getExtraConnectionAttributes() == null) ? 0 : getExtraConnectionAttributes().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getSslMode() == null) ? 0 : getSslMode().hashCode());
        hashCode = prime * hashCode + ((getDynamoDbSettings() == null) ? 0 : getDynamoDbSettings().hashCode());
        hashCode = prime * hashCode + ((getS3Settings() == null) ? 0 : getS3Settings().hashCode());
        hashCode = prime * hashCode + ((getMongoDbSettings() == null) ? 0 : getMongoDbSettings().hashCode());
        return hashCode;
    }

    @Override
    public CreateEndpointRequest clone() {
        return (CreateEndpointRequest) super.clone();
    }

}
