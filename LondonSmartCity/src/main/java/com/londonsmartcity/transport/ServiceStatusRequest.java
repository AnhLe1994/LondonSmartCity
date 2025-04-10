// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transport_service.proto

package com.londonsmartcity.transport;

/**
 * Protobuf type {@code com.londonsmartcity.transport.ServiceStatusRequest}
 */
public final class ServiceStatusRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.londonsmartcity.transport.ServiceStatusRequest)
    ServiceStatusRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ServiceStatusRequest.newBuilder() to construct.
  private ServiceStatusRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ServiceStatusRequest() {
    lineId_ = "";
    transportType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ServiceStatusRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ServiceStatusRequest(
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

            lineId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            transportType_ = s;
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
    return com.londonsmartcity.transport.TransportServiceProto.internal_static_com_londonsmartcity_transport_ServiceStatusRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.londonsmartcity.transport.TransportServiceProto.internal_static_com_londonsmartcity_transport_ServiceStatusRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.londonsmartcity.transport.ServiceStatusRequest.class, com.londonsmartcity.transport.ServiceStatusRequest.Builder.class);
  }

  public static final int LINE_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object lineId_;
  /**
   * <code>string line_id = 1;</code>
   * @return The lineId.
   */
  @java.lang.Override
  public java.lang.String getLineId() {
    java.lang.Object ref = lineId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lineId_ = s;
      return s;
    }
  }
  /**
   * <code>string line_id = 1;</code>
   * @return The bytes for lineId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLineIdBytes() {
    java.lang.Object ref = lineId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lineId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TRANSPORT_TYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object transportType_;
  /**
   * <pre>
   * "BUS", "TUBE", "TRAIN"
   * </pre>
   *
   * <code>string transport_type = 2;</code>
   * @return The transportType.
   */
  @java.lang.Override
  public java.lang.String getTransportType() {
    java.lang.Object ref = transportType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      transportType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * "BUS", "TUBE", "TRAIN"
   * </pre>
   *
   * <code>string transport_type = 2;</code>
   * @return The bytes for transportType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTransportTypeBytes() {
    java.lang.Object ref = transportType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      transportType_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(lineId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, lineId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(transportType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, transportType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(lineId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, lineId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(transportType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, transportType_);
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
    if (!(obj instanceof com.londonsmartcity.transport.ServiceStatusRequest)) {
      return super.equals(obj);
    }
    com.londonsmartcity.transport.ServiceStatusRequest other = (com.londonsmartcity.transport.ServiceStatusRequest) obj;

    if (!getLineId()
        .equals(other.getLineId())) return false;
    if (!getTransportType()
        .equals(other.getTransportType())) return false;
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
    hash = (37 * hash) + LINE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getLineId().hashCode();
    hash = (37 * hash) + TRANSPORT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getTransportType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.londonsmartcity.transport.ServiceStatusRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.londonsmartcity.transport.ServiceStatusRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.londonsmartcity.transport.ServiceStatusRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.londonsmartcity.transport.ServiceStatusRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.londonsmartcity.transport.ServiceStatusRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.londonsmartcity.transport.ServiceStatusRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.londonsmartcity.transport.ServiceStatusRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.londonsmartcity.transport.ServiceStatusRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.londonsmartcity.transport.ServiceStatusRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.londonsmartcity.transport.ServiceStatusRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.londonsmartcity.transport.ServiceStatusRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.londonsmartcity.transport.ServiceStatusRequest parseFrom(
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
  public static Builder newBuilder(com.londonsmartcity.transport.ServiceStatusRequest prototype) {
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
   * Protobuf type {@code com.londonsmartcity.transport.ServiceStatusRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.londonsmartcity.transport.ServiceStatusRequest)
      com.londonsmartcity.transport.ServiceStatusRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.londonsmartcity.transport.TransportServiceProto.internal_static_com_londonsmartcity_transport_ServiceStatusRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.londonsmartcity.transport.TransportServiceProto.internal_static_com_londonsmartcity_transport_ServiceStatusRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.londonsmartcity.transport.ServiceStatusRequest.class, com.londonsmartcity.transport.ServiceStatusRequest.Builder.class);
    }

    // Construct using com.londonsmartcity.transport.ServiceStatusRequest.newBuilder()
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
      lineId_ = "";

      transportType_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.londonsmartcity.transport.TransportServiceProto.internal_static_com_londonsmartcity_transport_ServiceStatusRequest_descriptor;
    }

    @java.lang.Override
    public com.londonsmartcity.transport.ServiceStatusRequest getDefaultInstanceForType() {
      return com.londonsmartcity.transport.ServiceStatusRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.londonsmartcity.transport.ServiceStatusRequest build() {
      com.londonsmartcity.transport.ServiceStatusRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.londonsmartcity.transport.ServiceStatusRequest buildPartial() {
      com.londonsmartcity.transport.ServiceStatusRequest result = new com.londonsmartcity.transport.ServiceStatusRequest(this);
      result.lineId_ = lineId_;
      result.transportType_ = transportType_;
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
      if (other instanceof com.londonsmartcity.transport.ServiceStatusRequest) {
        return mergeFrom((com.londonsmartcity.transport.ServiceStatusRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.londonsmartcity.transport.ServiceStatusRequest other) {
      if (other == com.londonsmartcity.transport.ServiceStatusRequest.getDefaultInstance()) return this;
      if (!other.getLineId().isEmpty()) {
        lineId_ = other.lineId_;
        onChanged();
      }
      if (!other.getTransportType().isEmpty()) {
        transportType_ = other.transportType_;
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
      com.londonsmartcity.transport.ServiceStatusRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.londonsmartcity.transport.ServiceStatusRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object lineId_ = "";
    /**
     * <code>string line_id = 1;</code>
     * @return The lineId.
     */
    public java.lang.String getLineId() {
      java.lang.Object ref = lineId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lineId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string line_id = 1;</code>
     * @return The bytes for lineId.
     */
    public com.google.protobuf.ByteString
        getLineIdBytes() {
      java.lang.Object ref = lineId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lineId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string line_id = 1;</code>
     * @param value The lineId to set.
     * @return This builder for chaining.
     */
    public Builder setLineId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lineId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string line_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLineId() {
      
      lineId_ = getDefaultInstance().getLineId();
      onChanged();
      return this;
    }
    /**
     * <code>string line_id = 1;</code>
     * @param value The bytes for lineId to set.
     * @return This builder for chaining.
     */
    public Builder setLineIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      lineId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object transportType_ = "";
    /**
     * <pre>
     * "BUS", "TUBE", "TRAIN"
     * </pre>
     *
     * <code>string transport_type = 2;</code>
     * @return The transportType.
     */
    public java.lang.String getTransportType() {
      java.lang.Object ref = transportType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        transportType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * "BUS", "TUBE", "TRAIN"
     * </pre>
     *
     * <code>string transport_type = 2;</code>
     * @return The bytes for transportType.
     */
    public com.google.protobuf.ByteString
        getTransportTypeBytes() {
      java.lang.Object ref = transportType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        transportType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * "BUS", "TUBE", "TRAIN"
     * </pre>
     *
     * <code>string transport_type = 2;</code>
     * @param value The transportType to set.
     * @return This builder for chaining.
     */
    public Builder setTransportType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      transportType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * "BUS", "TUBE", "TRAIN"
     * </pre>
     *
     * <code>string transport_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTransportType() {
      
      transportType_ = getDefaultInstance().getTransportType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * "BUS", "TUBE", "TRAIN"
     * </pre>
     *
     * <code>string transport_type = 2;</code>
     * @param value The bytes for transportType to set.
     * @return This builder for chaining.
     */
    public Builder setTransportTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      transportType_ = value;
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


    // @@protoc_insertion_point(builder_scope:com.londonsmartcity.transport.ServiceStatusRequest)
  }

  // @@protoc_insertion_point(class_scope:com.londonsmartcity.transport.ServiceStatusRequest)
  private static final com.londonsmartcity.transport.ServiceStatusRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.londonsmartcity.transport.ServiceStatusRequest();
  }

  public static com.londonsmartcity.transport.ServiceStatusRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ServiceStatusRequest>
      PARSER = new com.google.protobuf.AbstractParser<ServiceStatusRequest>() {
    @java.lang.Override
    public ServiceStatusRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ServiceStatusRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ServiceStatusRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ServiceStatusRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.londonsmartcity.transport.ServiceStatusRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

