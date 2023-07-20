// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/perfetto/trace/track_event/chrome_window_handle_event_info.proto

package perfetto.protos;

public final class ChromeWindowHandleEventInfoOuterClass {
  private ChromeWindowHandleEventInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChromeWindowHandleEventInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:perfetto.protos.ChromeWindowHandleEventInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional uint32 dpi = 1;</code>
     * @return Whether the dpi field is set.
     */
    boolean hasDpi();
    /**
     * <code>optional uint32 dpi = 1;</code>
     * @return The dpi.
     */
    int getDpi();

    /**
     * <code>optional uint32 message_id = 2;</code>
     * @return Whether the messageId field is set.
     */
    boolean hasMessageId();
    /**
     * <code>optional uint32 message_id = 2;</code>
     * @return The messageId.
     */
    int getMessageId();

    /**
     * <code>optional fixed64 hwnd_ptr = 3;</code>
     * @return Whether the hwndPtr field is set.
     */
    boolean hasHwndPtr();
    /**
     * <code>optional fixed64 hwnd_ptr = 3;</code>
     * @return The hwndPtr.
     */
    long getHwndPtr();
  }
  /**
   * <pre>
   * Details about HWNDMessageHandler trace events.
   * </pre>
   *
   * Protobuf type {@code perfetto.protos.ChromeWindowHandleEventInfo}
   */
  public static final class ChromeWindowHandleEventInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:perfetto.protos.ChromeWindowHandleEventInfo)
      ChromeWindowHandleEventInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChromeWindowHandleEventInfo.newBuilder() to construct.
    private ChromeWindowHandleEventInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChromeWindowHandleEventInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChromeWindowHandleEventInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return perfetto.protos.ChromeWindowHandleEventInfoOuterClass.internal_static_perfetto_protos_ChromeWindowHandleEventInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return perfetto.protos.ChromeWindowHandleEventInfoOuterClass.internal_static_perfetto_protos_ChromeWindowHandleEventInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              perfetto.protos.ChromeWindowHandleEventInfoOuterClass.ChromeWindowHandleEventInfo.class, perfetto.protos.ChromeWindowHandleEventInfoOuterClass.ChromeWindowHandleEventInfo.Builder.class);
    }

    private int bitField0_;
    public static final int DPI_FIELD_NUMBER = 1;
    private int dpi_ = 0;
    /**
     * <code>optional uint32 dpi = 1;</code>
     * @return Whether the dpi field is set.
     */
    @java.lang.Override
    public boolean hasDpi() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional uint32 dpi = 1;</code>
     * @return The dpi.
     */
    @java.lang.Override
    public int getDpi() {
      return dpi_;
    }

    public static final int MESSAGE_ID_FIELD_NUMBER = 2;
    private int messageId_ = 0;
    /**
     * <code>optional uint32 message_id = 2;</code>
     * @return Whether the messageId field is set.
     */
    @java.lang.Override
    public boolean hasMessageId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional uint32 message_id = 2;</code>
     * @return The messageId.
     */
    @java.lang.Override
    public int getMessageId() {
      return messageId_;
    }

    public static final int HWND_PTR_FIELD_NUMBER = 3;
    private long hwndPtr_ = 0L;
    /**
     * <code>optional fixed64 hwnd_ptr = 3;</code>
     * @return Whether the hwndPtr field is set.
     */
    @java.lang.Override
    public boolean hasHwndPtr() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional fixed64 hwnd_ptr = 3;</code>
     * @return The hwndPtr.
     */
    @java.lang.Override
    public long getHwndPtr() {
      return hwndPtr_;
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
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeUInt32(1, dpi_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeUInt32(2, messageId_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeFixed64(3, hwndPtr_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, dpi_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, messageId_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed64Size(3, hwndPtr_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof perfetto.protos.ChromeWindowHandleEventInfoOuterClass.ChromeWindowHandleEventInfo)) {
        return super.equals(obj);
      }
      perfetto.protos.ChromeWindowHandleEventInfoOuterClass.ChromeWindowHandleEventInfo other = (perfetto.protos.ChromeWindowHandleEventInfoOuterClass.ChromeWindowHandleEventInfo) obj;

      if (hasDpi() != other.hasDpi()) return false;
      if (hasDpi()) {
        if (getDpi()
            != other.getDpi()) return false;
      }
      if (hasMessageId() != other.hasMessageId()) return false;
      if (hasMessageId()) {
        if (getMessageId()
            != other.getMessageId()) return false;
      }
      if (hasHwndPtr() != other.hasHwndPtr()) return false;
      if (hasHwndPtr()) {
        if (getHwndPtr()
            != other.getHwndPtr()) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasDpi()) {
        hash = (37 * hash) + DPI_FIELD_NUMBER;
        hash = (53 * hash) + getDpi();
      }
      if (hasMessageId()) {
        hash = (37 * hash) + MESSAGE_ID_FIELD_NUMBER;
        hash = (53 * hash) + getMessageId();
      }
      if (hasHwndPtr()) {
        hash = (37 * hash) + HWND_PTR_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getHwndPtr());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static perfetto.protos.ChromeWindowHandleEventInfoOuterClass.ChromeWindowHandleEventInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static perfetto.protos.ChromeWindowHandleEventInfoOuterClass.ChromeWindowHandleEventInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static perfetto.protos.ChromeWindowHandleEventInfoOuterClass.ChromeWindowHandleEventInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static perfetto.protos.ChromeWindowHandleEventInfoOuterClass.ChromeWindowHandleEventInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static perfetto.protos.ChromeWindowHandleEventInfoOuterClass.ChromeWindowHandleEventInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static perfetto.protos.ChromeWindowHandleEventInfoOuterClass.ChromeWindowHandleEventInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static perfetto.protos.ChromeWindowHandleEventInfoOuterClass.ChromeWindowHandleEventInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static perfetto.protos.ChromeWindowHandleEventInfoOuterClass.ChromeWindowHandleEventInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static perfetto.protos.ChromeWindowHandleEventInfoOuterClass.ChromeWindowHandleEventInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static perfetto.protos.ChromeWindowHandleEventInfoOuterClass.ChromeWindowHandleEventInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static perfetto.protos.ChromeWindowHandleEventInfoOuterClass.ChromeWindowHandleEventInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static perfetto.protos.ChromeWindowHandleEventInfoOuterClass.ChromeWindowHandleEventInfo parseFrom(
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
    public static Builder newBuilder(perfetto.protos.ChromeWindowHandleEventInfoOuterClass.ChromeWindowHandleEventInfo prototype) {
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
     * <pre>
     * Details about HWNDMessageHandler trace events.
     * </pre>
     *
     * Protobuf type {@code perfetto.protos.ChromeWindowHandleEventInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:perfetto.protos.ChromeWindowHandleEventInfo)
        perfetto.protos.ChromeWindowHandleEventInfoOuterClass.ChromeWindowHandleEventInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return perfetto.protos.ChromeWindowHandleEventInfoOuterClass.internal_static_perfetto_protos_ChromeWindowHandleEventInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return perfetto.protos.ChromeWindowHandleEventInfoOuterClass.internal_static_perfetto_protos_ChromeWindowHandleEventInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                perfetto.protos.ChromeWindowHandleEventInfoOuterClass.ChromeWindowHandleEventInfo.class, perfetto.protos.ChromeWindowHandleEventInfoOuterClass.ChromeWindowHandleEventInfo.Builder.class);
      }

      // Construct using perfetto.protos.ChromeWindowHandleEventInfoOuterClass.ChromeWindowHandleEventInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        dpi_ = 0;
        messageId_ = 0;
        hwndPtr_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return perfetto.protos.ChromeWindowHandleEventInfoOuterClass.internal_static_perfetto_protos_ChromeWindowHandleEventInfo_descriptor;
      }

      @java.lang.Override
      public perfetto.protos.ChromeWindowHandleEventInfoOuterClass.ChromeWindowHandleEventInfo getDefaultInstanceForType() {
        return perfetto.protos.ChromeWindowHandleEventInfoOuterClass.ChromeWindowHandleEventInfo.getDefaultInstance();
      }

      @java.lang.Override
      public perfetto.protos.ChromeWindowHandleEventInfoOuterClass.ChromeWindowHandleEventInfo build() {
        perfetto.protos.ChromeWindowHandleEventInfoOuterClass.ChromeWindowHandleEventInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public perfetto.protos.ChromeWindowHandleEventInfoOuterClass.ChromeWindowHandleEventInfo buildPartial() {
        perfetto.protos.ChromeWindowHandleEventInfoOuterClass.ChromeWindowHandleEventInfo result = new perfetto.protos.ChromeWindowHandleEventInfoOuterClass.ChromeWindowHandleEventInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(perfetto.protos.ChromeWindowHandleEventInfoOuterClass.ChromeWindowHandleEventInfo result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.dpi_ = dpi_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.messageId_ = messageId_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.hwndPtr_ = hwndPtr_;
          to_bitField0_ |= 0x00000004;
        }
        result.bitField0_ |= to_bitField0_;
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
        if (other instanceof perfetto.protos.ChromeWindowHandleEventInfoOuterClass.ChromeWindowHandleEventInfo) {
          return mergeFrom((perfetto.protos.ChromeWindowHandleEventInfoOuterClass.ChromeWindowHandleEventInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(perfetto.protos.ChromeWindowHandleEventInfoOuterClass.ChromeWindowHandleEventInfo other) {
        if (other == perfetto.protos.ChromeWindowHandleEventInfoOuterClass.ChromeWindowHandleEventInfo.getDefaultInstance()) return this;
        if (other.hasDpi()) {
          setDpi(other.getDpi());
        }
        if (other.hasMessageId()) {
          setMessageId(other.getMessageId());
        }
        if (other.hasHwndPtr()) {
          setHwndPtr(other.getHwndPtr());
        }
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                dpi_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                messageId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 25: {
                hwndPtr_ = input.readFixed64();
                bitField0_ |= 0x00000004;
                break;
              } // case 25
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

      private int dpi_ ;
      /**
       * <code>optional uint32 dpi = 1;</code>
       * @return Whether the dpi field is set.
       */
      @java.lang.Override
      public boolean hasDpi() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional uint32 dpi = 1;</code>
       * @return The dpi.
       */
      @java.lang.Override
      public int getDpi() {
        return dpi_;
      }
      /**
       * <code>optional uint32 dpi = 1;</code>
       * @param value The dpi to set.
       * @return This builder for chaining.
       */
      public Builder setDpi(int value) {
        
        dpi_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 dpi = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearDpi() {
        bitField0_ = (bitField0_ & ~0x00000001);
        dpi_ = 0;
        onChanged();
        return this;
      }

      private int messageId_ ;
      /**
       * <code>optional uint32 message_id = 2;</code>
       * @return Whether the messageId field is set.
       */
      @java.lang.Override
      public boolean hasMessageId() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional uint32 message_id = 2;</code>
       * @return The messageId.
       */
      @java.lang.Override
      public int getMessageId() {
        return messageId_;
      }
      /**
       * <code>optional uint32 message_id = 2;</code>
       * @param value The messageId to set.
       * @return This builder for chaining.
       */
      public Builder setMessageId(int value) {
        
        messageId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 message_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearMessageId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        messageId_ = 0;
        onChanged();
        return this;
      }

      private long hwndPtr_ ;
      /**
       * <code>optional fixed64 hwnd_ptr = 3;</code>
       * @return Whether the hwndPtr field is set.
       */
      @java.lang.Override
      public boolean hasHwndPtr() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional fixed64 hwnd_ptr = 3;</code>
       * @return The hwndPtr.
       */
      @java.lang.Override
      public long getHwndPtr() {
        return hwndPtr_;
      }
      /**
       * <code>optional fixed64 hwnd_ptr = 3;</code>
       * @param value The hwndPtr to set.
       * @return This builder for chaining.
       */
      public Builder setHwndPtr(long value) {
        
        hwndPtr_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>optional fixed64 hwnd_ptr = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearHwndPtr() {
        bitField0_ = (bitField0_ & ~0x00000004);
        hwndPtr_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:perfetto.protos.ChromeWindowHandleEventInfo)
    }

    // @@protoc_insertion_point(class_scope:perfetto.protos.ChromeWindowHandleEventInfo)
    private static final perfetto.protos.ChromeWindowHandleEventInfoOuterClass.ChromeWindowHandleEventInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new perfetto.protos.ChromeWindowHandleEventInfoOuterClass.ChromeWindowHandleEventInfo();
    }

    public static perfetto.protos.ChromeWindowHandleEventInfoOuterClass.ChromeWindowHandleEventInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<ChromeWindowHandleEventInfo>
        PARSER = new com.google.protobuf.AbstractParser<ChromeWindowHandleEventInfo>() {
      @java.lang.Override
      public ChromeWindowHandleEventInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<ChromeWindowHandleEventInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChromeWindowHandleEventInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public perfetto.protos.ChromeWindowHandleEventInfoOuterClass.ChromeWindowHandleEventInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_perfetto_protos_ChromeWindowHandleEventInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_perfetto_protos_ChromeWindowHandleEventInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nGprotos/perfetto/trace/track_event/chro" +
      "me_window_handle_event_info.proto\022\017perfe" +
      "tto.protos\"P\n\033ChromeWindowHandleEventInf" +
      "o\022\013\n\003dpi\030\001 \001(\r\022\022\n\nmessage_id\030\002 \001(\r\022\020\n\010hw" +
      "nd_ptr\030\003 \001(\006"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_perfetto_protos_ChromeWindowHandleEventInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_perfetto_protos_ChromeWindowHandleEventInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_perfetto_protos_ChromeWindowHandleEventInfo_descriptor,
        new java.lang.String[] { "Dpi", "MessageId", "HwndPtr", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}