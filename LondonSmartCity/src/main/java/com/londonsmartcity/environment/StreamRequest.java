// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: environment_service.proto

package com.londonsmartcity.environment;

/**
 * Protobuf type {@code com.londonsmartcity.environment.StreamRequest}
 */
public final class StreamRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.londonsmartcity.environment.StreamRequest)
    StreamRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StreamRequest.newBuilder() to construct.
  private StreamRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StreamRequest() {
    locationId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StreamRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StreamRequest(
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

            locationId_ = s;
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
    return com.londonsmartcity.environment.EnvironmentServiceProto.internal_static_com_londonsmartcity_environment_StreamRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.londonsmartcity.environment.EnvironmentServiceProto.internal_static_com_londonsmartcity_environment_StreamRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.londonsmartcity.environment.StreamRequest.class, com.londonsmartcity.environment.StreamRequest.Builder.class);
  }

  public static final int LOCATION_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object locationId_;
  /**
   * <code>string location_id = 1;</code>
   * @return The locationId.
   */
  @java.lang.Override
  public java.lang.String getLocationId() {
    java.lang.Object ref = locationId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      locationId_ = s;
      return s;
    }
  }
  /**
   * <code>string location_id = 1;</code>
   * @return The bytes for locationId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLocationIdBytes() {
    java.lang.Object ref = locationId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      locationId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(locationId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, locationId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(locationId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, locationId_);
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
    if (!(obj instanceof com.londonsmartcity.environment.StreamRequest)) {
      return super.equals(obj);
    }
    com.londonsmartcity.environment.StreamRequest other = (com.londonsmartcity.environment.StreamRequest) obj;

    if (!getLocationId()
        .equals(other.getLocationId())) return false;
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
    hash = (37 * hash) + LOCATION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getLocationId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.londonsmartcity.environment.StreamRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.londonsmartcity.environment.StreamRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.londonsmartcity.environment.StreamRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.londonsmartcity.environment.StreamRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.londonsmartcity.environment.StreamRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.londonsmartcity.environment.StreamRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.londonsmartcity.environment.StreamRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.londonsmartcity.environment.StreamRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.londonsmartcity.environment.StreamRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.londonsmartcity.environment.StreamRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.londonsmartcity.environment.StreamRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.londonsmartcity.environment.StreamRequest parseFrom(
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
  public static Builder newBuilder(com.londonsmartcity.environment.StreamRequest prototype) {
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
   * Protobuf type {@code com.londonsmartcity.environment.StreamRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.londonsmartcity.environment.StreamRequest)
      com.londonsmartcity.environment.StreamRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.londonsmartcity.environment.EnvironmentServiceProto.internal_static_com_londonsmartcity_environment_StreamRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.londonsmartcity.environment.EnvironmentServiceProto.internal_static_com_londonsmartcity_environment_StreamRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.londonsmartcity.environment.StreamRequest.class, com.londonsmartcity.environment.StreamRequest.Builder.class);
    }

    // Construct using com.londonsmartcity.environment.StreamRequest.newBuilder()
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
      locationId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.londonsmartcity.environment.EnvironmentServiceProto.internal_static_com_londonsmartcity_environment_StreamRequest_descriptor;
    }

    @java.lang.Override
    public com.londonsmartcity.environment.StreamRequest getDefaultInstanceForType() {
      return com.londonsmartcity.environment.StreamRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.londonsmartcity.environment.StreamRequest build() {
      com.londonsmartcity.environment.StreamRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.londonsmartcity.environment.StreamRequest buildPartial() {
      com.londonsmartcity.environment.StreamRequest result = new com.londonsmartcity.environment.StreamRequest(this);
      result.locationId_ = locationId_;
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
      if (other instanceof com.londonsmartcity.environment.StreamRequest) {
        return mergeFrom((com.londonsmartcity.environment.StreamRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.londonsmartcity.environment.StreamRequest other) {
      if (other == com.londonsmartcity.environment.StreamRequest.getDefaultInstance()) return this;
      if (!other.getLocationId().isEmpty()) {
        locationId_ = other.locationId_;
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
      com.londonsmartcity.environment.StreamRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.londonsmartcity.environment.StreamRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object locationId_ = "";
    /**
     * <code>string location_id = 1;</code>
     * @return The locationId.
     */
    public java.lang.String getLocationId() {
      java.lang.Object ref = locationId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        locationId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string location_id = 1;</code>
     * @return The bytes for locationId.
     */
    public com.google.protobuf.ByteString
        getLocationIdBytes() {
      java.lang.Object ref = locationId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        locationId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string location_id = 1;</code>
     * @param value The locationId to set.
     * @return This builder for chaining.
     */
    public Builder setLocationId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      locationId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string location_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLocationId() {
      
      locationId_ = getDefaultInstance().getLocationId();
      onChanged();
      return this;
    }
    /**
     * <code>string location_id = 1;</code>
     * @param value The bytes for locationId to set.
     * @return This builder for chaining.
     */
    public Builder setLocationIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      locationId_ = value;
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


    // @@protoc_insertion_point(builder_scope:com.londonsmartcity.environment.StreamRequest)
  }

  // @@protoc_insertion_point(class_scope:com.londonsmartcity.environment.StreamRequest)
  private static final com.londonsmartcity.environment.StreamRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.londonsmartcity.environment.StreamRequest();
  }

  public static com.londonsmartcity.environment.StreamRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StreamRequest>
      PARSER = new com.google.protobuf.AbstractParser<StreamRequest>() {
    @java.lang.Override
    public StreamRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StreamRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StreamRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StreamRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.londonsmartcity.environment.StreamRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

