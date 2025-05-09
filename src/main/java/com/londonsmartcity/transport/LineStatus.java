// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transport_service.proto

package com.londonsmartcity.transport;

/**
 * Protobuf type {@code com.londonsmartcity.transport.LineStatus}
 */
public final class LineStatus extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.londonsmartcity.transport.LineStatus)
    LineStatusOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LineStatus.newBuilder() to construct.
  private LineStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LineStatus() {
    lineId_ = "";
    status_ = "";
    description_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LineStatus();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LineStatus(
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

            status_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            description_ = s;
            break;
          }
          case 32: {

            lastUpdated_ = input.readInt64();
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
    return com.londonsmartcity.transport.TransportServiceProto.internal_static_com_londonsmartcity_transport_LineStatus_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.londonsmartcity.transport.TransportServiceProto.internal_static_com_londonsmartcity_transport_LineStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.londonsmartcity.transport.LineStatus.class, com.londonsmartcity.transport.LineStatus.Builder.class);
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

  public static final int STATUS_FIELD_NUMBER = 2;
  private volatile java.lang.Object status_;
  /**
   * <pre>
   * "GOOD_SERVICE", "MINOR_DELAYS", "SEVERE_DELAYS", "PART_SUSPENDED", "SUSPENDED"
   * </pre>
   *
   * <code>string status = 2;</code>
   * @return The status.
   */
  @java.lang.Override
  public java.lang.String getStatus() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      status_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * "GOOD_SERVICE", "MINOR_DELAYS", "SEVERE_DELAYS", "PART_SUSPENDED", "SUSPENDED"
   * </pre>
   *
   * <code>string status = 2;</code>
   * @return The bytes for status.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStatusBytes() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      status_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 3;
  private volatile java.lang.Object description_;
  /**
   * <code>string description = 3;</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LAST_UPDATED_FIELD_NUMBER = 4;
  private long lastUpdated_;
  /**
   * <code>int64 last_updated = 4;</code>
   * @return The lastUpdated.
   */
  @java.lang.Override
  public long getLastUpdated() {
    return lastUpdated_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(status_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, status_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, description_);
    }
    if (lastUpdated_ != 0L) {
      output.writeInt64(4, lastUpdated_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(status_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, status_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, description_);
    }
    if (lastUpdated_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, lastUpdated_);
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
    if (!(obj instanceof com.londonsmartcity.transport.LineStatus)) {
      return super.equals(obj);
    }
    com.londonsmartcity.transport.LineStatus other = (com.londonsmartcity.transport.LineStatus) obj;

    if (!getLineId()
        .equals(other.getLineId())) return false;
    if (!getStatus()
        .equals(other.getStatus())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (getLastUpdated()
        != other.getLastUpdated()) return false;
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
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getStatus().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + LAST_UPDATED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLastUpdated());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.londonsmartcity.transport.LineStatus parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.londonsmartcity.transport.LineStatus parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.londonsmartcity.transport.LineStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.londonsmartcity.transport.LineStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.londonsmartcity.transport.LineStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.londonsmartcity.transport.LineStatus parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.londonsmartcity.transport.LineStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.londonsmartcity.transport.LineStatus parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.londonsmartcity.transport.LineStatus parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.londonsmartcity.transport.LineStatus parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.londonsmartcity.transport.LineStatus parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.londonsmartcity.transport.LineStatus parseFrom(
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
  public static Builder newBuilder(com.londonsmartcity.transport.LineStatus prototype) {
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
   * Protobuf type {@code com.londonsmartcity.transport.LineStatus}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.londonsmartcity.transport.LineStatus)
      com.londonsmartcity.transport.LineStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.londonsmartcity.transport.TransportServiceProto.internal_static_com_londonsmartcity_transport_LineStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.londonsmartcity.transport.TransportServiceProto.internal_static_com_londonsmartcity_transport_LineStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.londonsmartcity.transport.LineStatus.class, com.londonsmartcity.transport.LineStatus.Builder.class);
    }

    // Construct using com.londonsmartcity.transport.LineStatus.newBuilder()
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

      status_ = "";

      description_ = "";

      lastUpdated_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.londonsmartcity.transport.TransportServiceProto.internal_static_com_londonsmartcity_transport_LineStatus_descriptor;
    }

    @java.lang.Override
    public com.londonsmartcity.transport.LineStatus getDefaultInstanceForType() {
      return com.londonsmartcity.transport.LineStatus.getDefaultInstance();
    }

    @java.lang.Override
    public com.londonsmartcity.transport.LineStatus build() {
      com.londonsmartcity.transport.LineStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.londonsmartcity.transport.LineStatus buildPartial() {
      com.londonsmartcity.transport.LineStatus result = new com.londonsmartcity.transport.LineStatus(this);
      result.lineId_ = lineId_;
      result.status_ = status_;
      result.description_ = description_;
      result.lastUpdated_ = lastUpdated_;
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
      if (other instanceof com.londonsmartcity.transport.LineStatus) {
        return mergeFrom((com.londonsmartcity.transport.LineStatus)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.londonsmartcity.transport.LineStatus other) {
      if (other == com.londonsmartcity.transport.LineStatus.getDefaultInstance()) return this;
      if (!other.getLineId().isEmpty()) {
        lineId_ = other.lineId_;
        onChanged();
      }
      if (!other.getStatus().isEmpty()) {
        status_ = other.status_;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      if (other.getLastUpdated() != 0L) {
        setLastUpdated(other.getLastUpdated());
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
      com.londonsmartcity.transport.LineStatus parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.londonsmartcity.transport.LineStatus) e.getUnfinishedMessage();
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

    private java.lang.Object status_ = "";
    /**
     * <pre>
     * "GOOD_SERVICE", "MINOR_DELAYS", "SEVERE_DELAYS", "PART_SUSPENDED", "SUSPENDED"
     * </pre>
     *
     * <code>string status = 2;</code>
     * @return The status.
     */
    public java.lang.String getStatus() {
      java.lang.Object ref = status_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        status_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * "GOOD_SERVICE", "MINOR_DELAYS", "SEVERE_DELAYS", "PART_SUSPENDED", "SUSPENDED"
     * </pre>
     *
     * <code>string status = 2;</code>
     * @return The bytes for status.
     */
    public com.google.protobuf.ByteString
        getStatusBytes() {
      java.lang.Object ref = status_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        status_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * "GOOD_SERVICE", "MINOR_DELAYS", "SEVERE_DELAYS", "PART_SUSPENDED", "SUSPENDED"
     * </pre>
     *
     * <code>string status = 2;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * "GOOD_SERVICE", "MINOR_DELAYS", "SEVERE_DELAYS", "PART_SUSPENDED", "SUSPENDED"
     * </pre>
     *
     * <code>string status = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = getDefaultInstance().getStatus();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * "GOOD_SERVICE", "MINOR_DELAYS", "SEVERE_DELAYS", "PART_SUSPENDED", "SUSPENDED"
     * </pre>
     *
     * <code>string status = 2;</code>
     * @param value The bytes for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      status_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <code>string description = 3;</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string description = 3;</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string description = 3;</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string description = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <code>string description = 3;</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      description_ = value;
      onChanged();
      return this;
    }

    private long lastUpdated_ ;
    /**
     * <code>int64 last_updated = 4;</code>
     * @return The lastUpdated.
     */
    @java.lang.Override
    public long getLastUpdated() {
      return lastUpdated_;
    }
    /**
     * <code>int64 last_updated = 4;</code>
     * @param value The lastUpdated to set.
     * @return This builder for chaining.
     */
    public Builder setLastUpdated(long value) {
      
      lastUpdated_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 last_updated = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLastUpdated() {
      
      lastUpdated_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:com.londonsmartcity.transport.LineStatus)
  }

  // @@protoc_insertion_point(class_scope:com.londonsmartcity.transport.LineStatus)
  private static final com.londonsmartcity.transport.LineStatus DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.londonsmartcity.transport.LineStatus();
  }

  public static com.londonsmartcity.transport.LineStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LineStatus>
      PARSER = new com.google.protobuf.AbstractParser<LineStatus>() {
    @java.lang.Override
    public LineStatus parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LineStatus(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LineStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LineStatus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.londonsmartcity.transport.LineStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

