// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request.proto

// Protobuf Java Version: 3.25.2
package sample.camel.dto;

public final class RequestOuterClass {
  private RequestOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:example.Request)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * IP адрес клиента
     * </pre>
     *
     * <code>string client_ip = 1;</code>
     * @return The clientIp.
     */
    String getClientIp();
    /**
     * <pre>
     * IP адрес клиента
     * </pre>
     *
     * <code>string client_ip = 1;</code>
     * @return The bytes for clientIp.
     */
    com.google.protobuf.ByteString
        getClientIpBytes();

    /**
     * <pre>
     * Время получения запроса
     * </pre>
     *
     * <code>string request_time = 2;</code>
     * @return The requestTime.
     */
    String getRequestTime();
    /**
     * <pre>
     * Время получения запроса
     * </pre>
     *
     * <code>string request_time = 2;</code>
     * @return The bytes for requestTime.
     */
    com.google.protobuf.ByteString
        getRequestTimeBytes();

    /**
     * <pre>
     * Уникальный идентификатор запроса
     * </pre>
     *
     * <code>string guid = 3;</code>
     * @return The guid.
     */
    String getGuid();
    /**
     * <pre>
     * Уникальный идентификатор запроса
     * </pre>
     *
     * <code>string guid = 3;</code>
     * @return The bytes for guid.
     */
    com.google.protobuf.ByteString
        getGuidBytes();

    /**
     * <pre>
     * Данные самого запроса
     * </pre>
     *
     * <code>string request_data = 4;</code>
     * @return The requestData.
     */
    String getRequestData();
    /**
     * <pre>
     * Данные самого запроса
     * </pre>
     *
     * <code>string request_data = 4;</code>
     * @return The bytes for requestData.
     */
    com.google.protobuf.ByteString
        getRequestDataBytes();
  }
  /**
   * <pre>
   * Сообщение, содержащее информацию о запросе
   * </pre>
   *
   * Protobuf type {@code example.Request}
   */
  public static final class Request extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:example.Request)
      RequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Request.newBuilder() to construct.
    private Request(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Request() {
      clientIp_ = "";
      requestTime_ = "";
      guid_ = "";
      requestData_ = "";
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new Request();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return RequestOuterClass.internal_static_example_Request_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return RequestOuterClass.internal_static_example_Request_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              RequestOuterClass.Request.class, RequestOuterClass.Request.Builder.class);
    }

    public static final int CLIENT_IP_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile Object clientIp_ = "";
    /**
     * <pre>
     * IP адрес клиента
     * </pre>
     *
     * <code>string client_ip = 1;</code>
     * @return The clientIp.
     */
    @Override
    public String getClientIp() {
      Object ref = clientIp_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        clientIp_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * IP адрес клиента
     * </pre>
     *
     * <code>string client_ip = 1;</code>
     * @return The bytes for clientIp.
     */
    @Override
    public com.google.protobuf.ByteString
        getClientIpBytes() {
      Object ref = clientIp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        clientIp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int REQUEST_TIME_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile Object requestTime_ = "";
    /**
     * <pre>
     * Время получения запроса
     * </pre>
     *
     * <code>string request_time = 2;</code>
     * @return The requestTime.
     */
    @Override
    public String getRequestTime() {
      Object ref = requestTime_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        requestTime_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Время получения запроса
     * </pre>
     *
     * <code>string request_time = 2;</code>
     * @return The bytes for requestTime.
     */
    @Override
    public com.google.protobuf.ByteString
        getRequestTimeBytes() {
      Object ref = requestTime_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        requestTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int GUID_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile Object guid_ = "";
    /**
     * <pre>
     * Уникальный идентификатор запроса
     * </pre>
     *
     * <code>string guid = 3;</code>
     * @return The guid.
     */
    @Override
    public String getGuid() {
      Object ref = guid_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        guid_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Уникальный идентификатор запроса
     * </pre>
     *
     * <code>string guid = 3;</code>
     * @return The bytes for guid.
     */
    @Override
    public com.google.protobuf.ByteString
        getGuidBytes() {
      Object ref = guid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        guid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int REQUEST_DATA_FIELD_NUMBER = 4;
    @SuppressWarnings("serial")
    private volatile Object requestData_ = "";
    /**
     * <pre>
     * Данные самого запроса
     * </pre>
     *
     * <code>string request_data = 4;</code>
     * @return The requestData.
     */
    @Override
    public String getRequestData() {
      Object ref = requestData_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        requestData_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Данные самого запроса
     * </pre>
     *
     * <code>string request_data = 4;</code>
     * @return The bytes for requestData.
     */
    @Override
    public com.google.protobuf.ByteString
        getRequestDataBytes() {
      Object ref = requestData_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        requestData_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientIp_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, clientIp_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(requestTime_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, requestTime_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(guid_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, guid_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(requestData_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, requestData_);
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientIp_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, clientIp_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(requestTime_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, requestTime_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(guid_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, guid_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(requestData_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, requestData_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof RequestOuterClass.Request)) {
        return super.equals(obj);
      }
      RequestOuterClass.Request other = (RequestOuterClass.Request) obj;

      if (!getClientIp()
          .equals(other.getClientIp())) return false;
      if (!getRequestTime()
          .equals(other.getRequestTime())) return false;
      if (!getGuid()
          .equals(other.getGuid())) return false;
      if (!getRequestData()
          .equals(other.getRequestData())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + CLIENT_IP_FIELD_NUMBER;
      hash = (53 * hash) + getClientIp().hashCode();
      hash = (37 * hash) + REQUEST_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getRequestTime().hashCode();
      hash = (37 * hash) + GUID_FIELD_NUMBER;
      hash = (53 * hash) + getGuid().hashCode();
      hash = (37 * hash) + REQUEST_DATA_FIELD_NUMBER;
      hash = (53 * hash) + getRequestData().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static RequestOuterClass.Request parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestOuterClass.Request parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestOuterClass.Request parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestOuterClass.Request parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestOuterClass.Request parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestOuterClass.Request parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestOuterClass.Request parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RequestOuterClass.Request parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static RequestOuterClass.Request parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static RequestOuterClass.Request parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static RequestOuterClass.Request parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RequestOuterClass.Request parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(RequestOuterClass.Request prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Сообщение, содержащее информацию о запросе
     * </pre>
     *
     * Protobuf type {@code example.Request}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:example.Request)
        RequestOuterClass.RequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return RequestOuterClass.internal_static_example_Request_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return RequestOuterClass.internal_static_example_Request_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                RequestOuterClass.Request.class, RequestOuterClass.Request.Builder.class);
      }

      // Construct using example.RequestOuterClass.Request.newBuilder()
      private Builder() {

      }

      private Builder(
          BuilderParent parent) {
        super(parent);

      }
      @Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        clientIp_ = "";
        requestTime_ = "";
        guid_ = "";
        requestData_ = "";
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return RequestOuterClass.internal_static_example_Request_descriptor;
      }

      @Override
      public RequestOuterClass.Request getDefaultInstanceForType() {
        return RequestOuterClass.Request.getDefaultInstance();
      }

      @Override
      public RequestOuterClass.Request build() {
        RequestOuterClass.Request result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public RequestOuterClass.Request buildPartial() {
        RequestOuterClass.Request result = new RequestOuterClass.Request(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(RequestOuterClass.Request result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.clientIp_ = clientIp_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.requestTime_ = requestTime_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.guid_ = guid_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.requestData_ = requestData_;
        }
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof RequestOuterClass.Request) {
          return mergeFrom((RequestOuterClass.Request)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(RequestOuterClass.Request other) {
        if (other == RequestOuterClass.Request.getDefaultInstance()) return this;
        if (!other.getClientIp().isEmpty()) {
          clientIp_ = other.clientIp_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (!other.getRequestTime().isEmpty()) {
          requestTime_ = other.requestTime_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (!other.getGuid().isEmpty()) {
          guid_ = other.guid_;
          bitField0_ |= 0x00000004;
          onChanged();
        }
        if (!other.getRequestData().isEmpty()) {
          requestData_ = other.requestData_;
          bitField0_ |= 0x00000008;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                clientIp_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                requestTime_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 26: {
                guid_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
              case 34: {
                requestData_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private Object clientIp_ = "";
      /**
       * <pre>
       * IP адрес клиента
       * </pre>
       *
       * <code>string client_ip = 1;</code>
       * @return The clientIp.
       */
      public String getClientIp() {
        Object ref = clientIp_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          clientIp_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <pre>
       * IP адрес клиента
       * </pre>
       *
       * <code>string client_ip = 1;</code>
       * @return The bytes for clientIp.
       */
      public com.google.protobuf.ByteString
          getClientIpBytes() {
        Object ref = clientIp_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          clientIp_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * IP адрес клиента
       * </pre>
       *
       * <code>string client_ip = 1;</code>
       * @param value The clientIp to set.
       * @return This builder for chaining.
       */
      public Builder setClientIp(
          String value) {
        if (value == null) { throw new NullPointerException(); }
        clientIp_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * IP адрес клиента
       * </pre>
       *
       * <code>string client_ip = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearClientIp() {
        clientIp_ = getDefaultInstance().getClientIp();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * IP адрес клиента
       * </pre>
       *
       * <code>string client_ip = 1;</code>
       * @param value The bytes for clientIp to set.
       * @return This builder for chaining.
       */
      public Builder setClientIpBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        clientIp_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private Object requestTime_ = "";
      /**
       * <pre>
       * Время получения запроса
       * </pre>
       *
       * <code>string request_time = 2;</code>
       * @return The requestTime.
       */
      public String getRequestTime() {
        Object ref = requestTime_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          requestTime_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <pre>
       * Время получения запроса
       * </pre>
       *
       * <code>string request_time = 2;</code>
       * @return The bytes for requestTime.
       */
      public com.google.protobuf.ByteString
          getRequestTimeBytes() {
        Object ref = requestTime_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          requestTime_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Время получения запроса
       * </pre>
       *
       * <code>string request_time = 2;</code>
       * @param value The requestTime to set.
       * @return This builder for chaining.
       */
      public Builder setRequestTime(
          String value) {
        if (value == null) { throw new NullPointerException(); }
        requestTime_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Время получения запроса
       * </pre>
       *
       * <code>string request_time = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRequestTime() {
        requestTime_ = getDefaultInstance().getRequestTime();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Время получения запроса
       * </pre>
       *
       * <code>string request_time = 2;</code>
       * @param value The bytes for requestTime to set.
       * @return This builder for chaining.
       */
      public Builder setRequestTimeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        requestTime_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private Object guid_ = "";
      /**
       * <pre>
       * Уникальный идентификатор запроса
       * </pre>
       *
       * <code>string guid = 3;</code>
       * @return The guid.
       */
      public String getGuid() {
        Object ref = guid_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          guid_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <pre>
       * Уникальный идентификатор запроса
       * </pre>
       *
       * <code>string guid = 3;</code>
       * @return The bytes for guid.
       */
      public com.google.protobuf.ByteString
          getGuidBytes() {
        Object ref = guid_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          guid_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Уникальный идентификатор запроса
       * </pre>
       *
       * <code>string guid = 3;</code>
       * @param value The guid to set.
       * @return This builder for chaining.
       */
      public Builder setGuid(
          String value) {
        if (value == null) { throw new NullPointerException(); }
        guid_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Уникальный идентификатор запроса
       * </pre>
       *
       * <code>string guid = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuid() {
        guid_ = getDefaultInstance().getGuid();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Уникальный идентификатор запроса
       * </pre>
       *
       * <code>string guid = 3;</code>
       * @param value The bytes for guid to set.
       * @return This builder for chaining.
       */
      public Builder setGuidBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        guid_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }

      private Object requestData_ = "";
      /**
       * <pre>
       * Данные самого запроса
       * </pre>
       *
       * <code>string request_data = 4;</code>
       * @return The requestData.
       */
      public String getRequestData() {
        Object ref = requestData_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          requestData_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <pre>
       * Данные самого запроса
       * </pre>
       *
       * <code>string request_data = 4;</code>
       * @return The bytes for requestData.
       */
      public com.google.protobuf.ByteString
          getRequestDataBytes() {
        Object ref = requestData_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          requestData_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Данные самого запроса
       * </pre>
       *
       * <code>string request_data = 4;</code>
       * @param value The requestData to set.
       * @return This builder for chaining.
       */
      public Builder setRequestData(
          String value) {
        if (value == null) { throw new NullPointerException(); }
        requestData_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Данные самого запроса
       * </pre>
       *
       * <code>string request_data = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearRequestData() {
        requestData_ = getDefaultInstance().getRequestData();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Данные самого запроса
       * </pre>
       *
       * <code>string request_data = 4;</code>
       * @param value The bytes for requestData to set.
       * @return This builder for chaining.
       */
      public Builder setRequestDataBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        requestData_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:example.Request)
    }

    // @@protoc_insertion_point(class_scope:example.Request)
    private static final RequestOuterClass.Request DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new RequestOuterClass.Request();
    }

    public static RequestOuterClass.Request getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Request>
        PARSER = new com.google.protobuf.AbstractParser<Request>() {
      @Override
      public Request parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Request> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Request> getParserForType() {
      return PARSER;
    }

    @Override
    public RequestOuterClass.Request getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_example_Request_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_example_Request_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\rrequest.proto\022\007example\"V\n\007Request\022\021\n\tc" +
      "lient_ip\030\001 \001(\t\022\024\n\014request_time\030\002 \001(\t\022\014\n\004" +
      "guid\030\003 \001(\t\022\024\n\014request_data\030\004 \001(\tb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_example_Request_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_example_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_example_Request_descriptor,
        new String[] { "ClientIp", "RequestTime", "Guid", "RequestData", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}