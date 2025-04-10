// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: environment_service.proto

package com.londonsmartcity.environment;

/**
 * Protobuf type {@code com.londonsmartcity.environment.WeatherResponse}
 */
public final class WeatherResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.londonsmartcity.environment.WeatherResponse)
    WeatherResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WeatherResponse.newBuilder() to construct.
  private WeatherResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WeatherResponse() {
    locationId_ = "";
    weatherCondition_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WeatherResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WeatherResponse(
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
          case 17: {

            temperature_ = input.readDouble();
            break;
          }
          case 25: {

            humidity_ = input.readDouble();
            break;
          }
          case 33: {

            windSpeed_ = input.readDouble();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            weatherCondition_ = s;
            break;
          }
          case 48: {

            timestamp_ = input.readInt64();
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
    return com.londonsmartcity.environment.EnvironmentServiceProto.internal_static_com_londonsmartcity_environment_WeatherResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.londonsmartcity.environment.EnvironmentServiceProto.internal_static_com_londonsmartcity_environment_WeatherResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.londonsmartcity.environment.WeatherResponse.class, com.londonsmartcity.environment.WeatherResponse.Builder.class);
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

  public static final int TEMPERATURE_FIELD_NUMBER = 2;
  private double temperature_;
  /**
   * <code>double temperature = 2;</code>
   * @return The temperature.
   */
  @java.lang.Override
  public double getTemperature() {
    return temperature_;
  }

  public static final int HUMIDITY_FIELD_NUMBER = 3;
  private double humidity_;
  /**
   * <code>double humidity = 3;</code>
   * @return The humidity.
   */
  @java.lang.Override
  public double getHumidity() {
    return humidity_;
  }

  public static final int WIND_SPEED_FIELD_NUMBER = 4;
  private double windSpeed_;
  /**
   * <code>double wind_speed = 4;</code>
   * @return The windSpeed.
   */
  @java.lang.Override
  public double getWindSpeed() {
    return windSpeed_;
  }

  public static final int WEATHER_CONDITION_FIELD_NUMBER = 5;
  private volatile java.lang.Object weatherCondition_;
  /**
   * <code>string weather_condition = 5;</code>
   * @return The weatherCondition.
   */
  @java.lang.Override
  public java.lang.String getWeatherCondition() {
    java.lang.Object ref = weatherCondition_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      weatherCondition_ = s;
      return s;
    }
  }
  /**
   * <code>string weather_condition = 5;</code>
   * @return The bytes for weatherCondition.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getWeatherConditionBytes() {
    java.lang.Object ref = weatherCondition_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      weatherCondition_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 6;
  private long timestamp_;
  /**
   * <code>int64 timestamp = 6;</code>
   * @return The timestamp.
   */
  @java.lang.Override
  public long getTimestamp() {
    return timestamp_;
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
    if (java.lang.Double.doubleToRawLongBits(temperature_) != 0) {
      output.writeDouble(2, temperature_);
    }
    if (java.lang.Double.doubleToRawLongBits(humidity_) != 0) {
      output.writeDouble(3, humidity_);
    }
    if (java.lang.Double.doubleToRawLongBits(windSpeed_) != 0) {
      output.writeDouble(4, windSpeed_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(weatherCondition_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, weatherCondition_);
    }
    if (timestamp_ != 0L) {
      output.writeInt64(6, timestamp_);
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
    if (java.lang.Double.doubleToRawLongBits(temperature_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, temperature_);
    }
    if (java.lang.Double.doubleToRawLongBits(humidity_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, humidity_);
    }
    if (java.lang.Double.doubleToRawLongBits(windSpeed_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, windSpeed_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(weatherCondition_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, weatherCondition_);
    }
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, timestamp_);
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
    if (!(obj instanceof com.londonsmartcity.environment.WeatherResponse)) {
      return super.equals(obj);
    }
    com.londonsmartcity.environment.WeatherResponse other = (com.londonsmartcity.environment.WeatherResponse) obj;

    if (!getLocationId()
        .equals(other.getLocationId())) return false;
    if (java.lang.Double.doubleToLongBits(getTemperature())
        != java.lang.Double.doubleToLongBits(
            other.getTemperature())) return false;
    if (java.lang.Double.doubleToLongBits(getHumidity())
        != java.lang.Double.doubleToLongBits(
            other.getHumidity())) return false;
    if (java.lang.Double.doubleToLongBits(getWindSpeed())
        != java.lang.Double.doubleToLongBits(
            other.getWindSpeed())) return false;
    if (!getWeatherCondition()
        .equals(other.getWeatherCondition())) return false;
    if (getTimestamp()
        != other.getTimestamp()) return false;
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
    hash = (37 * hash) + TEMPERATURE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getTemperature()));
    hash = (37 * hash) + HUMIDITY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getHumidity()));
    hash = (37 * hash) + WIND_SPEED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getWindSpeed()));
    hash = (37 * hash) + WEATHER_CONDITION_FIELD_NUMBER;
    hash = (53 * hash) + getWeatherCondition().hashCode();
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestamp());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.londonsmartcity.environment.WeatherResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.londonsmartcity.environment.WeatherResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.londonsmartcity.environment.WeatherResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.londonsmartcity.environment.WeatherResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.londonsmartcity.environment.WeatherResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.londonsmartcity.environment.WeatherResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.londonsmartcity.environment.WeatherResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.londonsmartcity.environment.WeatherResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.londonsmartcity.environment.WeatherResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.londonsmartcity.environment.WeatherResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.londonsmartcity.environment.WeatherResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.londonsmartcity.environment.WeatherResponse parseFrom(
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
  public static Builder newBuilder(com.londonsmartcity.environment.WeatherResponse prototype) {
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
   * Protobuf type {@code com.londonsmartcity.environment.WeatherResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.londonsmartcity.environment.WeatherResponse)
      com.londonsmartcity.environment.WeatherResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.londonsmartcity.environment.EnvironmentServiceProto.internal_static_com_londonsmartcity_environment_WeatherResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.londonsmartcity.environment.EnvironmentServiceProto.internal_static_com_londonsmartcity_environment_WeatherResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.londonsmartcity.environment.WeatherResponse.class, com.londonsmartcity.environment.WeatherResponse.Builder.class);
    }

    // Construct using com.londonsmartcity.environment.WeatherResponse.newBuilder()
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

      temperature_ = 0D;

      humidity_ = 0D;

      windSpeed_ = 0D;

      weatherCondition_ = "";

      timestamp_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.londonsmartcity.environment.EnvironmentServiceProto.internal_static_com_londonsmartcity_environment_WeatherResponse_descriptor;
    }

    @java.lang.Override
    public com.londonsmartcity.environment.WeatherResponse getDefaultInstanceForType() {
      return com.londonsmartcity.environment.WeatherResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.londonsmartcity.environment.WeatherResponse build() {
      com.londonsmartcity.environment.WeatherResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.londonsmartcity.environment.WeatherResponse buildPartial() {
      com.londonsmartcity.environment.WeatherResponse result = new com.londonsmartcity.environment.WeatherResponse(this);
      result.locationId_ = locationId_;
      result.temperature_ = temperature_;
      result.humidity_ = humidity_;
      result.windSpeed_ = windSpeed_;
      result.weatherCondition_ = weatherCondition_;
      result.timestamp_ = timestamp_;
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
      if (other instanceof com.londonsmartcity.environment.WeatherResponse) {
        return mergeFrom((com.londonsmartcity.environment.WeatherResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.londonsmartcity.environment.WeatherResponse other) {
      if (other == com.londonsmartcity.environment.WeatherResponse.getDefaultInstance()) return this;
      if (!other.getLocationId().isEmpty()) {
        locationId_ = other.locationId_;
        onChanged();
      }
      if (other.getTemperature() != 0D) {
        setTemperature(other.getTemperature());
      }
      if (other.getHumidity() != 0D) {
        setHumidity(other.getHumidity());
      }
      if (other.getWindSpeed() != 0D) {
        setWindSpeed(other.getWindSpeed());
      }
      if (!other.getWeatherCondition().isEmpty()) {
        weatherCondition_ = other.weatherCondition_;
        onChanged();
      }
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
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
      com.londonsmartcity.environment.WeatherResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.londonsmartcity.environment.WeatherResponse) e.getUnfinishedMessage();
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

    private double temperature_ ;
    /**
     * <code>double temperature = 2;</code>
     * @return The temperature.
     */
    @java.lang.Override
    public double getTemperature() {
      return temperature_;
    }
    /**
     * <code>double temperature = 2;</code>
     * @param value The temperature to set.
     * @return This builder for chaining.
     */
    public Builder setTemperature(double value) {
      
      temperature_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double temperature = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTemperature() {
      
      temperature_ = 0D;
      onChanged();
      return this;
    }

    private double humidity_ ;
    /**
     * <code>double humidity = 3;</code>
     * @return The humidity.
     */
    @java.lang.Override
    public double getHumidity() {
      return humidity_;
    }
    /**
     * <code>double humidity = 3;</code>
     * @param value The humidity to set.
     * @return This builder for chaining.
     */
    public Builder setHumidity(double value) {
      
      humidity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double humidity = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearHumidity() {
      
      humidity_ = 0D;
      onChanged();
      return this;
    }

    private double windSpeed_ ;
    /**
     * <code>double wind_speed = 4;</code>
     * @return The windSpeed.
     */
    @java.lang.Override
    public double getWindSpeed() {
      return windSpeed_;
    }
    /**
     * <code>double wind_speed = 4;</code>
     * @param value The windSpeed to set.
     * @return This builder for chaining.
     */
    public Builder setWindSpeed(double value) {
      
      windSpeed_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double wind_speed = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearWindSpeed() {
      
      windSpeed_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object weatherCondition_ = "";
    /**
     * <code>string weather_condition = 5;</code>
     * @return The weatherCondition.
     */
    public java.lang.String getWeatherCondition() {
      java.lang.Object ref = weatherCondition_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        weatherCondition_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string weather_condition = 5;</code>
     * @return The bytes for weatherCondition.
     */
    public com.google.protobuf.ByteString
        getWeatherConditionBytes() {
      java.lang.Object ref = weatherCondition_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        weatherCondition_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string weather_condition = 5;</code>
     * @param value The weatherCondition to set.
     * @return This builder for chaining.
     */
    public Builder setWeatherCondition(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      weatherCondition_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string weather_condition = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearWeatherCondition() {
      
      weatherCondition_ = getDefaultInstance().getWeatherCondition();
      onChanged();
      return this;
    }
    /**
     * <code>string weather_condition = 5;</code>
     * @param value The bytes for weatherCondition to set.
     * @return This builder for chaining.
     */
    public Builder setWeatherConditionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      weatherCondition_ = value;
      onChanged();
      return this;
    }

    private long timestamp_ ;
    /**
     * <code>int64 timestamp = 6;</code>
     * @return The timestamp.
     */
    @java.lang.Override
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <code>int64 timestamp = 6;</code>
     * @param value The timestamp to set.
     * @return This builder for chaining.
     */
    public Builder setTimestamp(long value) {
      
      timestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 timestamp = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimestamp() {
      
      timestamp_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:com.londonsmartcity.environment.WeatherResponse)
  }

  // @@protoc_insertion_point(class_scope:com.londonsmartcity.environment.WeatherResponse)
  private static final com.londonsmartcity.environment.WeatherResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.londonsmartcity.environment.WeatherResponse();
  }

  public static com.londonsmartcity.environment.WeatherResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WeatherResponse>
      PARSER = new com.google.protobuf.AbstractParser<WeatherResponse>() {
    @java.lang.Override
    public WeatherResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WeatherResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WeatherResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WeatherResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.londonsmartcity.environment.WeatherResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

