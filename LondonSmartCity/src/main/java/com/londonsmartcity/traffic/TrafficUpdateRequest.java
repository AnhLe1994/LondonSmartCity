// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: traffic_service.proto

package com.londonsmartcity.traffic;

/**
 * Protobuf type {@code com.londonsmartcity.traffic.TrafficUpdateRequest}
 */
public final class TrafficUpdateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.londonsmartcity.traffic.TrafficUpdateRequest)
    TrafficUpdateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TrafficUpdateRequest.newBuilder() to construct.
  private TrafficUpdateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TrafficUpdateRequest() {
    location_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TrafficUpdateRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TrafficUpdateRequest(
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

            location_ = s;
            break;
          }
          case 16: {

            updateInterval_ = input.readInt32();
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
    return com.londonsmartcity.traffic.TrafficServiceProto.internal_static_com_londonsmartcity_traffic_TrafficUpdateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.londonsmartcity.traffic.TrafficServiceProto.internal_static_com_londonsmartcity_traffic_TrafficUpdateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.londonsmartcity.traffic.TrafficUpdateRequest.class, com.londonsmartcity.traffic.TrafficUpdateRequest.Builder.class);
  }

  public static final int LOCATION_FIELD_NUMBER = 1;
  private volatile java.lang.Object location_;
  /**
   * <code>string location = 1;</code>
   * @return The location.
   */
  @java.lang.Override
  public java.lang.String getLocation() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      location_ = s;
      return s;
    }
  }
  /**
   * <code>string location = 1;</code>
   * @return The bytes for location.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLocationBytes() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      location_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UPDATE_INTERVAL_FIELD_NUMBER = 2;
  private int updateInterval_;
  /**
   * <pre>
   * Update interval in seconds
   * </pre>
   *
   * <code>int32 update_interval = 2;</code>
   * @return The updateInterval.
   */
  @java.lang.Override
  public int getUpdateInterval() {
    return updateInterval_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(location_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, location_);
    }
    if (updateInterval_ != 0) {
      output.writeInt32(2, updateInterval_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(location_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, location_);
    }
    if (updateInterval_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, updateInterval_);
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
    if (!(obj instanceof com.londonsmartcity.traffic.TrafficUpdateRequest)) {
      return super.equals(obj);
    }
    com.londonsmartcity.traffic.TrafficUpdateRequest other = (com.londonsmartcity.traffic.TrafficUpdateRequest) obj;

    if (!getLocation()
        .equals(other.getLocation())) return false;
    if (getUpdateInterval()
        != other.getUpdateInterval()) return false;
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
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getLocation().hashCode();
    hash = (37 * hash) + UPDATE_INTERVAL_FIELD_NUMBER;
    hash = (53 * hash) + getUpdateInterval();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.londonsmartcity.traffic.TrafficUpdateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.londonsmartcity.traffic.TrafficUpdateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.londonsmartcity.traffic.TrafficUpdateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.londonsmartcity.traffic.TrafficUpdateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.londonsmartcity.traffic.TrafficUpdateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.londonsmartcity.traffic.TrafficUpdateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.londonsmartcity.traffic.TrafficUpdateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.londonsmartcity.traffic.TrafficUpdateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.londonsmartcity.traffic.TrafficUpdateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.londonsmartcity.traffic.TrafficUpdateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.londonsmartcity.traffic.TrafficUpdateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.londonsmartcity.traffic.TrafficUpdateRequest parseFrom(
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
  public static Builder newBuilder(com.londonsmartcity.traffic.TrafficUpdateRequest prototype) {
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
   * Protobuf type {@code com.londonsmartcity.traffic.TrafficUpdateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.londonsmartcity.traffic.TrafficUpdateRequest)
      com.londonsmartcity.traffic.TrafficUpdateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.londonsmartcity.traffic.TrafficServiceProto.internal_static_com_londonsmartcity_traffic_TrafficUpdateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.londonsmartcity.traffic.TrafficServiceProto.internal_static_com_londonsmartcity_traffic_TrafficUpdateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.londonsmartcity.traffic.TrafficUpdateRequest.class, com.londonsmartcity.traffic.TrafficUpdateRequest.Builder.class);
    }

    // Construct using com.londonsmartcity.traffic.TrafficUpdateRequest.newBuilder()
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
      location_ = "";

      updateInterval_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.londonsmartcity.traffic.TrafficServiceProto.internal_static_com_londonsmartcity_traffic_TrafficUpdateRequest_descriptor;
    }

    @java.lang.Override
    public com.londonsmartcity.traffic.TrafficUpdateRequest getDefaultInstanceForType() {
      return com.londonsmartcity.traffic.TrafficUpdateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.londonsmartcity.traffic.TrafficUpdateRequest build() {
      com.londonsmartcity.traffic.TrafficUpdateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.londonsmartcity.traffic.TrafficUpdateRequest buildPartial() {
      com.londonsmartcity.traffic.TrafficUpdateRequest result = new com.londonsmartcity.traffic.TrafficUpdateRequest(this);
      result.location_ = location_;
      result.updateInterval_ = updateInterval_;
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
      if (other instanceof com.londonsmartcity.traffic.TrafficUpdateRequest) {
        return mergeFrom((com.londonsmartcity.traffic.TrafficUpdateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.londonsmartcity.traffic.TrafficUpdateRequest other) {
      if (other == com.londonsmartcity.traffic.TrafficUpdateRequest.getDefaultInstance()) return this;
      if (!other.getLocation().isEmpty()) {
        location_ = other.location_;
        onChanged();
      }
      if (other.getUpdateInterval() != 0) {
        setUpdateInterval(other.getUpdateInterval());
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
      com.londonsmartcity.traffic.TrafficUpdateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.londonsmartcity.traffic.TrafficUpdateRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object location_ = "";
    /**
     * <code>string location = 1;</code>
     * @return The location.
     */
    public java.lang.String getLocation() {
      java.lang.Object ref = location_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        location_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string location = 1;</code>
     * @return The bytes for location.
     */
    public com.google.protobuf.ByteString
        getLocationBytes() {
      java.lang.Object ref = location_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        location_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string location = 1;</code>
     * @param value The location to set.
     * @return This builder for chaining.
     */
    public Builder setLocation(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      location_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string location = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLocation() {
      
      location_ = getDefaultInstance().getLocation();
      onChanged();
      return this;
    }
    /**
     * <code>string location = 1;</code>
     * @param value The bytes for location to set.
     * @return This builder for chaining.
     */
    public Builder setLocationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      location_ = value;
      onChanged();
      return this;
    }

    private int updateInterval_ ;
    /**
     * <pre>
     * Update interval in seconds
     * </pre>
     *
     * <code>int32 update_interval = 2;</code>
     * @return The updateInterval.
     */
    @java.lang.Override
    public int getUpdateInterval() {
      return updateInterval_;
    }
    /**
     * <pre>
     * Update interval in seconds
     * </pre>
     *
     * <code>int32 update_interval = 2;</code>
     * @param value The updateInterval to set.
     * @return This builder for chaining.
     */
    public Builder setUpdateInterval(int value) {
      
      updateInterval_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Update interval in seconds
     * </pre>
     *
     * <code>int32 update_interval = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUpdateInterval() {
      
      updateInterval_ = 0;
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


    // @@protoc_insertion_point(builder_scope:com.londonsmartcity.traffic.TrafficUpdateRequest)
  }

  // @@protoc_insertion_point(class_scope:com.londonsmartcity.traffic.TrafficUpdateRequest)
  private static final com.londonsmartcity.traffic.TrafficUpdateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.londonsmartcity.traffic.TrafficUpdateRequest();
  }

  public static com.londonsmartcity.traffic.TrafficUpdateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TrafficUpdateRequest>
      PARSER = new com.google.protobuf.AbstractParser<TrafficUpdateRequest>() {
    @java.lang.Override
    public TrafficUpdateRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TrafficUpdateRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TrafficUpdateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TrafficUpdateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.londonsmartcity.traffic.TrafficUpdateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

