// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service_discovery.proto

package com.londonsmartcity.discovery;

/**
 * Protobuf type {@code discovery.UnregisterRequest}
 */
public final class UnregisterRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:discovery.UnregisterRequest)
    UnregisterRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UnregisterRequest.newBuilder() to construct.
  private UnregisterRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UnregisterRequest() {
    serviceId_ = "";
    registrationId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UnregisterRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UnregisterRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            serviceId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            registrationId_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.londonsmartcity.discovery.ServiceDiscoveryProto.internal_static_discovery_UnregisterRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.londonsmartcity.discovery.ServiceDiscoveryProto.internal_static_discovery_UnregisterRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.londonsmartcity.discovery.UnregisterRequest.class, com.londonsmartcity.discovery.UnregisterRequest.Builder.class);
  }

  public static final int SERVICE_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object serviceId_;
  /**
   * <code>string service_id = 1;</code>
   * @return The serviceId.
   */
  @java.lang.Override
  public java.lang.String getServiceId() {
    java.lang.Object ref = serviceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceId_ = s;
      return s;
    }
  }
  /**
   * <code>string service_id = 1;</code>
   * @return The bytes for serviceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getServiceIdBytes() {
    java.lang.Object ref = serviceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      serviceId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REGISTRATION_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object registrationId_;
  /**
   * <code>string registration_id = 2;</code>
   * @return The registrationId.
   */
  @java.lang.Override
  public java.lang.String getRegistrationId() {
    java.lang.Object ref = registrationId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      registrationId_ = s;
      return s;
    }
  }
  /**
   * <code>string registration_id = 2;</code>
   * @return The bytes for registrationId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRegistrationIdBytes() {
    java.lang.Object ref = registrationId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      registrationId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, serviceId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(registrationId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, registrationId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, serviceId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(registrationId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, registrationId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.londonsmartcity.discovery.UnregisterRequest)) {
      return super.equals(obj);
    }
    com.londonsmartcity.discovery.UnregisterRequest other = (com.londonsmartcity.discovery.UnregisterRequest) obj;

    if (!getServiceId()
        .equals(other.getServiceId())) return false;
    if (!getRegistrationId()
        .equals(other.getRegistrationId())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SERVICE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getServiceId().hashCode();
    hash = (37 * hash) + REGISTRATION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRegistrationId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.londonsmartcity.discovery.UnregisterRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.londonsmartcity.discovery.UnregisterRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.londonsmartcity.discovery.UnregisterRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.londonsmartcity.discovery.UnregisterRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.londonsmartcity.discovery.UnregisterRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.londonsmartcity.discovery.UnregisterRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.londonsmartcity.discovery.UnregisterRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.londonsmartcity.discovery.UnregisterRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.londonsmartcity.discovery.UnregisterRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.londonsmartcity.discovery.UnregisterRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.londonsmartcity.discovery.UnregisterRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.londonsmartcity.discovery.UnregisterRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.londonsmartcity.discovery.UnregisterRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code discovery.UnregisterRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:discovery.UnregisterRequest)
      com.londonsmartcity.discovery.UnregisterRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.londonsmartcity.discovery.ServiceDiscoveryProto.internal_static_discovery_UnregisterRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.londonsmartcity.discovery.ServiceDiscoveryProto.internal_static_discovery_UnregisterRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.londonsmartcity.discovery.UnregisterRequest.class, com.londonsmartcity.discovery.UnregisterRequest.Builder.class);
    }

    // Construct using com.londonsmartcity.discovery.UnregisterRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      serviceId_ = "";

      registrationId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.londonsmartcity.discovery.ServiceDiscoveryProto.internal_static_discovery_UnregisterRequest_descriptor;
    }

    @java.lang.Override
    public com.londonsmartcity.discovery.UnregisterRequest getDefaultInstanceForType() {
      return com.londonsmartcity.discovery.UnregisterRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.londonsmartcity.discovery.UnregisterRequest build() {
      com.londonsmartcity.discovery.UnregisterRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.londonsmartcity.discovery.UnregisterRequest buildPartial() {
      com.londonsmartcity.discovery.UnregisterRequest result = new com.londonsmartcity.discovery.UnregisterRequest(this);
      result.serviceId_ = serviceId_;
      result.registrationId_ = registrationId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.londonsmartcity.discovery.UnregisterRequest) {
        return mergeFrom((com.londonsmartcity.discovery.UnregisterRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.londonsmartcity.discovery.UnregisterRequest other) {
      if (other == com.londonsmartcity.discovery.UnregisterRequest.getDefaultInstance()) return this;
      if (!other.getServiceId().isEmpty()) {
        serviceId_ = other.serviceId_;
        onChanged();
      }
      if (!other.getRegistrationId().isEmpty()) {
        registrationId_ = other.registrationId_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.londonsmartcity.discovery.UnregisterRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.londonsmartcity.discovery.UnregisterRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object serviceId_ = "";
    /**
     * <code>string service_id = 1;</code>
     * @return The serviceId.
     */
    public java.lang.String getServiceId() {
      java.lang.Object ref = serviceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string service_id = 1;</code>
     * @return The bytes for serviceId.
     */
    public com.google.protobuf.ByteString
        getServiceIdBytes() {
      java.lang.Object ref = serviceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serviceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string service_id = 1;</code>
     * @param value The serviceId to set.
     * @return This builder for chaining.
     */
    public Builder setServiceId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      serviceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string service_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearServiceId() {
      
      serviceId_ = getDefaultInstance().getServiceId();
      onChanged();
      return this;
    }
    /**
     * <code>string service_id = 1;</code>
     * @param value The bytes for serviceId to set.
     * @return This builder for chaining.
     */
    public Builder setServiceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      serviceId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object registrationId_ = "";
    /**
     * <code>string registration_id = 2;</code>
     * @return The registrationId.
     */
    public java.lang.String getRegistrationId() {
      java.lang.Object ref = registrationId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        registrationId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string registration_id = 2;</code>
     * @return The bytes for registrationId.
     */
    public com.google.protobuf.ByteString
        getRegistrationIdBytes() {
      java.lang.Object ref = registrationId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        registrationId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string registration_id = 2;</code>
     * @param value The registrationId to set.
     * @return This builder for chaining.
     */
    public Builder setRegistrationId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      registrationId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string registration_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRegistrationId() {
      
      registrationId_ = getDefaultInstance().getRegistrationId();
      onChanged();
      return this;
    }
    /**
     * <code>string registration_id = 2;</code>
     * @param value The bytes for registrationId to set.
     * @return This builder for chaining.
     */
    public Builder setRegistrationIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      registrationId_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:discovery.UnregisterRequest)
  }

  // @@protoc_insertion_point(class_scope:discovery.UnregisterRequest)
  private static final com.londonsmartcity.discovery.UnregisterRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.londonsmartcity.discovery.UnregisterRequest();
  }

  public static com.londonsmartcity.discovery.UnregisterRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UnregisterRequest>
      PARSER = new com.google.protobuf.AbstractParser<UnregisterRequest>() {
    @java.lang.Override
    public UnregisterRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UnregisterRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UnregisterRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UnregisterRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.londonsmartcity.discovery.UnregisterRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

