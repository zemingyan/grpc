// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CombinationStaff.proto

package org.serialization.protobuf.imported;

/**
 * Protobuf type {@code CombinationStaff}
 */
public  final class CombinationStaff extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:CombinationStaff)
    CombinationStaffOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CombinationStaff.newBuilder() to construct.
  private CombinationStaff(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CombinationStaff() {
    name_ = "";
    email_ = "";
    phone_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CombinationStaff(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 8: {

            id_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            email_ = s;
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000008) != 0)) {
              phone_ = new java.util.ArrayList<org.serialization.protobuf.imported.PhoneNumber>();
              mutable_bitField0_ |= 0x00000008;
            }
            phone_.add(
                input.readMessage(org.serialization.protobuf.imported.PhoneNumber.parser(), extensionRegistry));
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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000008) != 0)) {
        phone_ = java.util.Collections.unmodifiableList(phone_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.serialization.protobuf.imported.Staffbuf.internal_static_CombinationStaff_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.serialization.protobuf.imported.Staffbuf.internal_static_CombinationStaff_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.serialization.protobuf.imported.CombinationStaff.class, org.serialization.protobuf.imported.CombinationStaff.Builder.class);
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>int32 id = 1;</code>
   */
  public int getId() {
    return id_;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 2;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EMAIL_FIELD_NUMBER = 3;
  private volatile java.lang.Object email_;
  /**
   * <code>string email = 3;</code>
   */
  public java.lang.String getEmail() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      email_ = s;
      return s;
    }
  }
  /**
   * <code>string email = 3;</code>
   */
  public com.google.protobuf.ByteString
      getEmailBytes() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      email_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PHONE_FIELD_NUMBER = 4;
  private java.util.List<org.serialization.protobuf.imported.PhoneNumber> phone_;
  /**
   * <pre>
   * 引入的消息类型
   * </pre>
   *
   * <code>repeated .PhoneNumber phone = 4;</code>
   */
  public java.util.List<org.serialization.protobuf.imported.PhoneNumber> getPhoneList() {
    return phone_;
  }
  /**
   * <pre>
   * 引入的消息类型
   * </pre>
   *
   * <code>repeated .PhoneNumber phone = 4;</code>
   */
  public java.util.List<? extends org.serialization.protobuf.imported.PhoneNumberOrBuilder> 
      getPhoneOrBuilderList() {
    return phone_;
  }
  /**
   * <pre>
   * 引入的消息类型
   * </pre>
   *
   * <code>repeated .PhoneNumber phone = 4;</code>
   */
  public int getPhoneCount() {
    return phone_.size();
  }
  /**
   * <pre>
   * 引入的消息类型
   * </pre>
   *
   * <code>repeated .PhoneNumber phone = 4;</code>
   */
  public org.serialization.protobuf.imported.PhoneNumber getPhone(int index) {
    return phone_.get(index);
  }
  /**
   * <pre>
   * 引入的消息类型
   * </pre>
   *
   * <code>repeated .PhoneNumber phone = 4;</code>
   */
  public org.serialization.protobuf.imported.PhoneNumberOrBuilder getPhoneOrBuilder(
      int index) {
    return phone_.get(index);
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
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (!getEmailBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, email_);
    }
    for (int i = 0; i < phone_.size(); i++) {
      output.writeMessage(4, phone_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (!getEmailBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, email_);
    }
    for (int i = 0; i < phone_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, phone_.get(i));
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
    if (!(obj instanceof org.serialization.protobuf.imported.CombinationStaff)) {
      return super.equals(obj);
    }
    org.serialization.protobuf.imported.CombinationStaff other = (org.serialization.protobuf.imported.CombinationStaff) obj;

    if (getId()
        != other.getId()) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (!getEmail()
        .equals(other.getEmail())) return false;
    if (!getPhoneList()
        .equals(other.getPhoneList())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + EMAIL_FIELD_NUMBER;
    hash = (53 * hash) + getEmail().hashCode();
    if (getPhoneCount() > 0) {
      hash = (37 * hash) + PHONE_FIELD_NUMBER;
      hash = (53 * hash) + getPhoneList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.serialization.protobuf.imported.CombinationStaff parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.serialization.protobuf.imported.CombinationStaff parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.serialization.protobuf.imported.CombinationStaff parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.serialization.protobuf.imported.CombinationStaff parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.serialization.protobuf.imported.CombinationStaff parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.serialization.protobuf.imported.CombinationStaff parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.serialization.protobuf.imported.CombinationStaff parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.serialization.protobuf.imported.CombinationStaff parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.serialization.protobuf.imported.CombinationStaff parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.serialization.protobuf.imported.CombinationStaff parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.serialization.protobuf.imported.CombinationStaff parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.serialization.protobuf.imported.CombinationStaff parseFrom(
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
  public static Builder newBuilder(org.serialization.protobuf.imported.CombinationStaff prototype) {
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
   * Protobuf type {@code CombinationStaff}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:CombinationStaff)
      org.serialization.protobuf.imported.CombinationStaffOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.serialization.protobuf.imported.Staffbuf.internal_static_CombinationStaff_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.serialization.protobuf.imported.Staffbuf.internal_static_CombinationStaff_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.serialization.protobuf.imported.CombinationStaff.class, org.serialization.protobuf.imported.CombinationStaff.Builder.class);
    }

    // Construct using org.serialization.protobuf.imported.CombinationStaff.newBuilder()
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
        getPhoneFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0;

      name_ = "";

      email_ = "";

      if (phoneBuilder_ == null) {
        phone_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
      } else {
        phoneBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.serialization.protobuf.imported.Staffbuf.internal_static_CombinationStaff_descriptor;
    }

    @java.lang.Override
    public org.serialization.protobuf.imported.CombinationStaff getDefaultInstanceForType() {
      return org.serialization.protobuf.imported.CombinationStaff.getDefaultInstance();
    }

    @java.lang.Override
    public org.serialization.protobuf.imported.CombinationStaff build() {
      org.serialization.protobuf.imported.CombinationStaff result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.serialization.protobuf.imported.CombinationStaff buildPartial() {
      org.serialization.protobuf.imported.CombinationStaff result = new org.serialization.protobuf.imported.CombinationStaff(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.id_ = id_;
      result.name_ = name_;
      result.email_ = email_;
      if (phoneBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0)) {
          phone_ = java.util.Collections.unmodifiableList(phone_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.phone_ = phone_;
      } else {
        result.phone_ = phoneBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof org.serialization.protobuf.imported.CombinationStaff) {
        return mergeFrom((org.serialization.protobuf.imported.CombinationStaff)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.serialization.protobuf.imported.CombinationStaff other) {
      if (other == org.serialization.protobuf.imported.CombinationStaff.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getEmail().isEmpty()) {
        email_ = other.email_;
        onChanged();
      }
      if (phoneBuilder_ == null) {
        if (!other.phone_.isEmpty()) {
          if (phone_.isEmpty()) {
            phone_ = other.phone_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensurePhoneIsMutable();
            phone_.addAll(other.phone_);
          }
          onChanged();
        }
      } else {
        if (!other.phone_.isEmpty()) {
          if (phoneBuilder_.isEmpty()) {
            phoneBuilder_.dispose();
            phoneBuilder_ = null;
            phone_ = other.phone_;
            bitField0_ = (bitField0_ & ~0x00000008);
            phoneBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPhoneFieldBuilder() : null;
          } else {
            phoneBuilder_.addAllMessages(other.phone_);
          }
        }
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
      org.serialization.protobuf.imported.CombinationStaff parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.serialization.protobuf.imported.CombinationStaff) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int id_ ;
    /**
     * <code>int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 1;</code>
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object email_ = "";
    /**
     * <code>string email = 3;</code>
     */
    public java.lang.String getEmail() {
      java.lang.Object ref = email_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        email_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string email = 3;</code>
     */
    public com.google.protobuf.ByteString
        getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string email = 3;</code>
     */
    public Builder setEmail(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      email_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string email = 3;</code>
     */
    public Builder clearEmail() {
      
      email_ = getDefaultInstance().getEmail();
      onChanged();
      return this;
    }
    /**
     * <code>string email = 3;</code>
     */
    public Builder setEmailBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      email_ = value;
      onChanged();
      return this;
    }

    private java.util.List<org.serialization.protobuf.imported.PhoneNumber> phone_ =
      java.util.Collections.emptyList();
    private void ensurePhoneIsMutable() {
      if (!((bitField0_ & 0x00000008) != 0)) {
        phone_ = new java.util.ArrayList<org.serialization.protobuf.imported.PhoneNumber>(phone_);
        bitField0_ |= 0x00000008;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.serialization.protobuf.imported.PhoneNumber, org.serialization.protobuf.imported.PhoneNumber.Builder, org.serialization.protobuf.imported.PhoneNumberOrBuilder> phoneBuilder_;

    /**
     * <pre>
     * 引入的消息类型
     * </pre>
     *
     * <code>repeated .PhoneNumber phone = 4;</code>
     */
    public java.util.List<org.serialization.protobuf.imported.PhoneNumber> getPhoneList() {
      if (phoneBuilder_ == null) {
        return java.util.Collections.unmodifiableList(phone_);
      } else {
        return phoneBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * 引入的消息类型
     * </pre>
     *
     * <code>repeated .PhoneNumber phone = 4;</code>
     */
    public int getPhoneCount() {
      if (phoneBuilder_ == null) {
        return phone_.size();
      } else {
        return phoneBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * 引入的消息类型
     * </pre>
     *
     * <code>repeated .PhoneNumber phone = 4;</code>
     */
    public org.serialization.protobuf.imported.PhoneNumber getPhone(int index) {
      if (phoneBuilder_ == null) {
        return phone_.get(index);
      } else {
        return phoneBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * 引入的消息类型
     * </pre>
     *
     * <code>repeated .PhoneNumber phone = 4;</code>
     */
    public Builder setPhone(
        int index, org.serialization.protobuf.imported.PhoneNumber value) {
      if (phoneBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePhoneIsMutable();
        phone_.set(index, value);
        onChanged();
      } else {
        phoneBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 引入的消息类型
     * </pre>
     *
     * <code>repeated .PhoneNumber phone = 4;</code>
     */
    public Builder setPhone(
        int index, org.serialization.protobuf.imported.PhoneNumber.Builder builderForValue) {
      if (phoneBuilder_ == null) {
        ensurePhoneIsMutable();
        phone_.set(index, builderForValue.build());
        onChanged();
      } else {
        phoneBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 引入的消息类型
     * </pre>
     *
     * <code>repeated .PhoneNumber phone = 4;</code>
     */
    public Builder addPhone(org.serialization.protobuf.imported.PhoneNumber value) {
      if (phoneBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePhoneIsMutable();
        phone_.add(value);
        onChanged();
      } else {
        phoneBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * 引入的消息类型
     * </pre>
     *
     * <code>repeated .PhoneNumber phone = 4;</code>
     */
    public Builder addPhone(
        int index, org.serialization.protobuf.imported.PhoneNumber value) {
      if (phoneBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePhoneIsMutable();
        phone_.add(index, value);
        onChanged();
      } else {
        phoneBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 引入的消息类型
     * </pre>
     *
     * <code>repeated .PhoneNumber phone = 4;</code>
     */
    public Builder addPhone(
        org.serialization.protobuf.imported.PhoneNumber.Builder builderForValue) {
      if (phoneBuilder_ == null) {
        ensurePhoneIsMutable();
        phone_.add(builderForValue.build());
        onChanged();
      } else {
        phoneBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 引入的消息类型
     * </pre>
     *
     * <code>repeated .PhoneNumber phone = 4;</code>
     */
    public Builder addPhone(
        int index, org.serialization.protobuf.imported.PhoneNumber.Builder builderForValue) {
      if (phoneBuilder_ == null) {
        ensurePhoneIsMutable();
        phone_.add(index, builderForValue.build());
        onChanged();
      } else {
        phoneBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 引入的消息类型
     * </pre>
     *
     * <code>repeated .PhoneNumber phone = 4;</code>
     */
    public Builder addAllPhone(
        java.lang.Iterable<? extends org.serialization.protobuf.imported.PhoneNumber> values) {
      if (phoneBuilder_ == null) {
        ensurePhoneIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, phone_);
        onChanged();
      } else {
        phoneBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * 引入的消息类型
     * </pre>
     *
     * <code>repeated .PhoneNumber phone = 4;</code>
     */
    public Builder clearPhone() {
      if (phoneBuilder_ == null) {
        phone_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
      } else {
        phoneBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * 引入的消息类型
     * </pre>
     *
     * <code>repeated .PhoneNumber phone = 4;</code>
     */
    public Builder removePhone(int index) {
      if (phoneBuilder_ == null) {
        ensurePhoneIsMutable();
        phone_.remove(index);
        onChanged();
      } else {
        phoneBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * 引入的消息类型
     * </pre>
     *
     * <code>repeated .PhoneNumber phone = 4;</code>
     */
    public org.serialization.protobuf.imported.PhoneNumber.Builder getPhoneBuilder(
        int index) {
      return getPhoneFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 引入的消息类型
     * </pre>
     *
     * <code>repeated .PhoneNumber phone = 4;</code>
     */
    public org.serialization.protobuf.imported.PhoneNumberOrBuilder getPhoneOrBuilder(
        int index) {
      if (phoneBuilder_ == null) {
        return phone_.get(index);  } else {
        return phoneBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * 引入的消息类型
     * </pre>
     *
     * <code>repeated .PhoneNumber phone = 4;</code>
     */
    public java.util.List<? extends org.serialization.protobuf.imported.PhoneNumberOrBuilder> 
         getPhoneOrBuilderList() {
      if (phoneBuilder_ != null) {
        return phoneBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(phone_);
      }
    }
    /**
     * <pre>
     * 引入的消息类型
     * </pre>
     *
     * <code>repeated .PhoneNumber phone = 4;</code>
     */
    public org.serialization.protobuf.imported.PhoneNumber.Builder addPhoneBuilder() {
      return getPhoneFieldBuilder().addBuilder(
          org.serialization.protobuf.imported.PhoneNumber.getDefaultInstance());
    }
    /**
     * <pre>
     * 引入的消息类型
     * </pre>
     *
     * <code>repeated .PhoneNumber phone = 4;</code>
     */
    public org.serialization.protobuf.imported.PhoneNumber.Builder addPhoneBuilder(
        int index) {
      return getPhoneFieldBuilder().addBuilder(
          index, org.serialization.protobuf.imported.PhoneNumber.getDefaultInstance());
    }
    /**
     * <pre>
     * 引入的消息类型
     * </pre>
     *
     * <code>repeated .PhoneNumber phone = 4;</code>
     */
    public java.util.List<org.serialization.protobuf.imported.PhoneNumber.Builder> 
         getPhoneBuilderList() {
      return getPhoneFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.serialization.protobuf.imported.PhoneNumber, org.serialization.protobuf.imported.PhoneNumber.Builder, org.serialization.protobuf.imported.PhoneNumberOrBuilder> 
        getPhoneFieldBuilder() {
      if (phoneBuilder_ == null) {
        phoneBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.serialization.protobuf.imported.PhoneNumber, org.serialization.protobuf.imported.PhoneNumber.Builder, org.serialization.protobuf.imported.PhoneNumberOrBuilder>(
                phone_,
                ((bitField0_ & 0x00000008) != 0),
                getParentForChildren(),
                isClean());
        phone_ = null;
      }
      return phoneBuilder_;
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


    // @@protoc_insertion_point(builder_scope:CombinationStaff)
  }

  // @@protoc_insertion_point(class_scope:CombinationStaff)
  private static final org.serialization.protobuf.imported.CombinationStaff DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.serialization.protobuf.imported.CombinationStaff();
  }

  public static org.serialization.protobuf.imported.CombinationStaff getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CombinationStaff>
      PARSER = new com.google.protobuf.AbstractParser<CombinationStaff>() {
    @java.lang.Override
    public CombinationStaff parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CombinationStaff(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CombinationStaff> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CombinationStaff> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.serialization.protobuf.imported.CombinationStaff getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

